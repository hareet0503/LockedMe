package com.LockedMe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to LockedMe");
        System.out.println("----------------------------");
        displayOptions();
    }

    public static void displayOptions() {
        System.out.println("\nEnter Directory Path: ");
        Scanner sc = new Scanner(System.in);
        String directoryName = sc.nextLine();
        LockedMe lockedMe = new LockedMe(directoryName);
        do {
            System.out.println("\nPlease select one of the below options:");
            System.out.println("--------------------------------------");
            System.out.println("1. Get list of files in the directory");
            System.out.println("2. Add/delete/Search files in the directory");
            System.out.println("3. Close the Application");
            System.out.print("\nEnter the option number: ");
            int option = sc.nextInt();
            if (option == 1) {
                lockedMe.printFileNamesInAscendingOrder();
            } else if (option == 2) {
                lockedMe.displayOptions();
            } else if (option == 3) {
                System.exit(0);
            } else {
                System.out.println("\n>>>Please enter a valid option!!");
            }
        } while (true);
    }
}
