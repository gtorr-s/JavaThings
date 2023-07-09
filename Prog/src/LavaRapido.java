public class LavaRapido {
    private String nome;
    private double lucro;

    public LavaRapido(String nome) {
        this.nome = nome;
        this.lucro = 0.0;
    }

    public void lavaVeiculo(Veiculo veiculo) {
        veiculo.limpa();

        if (veiculo.getTipo().equals("carga")) {
            this.lucro += 20;
        } else if (veiculo.getTipo().equals("passeio")) {
            this.lucro += 15;
        }
    }

    public void status() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Lucro: R$" + this.lucro);
}
}

