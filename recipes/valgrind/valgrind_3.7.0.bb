require valgrind.inc
export PERL="/usr/bin/env perl"

PR = "r0"

#SRC_URI += "file://vg-ppc-feature.patch"
SRC_URI += "file://armv7-hack.patch"

SRC_URI[md5sum] = "a855fda56edf05614f099dca316d1775"
SRC_URI[sha256sum] = "5d62c0330f1481fe2c593249192fa68ff454c19c34343978cc9ce91aa324cbf6"
