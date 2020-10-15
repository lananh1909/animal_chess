package piece;

public class Coordinate {
    private int iRow;
    private int iCol;

    public Ground getKind() {
        return kind;
    }

    public void setKind(Ground kind) {
        this.kind = kind;
    }

    private Ground kind;

    public Coordinate(int _iRow, int _iCol, Ground kind) {
        this.iRow = _iRow;
        this.iCol = _iCol;
        this.kind = kind;
    }

    public Coordinate(int _iRow, int _iCol) {
        this.iRow = _iRow;
        this.iCol = _iCol;
    }

    public int getRow() {
        return this.iRow;
    }

    public void setRow(int _iRow) {
        this.iRow = _iRow;
    }

    public int getCol() {
        return this.iCol;
    }

    public void setCol(int _Col) {
        this.iCol = _Col;
    }
}
