import java.util.*;
class TreeMapDemo
{
	public static void main(String[] args)
	{
		TreeMap t=new TreeMap();
		t.put(101,"Durga");
        t.put(103,"Karan");
		t.put(102,"Udyam");
		t.put(105,"Saurav");
		t.put(104,"Ashvil");
		t.put(109,"Yogendra");
		//t.put(null,"Rahul");
		t.put("XXX","YYY");
		System.out.println(t);
	}
}