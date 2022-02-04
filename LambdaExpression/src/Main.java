import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		// Example1
		SumFunctionInterface sum = (int x, int y) -> System.out.println("Sum:" + (x + y));
		sum.sumAbstractMethod(5, 10);
		SumFunctionInterface sum2 = (x, y) -> System.out.println("Sum2:" + (x + y));
		sum2.sumAbstractMethod(50, 100);
		// Example2
		ArrayList<User> myFriends = new ArrayList<User>();
		myFriends.add(new User(1, "Gökhan", 23));
		myFriends.add(new User(2, "Onur", 24));
		myFriends.add(new User(3, "Eda", 22));
		myFriends.add(new User(4, "Kaan", 24));
		myFriends.add(new User(5, "Arda", 22));
		myFriends.add(new User(6, "Aleyna", 22));
		myFriends.add(new User(7, "Esra", 22));
		myFriends.add(new User(8, "Batu", 23));
		myFriends.add(new User(9, "Orhan", 22));
		myFriends.add(new User(10, "Gönenç Berkay", 22));
		myFriends.add(new User(11, "İsmail", 22));
		myFriends.add(new User(12, "Teo", 23));
		myFriends.add(new User(13, "Sina", 22));

		myFriends.stream().filter(u -> u.getAge() > 22)
				.forEach(u -> System.out.println(u.getName() + " " + u.getAge()));
	}
}
