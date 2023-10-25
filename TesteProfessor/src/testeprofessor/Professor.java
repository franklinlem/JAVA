package testeprofessor;

public class Professor{
    private String matricula;
    
}

    // Construtor
    public Professor(String matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    // Getters
    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    // Setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

public class ProfessorConcursado extends Professor {

    // Construtor
    public ProfessorConcursado(String matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }
}

public class ProfessorHorista extends Professor {
    private double valorHora;
    private int quantidadeHoras;

    // Construtor
    public ProfessorHorista(String matricula, String nome, double valorHora, int quantidadeHoras) {
        super(matricula, nome);
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
        setSalario(calcularSalario());
    }

    // Getters
    public double getValorHora() {
        return valorHora;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    // Setters
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
        setSalario(calcularSalario());
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
        setSalario(calcularSalario());
    }

    // Método para cálculo do salário total
    private double calcularSalario() {
        return valorHora * quantidadeHoras;
    }    

