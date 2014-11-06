require recipes/uhd/uhd.inc

PV = "3.7.3"
PR = "${INC_PR}.0"

SRC_URI = "git://github.com/EttusResearch/uhd.git;branch=maint;protocol=git"

S = "${WORKDIR}/git/host"

SRCREV = "e10df19c89d21ce860a36bb071b4a26b2f067460"
