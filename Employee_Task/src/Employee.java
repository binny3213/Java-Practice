import java.util.*;

public class Employee {
	protected String mName,mId;
	protected List<Task> mTasks;
	protected double mSalary;
	protected double mBonus;
	
	public Employee(String name, String id)
	{
		mTasks = new LinkedList<Task>();
		mName= name;
		mId=id;
	}
	public double getSalary()
	{
		return mSalary;
	}
	public double getBonus()
	{
		return mBonus;
	}
	public void setSalary(double salary)
	{
		mSalary = salary;
	}
	public void setBonus(double bonus)
	{
		mBonus = bonus;
	}
	public void addTask(Task task)
	{
		mTasks.add(task);
	}
	public double calcBonus()
	{
		return 0;
	}
	public void addSubordinate(Employee employee)
	{
		
	}
	
	
	
}
