package com.skilldistillery.subscription.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.subscription.data.SubscriptionDAO;
import com.skilldistillery.subscription.entities.Subscription;
import com.skilldistillery.subscription.services.SubscriptionService;

@RestController
@RequestMapping("api")
public class SubscriptionController {

	@Autowired
	private SubscriptionDAO subDao;
	
	@Autowired 
	private SubscriptionService subSvc;
	
	@GetMapping("subscriptions")
	public List<Subscription> listSubs(){
		return subSvc.findAllSubscriptions();
	}
	
	@GetMapping("subscriptions/{id}")
	public Subscription findSingleSub(@PathVariable("id") Integer id, HttpServletResponse resp) {
		Subscription sub = subSvc.findSingleSubscription(id);
		if (sub == null) {
			resp.setStatus(404);
		}
		return sub;
	}
	
	@PostMapping("subscriptions")
	public Subscription createSub(@RequestBody Subscription sub, HttpServletResponse resp, HttpServletRequest req) {
		try {
			subDao.createSubscription(sub);
			resp.setStatus(201);
			StringBuffer url = req.getRequestURL();
			url.append("/").append(sub.getId());
			String location = url.toString();
			resp.addHeader("Location", location);
		} catch (Exception e) {
			e.printStackTrace();
			resp.setStatus(400);
			sub = null;
		}
		return sub;
	}
	
}





















