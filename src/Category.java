import java.util.ArrayList;

public class Category {
	private String name;
	private ArrayList<Assignment> assignments;
	
	public Category(String name)
	{
		this.name = name;
		assignments = new ArrayList<Assignment>();
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void addAssignment(Assignment a)
	{
		assignments.add(a);
	}
	
	public String toString()
	{
		String result = name + "\n";
		for(Assignment a : assignments)
			result += a + "\n";
		
		return result;
	}
	
	public static void main(String[] args)
	{
		Category c = new Category("Category");
		c.addAssignment(new Assignment("Worksheet", "1/25", "25/25"));
		c.addAssignment(new Assignment("Test", "1/23", "12.5/14"));
		c.addAssignment(new Assignment("Quiz", "1/20", "30/35"));
		System.out.println(c);
	}
}
