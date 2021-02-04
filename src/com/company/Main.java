package com.company;

import com.company.proxypattern.Image;
import com.company.proxypattern.ProxyImage;

public class Main {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // image will be loaded from disk



        image.display();

        System.out.println("-------");

        // image will not be loaded from disk;

        image.display();
    }
}
