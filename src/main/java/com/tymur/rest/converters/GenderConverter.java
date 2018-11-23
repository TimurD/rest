package com.tymur.rest.converters;

import com.tymur.rest.gender.Gender;

import javax.persistence.AttributeConverter;

public class GenderConverter implements AttributeConverter<String, Integer> {

    private static final String GENDER_NOT_FOUND_MESSAGE = "Gender not found: ";

    @Override
    public Integer convertToDatabaseColumn(String gender) {
        if (gender.equals(Gender.MALE.getName())) {
            return 0;
        }
        if (gender.equals(Gender.FEMALE.getName())) {
            return 1;
        }
        throw new RuntimeException(GENDER_NOT_FOUND_MESSAGE + gender);
    }

    @Override
    public String convertToEntityAttribute(Integer dbValue) {
        if (dbValue == 0) {
            return Gender.MALE.getName();
        }
        if (dbValue == 1) {
            return Gender.FEMALE.getName();
        }
        throw new RuntimeException(GENDER_NOT_FOUND_MESSAGE + dbValue);
    }
}
