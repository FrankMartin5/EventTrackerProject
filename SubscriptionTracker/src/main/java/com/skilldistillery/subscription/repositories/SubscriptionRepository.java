package com.skilldistillery.subscription.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.subscription.entities.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, Integer> {

}
