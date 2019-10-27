package com.codeahoy.tutorial.datastructures;

import java.util.PriorityQueue;

/**
 * (C) 2019 CodeAhoy
 * tutorial permalink: https://codeahoy.com/java/PriorityQueue-Explained-With-Examples-JI_12/
 */
public class PriorityQueueExample {

    public static void main(String[] args) {

        // Create a PriorityQueue that sorts elements
        // by their natural ordering
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Let's add some elements to the PriorityQueue
        Integer [] elements = new Integer[]{8, 100, 98, 10, 2,
                15, 45, 25, 76, 3, 9, 1, 63, };

        for (int e: elements) {
            pq.add(e);
        }

        // Let's iterate through the elements to see they
        // are not necessarily stored in sorted order
        System.out.print("Print by Iterating: ");
        for(int e: pq) {
            System.out.print(e + " ");
        }

        System.out.println();
        System.out.print("Print by Retrieval: ");

        // Let's remove elements one by one
        while (!pq.isEmpty()) {
            System.out.print(pq.remove() + " ");
        }
    }
}
