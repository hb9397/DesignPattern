package com.example.designpattern.abstractFactory.product.cicd;

public class NaverCICD extends CIAndCD{
	@Override
	public void makeToSolution() {
		super.makeToSolution();
		System.out.println("네이버 CI/CD 솔루션");
	}
}
