import java.util.*;

public class Manager extends Employee {
	protected List<Employee> mSubordinates;
	public Manager(String name,String id)
	{
		super(name,id);
		mSubordinates = new LinkedList<Employee>();
	}
	public void addSubordinate(Employee subordinate)
	{
		 mSubordinates.add(subordinate);
	}
	
	public double calcBonus()
	{
		mBonus = 0;
		double factor1 = (mSalary / 10);
		
		for(Task task: mTasks)
		{
			if(task.taskBeforeTime() || task.taskOnTime())
			{
				mBonus+= factor1;
			}
		}
		
		double factor2 = mSalary / mSubordinates.size();
		
		
		
		for(Employee suberdinate:mSubordinates)
		{
			suberdinate.calcBonus();
			if(suberdinate.getBonus() > suberdinate.getSalary())
			{
				mBonus += factor2;
			}
			
		}
		
		System.out.println("Manager " + mName + " got a bonus of " + mBonus);
		return mBonus;
	}
	
}
