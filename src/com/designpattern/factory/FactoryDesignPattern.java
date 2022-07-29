package com.designpattern.factory;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		FactoryClass f=new FactoryClass();
		Profession p2=f.createProcession("Doctor");
		p2.getProfession();
//		Profession p1=f.createProcession("Engineer");
//		p1.getProfession();
		

	}

}
