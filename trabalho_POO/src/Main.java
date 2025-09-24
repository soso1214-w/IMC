public class Main {
    public static void main(String[] args) {
        // Instanciando um objeto do tipo Pessoa (polimorfismo)
        Pessoa pessoaComum = new Pessoa("Maria", 70.0, 1.75);

        // Instanciando um objeto do tipo Atleta (polimorfismo)
        Pessoa atleta = new Atleta("João", 85.0, 1.80, "Futebol");

        // Calculando e exibindo o IMC de uma pessoa comum
        double imcPessoa = pessoaComum.calcularIMC();
        System.out.println("Nome: " + pessoaComum.getNome());
        System.out.printf("IMC da pessoa comum: %.2f\n", imcPessoa);

        System.out.println("---");

        // Calculando e exibindo o IMC de um atleta
        double imcAtleta = atleta.calcularIMC();
        System.out.println("Nome: " + atleta.getNome());
        System.out.printf("IMC do atleta: %.2f\n", imcAtleta);

        System.out.println("---");

        // Demonstração adicional da diferença no cálculo
        // O IMC base de João seria: 85 / (1.80 * 1.80) = 26.23
        // O IMC ajustado é 5% menor: 26.23 * 0.95 = 24.92
    }
}