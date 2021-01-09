package method_ref;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyCollectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> listA = new ArrayList<>();
       listA.add("A");
       listA.add("B");
       listA.add("C");
       listA.add("D");
       listA.add("E");
       
       listA.remove(0);
       
       
       Object[] obj = listA.toArray();
       String [] obj1 = listA.toArray(new String[0]);
       Set<String> set = new HashSet<>();
       set.addAll(listA);
       
      
	}

}
