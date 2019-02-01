
public class Assignment {
	private String name, date;
	private int pointsOutOf;
	private double pointsReceived;
	
	public Assignment(String name, String date, String grade)
	{
		this.name = name;
		this.date = date;
		pointsReceived = Double.parseDouble(grade.substring(0, grade.indexOf('/')));
		pointsOutOf = Integer.parseInt(grade.substring(grade.indexOf("/") + 1));
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getDate()
	{
		return this.date;
	}
	
	public double getPointsReceived()
	{
		return pointsReceived;
	}
	
	public double getPointsOutOf()
	{
		return pointsOutOf;
	}
	
	public double getPercentGrade()
	{
		return pointsReceived/pointsOutOf * 100;
	}
	
	public String toString()
	{
		return this.date + "\t" + this.name + "\t" + pointsReceived + "/" + pointsOutOf;
	}
	
	public static void main(String[] args)
	{
		Assignment ass = new Assignment("Worksheet", "1/25", "25/25");
		System.out.println(ass.getPercentGrade());
		System.out.println(ass);
	}
}
