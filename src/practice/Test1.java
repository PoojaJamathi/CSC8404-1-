package practice;
import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<test> myset=new HashSet<test>();
		myset.add(new test(1));
		myset.add(new test(2));
		myset.add(new test(1));
		myset.add(new test(2));		
	
	System.out.println(myset);
	SortedSet<classcomp> mySortedSet=new TreeSet<classcomp>();
	mySortedSet.add(new classcomp(1));
	mySortedSet.add(new classcomp(2));
	mySortedSet.add(new classcomp(1));
	mySortedSet.add(new classcomp(2));
	System.out.println(mySortedSet);

	}

}
