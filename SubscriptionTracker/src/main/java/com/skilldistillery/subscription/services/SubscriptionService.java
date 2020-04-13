package com.skilldistillery.subscription.services;

import java.util.List;

import com.skilldistillery.subscription.entities.Subscription;

public interface SubscriptionService {

	List<Subscription> findAllSubscriptions();
	Subscription findSingleSubscription(Integer id);
}
