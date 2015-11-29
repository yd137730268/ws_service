package org.dy.ws.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.dy.ws.pojo.Entry;
import org.dy.ws.pojo.World;
import org.dy.ws.pojo.WorldMap;

public class WorldMapXmlAdapter extends
		XmlAdapter<WorldMap, Map<String, World>> {

	@Override
	public WorldMap marshal(Map<String, World> map) throws Exception {
		WorldMap worldMap = new WorldMap();
		if (map == null) {
			return worldMap;
		}
		Entry entry = null;
		List<Entry> entryList = worldMap.getList();
		for (String key : map.keySet()) {
			entry = new Entry(key, map.get(key));
			entryList.add(entry);
		}
		return worldMap;
	}

	@Override
	public Map<String, World> unmarshal(WorldMap worldMap) throws Exception {
		Map<String, World> map = new HashMap<String, World>();
		if (worldMap == null || (worldMap != null && worldMap == null)) {
			return map;
		}
		for (Entry entry : worldMap.getList()) {
			map.put(entry.getKey(), entry.getValue());
		}
		return map;
	}

}
