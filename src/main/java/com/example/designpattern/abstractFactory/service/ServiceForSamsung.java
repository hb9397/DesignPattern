package com.example.designpattern.abstractFactory.service;

import com.example.designpattern.abstractFactory.AbstractFactoryCompany;
import com.example.designpattern.abstractFactory.product.be.SamsungBE;
import com.example.designpattern.abstractFactory.product.cicd.SamsungCICD;
import com.example.designpattern.abstractFactory.product.fe.SamsungFE;

public class ServiceForSamsung implements AbstractFactoryCompany {
	@Override
	public void serviceToBE() {
		SamsungBE samsungBE = new SamsungBE();
		samsungBE.makeToSolution();
		System.out.println();
	}

	@Override
	public void serviceToCIAndCD() {
		SamsungCICD samsungCICD = new SamsungCICD();
		samsungCICD.makeToSolution();
		System.out.println();
	}

	@Override
	public void serviceToFE() {
		SamsungFE samsungFE = new SamsungFE();
		samsungFE.makeToSolution();
		System.out.println();
	}
}
