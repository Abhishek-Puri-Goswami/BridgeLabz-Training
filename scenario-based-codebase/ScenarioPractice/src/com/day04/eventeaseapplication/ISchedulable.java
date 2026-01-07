package com.day04.eventeaseapplication;

public interface ISchedulable {
	void schedule();

	void reschedule(String newDate);

	void cancel();
}
