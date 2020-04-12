package com.skilldistillery.subscription.data;

import java.util.List;

import com.skilldistillery.subscription.entities.Subscription;

public interface SubscriptionDAO {
	
	Subscription createSubscription(Subscription subscription);
	Subscription updateSubscription(Integer id, Subscription subscription);
	
}
