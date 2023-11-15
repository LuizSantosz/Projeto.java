package Dominio;

public abstract class Animal {

    private Float tamanho;
    private String cor;

    public float getTamanho(){
        return tamanho;
    }

    public void SetTamanho(Float tamanho){
        this.tamanho = tamanho;
    }

    public String getCor(){
        return cor;
    }

    public void SetCor(String cor){
        this.cor = cor;
    }

    public Animal(Float tamanho, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;
    }
    
}