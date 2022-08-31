/*
 *  INCOMPLETE
 * 
 *  Given two rectangles on a 2D graph, return the area of their intersection. If the rectangles don't intersect, return 0;
 */

import java.awt.Point;

public class p185intersectionarea {
    public static int intersect(Point r1tL, Point r1D, Point r2tL, Point r2D){
        Point r1bR = new Point((r1tL.x + r1D.x), (r1tL.y - r1D.y));
        Point r2bR = new Point((r2tL.x + r2D.x), (r2tL.y - r2D.y));

        int r1A = Math.abs(r1tL.x - r1bR.x) * Math.abs(r1tL.y - r2bR.y);
        int r2A = Math.abs(r2tL.x - r2bR.x) * Math.abs(r2tL.y - r2bR.y);

        int x_dist = (Math.min(r1bR.x, r2bR.x)) - (Math.max(r1tL.x, r2tL.x));
        int y_dist = (Math.min(r1bR.y, r2bR.y)) - (Math.max(r1tL.x, r2tL.x));

        int area = 0;

        if (x_dist > 0 && y_dist > 0){
            area = x_dist * y_dist;
        }
        return (r1A + r2A - area);
    }

    public static void main (String[] args){
        Point r1tL = new Point(1, 4);
        Point r1D = new Point(3, 3);
        Point r2tL = new Point(0, 5);
        Point r2D = new Point(4, 3);

        System.out.println(intersect (r1tL, r1D, r2tL, r2D));

    }
}
