package piece;

public class Piece {
    public static final int GLASS = 10;
    public static final int WATER = 20;
    public static final int TRAP = 30;
    public static final int CAVE = 40;

    protected int color;
    protected int point;
    protected String name;
    protected Coordinate coordinate;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Piece(int _color, Coordinate _coordinate) {
        this.color = _color;
        this.coordinate = _coordinate;
        this.name = "";
    }

    public int getTypeOfLand(){
        Coordinate add = this.coordinate;
        int iRow = add.getRow();
        int iCol = add.getRow();
        if((iRow == 0 || iRow == 8) && iCol ==3){
            return CAVE;
        }
        if((iRow == 0 || iRow == 8) && (iCol == 2 || iCol == 4)){
            return TRAP;
        }
        if((iRow == 1 || iRow == 7) && iCol ==3){
            return TRAP;
        }
        if((iRow >= 3 && iRow <= 5) && ((iCol >= 1 && iCol <= 2) || (iCol >= 4 && iCol <= 5))){
            return WATER;
        }
        return GLASS;
    }
}
