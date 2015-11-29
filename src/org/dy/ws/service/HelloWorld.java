package org.dy.ws.service;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import org.dy.ws.pojo.User;
import org.dy.ws.pojo.World;

@WebService
public interface HelloWorld {
	String sayHi(String name);

	List<World> getWorldsByUser(User user);
	
	Map<String, World> getAllWorlds();
}
