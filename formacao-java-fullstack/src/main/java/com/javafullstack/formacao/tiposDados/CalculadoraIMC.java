package com.javafullstack.formacao.tiposDados;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void execute(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("%s, seu IMC é: %.2f%n", nome, imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25.0) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30.0) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 40.0) {
            System.out.println("Classificação: Obesidade");
        } else {
            System.out.println("Classificação: Obesidade grave");
        }

        scanner.close();


    }
}
