package string_study;

public class Test_1 {

	public static void main(String[] args) {
		
		String a="Vaibhav Pardeshi ";
		String b="Shantanu Pawale";
		String e="vaibhav Pardeshi";
		String x="";
		String y=" ";
		
		String t=null;
		
		String c=new String("Suresh Chavan");
		String D=new String("Vaibhav Pardeshi");
		
		System.out.println(a==e);
		System.out.println(a.equals(e));
		System.out.println(a.equals(e));
		System.out.println(a.equalsIgnoreCase(e));
		System.out.println(a.length());
		System.out.println(a.charAt(2));
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.contains("a"));
		System.out.println(a.isEmpty());		//F
		System.out.println(x.isEmpty());		//T
		System.out.println(y.isEmpty());		//F
		System.out.println(a.isBlank());		//F
		System.out.println(x.isBlank());		//T
		System.out.println(y.isBlank());		//T
		System.out.println(x.isBlank());
		System.out.println(a.startsWith("Va"));
		System.out.println(a.endsWith("deshi"));
		System.out.println(a.substring(0,4));
		System.out.println(a.concat("from Nashik"));
		System.out.println(a.lastIndexOf('h'));
		System.out.println(a.indexOf('h'));
		System.out.println(a.replace('h','m'));
		
		
		String name="Raam Raam Raam Raam Raam";
		System.out.println(name.replace("Ra","Sh"));
		
		
		

	}

}
