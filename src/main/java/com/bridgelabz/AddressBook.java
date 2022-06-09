package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook
{
        ArrayList<Contact> contactList = new ArrayList<>();
       static Scanner scanner = new Scanner(System.in);

        // contact object by getting input from user
        public void addDetail()
        {
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
            //    scanner.close();
        }

        // Display the contactList
     public void display()
     {
         System.out.println(contactList);
     }

        /**
         * create a method name as editDetails.
         * This method is used to edit the details in address book
         */
        public void editDetails()
        {
                System.out.println("Confirm your first name to edit details : ");
                String confirmName = scanner.next();

                for(int i=0; i<contactList.size(); i++)
                {
                        if(contactList.get(i).getFirstName().equals(confirmName))
                        {
                                System.out.println("Select the Option : \n 1.FirstName \n 2.LastName \n 3.Address \n " +
                                        "4.City \n 5.State \n 6.Zip \n 7.PhoneNumber \n 8.Email");
                                System.out.println();
                                int edit = scanner.nextInt();

                                    switch (edit) {
                                            case 1:
                                                    System.out.println("Enter First Name : ");
                                                    contactList.get(i).setFirstName(scanner.next());
                                                    break;
                                            case 2:
                                                    System.out.println("Enter Last Name : ");
                                                    contactList.get(i).setLastName(scanner.next());
                                                    break;
                                            case 3:
                                                    System.out.println("Enter Address : ");
                                                    contactList.get(i).setAddress(scanner.next());
                                                    break;
                                            case 4:
                                                    System.out.println("Enter City : ");
                                                    contactList.get(i).setCity(scanner.next());
                                                    break;
                                            case 5:
                                                    System.out.println("Enter State : ");
                                                    contactList.get(i).setCity(scanner.next());
                                                    break;
                                            case 6:
                                                    System.out.println("Enter Zip : ");
                                                    contactList.get(i).setZip(scanner.nextInt());
                                                    break;
                                            case 7:
                                                    System.out.println("Enter PhoneNumber : ");
                                                    contactList.get(i).setPhoneNumber(scanner.next());
                                                    break;
                                            case 8:
                                                    System.out.println("Enter Email : ");
                                                    contactList.get(i).setEmail(scanner.next());
                                    }


                                System.out.println("Edited List is : ");
                                System.out.println(contactList);
                        }
                        else
                        {
                                System.out.println("Enter valid FirstName : ");
                        }
                }

        }

}
