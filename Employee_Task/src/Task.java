
public class Task {
	private String mName_Task;
	private int mDays_Ahead;
	private int mDays_Actual;
	
	public Task(String name, int plannerDurataionDays)
	{
		mName_Task = new String(name);
		mDays_Ahead = plannerDurataionDays;
	}
	
	public String getNameTask()
	{
		return mName_Task;
	}
	
	public void setName(String name)
	{
		mName_Task = new String(name);
	}
	
	public int getDaysAhead()
	{
		return mDays_Ahead;
	}
	
	public void setDaysAhead(int days)
	{
		mDays_Ahead = days;
	}
	
	public int getDaysActual()
	{
		return mDays_Actual;
	}
	
	public void setDaysActual(int days)
	{
		mDays_Actual = days;
	}
	
	public boolean taskOnTime()
	{
		return (mDays_Actual == mDays_Ahead);
	}
	public boolean taskBeforeTime()
	{
		return (mDays_Actual< mDays_Ahead);
	}
	
	
	
}
