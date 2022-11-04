package classes;

public class Relacionamento {
    private int idRelacionamento;
    private int idCantor;
    private int idMusica;
    private int idOuvinte;


    public Relacionamento(int idRelacionamento, int idCantor, int idMusica, int idOuvinte) {
        this.idRelacionamento = idRelacionamento;
        this.idCantor = idCantor;
        this.idMusica = idMusica;
        this.idOuvinte = idOuvinte;
    }

    public int getIdRelacionamento() {  return idRelacionamento; }

    public int getIdCantor() { return idCantor;  }

    public int getIdMusica() {  return idMusica;   }

    public int getIdOuvinte() {  return idOuvinte;  }

    public void setIdRelacionamento(int idRelacionamento) {
        this.idRelacionamento = idRelacionamento;
    }

    public void setIdCantor(int idCantor) {this.idCantor = idCantor;  }

    public void setIdMusica(int idMusica) {this.idMusica = idMusica;  }

    public void setIdOuvinte(int idOuvinte) {this.idOuvinte = idOuvinte;  }
}
