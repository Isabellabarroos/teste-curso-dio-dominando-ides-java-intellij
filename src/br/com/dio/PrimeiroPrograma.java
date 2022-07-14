package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro= new Livro("Anne de Green Galbes",  336);
        System.out.println(livro);

        /*int a =5 ;
        int b = 3;
        System.out.println("Hello World!! " + (a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}


/*comandos
ctrl+shift+/= comenta um bloco inteiro
ctrl+/= comenta linha por linha
ctrl+y= deleta a linha
ctrl+z= cria a linha
shift+f6= renomeia a classe
ctrl+alt+l= organiza as linhas
ctrl+d= duplica a linha
ctrl+shift+seta para cima ou para baixo= muda a linha de posição
ctrl+k= commit */