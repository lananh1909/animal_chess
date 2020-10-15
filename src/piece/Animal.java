package piece;

import java.util.List;

public abstract class Animal extends Piece{

    public Animal(int _color, Coordinate _coordinate) {
        super(_color, _coordinate);
    }

    public abstract List<Coordinate> getPossibleMove(Piece[][] var1);

    //glass = 10, water = 20, trap = 30, cave = 40

}
