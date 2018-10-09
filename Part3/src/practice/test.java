package practice;



public class test {
	private int index;//if using index then direct use index in constructor and every part
	public test(int index)
	{
		this.index=index;
	}
	public int getIndex()
	{
		return index;
	}
	public boolean equals(Object rhs)
	{

	if(rhs==this) return true;
	test p=(test)rhs;
	if(!(rhs instanceof test)) return false;
	return this.index==p.getIndex();
	}
	public String toString()
	{
		return this.index+"";
	}
		
		
		}


