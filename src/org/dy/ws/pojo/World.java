package org.dy.ws.pojo;

public class World {
	private int id;
	private String feel;

	public World() {

	}

	public World(int i, String string) {
		this.id = i;
		this.feel = string;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFeel() {
		return feel;
	}

	public void setFeel(String feel) {
		this.feel = feel;
	}

}
