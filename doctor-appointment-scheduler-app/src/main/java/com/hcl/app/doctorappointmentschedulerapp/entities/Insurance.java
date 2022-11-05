package com.hcl.app.doctorappointmentschedulerapp.entities;

import jakarta.persistence.Embeddable;

/**
 * This class is the model representation of Insurance
 */
@Embeddable
public class Insurance {

	//Insurance Provider Name
	private String providerName;

	//Copay that patient has to pay for the visit
	private double copay;

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public double getCopay() {
		return copay;
	}

	public void setCopay(double copay) {
		this.copay = copay;
	}

	@Override
	public String toString() {
		return "Insurance [providerName=" + providerName + ", copay=" + copay + "]";
	}
	

}
