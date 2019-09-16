package factory;

class CarroFactory {

    public Carro getCarro(String marca, String cor) {
        Carro corola = new Corola("prata");
        return corola;
    }

}
