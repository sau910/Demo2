package method_ref.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClassCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> list = new ArrayList<Car>();
		list.add(new Car("volvo","1235", 1, 40000));
		list.add(new Car("volvo","1235", 1, 50000));
		list.add(new Car("volvo","1235", 2, 70000));
		
		Comparator<Car> carBrandCompartor = new Comparator<Car>() {

			@Override
			public int compare(Car car1, Car car2) {
				// TODO Auto-generated method stub
				return car1.brand.compareTo(car2.brand);
			}
			
			
		};
		
       Comparator<Car> carNuber = (car1,car2)->car1.number.compareTo(car2.number);
	System.out.println();
	Collections.sort(list,carBrandCompartor);
	
	Collections.sort(list,carNuber);
	
	}
	
	

}
