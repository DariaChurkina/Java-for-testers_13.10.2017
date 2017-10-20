package com.company;

public class Main {

    public static void main(String[] args) {

        //Homework #2
        byte[][] numberSquare = new byte[5][5];

        byte minValue = 0;
        byte maxValue = 9;
        byte newRandomValue;

        for (int i = 0; i < numberSquare.length; i++) {
            for (int j = 0; j < numberSquare.length; j++) {

                while(true) {
                    newRandomValue = calculateRandomValue(minValue, maxValue);
                    boolean commonResult = true;
                    if(i > 0) {
                        for(int iPrevious = 0; iPrevious <= i - 1; iPrevious++) {
                            if(newRandomValue == numberSquare[iPrevious][j]) {
                                commonResult = false;
                                break;
                            }
                        }
                    }

                    if(j > 0) {
                        for(int jPrevious = 0; jPrevious <= j - 1; jPrevious++) {
                            if(newRandomValue == numberSquare[i][jPrevious]) {
                                commonResult = false;
                                break;
                            }
                        }
                    }

                    if(commonResult == true) {
                        numberSquare[i][j] = newRandomValue;
                        break;
                    }
                }
            }
        }

        printArray(numberSquare);
    }

    public static byte calculateRandomValue(byte minValue, byte maxValue) {
        maxValue -= minValue;
        byte randomValue = (byte) ((Math.random() * ++maxValue) + minValue);
        return randomValue;
    }

    public static void printArray(byte[][] array){
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        //end region Homework #2


//        //Homework #1
//	    int lengthInMeters = 12;
//        double lengthInMiles = lengthInMeters * 0.000621371;
//        double lengthInYards = lengthInMeters * 1.09361;
//        double lengthInFeet = lengthInMeters * 3.28083;
//
//	    double weightInKg = 28.6;
//	    double weightInPounds = weightInKg * 2.20462;
//	    double weightInOunces = weightInKg * 35.274;
//
//	    System.out.println(lengthInMeters + " meters in miles is " + lengthInMiles);
//        System.out.println(lengthInMeters + " meters in yards is " + lengthInYards);
//        System.out.println(lengthInMeters + " meters in feet is " + lengthInFeet);
//        System.out.println(weightInKg + " kilos in pounds is " + weightInPounds);
//        System.out.println(weightInKg + " kilos in ounces is " + weightInOunces);

    }
}
