package com.example.designpattern.abstractFactory.product.be;

public class NaverBE extends BackEnd{
	@Override
	public void makeToSolution() {
		super.makeToSolution();
		System.out.println("네이버 BE 솔루션");
	}
}
