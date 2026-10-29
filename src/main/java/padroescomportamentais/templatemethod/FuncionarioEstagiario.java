package padroescomportamentais.templatemethod;

public class FuncionarioEstagiario extends Funcionario {

    public float calcularBeneficio() {
        return 200.0f;
    }

    public float calcularDesconto() {
        return 0.0f;
    }

    @Override
    public String getTipo() {
        return "Estagiario";
    }
}
