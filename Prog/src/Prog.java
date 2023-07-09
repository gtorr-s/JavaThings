public class Prog {

    public static void main(String[] args){

        Veiculo v1, v2, v3;
        LavaRapido lav1, lav2;



        v1 = new Veiculo("passeio");

        v2 = new Veiculo("passeio");

        v3 = new Veiculo("carga");

        lav1 = new LavaRapido("Fast Clean");

        lav2 = new LavaRapido("Limpinho");

        v1.suja();

        v2.suja();

        v3.suja();

        lav1.lavaVeiculo(v1);

        lav2.lavaVeiculo(v2);

        lav1.lavaVeiculo(v3);

        v2.suja();

        lav2.lavaVeiculo(v2);

        v1.status();

        v2.status();

        v3.status();

        lav1.status();

        lav2.status();

    }

}