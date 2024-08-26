import java.util.ArrayList;
class Test
{
	public static void main(String[] args)
	{
		ArrayList <String> l=new ArrayList<String>();
		l.add("A");
		l.add(null);
		l.add("B");
		l.add("Z");
		l.add("C");
		//l.add(10);
		System.out.println(l);
		l.remove(2);
		l.add(2,"M");
		l.add("F");
		System.out.println(l);
	}
}