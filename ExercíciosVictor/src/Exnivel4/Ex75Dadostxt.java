package Exnivel4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex75Dadostxt {

    public static void salvarDados(String texto) {

        try (BufferedWriter escritor =
                new BufferedWriter(new FileWriter("dados.txt", true))) {

            escritor.write(texto);
            escritor.newLine();

            System.out.println("Dados salvos!");

        } catch (IOException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }

    public static void lerDados() {

        try (BufferedReader leitor =
                new BufferedReader(new FileReader("dados.txt"))) {

            String linha;

            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler: " + e.getMessage());
        }
    }
}
