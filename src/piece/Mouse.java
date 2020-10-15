package piece;

import java.util.List;

public class Mouse extends Animal {
    public Mouse(int _color, Coordinate _coordinate) {
        super(_color, _coordinate);
        this.name = "Mouse";
        this.point = 1;
    }

    @Override
    public List<Coordinate> getPossibleMove(Piece[][] var1) {
        return null;
    }
}
