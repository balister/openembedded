DESCRIPTION = "This is a filesystem client based on the SSH File Transfer Protocol using FUSE."
AUTHOR = "Miklos Szeredi <miklos@szeredi.hu>"
HOMEPAGE = "http://fuse.sourceforge.net/sshfs.html"
SECTION = "console/network"
PRIORITY = "optional"
LICENSE = "GPLv2"
DEPENDS = "glib-2.0 fuse"
PR = "r0"

SRC_URI = "${SOURCEFORGE_MIRROR}/fuse/${P}.tar.gz"
S = "${WORKDIR}/${P}"

inherit autotools

FILES_${PN} += "${libdir}/sshnodelay.so"

SRC_URI[md5sum] = "f72f12fda186dbd92382f70d25662ed3"
SRC_URI[sha256sum] = "ce229f87869d136c8347cca646f1dd6394c604127d021507a57205668d9288bb"
