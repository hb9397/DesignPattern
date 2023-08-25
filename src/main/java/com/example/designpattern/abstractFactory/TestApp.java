package com.example.designpattern.abstractFactory;

import com.example.designpattern.abstractFactory.AbstractFactoryCompany;
import com.example.designpattern.abstractFactory.service.ServiceForKakao;
import com.example.designpattern.abstractFactory.service.ServiceForNaver;
import com.example.designpattern.abstractFactory.service.ServiceForSamsung;

public class TestApp {
	public static void main(String[] args) {
		AbstractFactoryCompany forSamsung = new ServiceForSamsung();
		AbstractFactoryCompany forKakao = new ServiceForKakao();
		AbstractFactoryCompany forNaver = new ServiceForNaver();

		forSamsung.serviceToBE();
		forSamsung.serviceToCIAndCD();
		forSamsung.serviceToFE();

		forKakao.serviceToBE();
		forKakao.serviceToCIAndCD();
		forKakao.serviceToFE();

		forNaver.serviceToBE();
		forNaver.serviceToCIAndCD();
		forNaver.serviceToFE();
	}
}
