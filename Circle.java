/**
 * Circle 객체를 만드는 클래스
 * 
 * @author (2018315017 임민택)
 * @version (2019.09.02)
 */


public class Circle implements Shape
{
    private int radius;

    public Circle(int radius)
    {
        this.radius = radius;
    }
    
    public double getArea()
    {
        return radius*radius*PI;
    }
    
    public void draw(){
        System.out.print("반지름이 " + this.radius + "인 원입니다.");
    }
}