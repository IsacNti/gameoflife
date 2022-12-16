package Model;
import View.*;

public class Model {

    public int granne = 0;

    public Model(int width, int height) {

    }

    public void update() {
    GetRules();
    }

    private void GetRules() {





        if (granne == 2 || granne== 3){


        }
            else{

        }

    }

    public Shape[] getShapes() {
        Point[] points = {new Point(5,5),new Point(6,5),new Point(7,5)};
        return (Shape[])points;
    }
}
