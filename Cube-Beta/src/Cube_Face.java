import sun.util.resources.be.CurrencyNames_be_BY;
import java.util.Scanner;
public class Cube_Face {
    // Private Data Members
    private char [][] colors;
    private char face_Color;

    // Default Constructor
    public Cube_Face(){ // Cube_Face Default Constructor
        colors = new char[3][3];

        for(int row = 0; row <= 2; row++){ // row value
            for(int col = 0; col <= 2; col++){ // column value
                colors[row][col] = 'w'; //
            }
        }
        face_Color = colors [1][1];
    }

    // Constructor w/t Parameters
    public Cube_Face(char c){ // Cube_Face Constructor with parameter c
        colors = new char[3][3];

        for(int row = 0; row <= 2; row++){ // row value
            for(int col = 0; col <= 2; col++){ // column value
                colors[row][col] = java.lang.Character.toLowerCase(c);
            }
        }
        face_Color = colors [1][1];
    }

    // Member Methods
    public char get_Face_Color(){
        return face_Color;
    }

    public char get_Block_Color(int row, int col){
        return colors [row][col];
    }

    public void set_Block_Color(int row, int col, char c) {
        colors[row][col] = c;
    }

    public void rotate_Face_Clock(){

        char [][] rotatedFace = new char[3][3];
        rotatedFace [0][0] = colors[2][0];
        rotatedFace [0][1] = colors[1][0];
        rotatedFace [0][2] = colors[0][0];
        rotatedFace [1][2] = colors[0][1];
        rotatedFace [2][2] = colors[0][2];
        rotatedFace [2][1] = colors[1][2];
        rotatedFace [2][0] = colors[2][2];
        rotatedFace [1][0] = colors[2][1];
        rotatedFace [1][1] = colors[1][1];

        for(int row = 0; row <= 2; row++) { // row value
            for (int col = 0; col <= 2; col++) { // column value
                colors [row][col] = rotatedFace[row][col];
            }
        }
    }

    public void rotate_Face_CounterClock(){

        char [][] rotatedFace = new char[3][3];
        rotatedFace [0][0] = colors[0][2];
        rotatedFace [0][1] = colors[1][2];
        rotatedFace [0][2] = colors[2][2];
        rotatedFace [1][2] = colors[2][1];
        rotatedFace [2][2] = colors[2][0];
        rotatedFace [2][1] = colors[1][0];
        rotatedFace [2][0] = colors[0][0];
        rotatedFace [1][0] = colors[0][1];
        rotatedFace [1][1] = colors[1][1];

        for(int row = 0; row <= 2; row++) { // row value
            for (int col = 0; col <= 2; col++) { // column value
                colors [row][col] = rotatedFace[row][col];
            }
        }
    }

    public String toString(){ // displays the current face with: r = red, b = blue, w = white, y = yellow, g = green, o = orange

        String display_Face = "=========\n";
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                display_Face += "|" + get_Block_Color(row, col) + "|";
            }
            display_Face += "\n";
        }
        display_Face += "=========\n";
        return display_Face;

        //
        // =========  (F) <-- (current face)
        // |r||r||r|
        // |r||r||r|
        // |r||r||r|
        // =========
        //
    }
    // in CUBE class... display_FACES(); <=== for u,f,l,r,b,w

}


