package dio.generics.comparableXcomparator;

public class Livro implements Comparable<Livro> {

    private String titulo;
    private String autor;
    private int ano;

    //  Construtor
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    //  Usado para ordenar livros por ano
    @Override
    public int compareTo(Livro l) {
        return titulo.compareTo(l.titulo);
    }

    //  Métodos getters para acessar os dados privados

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }
}
