package variables;
class Variables {
	
	  String text="uis";
}	

class Hello extends Test{
	
	void print() {
		System.out.println(Hello.text);
	}
}

 class Test{
	public static void main(String[] args) {
		Hello h=new Hello();
		System.out.println(h.text);
	}
}
//	static String company="FLM";
//	int id=101;
//	String name="raj";
//	
//	static void variables() {
//		int age=20;
//		System.out.println("my age is:"+age);
//	};
//	
//	
//	public Variables(int id,String name) {
//		this.id=id;
//		this.name=name;
//	}
//	
//	public static void main(String[] args) {
//		Variables v=new Variables(102,"Kumar");
//		
//		v.variables();
//		System.out.println(v.id+v.name);
//	}


