public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    // Construtor
    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular o IMC
    public double calcularIMC() {
        // Fórmula: peso / (altura * altura)
        // É importante verificar se a altura não é zero para evitar divisão por zero
        if (this.altura > 0) {
            return this.peso / (this.altura * this.altura);
        } else {
            return 0; // Ou lançar uma exceção
        }
    }
}

