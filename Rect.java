
/**
 * Rect 객체를 만드는 클래스
 * 
 * @author (2018315038 이혜인) 
 * @version (2019.09.02)
 */
public class Rect implements Shape
{
    private int length_1, length_2;
    
    public Rect(int length_1, int length_2){
        this.length_1 = length_1;
        this.length_2 = length_2;
    }
    
    public double getArea()
    {
        return length_1 * length_2;
    }
    
    public void draw(){
        System.out.println(this.length_1+"x"+this.length_2+"크기의 사각형입니다.");
    }
}