package com.example.designpattern.factoryMethod.service;

import com.example.designpattern.factoryMethod.product.be.KakaoBE;
import com.example.designpattern.factoryMethod.product.be.NaverBE;
import com.example.designpattern.factoryMethod.product.be.SamsungBE;
import com.example.designpattern.factoryMethod.FactoryMethodCompany;

public class BackEndService implements FactoryMethodCompany {
	@Override
	public void serviceForCompany(String company) {
		switch (company.toLowerCase()) {
			case "samsung":
				SamsungBE samsungBE = new SamsungBE();
				samsungBE.makeToSolution();
				System.out.println();
				break;
			case "kakao":
				KakaoBE kakaoBE = new KakaoBE();
				kakaoBE.makeToSolution();
				System.out.println();
				break;
			case "naver":
				NaverBE naverBE = new NaverBE();
				naverBE.makeToSolution();
				System.out.println();
				break;
		}
	}
}
