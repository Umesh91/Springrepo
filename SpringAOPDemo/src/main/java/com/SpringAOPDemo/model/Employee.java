/**
 * 
 */
package com.SpringAOPDemo.model;
import com.SpringAOPDemo.Aspect.Loggable;

/**
 * @author A631954
 *
 */
public class Employee 
{
private String name;
	
	public String getName() {
		return name;
	}

	@Loggable
	public void setName(String nm) {
		this.name=nm;
	}
	
	public void throwException(){
		throw new RuntimeException("Dummy Exception");
	}	
}
