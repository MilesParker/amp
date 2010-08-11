JOB_ID=cbi-amp-nightly
BUILD_TYPE=N
ANT=/opt/public/common/apache-ant-1.7.1/bin/ant
RELENG_DIR=/opt/users/hudsonbuild/.hudson/jobs/$JOB_ID/workspace/build/org.eclipse.amp.releng
PROMO_LOGS_DIR=/home/data/users/mparker/promo_logs
BUILD_LOC=/home/data/users/mparker/promo_build
logFile=$PROMO_LOGS_DIR/promo_log.txt

DATE=`date +%Y%m%d-%H%M`

echo "$DATE: getting last successful build" >> $logFile
mkdir -p $BUILD_LOC
rm -f $BUILD_LOC/build.zip
rm -rf $BUILD_LOC/build
cd $BUILD_LOC
wget --no-check-certificate "https://build.eclipse.org/hudson/job/$JOB_ID/lastSuccessfulBuild/artifact/build/*zip*/build.zip"
if [ ! -f build.zip ]; then echo "ERROR:build.zip (from Hudson) not found"; exit -2; fi
unzip build.zip
echo "$DATE: publishing nightly build ..." >> $logFile
cd ../
mkdir -p $PROMO_LOGS_DIR
$ANT -f $RELENG_DIR/promote.xml -Dpromote.properties=$RELENG_DIR/promote-$BUILD_TYPE.properties -verbose 2>/dev/null 1> $PROMO_LOGS_DIR/$JOB_ID-promo-$BUILD_TYPE.txt

$ANT -f $RELENG_DIR/promote.xml -Dpromote.properties=$RELENG_DIR/promote-$BUILD_TYPE.properties -verbose 2>/dev/null 1> $PROMO_LOGS_DIR/$JOB_ID-promo-$BUILD_TYPE.txt

/opt/public/common/apache-ant-1.7.1/bin/ant -f /opt/users/hudsonbuild/.hudson/jobs/cbi-amp-nightly/workspace/build/org.eclipse.amp.releng/promote.xml -Dpromote.properties=/opt/users/hudsonbuild/.hudson/jobs/cbi-amp-nightly/workspace/build/org.eclipse.amp.releng/promote-I.properties 2>/dev/null 1> ~/promo_logs/cbi-amp-interim-promo.txt
