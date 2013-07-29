SUMMARY = "USB CEC Adaptor communication Library"
HOMEPAGE = "http://libcec.pulse-eight.com/"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=5e8e16396992369f73f3d28875f846da"
DEPENDS = "udev kernel-module-cdc-acm"
SRCREV = "54be21e43ea5b0268858e09f0252bb3909ef6132"

SRC_URI = "git://github.com/Pulse-Eight/libcec.git"

S = "${WORKDIR}/git"

inherit autotools lib_package pkgconfig

RRECOMMENDS_${PN} = "kernel-module-cdc-acm"

PKG_${PN}-bin = "cec-utils"
