
public class TeamMember extends Employee {
	public TeamMember(String name,String id)
	{
		super(name,id);
	}
	public double calcBonus()
	{
		mBonus = 0;
		double factor = mSalary / mTasks.size();
		for(Task task : mTasks)
		{
			if( task.taskOnTime())
			{
				mBonus+= factor;
			}
			else if(task.taskBeforeTime())
			{
				mBonus+= 2*factor;
			}
		}
		
		System.out.println("team member " + mName + " got a bonus of " + mBonus);
		return mBonus;
	}
}
