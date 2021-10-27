package geekassignment;

public class Datatypes {

	public static void main(String[] args) {
		System.out.println("max val from byte class:"+Byte.MAX_VALUE);
		System.out.println("min val from byte class:"+Byte.MIN_VALUE);
		Byte b=125;
		System.out.println(b);
		System.out.println(b.getClass().getName());
		
		System.out.println("max val from Short class:"+Short.MAX_VALUE);
		System.out.println("min val from Short class:"+Short.MIN_VALUE);
		Short s=1264;
		System.out.println(s);
		System.out.println(s.getClass().getName());
		
		
		System.out.println("max val from int class:"+Integer.MAX_VALUE);
		System.out.println("min val from int class:"+Integer.MIN_VALUE);
		Integer i=56487;
		System.out.println(i);
		System.out.println(i.getClass().getName());
		
		
		System.out.println("max val from long class:"+Long.MAX_VALUE);
		System.out.println("min val from long class:"+Long.MIN_VALUE);
		long l=45678912; 
		System.out.println(l);
		//System.out.println(l.getClass().getName());
		

		System.out.println("max val from float class:"+Float.MAX_VALUE);
		System.out.println("min val from float class:"+Float.MIN_VALUE);
		float f=7894.256f;
		System.out.println(f);
		//System.out.println(f.getClass().getName());
		
		System.out.println("max val from double class:"+Double.MAX_VALUE);
		System.out.println("min val from double class:"+Double.MIN_VALUE);
		double d=4568.45557;
		System.out.println(d);
		
		boolean b1=true;
		System.out.println(b1);
		boolean b2=false;
		System.out.println(b2);
		
		char c='c';
		char d1=++c;
		char f1='f';
		char d2=f1++;
		char d3=++f1;

		System.out.println(c);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);

	}

}
