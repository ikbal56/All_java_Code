package com.te.playercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.playerdto.Player;
import com.te.playerdto.PlayerResponse;
import com.te.playerservicelayer.PlayerService;

@RestController
public class PlayerController {

	@Autowired
	private PlayerService service;

	@PostMapping(path = "/add", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public PlayerResponse addPlayer(@RequestBody Player player) {

		PlayerResponse response = new PlayerResponse();

		if (service.addPlayer(player)) {
			response.setStatusCode(200);
			response.setMessage("Successfull");
			response.setDescription("Player : " + player.getName() + " added successfully");
		} else {
			response.setStatusCode(400);
			response.setMessage("Failed");
			response.setDescription("Player : " + player.getName() + " failed to add");
		}

		return response;
	}

}
