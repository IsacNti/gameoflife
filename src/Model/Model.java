package Model;
import View.*;

import java.util.ArrayList;

public class Model {

    private int m=1;
    private int x;
    private int y;
    public Model(int width, int height) {

    }

    public void update() {
        GetRules();

        GetCells();

        Point[] cells = (Point[]) getShapes();

        for (int i =0; i < ; i++) {

            cells[i].getX();
            cells[i].getY();

            System.out.println(x);
            System.out.println(y);
        }
    }

    private void GetCells() {
        for (int i =0; i < ; i++) {

            cells[i].getX();
            cells[i].getY();

            System.out.println(x);
            System.out.println(y);
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
