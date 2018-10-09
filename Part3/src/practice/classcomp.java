package practice;
import java.lang.Comparable;

public class classcomp implements Comparable<classcomp> {
	private int index;//if using index then direct use index in constructor and every part
	public classcomp(int i)
	{
		index=i;
	}
	public int getIndex()
	{
		return index;
	}
	
	public String toString()
	{
		return this.index+"";
	}
	public int compareTo(classcomp c)
	{
		return Integer.compare(this.index,c.getIndex());
	}
		
		

}
