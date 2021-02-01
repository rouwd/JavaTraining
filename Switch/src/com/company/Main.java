package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    int value = 4;
	    if(value == 1) {
            System.out.println("Value was 1");
        } else if (value ==2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

	    int switchValue = 3;
	    switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3 or 4 or 5");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char charValue = 'a';
	    switch(charValue) {
            case 'A': case 'B': case 'C': case 'D': case'E':
                System.out.println("Was A, B, C, D, or E");
                break;
            default:
                System.out.println("Was something else");
                break;
        }

        String month = "January";
	    switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
