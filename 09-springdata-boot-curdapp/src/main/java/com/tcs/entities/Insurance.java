package com.tcs.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Insurance {
	@Id
	protected int id;
    protected String insuranceName;
    protected int maxAge;
    protected int minAge;
    protected int minInsuredAmount;
    protected int maxInsuredAmount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInsuranceName() {
		return insuranceName;
	}
	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	public int getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}
	public int getMinAge() {
		return minAge;
	}
	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	public int getMinInsuredAmount() {
		return minInsuredAmount;
	}
	public void setMinInsuredAmount(int minInsuredAmount) {
		this.minInsuredAmount = minInsuredAmount;
	}
	public int getMaxInsuredAmount() {
		return maxInsuredAmount;
	}
	public void setMaxInsuredAmount(int maxInsuredAmount) {
		this.maxInsuredAmount = maxInsuredAmount;
	}
	@Override
	public String toString() {
		return "Insurance [id=" + id + ", insuranceName=" + insuranceName + ", maxAge=" + maxAge + ", minAge=" + minAge
				+ ", minInsuredAmount=" + minInsuredAmount + ", maxInsuredAmount=" + maxInsuredAmount + "]";
	}
    

}
