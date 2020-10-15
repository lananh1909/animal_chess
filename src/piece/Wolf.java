package piece;

import java.util.List;

public class Wolf extends Animal {
    public Wolf(int _color, Coordinate _coordinate) {
        super(_color, _coordinate);
        this.name = "Wolf";
        this.point = 1;
    }

    @Override
    public List<Coordinate> getPossibleMove(Piece[][] var1) {
        return null;
    }
}
