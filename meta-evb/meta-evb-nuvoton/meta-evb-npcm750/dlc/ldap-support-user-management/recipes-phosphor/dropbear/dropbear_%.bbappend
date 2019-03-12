# 0001-Only-load-dropbear-default-host-keys-if-a-key-is-not.patch
# has been upstreamed.  This patch can be removed once we upgrade
# to yocto 2.5 or later which will pull in the latest dropbear code.
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://dropbear-pam-sesssion-support.patch \
	       "

do_install_append() {
    echo "session   include   common-session" >> ${D}${sysconfdir}/pam.d/dropbear
}