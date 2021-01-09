package method_ref;

@FunctionalInterface
interface Callinterface
{
	
	public int calculate_balance(int wd);
	
}


public class ClassImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int balance = 50000;
        Callinterface c = (wd)->(balance-wd);
        System.out.println(c.calculate_balance(100));
        
	}

}
