DESCRIPTION = "A simple daemon to connect libcec to uinput. That is, using your TV to control your PC!"
HOMEPAGE = "http://libcec.pulse-eight.com/"

LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://README;md5=3f0ffbbc5cf3133fc6de91ad9732136d"

DEPENDS = "log4cplus boost libcec"

PR = "r2"
PV = "0.0.1"
SRCREV = "cb086865869402fdabe3b9142ea7e6ea3c699c1b"
SRC_URI = "git://github.com/bramp/libcec-daemon.git"
CPPOPTIONS = "-lcec -ldl -lboost_program_options -llog4cplus"
CCEXTRA = "-c -std=c++0x -g -Wall ${CFLAGS} ${LDFLAGS}"
S = "${WORKDIR}/git"

do_compile() {
 ${CXX} ${CPPOPTIONS} ${CCEXTRA} src/main.cpp -o src/main.o
 ${CXX} ${CPPOPTIONS} ${CCEXTRA} src/uinput.cpp -o src/uinput.o
 ${CXX} ${CPPOPTIONS} ${CCEXTRA} src/libcec.cpp -o src/libcec.o
 ${CXX} ${CPPOPTIONS} src/main.o src/uinput.o src/libcec.o -o libcec-daemon
}

do_install(){
 install -d ${D}${bindir}/
 install -m 0755 ${S}/libcec-daemon ${D}${bindir}/
}