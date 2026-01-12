package com.day02.callcenterapp;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;

public class CallCenter {
	private Queue<Call> regularQueue;
	private PriorityQueue<Call> vipQueue;
	private Map<String, Integer> callCountMap;

	public CallCenter() {
		regularQueue = new LinkedList<>();
		vipQueue = new PriorityQueue<>((_, _) -> 0); // All VIP have same priority
		callCountMap = new HashMap<>();
	}

	public void receiveCall(Call call) {
		String id = call.getCustomerId();
		callCountMap.put(id, callCountMap.getOrDefault(id, 0) + 1);
		if (call.isVip()) {
			vipQueue.offer(call);
			System.out.println("VIP call received     -> " + call);
		} else {
			regularQueue.offer(call);
			System.out.println("Regular call received -> " + call);
		}
	}

	public Call attendNextCall() {
		if (!vipQueue.isEmpty()) {
			Call vip = vipQueue.poll();
			System.out.println("Attending VIP customer: " + vip);
			return vip;
		}

		if (!regularQueue.isEmpty()) {
			Call regular = regularQueue.poll();
			System.out.println("Attending regular customer: " + regular);
			return regular;
		}

		System.out.println("No calls in queue!");
		return null;
	}

	public void showCallStatistics() {
		System.out.println("\n=== Monthly Call Statistics ===");
		if (callCountMap.isEmpty()) {
			System.out.println("No calls yet.");
			return;
		}

		callCountMap.forEach((id, count) -> System.out.println("Customer " + id + " called " + count + " time(s)"));
	}
	
	public void showQueueStatus() {
        System.out.println("\nCurrent Queue Status:");
        System.out.println("VIP Queue size: " + vipQueue.size());
        System.out.println("Regular Queue size: " + regularQueue.size());
    }
}
