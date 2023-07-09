
    public class personagem{
    private String nome;
    private int energia;
    private int fome;
    private int sono;
    private int experiencia;

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getSono() {
        return sono;
    }

    public void setSono(int sono) {
        this.sono = sono;
    }
    
    public personagem(String nome, int energia, int fome, int sono, int experiencia){
        this.experiencia = experiencia;
        this.nome = nome;
        if(energia >= 0 && energia <= 10){
            this.energia = energia;
        }
        if(fome >= 0 && fome <= 10){
            this.fome = fome;
        }
        if(sono >= 0 && sono <= 10){
            this.sono = sono;
        }
    }
    
    void exibirEstado(){
        System.out.println("Nome: " + nome + " Energia: " + energia + " Fome: " + fome + " Sono: " + sono);
    }
    
    void cacar(){
        if(energia >= 2){
            System.out.println(nome + " está caçando.");
            energia-=2; //energia = energia - 2
            experiencia+=1; // experiencia = experiencia + 1
        }else{
            System.out.println(nome + " está muito cansado para caçar.");
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
        exibirEstado();
    }
    
    void comer(){
        if(fome >= 1){
            System.out.println(nome + " está comendo.");
            energia = Math.min(energia + 1, 10);
            fome -= 1; // fome = fome - 1
        }else{
            System.out.println(nome + " está sem fome.");
        }
        exibirEstado();
    }
    
    void dormir(){
        if(sono >= 1){
            System.out.println(nome + " está dormindo.");
            energia = Math.min(energia + 1, 10);
            sono -= 1; // sono = sono - 1
        }else{
            System.out.println(nome + " está sem sono.");
        }
        exibirEstado();
    }
}




