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

import java.util.Objects;

import com.google.errorprone.annotations.Immutable;

/**
 * Represents an {@link OS} version.
 */
@Immutable
public final class OSVersion implements Comparable<OSVersion> {
	private static final OSVersion UNKNOWN = new OSVersion("Unknown", "Unknown");

	private final String fullName;
	private final String versionNumber;

	OSVersion(String fullName, String versionNumber) {
		this.fullName = fullName;
		this.versionNumber = versionNumber;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		return Objects.hash(fullName, versionNumber);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object object) {
		//It isn't actually necessary to implement equals here; I've just done it to fix the
		//warnings.
		return this == object;
	}

	/**
	 * Returns the full name of this {@link OSVersion}, e.g. {@code "Windows 7"} or
	 * {@code "macOS Catalina"}.
	 *
	 * @return the full name of this {@link OSVersion}.
	 */
	@Override
	public String toString() {
		return fullName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int compareTo(OSVersion version) {
		return fullName.compareTo(version.fullName);
	}

	/**
	 * Returns the full name of this {@link OSVersion}, e.g. {@code "Windows 7"} or
	 * {@code "macOS Catalina"}.
	 *
	 * @return the full name of this {@link OSVersion}.
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * Returns this {@link OSVersion}'s version number, e.g. {@code "10.10"}.
	 * This number may be but is not necessarily included in the full name returned by
	 * {@link #getFullName()}).
	 *
	 * @return this {@link OSVersion}'s version number.
	 */
	public String getVersionNumber() {
		return versionNumber;
	}

	/**
	 * Returns whether this {@link OSVersion} is {@link OSVersion#unknown()}.
	 *
	 * @return whether this {@link OSVersion} is {@link OSVersion#unknown()}.
	 */
	public boolean isUnknown() {
		return equals(UNKNOWN);
	}

	/**
	 * Returns an {@link OSVersion} that represents an unknown OS version.
	 *
	 * @return an {@link OSVersion} that represents an unknown OS version.
	 */
	public static OSVersion unknown() {
		return UNKNOWN;
	}
}
