package piece;

import java.util.List;

public class Elephant extends Animal {
    public Elephant(int _color, Coordinate _coordinate) {
        super(_color, _coordinate);
        this.name = "Elephant";
        this.point = 1;
    }

    @Override
    public List<Coordinate> getPossibleMove(Piece[][] var1) {
        return null;
    }
}
