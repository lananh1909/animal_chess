package Model;

import java.util.List;

public abstract class Animal extends Piece{


    public Animal(int color, int point, boolean isAnimal, String name, Coordinate coordinate) {
        super(color, point, isAnimal, name, coordinate);
    }

    public abstract List<Coordinate> getPossibleMove(Piece[][] var1);

    //glass = 10, water = 20, trap = 30, cave = 40

}
