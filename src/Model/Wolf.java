package Model;

import java.util.List;

public class Wolf extends Animal {
    public Wolf(int color, Coordinate coordinate) {
        super(color, 4, true, "Wolf", coordinate);
    }

    @Override
    public List<Piece> getPossibleMove(Piece[][] var1) {
        return null;
    }
}
