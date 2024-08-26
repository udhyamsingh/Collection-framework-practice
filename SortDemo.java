import java.util.Arrays;
import java.util.Comparator;
class SortDemo
{
	public static void main(String[] args)
	{
		int[] a={5,15,20,10,8,3};
		System.out.println("Array Before Sorting");
		for(int a1:a)
		{
			System.out.println(a1);
		}
		System.out.println("Array After Sorting");
		Arrays.sort(a);
		for(int a2:a)
		{
			System.out.println(a2);
		}
		String[] s={"Udhyam","Karan","Suraj"};
		System.out.println("Array Before Sorting");
		for(String s2:s)
		{
			System.out.println(s2);
		}
		System.out.println("String After Customized Sorting");
		Arrays.sort(s);
		for(String s1:s)
		{
			System.out.println(s1);
		}
		
		Arrays.sort(s,new MyComparator());
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}