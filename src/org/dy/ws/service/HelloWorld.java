package org.dy.ws.service;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.dy.ws.pojo.User;
import org.dy.ws.pojo.World;
import org.dy.ws.util.WorldMapXmlAdapter;

@WebService
public interface HelloWorld {
	String sayHi(String name);

	List<World> getWorldsByUser(User user);
	
	Map<String, World> getAllWorlds();
	//自定义转换器
	@XmlJavaTypeAdapter(WorldMapXmlAdapter.class) Map<String, World> getAllWorlds2();
}
