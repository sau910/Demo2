
import java.util.function.*;

@FunctionalInterface
interface FirstInterface{
	public int addNumber(int x,int y);
}
public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FirstInterface imp1 = (x,y)->x+y +y;
		IntBinaryOperator  imp1 = (x,y)->x*y+x; 
		System.out.println("add numbers are :"+imp1.applyAsInt(2, 4));
         
	}

}
