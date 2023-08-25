package com.example.designpattern.abstractFactory.service;

import com.example.designpattern.abstractFactory.AbstractFactoryCompany;
import com.example.designpattern.abstractFactory.product.be.KakaoBE;
import com.example.designpattern.abstractFactory.product.cicd.KakaoCICD;
import com.example.designpattern.abstractFactory.product.fe.KakaoFE;

public class ServiceForKakao implements AbstractFactoryCompany {
	@Override
	public void serviceToBE() {
		KakaoBE kakaoBE = new KakaoBE();
		kakaoBE.makeToSolution();
		System.out.println();
	}

	@Override
	public void serviceToCIAndCD() {
		KakaoCICD kakaoCICD = new KakaoCICD();
		kakaoCICD.makeToSolution();
		System.out.println();
	}

	@Override
	public void serviceToFE() {
		KakaoFE kakaoFE = new KakaoFE();
		kakaoFE.makeToSolution();
		System.out.println();
	}
}
