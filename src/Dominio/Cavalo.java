package Dominio;

public class Cavalo extends Animal {

    private String raca;

    public String getRaca(){
       return raca;
    }

    public void SetRaca(String raca){
        this.raca = raca;
    }

    public Cavalo(Float tamanho, String cor, String raca) {
        super(tamanho, cor);
        this.raca = raca;
    }
}
