package piece;

import java.util.List;

public class Cat extends Animal {
    public Cat(int _color, Coordinate _coordinate) {
        super(_color, _coordinate);
        this.name = "Cat";
        this.point = 1;
    }

    @Override
    public List<Coordinate> getPossibleMove(Piece[][] var1) {
        return null;
    }
}
