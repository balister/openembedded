include erlang.inc

inherit native

PR = "r0"

# EXTRA_OEMAKE = 'OTP_SMALL_BUILD=true'
EXTRA_OECONF = '--without-ssl'

do_configure() {
    TARGET=${HOST_SYS} \
    ac_cv_prog_javac_ver_1_2=no \
    ac_cv_prog_javac_ver_1_5=no \
	oe_runconf
}

do_compile_prepend() {
    export TARGET=${HOST_SYS}
}

do_stage_prepend() {
    export TARGET=${HOST_SYS}
}

do_install_prepend() {
    export TARGET=${HOST_SYS}
}

SRC_URI[md5sum] = "f12d00f6e62b36ad027d6c0c08905fad"
SRC_URI[sha256sum] = "f94f7de7328af3c0cdc42089c1a4ecd03bf98ec680f47eb5e6cddc50261cabde"
