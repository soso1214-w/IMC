public class Atleta extends Pessoa {
    private String esportePraticado;

    // Construtor da subclasse
    public Atleta(String nome, double peso, double altura, String esportePraticado) {
        // Chama o construtor da classe pai (Pessoa)
        super(nome, peso, altura);
        this.esportePraticado = esportePraticado;
    }

    // Método getter
    public String getEsportePraticado() {
        return esportePraticado;
    }

    // Método setter
    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }

    // Sobrescrita do método calcularIMC()
    @Override
    public double calcularIMC() {
        // Chama o método da classe pai para obter o IMC base
        double imcBase = super.calcularIMC();

        // Reduz o valor do IMC em 5%
        return imcBase * 0.95;
    }
}