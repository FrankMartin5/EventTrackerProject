package com.skilldistillery.subscription.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.subscription.entities.Subscription;

@Transactional
@Service
public class SubscriptionDAOImpl implements SubscriptionDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Subscription createSubscription(Subscription subscription) {
		em.persist(subscription);
		em.flush();
		return subscription;
	}

	@Override
	public Subscription updateSubscription(Integer id, Subscription subscription) {
		Subscription managed = em.find(Subscription.class, id);
		if (managed != null) {
			managed.setName(subscription.getName());
			managed.setRenewalDate(subscription.getRenewalDate());
			managed.setCost(subscription.getCost());
			em.persist(managed);
			em.flush();
		}
		return managed;
	}
	

}
