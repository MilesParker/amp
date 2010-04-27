<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:l="http://docbook.sourceforge.net/xmlns/l10n/1.0" xmlns:fo="http://www.w3.org/1999/XSL/Format"
	version="1.0">

	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()" />
		</xsl:copy>
	</xsl:template>
	<xsl:template match="imageobject">
		<xsl:element name="imagedata">
			<xsl:apply-templates />
			<xsl:attribute name="width">200</xsl:attribute>
		</xsl:element>
	</xsl:template>
</xsl:stylesheet> 