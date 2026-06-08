package Proxy;

public class Visualizador {

    private Image image;

    public Visualizador(Image image) {
        this.image = image;
    }

    public void mostrar(){
        image.exibir();
    }
}
