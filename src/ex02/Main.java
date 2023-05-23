package ex02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Livro> biblioteca = new ArrayList<>();
        biblioteca.add(new Livro());
        biblioteca.add(new Livro());
        biblioteca.add(new Livro());
        biblioteca.add(new Livro());

        biblioteca.get(0).registrarLivro("978-8580573299");
        biblioteca.get(1).registrarLivro("978-8579800245", "Jogos Vorazes");
        biblioteca.get(2).registrarLivro("978-8580575392", "O ladrão de raios", "Mitologia Grega");
        biblioteca.get(3).registrarLivro("978-8576832478", "Maze Runner: Correr ou Morrer",
                "Ficção Científica", "James Dashner");

        System.out.println("\n----- INFORMAÇÕES DOS LIVROS -----");
        for(int i = 0; i < biblioteca.size(); i++){
            System.out.println("ISBN: " + biblioteca.get(i).getIsbn() + ", Nome: " + biblioteca.get(i).getNome() +
                    ", Genero: " + biblioteca.get(i).getGenero() + ", Autor: " + biblioteca.get(i).getAutor());
        }
    }
}
