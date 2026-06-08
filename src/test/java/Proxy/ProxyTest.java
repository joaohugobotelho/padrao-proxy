package Proxy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProxyTest {

    @Test
    void deveCriarProxy() {

        Image image = new ImagemProxy("foto.jpg");

        assertNotNull(image);
    }

    @Test
    void deveExibirImagemSemErro() {

        Image image = new ImagemProxy("foto.jpg");

        assertDoesNotThrow(image::exibir);
    }

    @Test
    void visualizadorDeveUsarProxy() {

        Image image = new ImagemProxy("foto.jpg");

        Visualizador visualizador =
                new Visualizador(image);

        assertDoesNotThrow(visualizador::mostrar);
    }
}