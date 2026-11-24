import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadorBuilderTest {

    @Test
    void deveRetornarExcecaoParaComputadorSemNumeroSerie() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setProcessador("ryzen 5")
                    .setMemoriaRam(8)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de série inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaComputadorSemProcessador() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setNumeroSerie("123456")
                    .setMemoriaRam(8)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Processador inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarComputadorValido() {
        ComputadorBuilder computadorBuilder = new ComputadorBuilder();
        Computador computador = computadorBuilder
                .setNumeroSerie("123456")
                .setProcessador("ryzen 5")
                .setMemoriaRam(8)
                .build();

        assertNotNull(computador);
    }
}
