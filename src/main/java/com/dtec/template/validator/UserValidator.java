package com.dtec.template.validator;

import com.dtec.template.entity.UserEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by rikikun on 2/16/2015.
 */
@Component
public class UserValidator implements Validator {
	public boolean supports(Class clazz) {
		return UserEntity.class.equals(clazz);
	}

	public void validate(Object o, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "userName", "name.empty",
				"name.empty");
		ValidationUtils.rejectIfEmpty(errors, "password", "password.empty",
				"password.empty");
	}
}
