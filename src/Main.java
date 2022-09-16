import cinema.Assento;
import cinema.Menu;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Assento> assentos = new ArrayList<>();
        int qtdColunas = 14;
        int qtdLinhas = 12;

        for (int linha = 0; linha < qtdLinhas; linha++) {
            for (int coluna = 1; coluna <= qtdColunas; coluna++) {
                assentos.add(new Assento(coluna, linha));
            }
        }

        Menu menu = new Menu(assentos);

        menu.mostrarOpcoes();
    }
}
