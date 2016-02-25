package com.x.restservice;

import java.io.IOException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;

import com.x.model.UserInformation;

@Path("/UserService")
public class UserService {

	@POST
	@Path("/demographic")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public UserInformation userPersonalDetail(UserInformation form)	throws JAXBException, IOException {

		UserInformation userInfo = new UserInformation();
		userInfo.setAddress(form.getAddress());
		userInfo.setCellPhone(form.getCellPhone());
		userInfo.setCity(form.getCity());
		userInfo.setName(form.getName());

		return userInfo;
	}

	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public String test() throws JAXBException,
			IOException {
		
		String msg = "User Info Service is UP and Running!";
		System.out.println("***INSIDE TEST***");
		return msg;

	}

}
