package org.odata4j.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.StatusType;


public class ParseException extends ODataProducerException{

	private static final long serialVersionUID = 6748577364412896736L;

	public ParseException() {
		super("A parse exception occured", null);
	}

	public ParseException(String message, Throwable cause) {
		super(message, cause);
	}

	public ParseException(String message) {
		super(message,null);
	}

	public ParseException(Throwable cause) {
		super(cause.getLocalizedMessage(),cause);
	}

	@Override
	public StatusType getHttpStatus() {
		return Response.Status.BAD_REQUEST;
	}

}
