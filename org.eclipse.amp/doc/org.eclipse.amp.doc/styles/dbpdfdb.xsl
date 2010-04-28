<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:l="http://docbook.sourceforge.net/xmlns/l10n/1.0" xmlns:fo="http://www.w3.org/1999/XSL/Format"
	version="1.0">

	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()" />
		</xsl:copy>
	</xsl:template>
	<xsl:template match="informaltable">
		<xsl:copy>
			<xsl:attribute name="frame">none</xsl:attribute>
			<xsl:apply-templates select="@*|node()"  />
		</xsl:copy>	
	</xsl:template>
	<xsl:template match="imagedata">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()"  />
			<xsl:attribute name="scale">50</xsl:attribute>
		</xsl:copy>	
	</xsl:template>
</xsl:stylesheet> 