
/* Created by InteliJ Idea

 *User: Nicholas Gaultney
 *Date: 3/8/2018
 *Time: 11:46 AM
 *Contact: nmgaultney@gmail.com
 */

public class Point {
    private Integer xValue;
    private Integer yvalue;

    public Point(Integer x, Integer y){
        xValue = x;
        yvalue = y;
    }

    public Integer getX(){
        return xValue;
    }
    public Integer getY(){
        return yvalue;
    }

    public String getPoint(){
        return xValue + ", " + yvalue;
    }

    public void setPoint(Integer x, Integer y){
        xValue = x;
        yvalue = y;
    }
}
