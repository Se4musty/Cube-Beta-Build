import java.util.Scanner;
public class Testing {
    public static int test(){
                 /*   Cube myCube;
        myCube.set_Colors_Def();*/

        /* FACE TESTING */
//        Cube_Face test_face = new Cube_Face();
//        test_face.set_Block_Color(0,2,'r');
//        Display_Cube_Face(test_face);
        /* EO FACE TESTING */

        /* CUBE TESTING */
        // NOTE: Game ALWAYS starts with the user selecting the FOCAL(FRONT) face,
        // ...after only decide what color is upper to change perspective.

        // NOTE: FIX --> Cube rubix = new Cube('o', 'r');

        /* PREVIOUS FEATURE TESTING */

//        Cube rubix = new Cube('w', 'o');
//        Display_Cube(rubix);
//        rubix.get_Focal_Face().set_Block_Color(0,2,'r');
//        rubix.get_Focal_Face().rotate_Face_Clock();
//        Display_Cube(rubix);

        /* EO PREV TESTING*/

        /* NEW FEATURE TESTING */
        Cube rubix = new Cube();
        //rubix.get_Upper_Face().set_Block_Color(0,1,'r');
        //rubix.get_Bottom_Face().set_Block_Color(0,1,'r');
        //rubix.get_Back_Face().set_Block_Color(0,1,'r');
        Main.Display_Cube(rubix);
        //rubix.move_front_face_clock(); WORKS!
        //rubix.move_front_face_cclock(); WORKS!
        //rubix.move_upper_face_clock(); WORKS!
        //rubix.move_upper_face_cclock(); WORKS!
        //rubix.move_left_face_clock(); WORKS!
        //rubix.move_left_face_cclock(); WORKS!
        //rubix.move_right_face_clock(); WORKS!
        //rubix.move_right_face_cclock(); WORKS!
        //rubix.move_back_face_clock(); WORKS!
        //rubix.move_back_face_cclock(); WORKS!
        //rubix.move_bottom_face_clock(); WORKS!
        //rubix.move_bottom_face_cclock(); WORKS!
        //rubix.move_vertical_Layer_Up(); //WORKS!
        //rubix.move_vertical_Layer_Down(); //WORKS!
        //rubix.move_horizontal_Layer_Right(); WORKS!
        //rubix.move_horizontal_Layer_Left(); WORKS!

        // ROTATE CUBE?
        // rubix.rotate_Cube('l', 1); WORKS!
        Main.Display_Cube(rubix);
        /* EO NEW TESTING */

        /* EO CUBE TESTING */
        return 0;
    }
}
