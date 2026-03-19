import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    @Test
    public void Teste1() {
        Funcionario f = new Funcionario("João", 850.00, null);
        assertEquals(FaixaIrpf.PRIMEIRA, f.IdentificarFaixaIrpf());
    }

    @Test
    public void Teste2() {
        Funcionario f = new Funcionario("João", 850.00, null);
        assertEquals(0.00, f.calcularIrpf(), 0.01);
    }

    @Test
    public void Teste3() {
        Funcionario f = new Funcionario("João", 1903.98, null);
        assertEquals(FaixaIrpf.PRIMEIRA, f.IdentificarFaixaIrpf());
    }

    @Test
    public void Teste4() {
        Funcionario f = new Funcionario("João", 1903.98, null);
        assertEquals(0.00, f.calcularIrpf(), 0.01);
    }

    @Test
    public void Teste5() {
        Funcionario f = new Funcionario("João", 1903.99, null);
        assertEquals(FaixaIrpf.SEGUNDA, f.IdentificarFaixaIrpf());
    }

    @Test
    public void Teste6() {
        Funcionario f = new Funcionario("João", 1903.99, null);
        assertEquals(0.00, f.calcularIrpf(), 0.01);
    }

    @Test
    public void Teste7() {
        Funcionario f = new Funcionario("João", 2000.00, null);
        assertEquals(FaixaIrpf.SEGUNDA, f.IdentificarFaixaIrpf());
    }

    @Test
    public void Teste8() {
        Funcionario f = new Funcionario("João", 2000.00, null);
        assertEquals(7.20, f.calcularIrpf(), 0.01);
    }

    @Test
    public void Teste9() {
        Funcionario f = new Funcionario("João", 2826.65, null);
        assertEquals(FaixaIrpf.SEGUNDA, f.IdentificarFaixaIrpf());
    }

    @Test
    public void Teste10() {
        Funcionario f = new Funcionario("João", 2826.65, null);
        assertEquals(69.20, f.calcularIrpf(), 0.01);
    }

    @Test
    public void Teste11() {
        Funcionario f = new Funcionario("João", 2826.66, null);
        assertEquals(FaixaIrpf.TERCEIRA, f.IdentificarFaixaIrpf());
    }

    @Test
    public void Teste12() {
        Funcionario f = new Funcionario("João", 2826.66, null);
        assertEquals(69.20, f.calcularIrpf(), 0.01);
    }

    @Test
    public void Teste13() {
        Funcionario f = new Funcionario("João", 3000.00, null);
        assertEquals(FaixaIrpf.TERCEIRA, f.IdentificarFaixaIrpf());
    }

    @Test
    public void Teste14() {
        Funcionario f = new Funcionario("João", 3000.00, null);
        assertEquals(95.20, f.calcularIrpf(), 0.01);
    }

    @Test
    public void Teste15() {
        Funcionario f = new Funcionario("João", 3751.05, null);
        assertEquals(FaixaIrpf.TERCEIRA, f.IdentificarFaixaIrpf());
    }

    @Test
    public void Teste16() {
        Funcionario f = new Funcionario("João", 3751.05, null);
        assertEquals(207.86, f.calcularIrpf(), 0.01);
    }

    @Test
    public void Teste17() {
        Funcionario f = new Funcionario("João", 3751.06, null);
        assertEquals(FaixaIrpf.QUARTA, f.IdentificarFaixaIrpf());
    }

    @Test
    public void Teste18() {
        Funcionario f = new Funcionario("João", 3751.06, null);
        assertEquals(207.86, f.calcularIrpf(), 0.01);
    }

    @Test
    public void Teste19() {
        Funcionario f = new Funcionario("João", 4000, null);
        assertEquals(FaixaIrpf.QUARTA, f.IdentificarFaixaIrpf());
    }

    @Test
    public void Teste20() {
        Funcionario f = new Funcionario("João", 4000, null);
        assertEquals(263.87, f.calcularIrpf(), 0.01);
    }

    @Test
    public void Teste21() {
        Funcionario f = new Funcionario("João", 4664.68, null);
        assertEquals(FaixaIrpf.QUARTA, f.IdentificarFaixaIrpf());
    }

    @Test
    public void Teste22() {
        Funcionario f = new Funcionario("João",  4664.68, null);
        assertEquals(413.42, f.calcularIrpf(), 0.01);
    }

    @Test
    public void Teste23() {
        Funcionario f = new Funcionario("João",  4664.69, null);
        assertEquals(FaixaIrpf.QUINTA, f.IdentificarFaixaIrpf());
    }

    @Test
    public void Teste24() {
        Funcionario f = new Funcionario("João",4664.69, null);
        assertEquals(413.42, f.calcularIrpf(), 0.01);
    }

    @Test
    public void Teste25() {
        Funcionario f = new Funcionario("João",  5000, null);
        assertEquals(FaixaIrpf.QUINTA, f.IdentificarFaixaIrpf());
    }

    @Test
    public void Teste26() {
        Funcionario f = new Funcionario("João",5000, null);
        assertEquals(505,64 , f.calcularIrpf(), 0.01);
    }

}
