/**
 * 
 */
package com.Spring5MVCFormValidation.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Spring5MVCFormValidation.model.Customer;

/**
 * @author A631954
 *
 */
@Controller
@RequestMapping("/customer")
public class CustomerController
{
	
	// add an initbinder ... to convert trim input strings
    // remove leading and trailing whitespace
    // resolve issue for our validation
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		StringTrimmerEditor editor=new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, editor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		model.addAttribute("customer",new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "customer-form";
		}else
		{
			return "customer-confirmation";
		}
	}
	
	
}
