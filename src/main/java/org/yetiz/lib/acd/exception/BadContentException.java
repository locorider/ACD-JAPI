package org.yetiz.lib.acd.exception;

import org.yetiz.lib.utils.Log;

/**
 * Created by yeti on 2015/4/13.
 */
public class BadContentException extends RuntimeException {
	/**
	 * Constructs a new runtime exception with {@code null} as its
	 * detail message.  The cause is not initialized, and may subsequently be
	 * initialized by a call to {@link #initCause}.
	 */
	public BadContentException() {
		super("Data can't convert to JSON type.");
		Log.e(getMessage());
	}

	public BadContentException(String message) {
		super(message);
		Log.e(getMessage());
	}
}
