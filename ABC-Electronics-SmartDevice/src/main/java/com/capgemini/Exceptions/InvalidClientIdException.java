package com.capgemini.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class InvalidClientIdException extends Exception 
{
		public InvalidClientIdException(String message){
		        super(message);
		    }
	}
