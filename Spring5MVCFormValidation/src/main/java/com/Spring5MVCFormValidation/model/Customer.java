/**
 * 
 */
package com.Spring5MVCFormValidation.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

/**
 * @author A631954
 *
 */
public class Customer 
{
	private String firstName;
	@NotNull(message = "is required")
	@Size(min = 1,message = "is required")
	private String lastName;
	
	@NotNull(message = "is required")
	@Min(value = 0,message = "Value must be greater than 0")
	@Max(value = 10,message = "value must be less than 10")
	private Integer freePasses;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}\", message = \"only 5 chars/digits")
	private String postalCode;
	
	@NotNull(message = "is required")
	@Email(message = "Invalid email! Please enter valid email")
	private String email;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
