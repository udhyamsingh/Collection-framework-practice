import java.util.*;
class StackDemo
{
	public static void main(String[] args)
	{
		Stack s=new Stack();
		s.push("A");
		s.push("D");
		s.push("Z");
		s.push("G");
		System.out.println(s);
		System.out.println(s.search("Z"));
		System.out.println(s.search("B"));
	}
}