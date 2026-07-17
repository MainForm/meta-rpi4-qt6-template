SUMMARY = "Simple Qt 6 HelloWorld example"
DESCRIPTION = "A full-screen Qt 6 example application that renders HelloWorld in the center of the display."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    file://qt6-hello-world \
    file://qt6-hello-world.service \
"

S = "${WORKDIR}/qt6-hello-world"

DEPENDS += "qtbase"

inherit qt6-cmake systemd

SYSTEMD_SERVICE:${PN} = "qt6-hello-world.service"
SYSTEMD_AUTO_ENABLE:${PN} = "enable"

do_install:append() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/qt6-hello-world.service ${D}${systemd_system_unitdir}/
}
