package SingletonPattern;

import java.util.Scanner;

public class helpDeskStation {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        centralQueueSystem cqs = centralQueueSystem.getInstance();

        while (true){
            System.out.println("\n1. Display queue");
            System.out.println("2. Increase queue");
            System.out.println("3. Reset queue");
            System.out.println("4. Close queue system");
            System.out.print("\nWhat would you like to do?: ");
            int userChoice = sc.nextInt();

            switch (userChoice) {

                case 1:
                    System.out.println();
                    cqs.getQueueNumber();
                    break;
                case 2:
                    System.out.println();
                    cqs.increaseQueueNumber();
                    break;
                case 3:
                    System.out.print("\n\nReset Queue Number to: ");
                    int numReset = sc.nextInt();
                    cqs.resetQueue(numReset);
                    System.out.println();
                    cqs.getQueueNumber();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("\nPlease enter a number from the displayed options.");
                }
            }
        }

    }
