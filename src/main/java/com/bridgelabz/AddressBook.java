package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook
{
        ArrayList<Contact> contactList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // gives a new person object by getting input from user
        public void addDetail() {

                Contact contact = new Contact();

                System.out.println("Enter FirstName:");
                contact.setFirstName(scanner.next());
                System.out.println("Enter LastName:");
                contact.setLastName(scanner.next());
                System.out.println("Enter Address:");
                contact.setAddress(scanner.next());
                System.out.println("Enter City:");
                contact.setCity(scanner.next());
                System.out.println("Enter State:");
                contact.setState(scanner.next());
                System.out.println("Enter Pin code:");
                contact.setZip(scanner.nextInt());
                System.out.println("Enter Phone number:");
                contact.setPhoneNumber(scanner.next());
                System.out.println("Enter email:");
                contact.setEmail(scanner.next());
                contactList.add(contact);
                scanner.close();
        }

        // prints the person
     public void display()
     {
         System.out.println(contactList);
     }

}
