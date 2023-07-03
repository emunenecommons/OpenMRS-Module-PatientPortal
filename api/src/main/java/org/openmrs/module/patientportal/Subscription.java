package org.openmrs.module.patientportal;

import org.openmrs.event.EventListener;

import javax.jms.Message;

public class Subscription implements EventListener {
	
	public Subscription() {
		System.out.println("Module Initialized");
	}
	
	private int createdCount = 0;
	
	private int updatedCount = 0;
	
	private int purgedCount = 0;
	
	public int getCreatedCount() {
		return createdCount;
	}
	
	public void getUpdatedCount() {
		
	}
	
	public int getPurgedCount() {
		return purgedCount;
	}
	
	@Override
	public void onMessage(Message message) {
		System.out.println("Message Received");
	}
	
	// @Override
	// public void onMessage(Message message) {
	// try {
	// // MapMessage mapMessage = (MapMessage) message;
	// // if (Action.CREATED.toString().equals(mapMessage.getString("action")))
	// // createdCount++;
	// // else if (Action.UPDATED.toString().equals(mapMessage.getString("action")))
	// // updatedCount++;
	// // else if (Action.PURGED.toString().equals(mapMessage.getString("action")))
	// // purgedCount++;
	
	// // ..... Keep counts for more event actions
	// System.out.println("Ooops! some error occurred");
	// } catch (Exception e) {
	// System.out.println("Ooops! some error occurred");
	// }
	// }
}
