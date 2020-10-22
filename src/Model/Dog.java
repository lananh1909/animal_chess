package Model;

import java.util.List;

public class Dog extends Animal {
    public Dog(int color, Coordinate coordinate) {
        super(color, 3, true, "Dog", coordinate);
    }

    @Override
    public List<Piece> getPossibleMove(Piece[][] var1) {
        return null;
    }
}
