package classes;

public class Musica {
    private int idMusica;
    private String nome;
    private double duracao;
    private String genero;
    private boolean colaboracao;
    public int idCantor;

    public Musica(int idMusica, String nome, double duracao,
                  String genero, boolean colaboracao, int idCantor) {
        this.idMusica = idMusica;
        this.nome = nome;
        this.duracao = duracao;
        this.genero = genero;
        this.colaboracao = colaboracao;
        this.idCantor = idCantor;
    }

    public int getIdMusica() {return idMusica;   }

    public String getNome() {return nome;    }

    public double getDuracao() {return duracao;    }

    public String getGenero() {return genero;    }

    public boolean isColaboracao() {return colaboracao;    }

    public int getIdCantor() {return idCantor;    }

    public void setIdMusica(int idMusica) { this.idMusica = idMusica;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setColaboracao(boolean colaboracao) {
        this.colaboracao = colaboracao;
    }

    public void setIdCantor(int idCantor) {
        this.idCantor = idCantor;
    }
}
