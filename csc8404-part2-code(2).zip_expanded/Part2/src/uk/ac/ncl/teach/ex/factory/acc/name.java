package uk.ac.ncl.teach.ex.factory.acc;

import java.util.HashMap;
import java.util.Map;
import java.util.jar.Attributes.Name;

public final class name {
	private final String firstName,lastName;
	private static final Map<String, name>NAMES=new HashMap<String,name>();
	private name(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public static name getInstance(String firstName,String lastName)
	{
		final String k=firstName+lastName;
		if(!NAMES.containsKey(k))
			NAMES.put(k,new name(firstName,lastName));
		return NAMES.get(k);
	}
	public String getFirstName()
	{
		return firstName;
}
	public String getLastName()
	{
		return lastName;
	
	}
}
