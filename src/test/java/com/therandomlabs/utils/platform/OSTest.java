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

import org.junit.jupiter.api.Test;

public class OSTest {
	@Test
	public void macOSCatalinaShouldReturnCorrectVersion() {
		assertThat(OS.MACOS.getVersionByName("macOS Catalina")).isEqualTo(MacOSVersion.CATALINA);
	}

	@Test
	public void macOS10152ShouldReturnCorrectVersion() {
		assertThat(OS.MACOS.getVersionByVersionNumber("10.15.2")).isEqualTo(MacOSVersion.CATALINA);
	}

	@Test
	public void server2016ByNameShouldReturnCorrectVersion() {
		assertThat(OS.WINDOWS.getVersionByName("Windows Server 2016")).
				isEqualTo(WindowsVersion.WINDOWS_SERVER_2016);
	}

	@Test
	public void server2016ByVersionNumberShouldReturnCorrectVersion() {
		assertThat(OS.WINDOWS.getVersionByVersionNumber("Server 2016")).
				isEqualTo(WindowsVersion.WINDOWS_SERVER_2016);
	}

	@Test
	public void windowsCEByNameShouldReturnCorrectOS() {
		assertThat(OS.fromName("Windows CE")).isEqualTo(OS.WINDOWS_CE);
	}

	@Test
	public void windows8ByNameShouldReturnCorrectOS() {
		assertThat(OS.fromName("Windows 8")).isEqualTo(OS.WINDOWS);
	}
}
