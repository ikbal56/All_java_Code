package com.te.playerdto;

import org.springframework.beans.factory.annotation.Autowired;

public class PlayerResponse {
	
	private int statusCode;
	private String message;
	private String description;
	
	@Autowired
	private Player player;

	public PlayerResponse(int statusCode, String message, String description, Player player) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.description = description;
		this.player = player;
	}

	public PlayerResponse() {
		super();
		
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return "PlayerResponse [statusCode=" + statusCode + ", message=" + message + ", description=" + description
				+ ", player=" + player + "]";
	}
	
	
	

}
