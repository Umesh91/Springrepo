package com.SpringAutoWiringByType.spellcheck;

public class TextEditor
{
	private String name;
	private SpellChecker checker;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SpellChecker getChecker() {
		return checker;
	}
	public void setChecker(SpellChecker checker) {
		this.checker = checker;
	}
	
	public void checkIt()
	{
		checker.checkSpelling();
	}

}
