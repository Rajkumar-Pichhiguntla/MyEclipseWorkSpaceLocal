package constructor;

public class CallingChildConstructor {
	public static void main(String[] args) {
		Child c=new Child(5);
		System.out.println(c.a);
	}
}

class Parent{
	final int a;
	Parent(){
		a=100;
		System.out.println("parent");
	}
}

class Child extends Parent{
	Child(int x){
		System.out.println("child");
	}
}
