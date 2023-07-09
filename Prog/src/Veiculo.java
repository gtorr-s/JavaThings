
public class Veiculo {
    private String tipo;
    private boolean limpo;

    public Veiculo(String tipo) {
        this.tipo = tipo;
        this.limpo = true;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void suja() {
        this.limpo = false;
    }

    public void limpa() {
        this.limpo = true;
    }

    public void status() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Limpo: " + this.limpo);
    }
}
