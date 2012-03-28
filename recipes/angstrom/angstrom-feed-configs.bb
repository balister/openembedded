DESCRIPTION = "Configuration files for online package repositories aka feeds"
LICENSE = "MIT"

ANGSTROM_URI = "http://files.ettus.com"

RRECOMMENDS_${PN} += "opkg"

PR = "r16"
PACKAGE_ARCH = "${MACHINE_ARCH}"

FEED_BASEPATH = "binaries/oe-classic-feeds/ipk"


do_compile() {
	mkdir -p ${S}/${sysconfdir}/opkg

	rm ${S}/${sysconfdir}/opkg/arch.conf || true
	ipkgarchs="noarch armv7a usrp-e1xx"
	priority=1
	for arch in $ipkgarchs; do 
		echo "arch $arch $priority" >> ${S}/${sysconfdir}/opkg/arch.conf
		priority=$(expr $priority + 5)
	done

	echo "src/gz ${MACHINE_ARCH} ${ANGSTROM_URI}/${FEED_BASEPATH}/${MACHINE_ARCH}" >  ${S}/${sysconfdir}/opkg/${MACHINE_ARCH}-feed.conf
	echo "src/gz armv7a ${ANGSTROM_URI}/${FEED_BASEPATH}/armv7a" >  ${S}/${sysconfdir}/opkg/armv7a-feed.conf
	echo "src/gz no-arch ${ANGSTROM_URI}/${FEED_BASEPATH}/all" > ${S}/${sysconfdir}/opkg/noarch-feed.conf
		
}


do_install () {
	install -d ${D}${sysconfdir}/opkg
	install -m 0644  ${S}/${sysconfdir}/opkg/* ${D}${sysconfdir}/opkg/
}

FILES_${PN} = "\
					${sysconfdir}/opkg/${MACHINE_ARCH}-feed.conf \
					${sysconfdir}/opkg/armv7a-feed.conf \
					${sysconfdir}/opkg/noarch-feed.conf \
					${sysconfdir}/opkg/arch.conf \
					"

CONFFILES_${PN} += " \
					${sysconfdir}/opkg/${MACHINE_ARCH}-feed.conf \
					${sysconfdir}/opkg/armv7a-feed.conf \
					${sysconfdir}/opkg/noarch-feed.conf \
					${sysconfdir}/opkg/arch.conf \
					"

