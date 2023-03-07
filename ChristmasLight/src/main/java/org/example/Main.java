package org.example;

public class Main {
    public static void main(String[] args) {

        // Part One - If it is  a discrete light bulb, it does not have any brightness controls.
        ILights santa = new DiscreteLight();

        // Part Two - If it is a variable light bulb, it has brightness controls.
        //ILights santa = new VariableLight();

        santa.glowLights();

        System.out.println("Total Lights =  " + santa.getTotalOnLights());
    }

}
