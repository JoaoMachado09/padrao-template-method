package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioCLTTest {

    @Test
    void deveCalcularBeneficio() {
        FuncionarioCLT funcionario = new FuncionarioCLT();
        funcionario.setSalarioBase(3000.0f);
        assertEquals(500.0f, funcionario.calcularBeneficio());
    }

    @Test
    void deveCalcularDesconto() {
        FuncionarioCLT funcionario = new FuncionarioCLT();
        funcionario.setSalarioBase(3000.0f);
        assertEquals(300.0f, funcionario.calcularDesconto());
    }

    @Test
    void deveCalcularSalarioLiquido() {
        FuncionarioCLT funcionario = new FuncionarioCLT();
        funcionario.setSalarioBase(3000.0f);
        assertEquals(3200.0f, funcionario.calcularSalarioLiquido());
    }

    @Test
    void deveRetornarContracheque() {
        FuncionarioCLT funcionario = new FuncionarioCLT();
        funcionario.setSalarioBase(3000.0f);
        funcionario.setNome("Marina");
        funcionario.setMatricula(1);
        assertEquals("FuncionarioCLT{matricula=1, nome='Marina', salarioLiquido=3200.0}", funcionario.getContracheque());
    }
}
