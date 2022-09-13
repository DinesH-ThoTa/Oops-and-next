package basics;

public class StaticDemo {

	static String name;
	
	//static method can be called with class reference, they doesn't need any object creation
	//they do not depend on any other class
	static void Test1(String name)
	{
		StaticDemo.name=name;
		System.out.println(name);
	}

	static void Test2()
	{
		int value=10;
		System.out.println(value);
	}
	public static void main(String[] args) {
		StaticDemo rahul=new StaticDemo();
		
		//as i have declared name as static it doesn't need to be assigned to any object 
		System.out.println(StaticDemo.name);
		
		//static method can be called with class reference, they doesn't need any object creation
		StaticDemo.Test1("Rahul");
		
		Test1("Rahul");
		
		//after assigning Rahul to static variable it is returning same value
		System.out.println(StaticDemo.name);

		Test2();
	
	}
}
