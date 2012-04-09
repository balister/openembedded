require recipes/uhd/uhd.inc

PV = "3.4.0"
PR = "${INC_PR}.1"

SRC_URI = "git://ettus.sourcerepo.com/ettus/uhd.git;branch=maint;protocol=git"
S = "${WORKDIR}/git/host"

SRCREV = "097f20df1653c33035b6dcfefbbef22572426c65"
