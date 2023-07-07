package com.melek.yilmaz.embed.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//embed javada iki classın veritabanında tek bir tabloya karşılık gelmesi(denormalizasyon-olağansızlaştırma)



@Embeddable   //başka bir varlığın içinde gömülü olan sınıftır.Ayrı bir entity değildir
//Customer entitysinin içinde gömülüdür
public class Address {

	
	private String provinceName;
	private String districtName;
	private String addressLine1;
	private String adressLine2;
	
	
	
	

	
	
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAdressLine2() {
		return adressLine2;
	}
	public void setAdressLine2(String adressLine2) {
		this.adressLine2 = adressLine2;
	}

	

}
