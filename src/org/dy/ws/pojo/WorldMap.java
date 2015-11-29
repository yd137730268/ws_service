package org.dy.ws.pojo;

import java.util.ArrayList;
import java.util.List;

public class WorldMap {
	private List<Entry> list;

	public WorldMap() {
		if (list == null) {
			list = new ArrayList<Entry>();
		}
	}

	public List<Entry> getList() {
		return list;
	}

	public void setList(List<Entry> list) {
		this.list = list;
	}

}
