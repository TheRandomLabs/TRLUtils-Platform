# TRLUtils-Platform

[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](https://opensource.org/licenses/MIT)

[![Build](https://jitci.com/gh/TheRandomLabs/TRLUtils-Platform/svg)](https://jitci.com/gh/TheRandomLabs/TRLUtils-Platform)
[![Dependabot](https://badgen.net/dependabot/TheRandomLabs/TRLUtils-Platform/?icon=dependabot)](https://dependabot.com/)

[![Average time to resolve an issue](http://isitmaintained.com/badge/resolution/TheRandomLabs/TRLUtils-Platform.svg)](http://isitmaintained.com/project/TheRandomLabs/TRLUtils-Platform "Average time to resolve an issue")

<!-- [![Maven Central](https://img.shields.io/maven-central/v/com.therandomlabs.utils.platform/trlutils-platform.svg?style=shield)](https://maven-badges.herokuapp.com/maven-central/com.therandomlabs.utils.platform/trlutils-platform/)

[comment]: # [![Javadoc](https://javadoc.io/badge/com.therandomlabs.utils.platform/trlutils-platform.svg?color=blue)](https://javadoc.io/doc/com.therandomlabs.utils.platform/trlutils-platform)-->

A collection of utilities for accessing and manipulating platform information.

TRLUtils-Platform does not account for any information irrelevant to JRE 8 and newer.

All public-facing code is documented with Javadoc and (mostly) tested with JUnit.

## Platform information

* `Platform#CURRENT_OS` refers to the current operating system if known.
* `Platform#CURRENT_OS_VERSION` refers to the current operating system version if known.
Only Windows and Mac OS X/macOS versions are implemented, and they can be found in
`WindowsVersion` and `MacOSVersion`.
* `Platform#JVM_ARCHITECTURE` refers to the current JVM architecture
(either `Architecture#THIRTY_TWO_BIT` or `Architecture#SIXTY_FOUR_BIT`).
* `Platform#JRE_DIRECTORY` refers to the JRE installation directory.
* `Platform#JRE_BIN_DIRECTORY` refers to the JRE `bin` directory.
* `Platform#JAVA_EXECUTABLE`, `Platform#JAVAW_EXECUTABLE` and `Platform#getJREExecutable(String)`
can all be used to retrieve the paths of executables found in the JRE `bin` directory.
* `Platform#getMACAddress()`, `Platform#getMACAddress(char)` and `Platform#getMACAddress(String)`
can be used to retrieve the MAC address of the local machine.
* `Platform#getClassLocation(Class)` can be used to retrieve the base location of any class.

## System properties

* `SystemProperties` contains the majority of the universal Java system properties on JRE 8 and
newer.
* `SystemProperty` instances are used to access and manipulate the values of system properties.
* There are several other `*SystemProperties` classes for more specific purposes. These are:
  * `GroovySystemProperties`
  * `IBMSystemProperties`
  * `MacSystemProperties`
  * `MiscSystemProperties`
  * `SunSystemProperties`
* Custom `SystemProperty` instances can be constructed by either implementing `SystemProperty` or
using one of the preexisting `SystemProperty` implementations under
`com.therandomlabs.utils.platform.systemproperty.type`, which include integers, booleans and
path lists.
