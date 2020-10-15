package piece;

import java.util.List;

public class Lion extends Animal {
    public Lion(int _color, Coordinate _coordinate) {
        super(_color, _coordinate);
        this.name = "Lion";
        this.point = 1;
    }

    @Override
    public List<Coordinate> getPossibleMove(Piece[][] var1) {
        return null;
    }
}
