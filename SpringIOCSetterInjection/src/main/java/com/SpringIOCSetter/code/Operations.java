package com.SpringIOCSetter.code;

public class Operations 
{
	
	private int id;
	private StringOps ops;
	public int getId()
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public StringOps getOps() {
		return ops;
	}
	public void setOps(StringOps ops) {
		this.ops = ops;
	}
	
	public void replaceOperation()
	{
		String s1="navjeevan";
		s1=s1.replace('e','i');
		System.out.println("Replaced String"+s1);
	}

}
