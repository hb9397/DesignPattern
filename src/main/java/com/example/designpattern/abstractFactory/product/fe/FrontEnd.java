package com.example.designpattern.abstractFactory.product.fe;

import com.example.designpattern.abstractFactory.product.ServiceProduct;

public class FrontEnd implements ServiceProduct {
	@Override
	public void makeToSolution() {
		System.out.println("FE 솔루션 제공 -> 고객사의 공통 설정");
	}
}
