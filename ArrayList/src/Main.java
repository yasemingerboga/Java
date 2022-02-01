import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> myStringArr= new ArrayList<String>();
		myStringArr.add("Yasemin");
		myStringArr.add("Eda");
		myStringArr.add("Onur");
		System.out.println("ListArray size after addition "+ myStringArr.size());

		System.out.println("-------- PRINT ---------");
		for(String myString:myStringArr) {
			System.out.println(myString);
		}
		System.out.println("-------- END PRINT ---------\n");
		
		System.out.println("-------- GET ---------");
		System.out.println(myStringArr.get(0));
		System.out.println("-------- END GET ---------\n");
		
		System.out.println("-------- SET ---------");
		myStringArr.set(0, "Yasemin Gerboga");
		System.out.println(myStringArr.get(0));
		System.out.println("-------- END SET ---------\n");
		
		System.out.println("-------- SIZE AND GET ---------");
		for(int i=0;i<myStringArr.size();i++) {
			System.out.println(myStringArr.get(i));
		}
		System.out.println("------- END SIZE AND GET ----------\n");
		
		System.out.println("-------- REMOVE ---------");
		myStringArr.remove(0);
		myStringArr.remove("Onur");
		for(String myString:myStringArr) {
			System.out.println(myString);
		}
		System.out.println("ListArray size after deletion "+ myStringArr.size());
		System.out.println("-------- END REMOVE ---------\n");
		
		System.out.println("-------CONTAINS----------");
		Boolean isCheck = myStringArr.contains("Eda");
		System.out.println(isCheck);
		System.out.println("-------END CONTAINS----------");
		
		System.out.println("-------INDEXOF----------");
		int index = myStringArr.indexOf("Eda");
		System.out.println("Index: " + index);
		System.out.println("-------END INDEXOF----------\n");

		System.out.println("-------CLEAR----------");
		myStringArr.clear();
		System.out.println("ListArray size after clear operation "+ myStringArr.size());
		System.out.println("------- END CLEAR----------\n");
		
		System.out.println("-------CONTAINS----------");
		isCheck = myStringArr.contains("Eda");
		System.out.println(isCheck);
		System.out.println("-------END CONTAINS----------\n");
	}
}
