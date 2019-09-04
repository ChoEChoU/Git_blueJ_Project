
/**
 * Oval 객체를 만드는 클래스
 * 
 * @author 2018315026 정대기 
 * @version 2019.09.02
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
        System.out.println(this.length_1+"x"+this.length_2+"에 내접하는 타원입니다");
    }
}
