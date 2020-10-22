package Model;

import java.util.List;

public class Lion extends Animal {
    public Lion(int color, Coordinate coordinate) {
        super(color, 7, true, "Lion", coordinate);
    }

    @Override
    public List<Coordinate> getPossibleMove(Piece[][] var1) {
        return null;
    }
}
