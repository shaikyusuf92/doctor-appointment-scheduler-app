package com.hcl.app.doctorappointmentschedulerapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Custom Exception Class for doctor-appointment-scheduling API Exceptions
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public  class ResourceNotFoundException extends RuntimeException{

        private static final long serialVersionUID = 1L;

        public ResourceNotFoundException(String message) {
            super(message);
        }
    }