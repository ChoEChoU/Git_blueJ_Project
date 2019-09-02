
/**
 * 여기에 Oval 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Oval implements Shape
{
    private int length_1, length_2;
    
    public Oval(int length_1, int length_2){
        this.length_1 = length_1;
        this.length_2 = length_2;
    }
    
    public double getArea()
    {
        return length_1 * length_2 * PI;
    }
    
    public void draw(){
        System.out.print(this.length_1+"x"+this.length_2+"에 내접하는 타원입니다");
    }
}
