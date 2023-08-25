package com.example.designpattern.factoryMethod.product.be;

import com.example.designpattern.factoryMethod.product.ServiceProduct;

public class BackEnd implements ServiceProduct {
	@Override
	public void makeToSolution() {
		System.out.println("BE 솔루션 제공 -> 고객사의 공통 설정");
	}
}
