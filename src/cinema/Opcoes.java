package cinema;

import java.util.ArrayList;

public class Opcoes {
    private Mapa mapa;
    private ArrayList<Assento> assentos;

    public Opcoes(ArrayList<Assento> assentos) {
        this.assentos = assentos;
        this.mapa = new Mapa(assentos);
    }

    public void reservar(char linha, int coluna) {
        for (Assento assento : assentos) {
            if (assento.checkAssento(coluna, linha)) {
                assento.reservar();
            }
        }
    }

    public void cancelar(char linha, int coluna) {
        for (Assento assento : assentos) {
            if (assento.checkAssento(coluna, linha)) {
                assento.cancelarReserva();
            }
        }
    }

    public String mostrarMapa() {
        return mapa.mostrarMapa();
    }

    public String quantidade() {
        int quantidade = 0;

        for (Assento assento : assentos) {
            if (!assento.getOcupado()) {
                quantidade++;
            }
        }

        return "Quantidade de assentos disponíveis: " + quantidade;
    }
}
