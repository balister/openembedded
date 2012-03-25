require recipes/uhd/uhd.inc

PV = "3.4.0"
PR = "${INC_PR}.0"

SRC_URI = "git://ettus.sourcerepo.com/ettus/uhd.git;protocol=git"
S = "${WORKDIR}/git/host"

SRCREV = "d97b9deec9141968ef9ed04ddf44bffa860a51c2"
