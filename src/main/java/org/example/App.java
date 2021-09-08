package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        System.out.print("How many people? ");
        String people = se.nextLine();
        int ppl = Integer.parseInt(people);

        System.out.print("How many pizzas do you have? ");
        String pizzas = se.nextLine();
        int numPizzas = Integer.parseInt(pizzas);

        System.out.print("How many slices per pizza? ");
        String slices = se.nextLine();
        int numSlices = Integer.parseInt(slices);

        int totalSlices = numSlices * numPizzas;
        int getSlices = totalSlices / ppl;
        int leftover = totalSlices % ppl;

        System.out.println(ppl + " people with " + numPizzas + " pizzas (" + totalSlices +" slices)");
        System.out.println("Each person gets " + getSlices + " pieces of pizza.");
        System.out.println("There are " + leftover + " leftover pieces.");
    }
}