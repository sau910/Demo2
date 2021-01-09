
public class ClassImp1 implements Training1,Training2,Inter2{

	
	public static void main(String[] args) {
		Inter2 obj =new  ClassImp1();
		obj.method2();
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method One");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method Two");
	}

	@Override
	public void GitTrain() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void javatrain() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void score() {
		// TODO Auto-generated method stub
		
	}
}
