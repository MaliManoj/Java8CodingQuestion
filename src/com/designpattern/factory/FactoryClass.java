package com.designpattern.factory;

public class FactoryClass {
	public Profession createProcession(String str)
	{
		if(str==null)
			return null;
		else if(str.equals("Doctor"))
			return new Doctor();
		else return new Engineer();
	}
}
