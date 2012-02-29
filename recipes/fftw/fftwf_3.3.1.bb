require fftw.inc

SRC_URI = "http://www.fftw.org/fftw-${PV}.tar.gz"

EXTRA_OECONF = "--disable-fortran --enable-single --enable-shared --enable-threads"
EXTRA_OECONF_append_armv7a = " --enable-neon"

S="${WORKDIR}/fftw-${PV}"

SRC_URI[md5sum] = "76f5f3c7577613d0fbedaae77450ac91"
SRC_URI[sha256sum] = "c77fc5cda6ce868857aa565cb9b0df0d7a4fcf388ce5c6d482acd80e2452b739"
