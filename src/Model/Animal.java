package Model;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal extends Piece{


    public Animal(int color, int point, boolean isAnimal, String name, Coordinate coordinate) {
        super(color, point, isAnimal, name, coordinate);
    }
    public boolean checkPiece(Piece p){
        if (p.isAnimal() && p.color != this.color) {
            if (p.point <= this.point)
                return true;
            else
                return false;
        }

        if (p.isAnimal() && p.color == this.color)
            return false;

        if (p instanceof Water){
            return false;
        }

        if (p.color == this.color && p instanceof Cave)
            return false;

        return true;
    }
    public List<Piece> getPossibleMove(Piece[][] board){
        Coordinate co = this.getCoordinate();
        int iRow = co.getRow();
        int iCol = co.getCol();
        List<Piece> possibleMove = new ArrayList<Piece>();

        if (iRow < 8 && iRow > 0 && iCol < 6 && iCol > 0) {
            Piece top = board[iRow + 1][iCol];
            if(checkPiece(top)){
                possibleMove.add(top);
            }

            Piece left = board[iRow][iCol - 1];
            if(checkPiece(left)){
                possibleMove.add(left);
            }

            Piece right = board[iRow][iCol + 1];
            if(checkPiece(right)){
                possibleMove.add(right);
            }

            Piece bottom = board[iRow - 1][iCol];
            if(checkPiece(bottom)){
                possibleMove.add(bottom);
            }
        }

        if (iRow == 8) {
            Piece bottom = board[iRow - 1][iCol];
            if(checkPiece(bottom)){
                possibleMove.add(bottom);
            }
            if (iCol == 0) {
                Piece right = board[iRow][iCol + 1];
                if(checkPiece(right)){
                    possibleMove.add(right);
                }
            }

            if (iCol == 6){
                Piece left = board[iRow][iCol - 1];
                if(checkPiece(left)){
                    possibleMove.add(left);
                }
            }

            if (iCol > 0 && iCol < 6) {
                Piece left = board[iRow][iCol - 1];
                if(checkPiece(left)){
                    possibleMove.add(left);
                }

                Piece right = board[iRow][iCol + 1];
                if(checkPiece(right)){
                    possibleMove.add(right);
                }
            }
        }

        if (iRow == 0) {
            Piece top = board[iRow + 1][iCol];
            if(checkPiece(top)){
                possibleMove.add(top);
            }
            if (iCol == 0) {
                Piece right = board[iRow][iCol + 1];
                if(checkPiece(right)){
                    possibleMove.add(right);
                }
            }

            if (iCol == 6){
                Piece left = board[iRow][iCol - 1];
                if(checkPiece(left)){
                    possibleMove.add(left);
                }
            }

            if (iCol > 0 && iCol < 6) {
                Piece left = board[iRow][iCol - 1];
                if(checkPiece(left)){
                    possibleMove.add(left);
                }

                Piece right = board[iRow][iCol + 1];
                if(checkPiece(right)){
                    possibleMove.add(right);
                }
            }
        }

        if (iCol == 0 && iRow < 8 && iRow > 0) {
            Piece top = board[iRow + 1][iCol];
            if(checkPiece(top)){
                possibleMove.add(top);
            }

            Piece right = board[iRow][iCol + 1];
            if(checkPiece(right)){
                possibleMove.add(right);
            }

            Piece bottom = board[iRow - 1][iCol];
            if(checkPiece(bottom)){
                possibleMove.add(bottom);
            }
        }

        if (iCol == 6 && iRow < 8 && iRow > 0) {
            Piece top = board[iRow + 1][iCol];
            if(checkPiece(top)){
                possibleMove.add(top);
            }

            Piece left = board[iRow][iCol - 1];
            if(checkPiece(left)){
                possibleMove.add(left);
            }

            Piece bottom = board[iRow - 1][iCol];
            if(checkPiece(bottom)){
                possibleMove.add(bottom);
            }
        }

        return possibleMove;
    }

    //glass = 10, water = 20, trap = 30, cave = 40

}
