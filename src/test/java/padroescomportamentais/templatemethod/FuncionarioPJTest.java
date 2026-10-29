package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioPJTest {

    @Test
    void deveCalcularBeneficio() {
        FuncionarioPJ funcionario = new FuncionarioPJ();
        funcionario.setSalarioBase(5000.0f);
        assertEquals(0.0f, funcionario.calcularBeneficio());
    }

    @Test
    void deveCalcularDesconto() {
        FuncionarioPJ funcionario = new FuncionarioPJ();
        funcionario.setSalarioBase(5000.0f);
        assertEquals(300.0f, funcionario.calcularDesconto());
    }

    @Test
    void deveCalcularSalarioLiquido() {
        FuncionarioPJ funcionario = new FuncionarioPJ();
        funcionario.setSalarioBase(5000.0f);
        assertEquals(4700.0f, funcionario.calcularSalarioLiquido());
    }

    @Test
    void deveRetornarContracheque() {
        FuncionarioPJ funcionario = new FuncionarioPJ();
        funcionario.setSalarioBase(5000.0f);
        funcionario.setNome("Lucas");
        funcionario.setMatricula(3);
        assertEquals("Funcionario{matricula=3, nome='Lucas', salarioLiquido=4700.0}", funcionario.getContracheque());
    }
}
