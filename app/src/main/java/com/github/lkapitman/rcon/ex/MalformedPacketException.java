package com.github.lkapitman.rcon.ex;

import java.io.IOException;

/**
 * The type Malformed packet exception.
 */
public class MalformedPacketException extends IOException {

	/**
	 * Instantiates a new Malformed packet exception.
	 *
	 * @param message the message
	 */
	public MalformedPacketException(String message) {
		super(message);
	}
	
}
