SUMMARY = "OpenBMC for RUNBMC NUVOTON system - Applications"
PR = "r1"

inherit packagegroup

PROVIDES = "${PACKAGES}"
PACKAGES = " \
        ${PN}-chassis \
        ${PN}-fans \
        ${PN}-flash \
        ${PN}-system \
        "

PROVIDES += "virtual/obmc-chassis-mgmt"
PROVIDES += "virtual/obmc-fan-mgmt"
PROVIDES += "virtual/obmc-flash-mgmt"
PROVIDES += "virtual/obmc-system-mgmt"

RPROVIDES_${PN}-chassis += "virtual-obmc-chassis-mgmt"
RPROVIDES_${PN}-fans += "virtual-obmc-fan-mgmt"
RPROVIDES_${PN}-flash += "virtual-obmc-flash-mgmt"
RPROVIDES_${PN}-system += "virtual-obmc-system-mgmt"

SUMMARY_${PN}-chassis = "RUNBMC NUVOTON Chassis"
RDEPENDS_${PN}-chassis = " \
        obmc-button-power \
        obmc-control-chassis \
        obmc-op-control-power \
        "

SUMMARY_${PN}-fans = "RUNBMC NUVOTON Fans"
RDEPENDS_${PN}-fans = " \
        obmc-control-fan \
        "

SUMMARY_${PN}-flash = "RUNBMC NUVOTON Flash"
RDEPENDS_${PN}-flash = " \
        obmc-flash-bmc \
        obmc-mgr-download \
        obmc-control-bmc \
        "

SUMMARY_${PN}-system = "RUNBMC NUVOTON System"
RDEPENDS_${PN}-system = " \
        obmc-mgr-system \
        phosphor-webui\
        obmc-ikvm \
        obmc-console \
        "
