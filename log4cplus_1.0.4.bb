DESCRIPTION = "log4cplus is a simple to use C++ logging API providing thread-safe, flexible, and arbitrarily granular control over log management and configuration."
PRIORITY = "optional"
DEPENDS = "automake"
PR = "r1"
HOMEPAGE = "http://log4cplus.sourceforge.net/"
LICENSE = "unknown"
LIC_FILES_CHKSUM = "file://COPYING;md5=699511816c2b011c884c88344f67f9a0"
inherit autotools
SRC_URI = "http://ignum.dl.sourceforge.net/project/log4cplus/log4cplus-stable/${PV}/log4cplus-${PV}.tar.bz2"
SRC_URI[md5sum] = "977d0a390b3be1a4ad8cfab2e4dd3af3"
SRC_URI[sha256sum] = "c2bb01b5f4bff5fa768700e98ead4a79dfd556096c9f3f0401849da7ab80fbef"
S = "${WORKDIR}/log4cplus-${PV}"