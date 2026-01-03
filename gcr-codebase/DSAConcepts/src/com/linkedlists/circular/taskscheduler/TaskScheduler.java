package com.linkedlists.circular.taskscheduler;

public class TaskScheduler {

    public static void main(String[] args) {

        TaskCircularLinkedList scheduler = new TaskCircularLinkedList();

        scheduler.addLast(1, "Design Module", 1, "2025-01-10");
        scheduler.addLast(2, "Implement Code", 2, "2025-01-12");
        scheduler.addLast(3, "Testing", 1, "2025-01-15");

        scheduler.addAtPosition(1, 4, "Code Review", 2, "2025-01-11");

        System.out.println("All Tasks:");
        scheduler.displayAll();

        System.out.println("Current Task Cycle:");
        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();

        System.out.println("Search by Priority 1:");
        scheduler.searchByPriority(1);

        System.out.println("Remove Task ID 2:");
        scheduler.removeByTaskId(2);

        System.out.println("Final Task List:");
        scheduler.displayAll();
    }
}
