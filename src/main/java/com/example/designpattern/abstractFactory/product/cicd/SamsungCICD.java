package com.example.designpattern.abstractFactory.product.cicd;

import com.example.designpattern.abstractFactory.product.be.BackEnd;

public class SamsungCICD extends CIAndCD {
	@Override
	public void makeToSolution() {
		super.makeToSolution();
		System.out.println("삼성 CI/CD 솔루션");
	}
}
