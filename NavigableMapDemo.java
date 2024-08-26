import java.util.*;
class NavigableMapDemo
{
	public static void main(String[] args)
	{
		TreeMap<String,String>t=new TreeMap<String,String>();
		t.put("a","apple");
		t.put("g","gun");
		t.put("b","banana");
		t.put("e","elephant");
		t.put("f","fun");
		System.out.println(t);
		System.out.println(t.floorKey("g"));
		System.out.println(t.lowerKey("c"));
		System.out.println(t.ceilingKey("a"));
		System.out.println(t.higherKey("a"));
		System.out.println(t.pollFirstEntry());
		System.out.println(t.pollLastEntry());
		System.out.println(t.descendingMap());
		System.out.println(t);
	}
}