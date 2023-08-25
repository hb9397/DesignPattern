package com.example.designpattern.abstractFactory.service;

import com.example.designpattern.abstractFactory.AbstractFactoryCompany;
import com.example.designpattern.abstractFactory.product.be.NaverBE;
import com.example.designpattern.abstractFactory.product.cicd.NaverCICD;
import com.example.designpattern.abstractFactory.product.fe.NaverFE;

public class ServiceForNaver implements AbstractFactoryCompany {
	@Override
	public void serviceToBE() {
		NaverBE naverBE = new NaverBE();
		naverBE.makeToSolution();
		System.out.println();
	}

	@Override
	public void serviceToCIAndCD() {
		NaverCICD naverCICD = new NaverCICD();
		naverCICD.makeToSolution();
		System.out.println();
	}

	@Override
	public void serviceToFE() {
		NaverFE naverFE = new NaverFE();
		naverFE.makeToSolution();
		System.out.println();
	}
}
