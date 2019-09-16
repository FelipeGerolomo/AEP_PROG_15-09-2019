package observer;

public class Carro {
    private Integer Carro;
    private CarroListener listener;

    public Carro(Integer sinal) {
        this.Carro = Carro;
    }

    public void setListener(CarroListener listener) {
        this.listener = listener;

    }

    public void abrir(int sinal) {
        if (listener != null) {
            listener.carroFoiAberto(sinal);
        }
    }
}
