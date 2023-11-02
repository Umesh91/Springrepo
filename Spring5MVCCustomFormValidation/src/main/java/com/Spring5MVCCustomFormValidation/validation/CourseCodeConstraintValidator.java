/**
 * 
 */
package com.Spring5MVCCustomFormValidation.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author A631954
 *
 */
public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> 
{
	
	private String coursePrefix;

	public void initialize(CourseCode courseCode) {
		// TODO Auto-generated method stub
		coursePrefix=courseCode.value();
	}

	public boolean isValid(String theCode, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		boolean result;
		if(theCode !=null) {
			result=theCode.startsWith(coursePrefix);
		}else {result=true;}
		
		return result;
	}

}
