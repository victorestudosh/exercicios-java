package Exnivel4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ex69e70 {

    public static void main(String[] args) {

        ArrayList<Ex69Livro> livros = new ArrayList<Ex69Livro>();

        while (true) {

            StringBuilder sb = new StringBuilder("Escolha uma das opções abaixo: \n\n");

            sb.append("1 - Adicionar Livro \n").append("2 - Verificar Estoque de Livros \n") .append("3 - Deletar Livro \n").append("4 - Emprestar Livro \n").append("5 - Sair");

            String input = JOptionPane.showInputDialog(null, sb, "", JOptionPane.PLAIN_MESSAGE);

            if (input.equals("1")) {

                String nome = JOptionPane.showInputDialog(null, "Digite o Nome do Livro:", "", JOptionPane.PLAIN_MESSAGE);

                String autor = JOptionPane.showInputDialog(null, "Digite o nome do autor do livro:", "", JOptionPane.PLAIN_MESSAGE);

                Ex69Livro livro = new Ex69Livro(nome, autor);

                livros.add(livro);

                JOptionPane.showMessageDialog(null, "Livro Adicionado com Sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (input.equals("2")) {

                if (livros.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "Nenhum Livro foi Adicionado!", "", JOptionPane.WARNING_MESSAGE);

                } else {

                    StringBuilder livrosCadastrados = new StringBuilder();

                    livrosCadastrados.append("---- Livros Cadastrados ----\n\n");

                    for (Ex69Livro livro : livros) {

                        livrosCadastrados.append("Nome: ").append(livro.getNome()).append("\n");

                        livrosCadastrados.append("Autor: ").append(livro.getAutor()).append("\n");

                        if (livro.isEmprestado()) {
                            livrosCadastrados.append("Status: Emprestado\n\n");
                        } else {
                            livrosCadastrados.append("Status: Disponível\n\n");
                        }
                    }

                    JOptionPane.showMessageDialog(null, livrosCadastrados, "", JOptionPane.PLAIN_MESSAGE);
                }
            }

            else if (input.equals("3")) {

                if (livros.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "Nenhum Livro foi Adicionado!", "", JOptionPane.WARNING_MESSAGE);

                } else {

                    String nome = JOptionPane.showInputDialog(null, "Digite o nome do livro que deseja deletar:", "", JOptionPane.PLAIN_MESSAGE);

                    boolean encontrado = false;

                    for (int i = 0; i < livros.size(); i++) {

                        if (livros.get(i).getNome().equals(nome)) {

                            livros.remove(i);
                            encontrado = true;

                            JOptionPane.showMessageDialog(null, "Livro Deletado com Sucesso!");

                            break;
                        }
                    }

                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "Livro não encontrado!");
                    }
                }
            }

            else if (input.equals("4")) {

                String nome = JOptionPane.showInputDialog(null, "Digite o nome do livro que deseja emprestar:", "", JOptionPane.PLAIN_MESSAGE);

                boolean encontrado = false;

                for (Ex69Livro livro : livros) {

                    if (livro.getNome().equals(nome)) {

                        encontrado = true;

                        if (livro.isEmprestado()) {

                            JOptionPane.showMessageDialog(null, "Esse livro já está emprestado!");

                        } else {

                            livro.emprestarLivro();

                            JOptionPane.showMessageDialog(null, "Livro Emprestado com Sucesso!");
                        }

                        break;
                    }
                }

                if (encontrado == false) {

                     JOptionPane.showMessageDialog(null, "Livro não encontrado!");
                }
            } else if (input.equals("5")) {

                JOptionPane.showMessageDialog(null, "Programa encerrado!");

                break;
            }
        }
    }
}