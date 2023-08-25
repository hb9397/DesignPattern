package com.example.designpattern.factoryMethod.service;

import com.example.designpattern.factoryMethod.product.cicd.KakaoCICD;
import com.example.designpattern.factoryMethod.product.cicd.NaverCICD;
import com.example.designpattern.factoryMethod.product.cicd.SamsungCICD;
import com.example.designpattern.factoryMethod.FactoryMethodCompany;

public class CICDService implements FactoryMethodCompany {

	@Override
	public void serviceForCompany(String company) {
		switch (company.toLowerCase()) {
			case "samsung":
				SamsungCICD samsungCICD = new SamsungCICD();
				samsungCICD.makeToSolution();
				System.out.println();
				break;
			case "kakao":
				KakaoCICD kakaoCICD = new KakaoCICD();
				kakaoCICD.makeToSolution();
				System.out.println();
				break;
			case "naver":
				NaverCICD naverCICD = new NaverCICD();
				naverCICD.makeToSolution();
				System.out.println();
				break;
		}
	}
}
