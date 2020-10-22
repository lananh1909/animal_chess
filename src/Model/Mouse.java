package Model;

import java.util.List;

public class Mouse extends Animal {
    public Mouse(int color, Coordinate coordinate) {
        super(color, 1, true, "Mouse", coordinate);
    }

    @Override
    public List<Piece> getPossibleMove(Piece[][] var1) {
        return null;
    }
}
