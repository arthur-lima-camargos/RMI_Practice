class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Eixos: " + eixos);
    }
}
