package Proxy;

public class ImagemReal implements Image{

    private String nomeArquivo;

    public ImagemReal(String nomeArquivo){
        this.nomeArquivo = nomeArquivo;
        carregarDoDisco();
    }
    private void carregarDoDisco(){
        System.out.println("Carregando imagem" + nomeArquivo);
    }

    @Override
    public void exibir(){
        System.out.println("Exibindo imagem "+ nomeArquivo);
    }
}
