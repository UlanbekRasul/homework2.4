package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> textA = new ArrayList<String>();
        ArrayList<String> textB = new ArrayList<String>();
        ArrayList<String> textC = new ArrayList<String>();

        textA.add(scanner.nextLine());
        textA.add(scanner.nextLine());
        textA.add(scanner.nextLine());
        textA.add(scanner.nextLine());
        textA.add(scanner.nextLine());

        System.out.println(textA);


        textB.add(scanner.nextLine());
        textB.add(scanner.nextLine());
        textB.add(scanner.nextLine());
        textB.add(scanner.nextLine());
        textB.add(scanner.nextLine());

        System.out.println(textB);

        textC.add(textA.get(0));
        textC.add(textB.get(4));
        textC.add(textA.get(1));
        textC.add(textB.get(3));
        textC.add(textA.get(2));
        textC.add(textB.get(2));
        textC.add(textA.get(3));
        textC.add(textB.get(1));
        textC.add(textA.get(4));
        textC.add(textB.get(0));

        System.out.println(textC);

        textC.sort(Comparator.comparing(String::length));
        Collections.sort(textC);
        System.out.println(textC);


    }

}
