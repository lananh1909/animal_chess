package piece;

import java.util.List;

public class Cheetah extends Animal {
    public Cheetah(int _color, Coordinate _coordinate) {
        super(_color, _coordinate);
        this.name = "Cheetah";
        this.point = 1;
    }

    @Override
    public List<Coordinate> getPossibleMove(Piece[][] var1) {
        return null;
    }
}
