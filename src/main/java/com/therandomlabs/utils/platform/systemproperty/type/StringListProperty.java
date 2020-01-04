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

package com.therandomlabs.utils.platform.systemproperty.type;

import java.util.List;

import com.therandomlabs.utils.platform.systemproperty.SystemProperty;

/**
 * A {@link SystemProperty} with a list value consisting of string elements.
 */
public class StringListProperty extends ListProperty<String> {
	/**
	 * Constructs a {@link StringListProperty}.
	 *
	 * @param key the key of this {@link StringListProperty}.
	 * @param separator the character that separates the list elements in the raw string value
	 * of this {@link StringListProperty}.
	 */
	public StringListProperty(String key, char separator) {
		this(key, separator, false);
	}

	/**
	 * Constructs a {@link StringListProperty}.
	 *
	 * @param key the key of this {@link StringListProperty}.
	 * @param separator the string that separates the list elements in the raw string value
	 * of this {@link StringListProperty}.
	 */
	public StringListProperty(String key, String separator) {
		this(key, separator, false);
	}

	/**
	 * Constructs a {@link StringListProperty}.
	 *
	 * @param key the key of this {@link StringListProperty}.
	 * @param separator the character that separates the list elements in the raw string value
	 * of this {@link StringListProperty}.
	 * @param editable whether this {@link StringListProperty} can be edited by calling
	 * {@link SystemProperty#set(Object)} instead of {@link SystemProperty#forceSet(String)}.
	 */
	public StringListProperty(String key, char separator, boolean editable) {
		super(key, separator, editable);
	}

	/**
	 * Constructs a {@link StringListProperty}.
	 *
	 * @param key the key of this {@link StringListProperty}.
	 * @param separator the string that separates the list elements in the raw string value
	 * of this {@link StringListProperty}.
	 * @param editable whether this {@link StringListProperty} can be edited by calling
	 * {@link SystemProperty#set(Object)} instead of {@link SystemProperty#forceSet(String)}.
	 */
	public StringListProperty(String key, String separator, boolean editable) {
		super(key, separator, editable);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected List<String> convertList(List<String> list) {
		return list;
	}
}
