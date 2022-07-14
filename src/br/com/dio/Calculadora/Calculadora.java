package br.com.dio.Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextDouble();

        double somar =  somar (a, b);
        double subtrair = subtrair (a, b);
        double multiplicacao = multiplicacao(a, b);
        double divisao = divisao(a, b);

        System.out.println("somar: " + somar);
        System.out.println("sub: " + subtrair);
        System.out.println("mult: " + multiplicacao);
        System.out.println("div: " + divisao);
    }

    public static double somar (double a, double b){
        return a + b;

    }
    public static double subtrair (double a, double b){
        return a - b;

    }
    public static double multiplicacao (double a, double b){
        return a * b;

    }
    public static double divisao (double  a, double b){
        return a / b;

    }
}
