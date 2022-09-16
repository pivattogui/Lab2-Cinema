package cinema;

public class Assento {
    private int coluna;
    private char linha;
    private boolean ocupado = false;

    public Assento(int coluna, int linha) {
        this.coluna = coluna;
        this.linha = converteLinha(linha);
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public void setLinha(char linha) {
        this.linha = linha;
    }

    public void reservar() {
        this.ocupado = true;
    }

    public void cancelarReserva(){
        this.ocupado = false;
    }

    public boolean getOcupado() {
        return ocupado;
    }

    public int getColuna() {
        return coluna;
    }

    public char getLinha() {
        return linha;
    }

    public boolean checkAssento(int coluna, char linha) {
        if (this.coluna == coluna && this.linha == linha) {
            return true;
        }
        return false;
    }
    

    public char converteLinha(int index) {
        switch (index) {
            case 0:
                return 'A';
            case 1:
                return 'B';
            case 2:
                return 'C';
            case 3:
                return 'D';
            case 4:
                return 'E';
            case 5:
                return 'F';
            case 6:
                return 'G';
            case 7:
                return 'H';
            case 8:
                return 'I';
            case 9:
                return 'J';
            case 10:
                return 'K';
            case 11:
                return 'L';
            default:
                return '?';
        }
    }
}
