package org.dy.ws.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import org.dy.ws.pojo.User;
import org.dy.ws.pojo.World;
import org.dy.ws.service.HelloWorld;

@WebService(targetNamespace = "org.dy.ws.service.impl.HelloWorldWS", serviceName = "HelloWorldWS")
public class HelloWorldWS implements HelloWorld {
	public static User USER = new User(1, "Dong", new Date());
	public static World[] WORLDS = { new World(1, "cold"), new World(2, "warm") };

	@Override
	public String sayHi(String name) {
		String log = "sayHi -> " + name;
		System.out.println(log);
		return log;
	}

	@Override
	public List<World> getWorldsByUser(User user) {
		String log = "getWorldsByUser -> "
				+ (user != null ? user.getName() : "");
		System.out.println(log);

		List<World> list = new ArrayList<World>();
		if (USER.equals(user)) {
			list.add(WORLDS[0]);
		}
		return list;
	}
}
