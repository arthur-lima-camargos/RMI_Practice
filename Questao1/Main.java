public class Main {
    public static void main(String[] args) {
        Caminhao meuCaminhao = new Caminhao("PUC-1313", 2022, 6);
        meuCaminhao.exibirDados();

        Onibus meuOnibus = new Onibus("PUC-0678", 2020, 40);
        meuOnibus.exibirDados();
    }
}
