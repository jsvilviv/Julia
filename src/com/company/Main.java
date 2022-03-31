package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Як тебе звати?");
        String name = sc.nextLine();
        System.out.println("Добрий день " + name);

        System.out.println(name + ", скільки тобі років?");
        int old = sc.nextInt();
        System.out.println("Тобі " + old);

        if (old < 18)
            System.out.println("herbata");
       else if (old == 30)
            System.out.println("pisać");
        else
            System.out.println("Ziemniak");
    }

}
