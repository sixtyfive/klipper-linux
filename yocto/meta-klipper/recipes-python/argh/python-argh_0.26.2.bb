SUMMARY = "Pattern matching and various utilities for file systems paths."
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/argh/"

LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=cede70b648dcc81baf5b431d38905bad"

PYPI_PACKAGE = "argh"

SRC_URI[sha256sum] = "e9535b8c84dc9571a48999094fda7f33e63c3f1b74f3e5f3ac0105a58405bb65"

inherit pypi setuptools

BBCLASSEXTEND = "native"