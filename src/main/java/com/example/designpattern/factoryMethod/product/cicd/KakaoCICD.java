package com.example.designpattern.factoryMethod.product.cicd;

public class KakaoCICD extends CIAndCD {
	@Override
	public void makeToSolution() {
		super.makeToSolution();
		System.out.println("카카오 CI/CD 솔루션");
	}
}
