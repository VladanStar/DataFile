package com.company;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Main();

    }
    public Main(){
        // upis linije u fajl sa birsanjem svega sto je bilo napisano do sada u fajlu
        PrintWriter upisUFajl;

        try {
            upisUFajl= new PrintWriter("noviFajl.txt");
            upisUFajl.println("Ovo je jedna linija u fajlu!!!");
            upisUFajl.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // Dodavanje linije na postojeci fajl
        try {
            upisUFajl = new PrintWriter(new FileWriter("noviFajl.txt", true));
            upisUFajl.println("Ovo je jos jedna linija upisana u fajl dodata na proslu liniju");
            upisUFajl.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
