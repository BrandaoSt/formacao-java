package com.javafullstack.formacao.main;

import com.javafullstack.formacao.tiposDados.CalculadoraIMC;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Application {
    public static void main(String[] args) {

        int exercicioEscolhido = lerExercicioDoArquivo(); // → 1 por padrão

        switch (exercicioEscolhido) {
            case 1 -> CalculadoraIMC.execute();
            //case 2 -> ExercicioArrayList1.execute();
            default -> System.out.println("Opção inválida.");
        }
    }

    private static int lerExercicioDoArquivo() {
        Properties props = new Properties();
        try (InputStream in =
                     Application.class.getClassLoader()
                             .getResourceAsStream("config.properties")) {
            if (in != null) {
                props.load(in);
                return Integer.parseInt(props.getProperty("exercicio", "1"));
            }
        } catch (IOException e) {
            System.out.println("Falha ao ler config.properties: " + e.getMessage());
        }
        return 1; // fallback
    }
}