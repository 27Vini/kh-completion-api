package com.vinicius.khcompletion.util;

import com.vinicius.khcompletion.exceptions.DomainException;

public abstract class IdValidator {
    public static void validateId(Long id){
        if(id == null || id <= 0){
            throw new DomainException("Id must be a number higher than 0.");
        }
    }
}
