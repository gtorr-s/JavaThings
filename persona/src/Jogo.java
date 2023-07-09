public class Jogo {
    public static void main(String[] args) {
        personagem cacador = new personagem("",10,0,0,0);
        int opcao = 0;
        
        while(cacador.getEnergia() > 0 && opcao != 4 && cacador.getExperiencia() < 10){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada:\n1- Caçar\n2- Comer\n 3- Dormir\n 4- Sair"));
            
            if(opcao == 1){
                cacador.cacar();
            }else if(opcao == 2){
                cacador.comer();
            }else if(opcao == 3){
                cacador.dormir();
            }
        }
        if(cacador.getExperiencia() >= 10){
            System.out.println("Parabéns, você ganhou!!");
        }else{
            System.out.println("Você perdeu!!");
        }
    }
}
