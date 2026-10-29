package padroescomportamentais.templatemethod;

public class FuncionarioCLT extends Funcionario {

    public float calcularBeneficio() {
        return 500.0f;
    }

    public float calcularDesconto() {
        return this.getSalarioBase() * 0.10f;
    }

    @Override
    public String getTipo() {
        return "FuncionarioCLT";
    }
}
