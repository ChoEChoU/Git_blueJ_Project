
/**
 *   인터페이스 Shape
 * 
 * @author (2018315017 임민택) 
 * @version (2019.09.02)
 */

interface Shape
{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}
