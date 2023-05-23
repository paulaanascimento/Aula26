package ex02;

public class Livro {
    private String genero;
    private String nome;
    private String isbn;
    private String autor;

    public void registrarLivro(String isbn){
        this.isbn = isbn;
        System.out.println("O livro foi registrado com o ISBN " + this.isbn);
    }

    public void registrarLivro(String isbn, String nome){
        this.isbn = isbn;
        this.nome = nome;
        System.out.println("O livro foi registrado com o ISBN " + this.isbn + " e o nome '" + this.nome + "'");
    }

    public void registrarLivro(String isbn, String nome, String genero){
        this.isbn = isbn;
        this.nome = nome;
        this.genero = genero;
        System.out.println("O livro foi registrado com o ISBN " + this.isbn + ", nome '" + this.nome + "' e o genero '" + this.genero + "'");
    }

    public void registrarLivro(String isbn, String nome, String genero, String autor){
        this.isbn = isbn;
        this.nome = nome;
        this.genero = genero;
        this.autor = autor;
        System.out.println("O livro foi registrado com todos os atributos");
    }

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }
}
