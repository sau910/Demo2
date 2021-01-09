
@FunctionalInterface
public interface Training1 {
 
public  void javatrain();

 default void score() {
	System.out.println("First");
}
 
default void score1() {
	System.out.println("Second");
}

@Override
String toString();
 
}
