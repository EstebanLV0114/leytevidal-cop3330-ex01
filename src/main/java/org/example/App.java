/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}