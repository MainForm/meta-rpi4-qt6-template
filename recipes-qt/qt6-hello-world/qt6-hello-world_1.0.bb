SUMMARY = "Simple Qt 6 HelloWorld example"
DESCRIPTION = "A full-screen Qt 6 example application that renders HelloWorld in the center of the display."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    file://qt6-hello-world \
"

S = "${WORKDIR}/qt6-hello-world"

DEPENDS += "qtbase"

inherit qt6-cmake
