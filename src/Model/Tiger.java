package Model;

import java.util.List;

public class Tiger extends Animal {
    public Tiger(int color, Coordinate coordinate) {
        super(color, 6, true, "Tiger", coordinate);
    }

    @Override
    public List<Piece> getPossibleMove(Piece[][] var1) {
        return null;
    }
}
