DESCRIPTION = "Universal Hardware Driver Firmware"
HOMEPAGE = "http://www.ettus.com"
LICENSE = "GPLv3"

INC_PR = "r0"

PACKAGE_ARCH = "all"

SRC_URI = "http://files.ettus.com/binaries/maint_images/archive/uhd-images_${PV}-release.tar.gz"

S = "${WORKDIR}/uhd-images_${PV}-release"

do_install() {
	install -d ${D}${datadir}/uhd/images
	install -d ${D}${datadir}/uhd/images/bit
	install -d ${D}${datadir}/uhd/images/winusb_driver
	install -d ${D}${datadir}/uhd/images/winusb_driver/amd64
	install -d ${D}${datadir}/uhd/images/winusb_driver/x86
    install -m 0644 ${S}/share/uhd/images/bit/* ${D}${datadir}/uhd/images/bit
    install -m 0644 ${S}/share/uhd/images/winusb_driver/amd64/* ${D}${datadir}/uhd/images/winusb_driver/amd64
    install -m 0644 ${S}/share/uhd/images/winusb_driver/x86/* ${D}${datadir}/uhd/images/winusb_driver/x86
    install -m 0644 ${S}/share/uhd/images/winusb_driver/*.inf ${D}${datadir}/uhd/images/winusb_driver
    install -m 0644 ${S}/share/uhd/images/*.tag ${D}${datadir}/uhd/images
    install -m 0644 ${S}/share/uhd/images/LICENSE ${D}${datadir}/uhd/images
    install -m 0644 ${S}/share/uhd/images/*.hex ${D}${datadir}/uhd/images
    install -m 0644 ${S}/share/uhd/images/*.rbf ${D}${datadir}/uhd/images
    install -m 0644 ${S}/share/uhd/images/*.ihx ${D}${datadir}/uhd/images
    install -m 0644 ${S}/share/uhd/images/*.bin ${D}${datadir}/uhd/images
    install -m 0644 ${S}/share/uhd/images/*.bit ${D}${datadir}/uhd/images
    install -m 0644 ${S}/share/uhd/images/*.lvbitx ${D}${datadir}/uhd/images
}

PACKAGES = "${PN}"
FILES_${PN} = ${datadir}/uhd/images

