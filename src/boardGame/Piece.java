package boardGame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; //por padrão o java coloca o valor nulo, n precisa dessa linha
    }

    protected Board getBoard() { //somente classes e subclasses do mesmo pacote podem acessar o tabuleiro
        return board;
    }

}
