package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook
{
       ArrayList<Contact> contactList = new ArrayList<>();
       static Scanner scanner = new Scanner(System.in);
       static HashMap<String,ArrayList<Contact>> hashMap = new HashMap<>();
       static AddressBook addressBook = new AddressBook();

        // This method is used to add details to address book
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

        // Delete Contact details
        public void deleteDetails()
        {
                System.out.println("Confirm the first name of the person to delete contact : ");
                String confirmName = scanner.next();
                for (int i=0; i<contactList.size(); i++)
                {
                        if(contactList.get(i).getFirstName().equals(confirmName))
                        {
                                contactList.remove(i);
                                System.out.println("After Removing List : " +contactList);
                        }
                        else
                        {
                                System.out.println("Enter Valid FirstName : ");
                        }
                }
        }

        // Create address book
        public void createAddressBook()
        {
                while(true)
                {
                  System.out.println("Enter your Choice : \n 1.Create new AddressBook \n 2.Edit Existing AddressBook \n " +
                          "3.Display All AddressBook \n 4.Exit");
                  int choice = scanner.nextInt();
                  // if you choose option 4 then exist in process
                  if(choice == 4)
                  {
                          System.out.println("Exited");
                          break;
                  }
                  switch (choice)
                  {
                          case 1:
                                  System.out.println("Enter name of AddressBook : ");
                                  String addressBook_name = scanner.next();
                                  // Condition to check Uniqueness of address book
                                  if (hashMap.containsKey(addressBook_name))
                                  {
                                     System.out.println("Address Book Name Exits enter different name : ");
                                     break;
                                  }
                                //  create array list object name as new_address_book
                                  ArrayList<Contact> newAddressBook = new ArrayList<>();
                                  contactList = newAddressBook;
                                  while (true)
                                  {
                                    System.out.println("Enter your Choice : \n 1.Add Detail \n 2.Display Detail \n 3.Edit Detail \n" +
                                                  " 4.Delete Detail \n 5.Exit ");
                                    int choose = scanner.nextInt();
                                    if (choose == 5)
                                    {
                                            System.out.println("Exited");
                                            break;
                                    }
                                    switch (choose) {

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
                                           hashMap.put(addressBook_name,contactList);
                                          System.out.println(hashMap);
                                          break;
                                  }
                          case 2:
                                  System.out.println("Enter the name of AddressBook : ");
                                  String addressBook_name_old =scanner.next();
                                  // condition to check whether address book exists or no.
                                  if (hashMap.containsKey(addressBook_name_old))
                                  {
                                          // Create object of  ArrayList<Contact>
                                          ArrayList<Contact> old_AddressBook = new ArrayList<>();
                                          // Store All data in old_AddressBook
                                          contactList = old_AddressBook;
                                          contactList = hashMap.get(addressBook_name_old);

                                          while (true)
                                          {
                                                  System.out.println("Enter your Choice : \n 1.Add Detail \n 2.Display Detail \n" +
                                                          " 3.Edit Detail \n 4.Delete Detail \n 5.Exit ");
                                                  int choose = scanner.nextInt();
                                                  if (choose == 5)
                                                  {
                                                          System.out.println("Exited");
                                                          break;
                                                  }
                                                  switch (choose) {

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
                                                  hashMap.put(addressBook_name_old,contactList);
                                                  System.out.println(hashMap);
                                                  break;
                                          }
                                  }
                                  else
                                  {
                                          System.out.println("Enter valid name of AddressBook : ");
                                  }
                          case 3:
                                  System.out.println(hashMap);
                                  break;

                          default:
                                  System.out.println("Enter valid option");
                  }

                }
        }

}
