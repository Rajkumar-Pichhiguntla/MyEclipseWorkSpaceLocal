import com.flm.db.*;
import com.flm.cart.*;
import com.flm.*;
public class Test {
	static int a=10;
	String name ="Rajkumar";
	int x=22;
	public static void main(String[] args) {
		
		Test t=new Test();
		DataBase d=new DataBase();
		Cart c=new Cart();
		Employee e=new Employee();
		System.out.println("Hello");
		System.out.println(t.x);
		System.out.println(a);
		System.out.println(t.name);
		d.connect();
		c.add();
		
		e.employee();
	}
}
