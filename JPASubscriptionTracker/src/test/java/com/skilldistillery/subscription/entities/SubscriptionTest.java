package com.skilldistillery.subscription.entities;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SubscriptionTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Subscription subscription;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("SubscriptionTrackerPU");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		subscription = em.find(Subscription.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
	}

	@Test
	@DisplayName("Test subscriptions entity mapping")
	void test() {
		assertNotNull(subscription);
		assertEquals("netflix", subscription.getName());
		assertEquals("2020-05-12", subscription.getRenewalDate());
		assertEquals(15.99, subscription.getCost());
		assertEquals(LocalDateTime.of(2020, 04, 12, 02, 00, 00), subscription.getCreatedAt());
		assertEquals(LocalDateTime.of(2020, 04, 12, 02, 00, 00), subscription.getUpdatedAt());
	}

}
