package com.example.designpattern.factoryMethod.product.cicd;

import com.example.designpattern.factoryMethod.product.ServiceProduct;

public class CIAndCD implements ServiceProduct {
	@Override
	public void makeToSolution() {
		System.out.println("CI/CD 솔루션 제공 -> 고객사의 공통 설정");
	}
}
