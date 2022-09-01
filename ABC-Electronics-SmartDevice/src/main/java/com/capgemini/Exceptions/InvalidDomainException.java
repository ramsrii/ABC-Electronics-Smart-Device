package com.capgemini.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class InvalidDomainException extends Exception{
	
		public InvalidDomainException(String message){
	        super(message);
	    }

}
