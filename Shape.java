 
/**
 *   ?Έ?°??΄?€ Shape
 * 
 * @author (2018315017 ?λ―Όν, 2018315038 ?΄??Έ, 2018315026 ? ??κΈ?) 
 * @version (2019.09.02)
 */

interface Shape
{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.print("--- ?€? κ·Έλ¦½??€. ");
        draw();
    }
}
