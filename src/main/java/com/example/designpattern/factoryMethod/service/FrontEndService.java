package com.example.designpattern.factoryMethod.service;


import com.example.designpattern.factoryMethod.FactoryMethodCompany;
import com.example.designpattern.factoryMethod.product.fe.KakaoFE;
import com.example.designpattern.factoryMethod.product.fe.NaverFE;
import com.example.designpattern.factoryMethod.product.fe.SamsungFE;

public class FrontEndService implements FactoryMethodCompany {

	@Override
	public void serviceForCompany(String company) {
		switch (company.toLowerCase()) {
			case "samsung":
				SamsungFE samsungFE = new SamsungFE();
				samsungFE.makeToSolution();
				System.out.println();
				break;
			case "kakao":
				KakaoFE kakaoFE = new KakaoFE();
				kakaoFE.makeToSolution();
				System.out.println();
				break;
			case "naver":
				NaverFE naverFE = new NaverFE();
				naverFE.makeToSolution();
				System.out.println();
				break;
		}
	}
}
