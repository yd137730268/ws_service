package org.dy.ws.pojo;

public class Entry {
	private String key;
	private World value;

	public Entry() {

	}

	public Entry(String key, World value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public World getValue() {
		return value;
	}

	public void setValue(World value) {
		this.value = value;
	}

}
