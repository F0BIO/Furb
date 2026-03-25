import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class ImovelTest {
    // 1
    @Test
    public void recusarAreaNegativa() {
        Imovel imovel = new Imovel("Rua A", 10);
        assertThrows(IllegalArgumentException.class, () -> imovel.setArea(-5));
    }

    // 2
    @Test
    public void permitirAreaZero() {
        Imovel imovel = new Imovel("Rua A", 0);
        imovel.setBairro(new Bairro("Centro", 1.0));
        imovel.setFinalidade(Finalidade.RESIDENCIAL);

        double resultado = imovel.calcularIptu();
        assertEquals(0.0, resultado, 0.01);
    }

    // 3
    @Test
    public void recusarCalculoSemFinalidade() {
        Imovel imovel = new Imovel("Rua A", 250);
        imovel.setBairro(new Bairro("Centro", 1.0));

        assertThrows(IllegalStateException.class, imovel::calcularIptu);
    }

    // 4
    @Test
    public void recusarCalculoSemBairro() {
        Imovel imovel = new Imovel("Rua A", 400);
        imovel.setFinalidade(Finalidade.RESIDENCIAL);

        assertThrows(IllegalStateException.class, imovel::calcularIptu);
    }

    // 5
    @Test
    public void calcularImpostoResidencial() {
        Imovel imovel = new Imovel("Rua A", 400);
        imovel.setBairro(new Bairro("Centro", 1.0));
        imovel.setFinalidade(Finalidade.RESIDENCIAL);

        double resultado = imovel.calcularIptu();
        assertEquals(400.0, resultado, 0.01);
    }

    // 6
    @Test
    public void calcularComercialAte100m2() {
        Imovel imovel = new Imovel("Rua A", 80);
        imovel.setBairro(new Bairro("Centro", 1.0));
        imovel.setFinalidade(Finalidade.COMERCIAL);

        double resultado = imovel.calcularIptu();
        assertEquals(500.0, resultado, 0.01);
    }

    // 7
    @Test
    public void calcularComercialEntre100e400m2() {
        Imovel imovel = new Imovel("Rua A", 250);
        imovel.setBairro(new Bairro("Centro", 1.0));
        imovel.setFinalidade(Finalidade.COMERCIAL);

        double resultado = imovel.calcularIptu();
        assertEquals(1000.0, resultado, 0.01);
    }

    // 8
    @Test
    public void calcularComercialAcima400m2() {
        Imovel imovel = new Imovel("Rua A", 500);
        imovel.setBairro(new Bairro("Centro", 1.0));
        imovel.setFinalidade(Finalidade.COMERCIAL);

        double resultado = imovel.calcularIptu();
        assertEquals(500 * 2.55, resultado, 0.01);
    }

    // 9
    @Test
    public void calcularIndustrialAte2000m2() {
        Imovel imovel = new Imovel("Rua A", 2000);
        imovel.setBairro(new Bairro("Centro", 1.0));
        imovel.setFinalidade(Finalidade.INDUSTRIAL);

        double resultado = imovel.calcularIptu();
        assertEquals(1000.0, resultado, 0.01);
    }

    // 10
    @Test
    public void calcularIndustrialAcima2000m2() {
        Imovel imovel = new Imovel("Rua A", 3000);
        imovel.setBairro(new Bairro("Centro", 1.0));
        imovel.setFinalidade(Finalidade.INDUSTRIAL);

        double resultado = imovel.calcularIptu();
        assertEquals(3000 * 0.55, resultado, 0.01);
    }

    // 11
    @Test
    public void calcularComCoeficienteDiferente() {
        Imovel imovel = new Imovel("Rua A", 500);
        imovel.setBairro(new Bairro("Centro", 2.5));
        imovel.setFinalidade(Finalidade.RESIDENCIAL);

        double resultado = imovel.calcularIptu();
        assertEquals(1250.0, resultado, 0.01);
    }

    @Test
    public void testSetArea() {
        Imovel imovel = new Imovel(null, 0);

        assertThrows(IllegalArgumentException.class, () -> {imovel.setArea(-10);});
    }
}
