package com.skilldistillery.subscription.data;

import java.util.List;

import com.skilldistillery.subscription.entities.Subscription;

public interface SubscriptionDAO {

	public List<Subscription> findAll();
	
	
}
