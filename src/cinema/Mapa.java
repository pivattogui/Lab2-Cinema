package cinema;

import java.util.ArrayList;

public class Mapa {
    private ArrayList<Assento> assentos;

    public Mapa(ArrayList<Assento> assentos) {
        this.assentos = assentos;
    }

    public String mostrarMapa() {
        String msg = "\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12\t13\t14\nA";
        for (int i = 0; i < assentos.size(); i++) {
            if (assentos.get(i).getOcupado()) {
                if (i > 1 && assentos.get(i - 1).getLinha() != assentos.get(i).getLinha()) {
                    msg = msg + "\n" + assentos.get(i).getLinha() + "\tX";
                } else {
                    msg = msg + "\tX";
                }

            } else {
                if (i > 1 && assentos.get(i - 1).getLinha() != assentos.get(i).getLinha()) {
                    msg = msg + "\n" + assentos.get(i).getLinha() + "\tO";
                } else {
                    msg = msg + "\tO";
                }
            }
        }
        return msg;
    }
}
