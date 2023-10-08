/**
 * 
 */
package com.SpringAutoWiringByType.code;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author A631954
 *
 */
public class City 
{
	private int id;
	private String name;
	private State state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public State getState() {
		return state;
	}
	@Autowired(required = true)
	public void setState(State state) {
		this.state = state;
	}
	
	public void showCityDetails()
	{
		System.out.println("City Id"+id);
		System.out.println("City name"+name);
		System.out.println("State details"+state.getName());
	}

}
