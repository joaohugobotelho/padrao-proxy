package Proxy;

public class ImagemProxy implements Image{

    private String nomeArquivo;
    private ImagemReal imagemReal;

    public ImagemProxy(String nomeArquivo){
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void exibir(){

        if(imagemReal == null){
            imagemReal = new ImagemReal(nomeArquivo);
        }

        imagemReal.exibir();
    }
}
