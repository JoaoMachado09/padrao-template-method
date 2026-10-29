package padroescomportamentais.templatemethod;

public class FuncionarioPJ extends Funcionario {

    public float calcularBeneficio() {
        return 0.0f;
    }

    public float calcularDesconto() {
        return this.getSalarioBase() * 0.06f;
    }

}
