package observer;

import javax.swing.*;

public class App {
    public static void main(String[] args) {

        Carro c1 = new Carro(1);
        Carro c2 = new Carro(1);

        c2.setListener(new CarroListener() {

            public void carroFoiAberto(int sinal) {
                JOptionPane.showMessageDialog(null, "O carro "
                        + " foi aberto com a senha ");
            }
        });

        c1.abrir(1);
        c2.abrir(1);
    }
}
