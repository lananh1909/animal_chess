package Controller;

import Model.*;

public class Controller {
    public static Piece[][] board = new Piece[9][7];

    public Controller() {

    }

    public static void initBoard(Piece[][] board) {
        board[0][0] = new Tiger(1, new Coordinate(0, 0));
        board[1][0] = new Glass(new Coordinate(1, 0));
        board[2][0] = new Elephant(1, new Coordinate(2, 0));
        board[3][0] = new Glass(new Coordinate(3, 0));
        board[4][0] = new Glass(new Coordinate(4, 0));
        board[5][0] = new Glass(new Coordinate(5, 0));
        board[6][0] = new Mouse(2, new Coordinate(6, 0));
        board[7][0] = new Glass(new Coordinate(7, 0));
        board[8][0] = new Lion(2, new Coordinate(8, 0));

        board[0][1] = new Glass(new Coordinate(0, 1));
        board[1][1] = new Cat(1, new Coordinate(1, 1));
        board[2][1] = new Glass(new Coordinate(2, 1));
        board[3][1] = new Water(new Coordinate(3, 1));
        board[4][1] = new Water(new Coordinate(4, 1));
        board[5][1] = new Water(new Coordinate(5, 1));
        board[6][1] = new Glass(new Coordinate(6, 1));
        board[7][1] = new Dog(2, new Coordinate(7, 1));
        board[8][1] = new Glass(new Coordinate(8, 1));

        board[0][2] = new Trap(1, new Coordinate(0, 2));
        board[1][2] = new Glass(new Coordinate(1, 2));
        board[2][2] = new Wolf(1, new Coordinate(2, 2));
        board[3][2] = new Water(new Coordinate(3, 2));
        board[4][2] = new Water(new Coordinate(4, 2));
        board[5][2] = new Water(new Coordinate(5, 2));
        board[6][2] = new Cheetah(2, new Coordinate(6, 2));
        board[7][2] = new Glass(new Coordinate(7, 2));
        board[8][2] = new Trap(2, new Coordinate(8, 2));

        board[0][3] = new Cave(1, new Coordinate(0, 3));
        board[1][3] = new Trap(1, new Coordinate(1, 3));
        board[2][3] = new Glass(new Coordinate(2, 3));
        board[3][3] = new Glass(new Coordinate(3, 3));
        board[4][3] = new Glass(new Coordinate(4, 3));
        board[5][3] = new Glass(new Coordinate(5, 3));
        board[6][3] = new Glass(new Coordinate(6, 3));
        board[7][3] = new Trap(2, new Coordinate(7, 3));
        board[8][3] = new Cave(2, new Coordinate(8, 3));

        board[0][4] = new Trap(1, new Coordinate(0, 4));
        board[1][4] = new Glass(new Coordinate(1, 4));
        board[2][4] = new Cheetah(1, new Coordinate(2, 4));
        board[3][4] = new Water(new Coordinate(3, 4));
        board[4][4] = new Water(new Coordinate(4, 4));
        board[5][4] = new Water(new Coordinate(5, 4));
        board[6][4] = new Wolf(2, new Coordinate(6, 4));
        board[7][4] = new Glass(new Coordinate(7, 4));
        board[8][4] = new Trap(2, new Coordinate(8, 4));

        board[0][5] = new Glass(new Coordinate(0, 5));
        board[1][5] = new Dog(1, new Coordinate(1, 5));
        board[2][5] = new Glass(new Coordinate(2, 5));
        board[3][5] = new Water(new Coordinate(3, 5));
        board[4][5] = new Water(new Coordinate(4, 5));
        board[5][5] = new Water(new Coordinate(5, 5));
        board[6][5] = new Glass(new Coordinate(6, 5));
        board[7][5] = new Cat(2, new Coordinate(7, 5));
        board[8][5] = new Glass(new Coordinate(8, 5));

        board[0][6] = new Lion(1, new Coordinate(0, 6));
        board[1][6] = new Glass(new Coordinate(1, 6));
        board[2][6] = new Mouse(1, new Coordinate(2, 6));
        board[3][6] = new Glass(new Coordinate(3, 6));
        board[4][6] = new Glass(new Coordinate(4, 6));
        board[5][6] = new Glass(new Coordinate(5, 6));
        board[6][6] = new Elephant(2, new Coordinate(6, 6));
        board[7][6] = new Glass(new Coordinate(7, 6));
        board[8][6] = new Tiger(2, new Coordinate(8, 6));
    }

}
