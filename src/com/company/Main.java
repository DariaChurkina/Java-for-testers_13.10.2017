package com.company;

public class Main {

    public static void main(String[] args) {
	    int lengthInMeters = 12;
        double lengthInMiles = lengthInMeters * 0.000621371;
        double lengthInYards = lengthInMeters * 1.09361;
        double lengthInFeet = lengthInMeters * 3.28083;

	    double weightInKg = 28.6;
	    double weightInPounds = weightInKg * 2.20462;
	    double weightInOunces = weightInKg * 35.274;

	    System.out.println(lengthInMeters + " meters in miles is " + lengthInMiles);
        System.out.println(lengthInMeters + " meters in yards is " + lengthInYards);
        System.out.println(lengthInMeters + " meters in feet is " + lengthInFeet);
        System.out.println(weightInKg + " kilos in pounds is " + weightInPounds);
        System.out.println(weightInKg + " kilos in ounces is " + weightInOunces);

    }
}
