package Dominio;

public class Leao extends Animal {

    private boolean juba;

    public boolean isJuba() {
        return juba;
    }

    public void setJuba(boolean juba) {
        this.juba = juba;
    }

    public Leao(Float tamanho, String cor, boolean juba) {
        super(tamanho, cor);
        this.juba = juba;
    }

}
