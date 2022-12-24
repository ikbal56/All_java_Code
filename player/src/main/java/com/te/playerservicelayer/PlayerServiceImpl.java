package com.te.playerservicelayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.playerdao.PlayerDAO;
import com.te.playerdto.Player;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
  private PlayerDAO dao;

  @Override
  public boolean addPlayer(Player player) {

		return dao.addPlayer(player);

	}

}
