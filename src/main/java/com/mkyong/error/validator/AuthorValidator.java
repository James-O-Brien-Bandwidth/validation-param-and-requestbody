package com.mkyong.error.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class AuthorValidator implements ConstraintValidator<Author, String> {

    //Custom validation for Author done here
    List<String> authors = Arrays.asList("Santideva", "Marie Kondo", "Martin Fowler", "mkyong");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        //Add whatever checks you want here for validations

        return authors.contains(value);

    }
}
