
public class PrimitiveToClasses {

	public static void main(String[] args) {
		int num1=126;
		Integer num2=Integer.valueOf(num1);
		System.out.println(num2.getClass().getTypeName());
		//here num2 is already Integer but we r trying to change into Integer  again.
		//..then JVm unboxes num2 from Integer to int after that boxes into Integer
		Integer num3=Integer.valueOf(num2);
		
		System.out.println(num3);
		
		System.out.println(num2==num3);
		
		//String to int
		
		String numString="123";
		int num4=Integer.parseInt(numString);
		System.out.println(num4);
		System.out.println(num4+num2);
		System.out.println(numString+num4);
		String numToString=String.valueOf(num4);
		
		char c='A';
		Character ch=Character.valueOf(c);
		System.out.println("character:"+ch);
		
		Integer charToInt=Integer.valueOf(ch);
		System.out.println("charToInt:"+charToInt);
		
		
		float f=12.5f;
		Float f1=Float.valueOf(f);
		System.out.println(f1);
		
		String floatToString=String.valueOf(f1);
		System.out.println(floatToString);
		
		Float numToFloat=Float.valueOf(num4);
		System.out.println(numToFloat);
		
		float f2=numToFloat.floatValue();
		System.out.println(f2);
		
		
		System.out.println("----------------------------------");
		
		int a=10;
		Integer intToInt=Integer.valueOf(a);
		System.out.println(intToInt);
		int b=intToInt.intValue();
		System.out.println(b);
		
		float f3=Float.parseFloat("123");
		System.out.println(f3);
		
		System.out.println("-----------------");
		
	
		
		
		Integer a1=100;
		Integer b1=null;
		System.out.println((a1==b1)+ ""+ a1.equals(b1));
		Integer num=Integer.valueOf(123);
		System.out.println(num+10);
		
		Double d=15.7;
		Integer i=d.intValue();
		System.out.println(i);
		Integer i1=new Integer(50);
		Integer i2=Integer.valueOf(i1);
		System.out.println(i1==i2);
		
		
	}
	
}
