package base;

import  java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 8 Solution
 *  Copyright 2021 Bao Kastan
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int numPeople = myApp.getAmountOfPeople();
        int numPizzas = myApp.getAmountOfPizzas();
        int numSlices = myApp.getAmountOfSlices();
        int totalnumSlices = numSlices * numPizzas;

        myApp.printOutput(numPeople, numPizzas, totalnumSlices);
    }

    public void printOutput(int numPeople, int numPizzas, int totalnumSlices) {
        System.out.println(numPeople + " People with " + numPizzas + " Pizzas ("
                + totalnumSlices + " Slices)");
        System.out.println("Each person gets " + getSlicesPerPerson(numPeople, totalnumSlices)
                + " pieces of pizza.");
        System.out.println("There are " + getLeftoverSlices(numPeople, totalnumSlices)
                + " leftover pieces.");
    }

    public int getLeftoverSlices(int numPeople, int totalnumSlices) {
        return totalnumSlices % numPeople;
    }

    public int getSlicesPerPerson(int numPeople, int totalnumSlices) {
        return totalnumSlices / numPeople;
    }

    public int getAmountOfPeople() {
        System.out.println("How many People? ");
        return in.nextInt();
    }

    public int getAmountOfPizzas() {
        System.out.println("How many Pizzas do you have?");
        return in.nextInt();
    }

    public int getAmountOfSlices() {
        System.out.println("How many Slices per pizza?");
        return in.nextInt();
    }
}
