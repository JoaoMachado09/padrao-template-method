package padroescomportamentais.templatemethod;

public abstract class Funcionario {

    private int matricula;
    private String nome;
    private float salarioBase;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularBeneficio();

    public abstract float calcularDesconto();

    public float calcularSalarioLiquido() {
        return this.salarioBase + this.calcularBeneficio() - this.calcularDesconto();
    }

    public String getTipo() {
        return "Funcionario";
    }

    public String getContracheque() {
        return getTipo() + "{" +
                "matricula=" + this.matricula +
                ", nome='" + this.nome + '\'' +
                ", salarioLiquido=" + this.calcularSalarioLiquido() +
                '}';
    }
}
