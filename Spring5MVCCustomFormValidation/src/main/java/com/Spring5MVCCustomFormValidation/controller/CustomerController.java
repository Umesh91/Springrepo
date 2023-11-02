/**
 * 
 */
package com.Spring5MVCCustomFormValidation.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Spring5MVCCustomFormValidation.model.Customer;

/**
 * @author A631954
 *
 */
@Controller
@RequestMapping("/customer")
public class CustomerController 
{
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		StringTrimmerEditor st=new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, st);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		model.addAttribute("customer",new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer,BindingResult theBindingResult)
	{
		if(theBindingResult.hasErrors())
		{
			return "customer-form";
		}else {
			return "customer-confirmation";
		}
	}
}
