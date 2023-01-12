package Model;
import View.*;

import java.util.ArrayList;

public class Model {



    public Model(int width, int height) {

    }

    public void update() {
    GetRules();
    }

    private void GetRules() {



    }

    public Shape[] getShapes() {
        ArrayList<Point> points = new ArrayList<Point>();
        points.add(new Point(5,5));
        points.add(new Point(6,5));
        points.add(new Point(7,5));

        Point[] pixelsToDisplay = new Point[points.size()];
        points.toArray(pixelsToDisplay);

        return (Shape[])pixelsToDisplay;
    }
}
