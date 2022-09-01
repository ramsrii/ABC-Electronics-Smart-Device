package com.capgemini.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class InvalidComplaintException  extends Exception
{
	public InvalidComplaintException(String message)
	{
	        super(message); 
	}

}
