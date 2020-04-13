package com.skilldistillery.subscription.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.subscription.entities.Subscription;
import com.skilldistillery.subscription.repositories.SubscriptionRepository;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

	@Autowired
	private SubscriptionRepository subRepo;
	
	@Override
	public List<Subscription> findAllSubscriptions() {
		return subRepo.findAll();
	}

	@Override
	public Subscription findSingleSubscription(Integer id) {
		Optional<Subscription> optSub = subRepo.findById(id);
		
		if (optSub.isPresent()) {
			Subscription foundSubscription = optSub.get();
			return foundSubscription;
		}
		return null;
	}
	
	


}
