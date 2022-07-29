package com.designpattern.factory;

public class Doctor  implements Profession{
	@Override
	public void getProfession() {
		System.out.println("I am an Doctor");
	}
}