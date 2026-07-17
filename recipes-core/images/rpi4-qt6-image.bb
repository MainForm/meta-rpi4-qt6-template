SUMMARY = "Minimal Qt 6 image for Raspberry Pi 4"
DESCRIPTION = "A minimal bootable Raspberry Pi 4 image with the Qt 6 runtime"
LICENSE = "MIT"

inherit core-image populate_sdk_qt6_base

# Enable SSH so the board can be configured and debugged without a local console.
IMAGE_FEATURES:append = " ssh-server-openssh"

# Bootable base image plus the Qt 6 runtime libraries/plugins needed by target apps.
IMAGE_INSTALL:append = " \
    packagegroup-core-boot \
    packagegroup-qt6-essentials \
    qt6-hello-world \
"

# Qt 6 SDK support for building applications against this image.
TOOLCHAIN_HOST_TASK:append = " \
    nativesdk-packagegroup-qt6-toolchain-host-essentials \
"

# Basic network management, including Wi-Fi configuration via nmcli/wpa-supplicant.
IMAGE_INSTALL:append = " \
    networkmanager \
    networkmanager-nmcli \
    networkmanager-wifi \
    wpa-supplicant \
"

# Fontconfig plus Latin/monospace/Korean TrueType fonts for Qt text rendering.
IMAGE_INSTALL:append = " \
    fontconfig-utils \
    ttf-dejavu-sans \
    ttf-dejavu-sans-mono \
    source-han-sans-kr-fonts \
"
