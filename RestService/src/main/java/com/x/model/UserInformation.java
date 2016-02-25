package com.x.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "userInformation")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserInformation {

	private String name;
	private String address;
	private String city;
	private Long cellPhone;

	public UserInformation() {

	}

	public UserInformation(String nm, String addr, String cty, Long cellphone) {

		this.name = nm;
		this.address = addr;
		this.city = cty;
		this.cellPhone = cellphone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(Long cellPhone) {
		this.cellPhone = cellPhone;
	}

}
