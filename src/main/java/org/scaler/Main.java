package org.scaler;


import org.scaler.httpClient.Client;

import java.io.IOException;

public class Main {



    public static void main(String[] args) throws IOException {
        Client c=new Client();

        System.out.println("Hello world!");
        System.out.println("calling example.com"+ c.run("https://drive.google.com/open?id=1mIg0Aj7Rmhev9W6x2BzunEFlvbUBvTn8&usp=drive_fs"));
    }
}