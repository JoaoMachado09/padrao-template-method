package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioEstagiarioTest {

    @Test
    void deveCalcularBeneficio() {
        FuncionarioEstagiario funcionario = new FuncionarioEstagiario();
        funcionario.setSalarioBase(1200.0f);
        assertEquals(200.0f, funcionario.calcularBeneficio());
    }

    @Test
    void deveCalcularDesconto() {
        FuncionarioEstagiario funcionario = new FuncionarioEstagiario();
        funcionario.setSalarioBase(1200.0f);
        assertEquals(0.0f, funcionario.calcularDesconto());
    }

    @Test
    void deveCalcularSalarioLiquido() {
        FuncionarioEstagiario funcionario = new FuncionarioEstagiario();
        funcionario.setSalarioBase(1200.0f);
        assertEquals(1400.0f, funcionario.calcularSalarioLiquido());
    }

    @Test
    void deveRetornarContracheque() {
        FuncionarioEstagiario funcionario = new FuncionarioEstagiario();
        funcionario.setSalarioBase(1200.0f);
        funcionario.setNome("Pedro");
        funcionario.setMatricula(2);
        assertEquals("Estagiario{matricula=2, nome='Pedro', salarioLiquido=1400.0}", funcionario.getContracheque());
    }
}
