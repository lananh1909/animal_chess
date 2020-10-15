package piece;

import java.util.List;

public class Dog extends Animal {
    public Dog(int _color, Coordinate _coordinate) {
        super(_color, _coordinate);
        this.name = "Dog";
        this.point = 1;
    }

    @Override
    public List<Coordinate> getPossibleMove(Piece[][] var1) {
        return null;
    }
}
