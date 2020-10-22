package Model;

import java.util.List;

public class Cheetah extends Animal {
    public Cheetah(int color, Coordinate coordinate) {
        super(color, 5, true, "Cheetah", coordinate);
    }

    @Override
    public List<Piece> getPossibleMove(Piece[][] var1) {
        return null;
    }
}
