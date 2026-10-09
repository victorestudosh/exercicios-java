package Exnivel4;

public class Ex69Livro {

    private String nome;
    private String autor;
    private boolean emprestado;

    public Ex69Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
        this.emprestado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestarLivro() { 
        emprestado = true;
    }
}