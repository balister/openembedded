require recipes/uhd/uhd.inc

PV = "3.4.3"
PR = "${INC_PR}.0"

SRC_URI = "git://ettus.sourcerepo.com/ettus/uhd.git;branch=maint;protocol=git"
S = "${WORKDIR}/git/host"

SRCREV = "461eb1c72942f35cd1eee7901c240368d003325a"
