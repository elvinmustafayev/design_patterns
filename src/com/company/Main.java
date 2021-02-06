package com.company;

import com.company.nullobjectpattern.AbstractCustomer;
import com.company.nullobjectpattern.CustomerFactory;
import com.company.nullobjectpattern.RealCustomer;
import com.company.proxypattern.Image;
import com.company.proxypattern.ProxyImage;
import com.company.proxypattern.RealImage;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
//        Image image = new ProxyImage("test_10mb.jpg");
//
//        // image will be loaded from disk
//
//
//
//        image.display();
//
//        System.out.println("-------");
//
//        // image will not be loaded from disk;
//
//        image.display();


        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.isNill());



    }
}
