
/* Created by InteliJ Idea

 *User: Nicholas Gaultney
 *Date: 3/8/2018
 *Time: 11:48 AM
 *Contact: nmgaultney@gmail.com
 */

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

public class Line {
    Point point1;
    Point point2;

    public void Line(Point p1, Point p2){
        point1 = p1;
        point2 = p2;
    }

    public double lineWidth(){
        return abs(point2.getX() - point1.getX());
    }

    public double lineHeight(){
        return abs(point2.getY() - point1.getY());
    }

    public double lineLength(){
        return sqrt(pow(lineWidth(), 2));
    }

    public double lineSlope(){
        return ((point2.getX() - point1.getX()) * (point2.getY() - point1.getY()));
    }

}
