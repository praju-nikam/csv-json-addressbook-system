package com.bridgelabz;

import java.util.ArrayList;

public class AddressBookMain
{
    public static void main(String[] args) {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*- Wel come to AddressBook System -*-*-*-*-*-*-*-*-*-*-*-*-*-*");
         AddressBook addressBook = new AddressBook();
         Contact contact = new Contact();
         addressBook.addDetail();
         addressBook.display();

    }
}
