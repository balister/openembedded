DESCRIPTION = "Serial Port Support for Python"
SECTION = "devel/python"
PRIORITY = "optional"
LICENSE = "PSF"
SRCNAME = "pyserial"
PR = "ml0"

SRC_URI = "${SOURCEFORGE_MIRROR}/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"
S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

# FIXME might stop packaging serialwin32 and serialjava files

RDEPENDS_${PN} = "\
  python-fcntl \
  python-io \
  python-stringold \
"

SRC_URI[md5sum] = "34340820710239bea2ceca7f43ef8cab"
SRC_URI[sha256sum] = "eddd22280e0dac0888c6cddd8906ebd902fa42467fee151c43ecde4196bbf511"
