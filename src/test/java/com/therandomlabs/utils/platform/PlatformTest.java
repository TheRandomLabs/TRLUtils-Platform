/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2019-2020 TheRandomLabs
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.therandomlabs.utils.platform;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

public class PlatformTest {
	@Test
	public void osShouldNotBeUnknown() {
		assertThat(Platform.CURRENT_OS).isNotNull().isNotEqualTo(OS.UNKNOWN);
	}

	@Test
	public void osVersionShouldBeKnownForWindowsAndMacOS() {
		assumeTrue(Platform.CURRENT_OS == OS.WINDOWS || Platform.CURRENT_OS == OS.MACOS);
		assertThat(Platform.CURRENT_OS_VERSION).isNotNull().isNotEqualTo(OSVersion.unknown());
	}

	@Test
	public void jvmArchitectureShouldNotBeUnknown() {
		assertThat(Platform.JVM_ARCHITECTURE).isNotNull().isNotEqualTo(Architecture.UNKNOWN);
	}

	@Test
	public void jrePathsShouldBeValid() {
		assertThat(Platform.JRE_DIRECTORY).isDirectory();
		assertThat(Platform.JRE_BIN_DIRECTORY).isDirectory();
		//We don't check for javaw since it doesn't seem to exist on GitHub CI.
		assertThat(Platform.JAVA_EXECUTABLE).isExecutable();
	}

	@Test
	public void macAddressShouldBeValid() {
		assertThat(Platform.getMACAddress()).matches("^([0-9a-f]{2}:){5}([0-9a-f]{2})$");
	}

	@Test
	public void classLocationShouldNotBeNull() {
		assertThat(Platform.getClassLocation(getClass())).isNotNull();
	}
}
