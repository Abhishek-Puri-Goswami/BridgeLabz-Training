package com.day03.markmate;

public class InvalidMarkException extends Exception {
	private static final long serialVersionUID = 1L;

	// constructor
    public InvalidMarkException(String message) {
        super(message);
    }
}
