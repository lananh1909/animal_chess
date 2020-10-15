package piece;

import java.util.List;

public class Tiger extends Animal {
    public Tiger(int _color, Coordinate _coordinate) {
        super(_color, _coordinate);
        this.name = "Tiger";
        this.point = 1;
    }

    @Override
    public List<Coordinate> getPossibleMove(Piece[][] var1) {
        return null;
    }
}
