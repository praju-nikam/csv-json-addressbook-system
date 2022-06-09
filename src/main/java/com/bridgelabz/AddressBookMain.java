package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain
{
    public static void main(String[] args) {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*- Wel come to AddressBook System -*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println();
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Enter your Choice : \n 1.Add Detail \n 2.Display Detail \n 3.Edit Detail \n" +
                    " 4.Delete Detail \n 5.Exit ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addressBook.addDetail();
                    break;
                case 2:
                    addressBook.display();
                    break;
                case 3:
                    addressBook.editDetails();
                    break;
                case 4:
                    addressBook.deleteDetails();
                    break;
                case 5:
                    System.out.println("You are Exit ");
                default:
                    System.out.println(" You Enter Wrong Option");

            }
        }
        while (choice != 4);

    }
}
