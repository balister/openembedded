DESCRIPTION = "Universal Hardware Driver Firmware"
HOMEPAGE = "http://www.ettus.com"
LICENSE = "GPLv3"

INC_PR = "r0"

PACKAGE_ARCH = "all"

SRC_URI = "http://files.ettus.com/binaries/stable/releases/uhd_${PV}-release/uhd-images_${PV}-release.tar.gz"

S = "${WORKDIR}/uhd-images_${PV}-release"

do_install() {
	install -d ${D}${datadir}/uhd/images
	install -d ${D}${datadir}/uhd/images/bit
	install -m 0644 ${S}/share/uhd/images/bit/* ${D}${datadir}/uhd/images/bit
	rm -rf ${S}/share/uhd/images/bit
	install -m 0644 ${S}/share/uhd/images/* ${D}${datadir}/uhd/images
}

PACKAGES = "${PN}"
FILES_${PN} = ${datadir}/uhd/images

