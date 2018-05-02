package com.microsoft.graph.http;

import java.io.InputStream;

/**
 * Wraps an InputStream to pass as a request body
 */
public class InputStreamBody {

	private InputStream inputStream;
	private int contentLength;

	public InputStreamBody(InputStream inputStream, int contentLength) {
		this.inputStream = inputStream;
		this.contentLength = contentLength;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public int getContentLength() {
		return contentLength;
	}

}
