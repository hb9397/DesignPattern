package com.example.designpattern.factoryMethod.product.cicd;

public class SamsungCICD extends CIAndCD {
	@Override
	public void makeToSolution() {
		super.makeToSolution();
		System.out.println("삼성 CI/CD 솔루션");
	}
}
