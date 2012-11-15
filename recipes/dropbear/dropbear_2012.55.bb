require dropbear.inc
PR = "${INC_PR}.0"

#SRC_URI += "file://no-host-lookup.patch"

do_configure_prepend() {
	echo "#define DROPBEAR_SMALL_CODE" >>${S}/options.h
}

SRC_URI[md5sum] = "8c784baec3054cdb1bb4bfa792c87812"
SRC_URI[sha256sum] = "04982af2a10b220fa940f9f72f276d612c9bb643cfbb5ee1416e5a0f00de9b0f"
