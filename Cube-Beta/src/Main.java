import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        if (Testing.test() == 0){
            cout("Tests Passed Successfully!");
        }
        else
            cout("Test Failure :(");
    }

    public static void Display_labelings(){
        cout("Identifiers:");
        cout("f: Front face, u: Upper face, l: Left face, r: Right face, b: Back face, w: Bottom face\n");
        cout("Colors:");
        cout("w: White, g: Green, r: Red, o: Orange, y: Yellow, b: blue\n");
    }

    public static void Display_Cube(Cube cube){
        System.out.println(cube);
    }

    public static void Display_Cube_Face(Cube_Face face){
        System.out.println(face);
    }

    public static void cout(String str){
        System.out.println(str);
    }
}
