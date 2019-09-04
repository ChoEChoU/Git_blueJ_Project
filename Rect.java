
/**
 * 여기에 Rect 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
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