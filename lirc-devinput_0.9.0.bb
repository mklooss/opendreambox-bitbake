DESCRIPTION = "LIRC is a package that allows you to decode and send infra-red signals of many (but not all) commonly used remote controls."
PRIORITY = "optional"
SECTION = "console/network"
LICENSE = "GPLv2+"
DEPENDS = "virtual/kernel fakeroot-native setserial"
PR = "r7"
HOMEPAGE = "http://www.lirc.org/"
LIC_FILES_CHKSUM = "file://COPYING;md5=0636e73ff0215e8d672dc4c32c317bb3"
inherit autotools module-base
EXTRA_OEMAKE = 'SUBDIRS="daemons tools"'
PACKAGES =+ "lirc-x"

FILES_lirc-x = "${bindir}/irxevent ${bindir}/xmode2"
SRC_URI = "http://heanet.dl.sourceforge.net/project/lirc/LIRC/${PV}/lirc-${PV}.tar.bz2"
SRC_URI[md5sum] = "b232aef26f23fe33ea8305d276637086"
SRC_URI[sha256sum] = "6323afae6ad498d4369675f77ec3dbb680fe661bea586aa296e67f2e2daba4ff"
S = "${WORKDIR}/lirc-${PV}"
EXTRA_OECONF = "--with-kerneldir=${STAGING_KERNEL_DIR} --with-driver=devinput"