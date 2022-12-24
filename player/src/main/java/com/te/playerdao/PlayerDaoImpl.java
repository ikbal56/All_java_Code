package com.te.playerdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.playerdto.Player;

@Repository
public class PlayerDaoImpl implements PlayerDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("playerdetails");

	@Override
	public boolean addPlayer(Player player) {
		boolean isInserted = false;
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {

			transaction.begin();
			manager.persist(player);
			transaction.commit();
			isInserted = true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return isInserted;
	}

}
