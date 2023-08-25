package com.example.designpattern.factoryMethod;

import com.example.designpattern.factoryMethod.service.BackEndService;
import com.example.designpattern.factoryMethod.service.CICDService;
import com.example.designpattern.factoryMethod.service.FrontEndService;

public class TestApp {
	public static void main(String[] args) {
		FactoryMethodCompany serviceForBE = new BackEndService();
		FactoryMethodCompany serviceForCICD = new CICDService();
		FactoryMethodCompany serviceForFE = new FrontEndService();

		serviceForBE.serviceForCompany("Samsung");
		serviceForFE.serviceForCompany("Samsung");
		serviceForCICD.serviceForCompany("Samsung");

		serviceForBE.serviceForCompany("Kakao");
		serviceForFE.serviceForCompany("Kakao");
		serviceForCICD.serviceForCompany("Kakao");

		serviceForBE.serviceForCompany("Naver");
		serviceForFE.serviceForCompany("Naver");
		serviceForCICD.serviceForCompany("Naver");
	}
}
