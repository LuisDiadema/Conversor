package src.main.java.org.adivinhacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao conversor de temperatura");
        System.out.println("Escreva qual o valor em celsius deseja converter");
        String celsius = sc.nextLine();
        int cv = Integer.parseInt(celsius);
        double fahrenheit = (cv * 9 / 5) + 32;

        System.out.println("O valor de Fahrenheit é " + fahrenheit);
    }
}