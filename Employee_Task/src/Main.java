
public class Main {

	public static void main(String[] args) {

		
		TeamMember emp1 = new TeamMember("John","765754765");
		emp1.setSalary(10000);
		Task taskOnTime = new Task("taskOnTime", 10);
		taskOnTime.setDaysActual(10);
		
		Task taskBeforeTime = new Task("taskBeforeTime", 20);
		taskBeforeTime.setDaysActual(15);
		
		Task taskAfterTime = new Task("taskAfterTime", 30);
		taskAfterTime.setDaysActual(35);
		
		emp1.addTask(taskOnTime);
		emp1.addTask(taskBeforeTime);
		
		TeamMember emp2 = new TeamMember("Jack","5875678567");
		emp2.setSalary(30000);
		emp2.addTask(taskOnTime);
		emp2.addTask(taskAfterTime);
		emp2.addTask(taskAfterTime);
		
		Manager manager = new Manager("Jim","45674567456");
		manager.setSalary(32000);
		manager.addTask(taskOnTime);
		manager.addSubordinate(emp1);
		manager.addSubordinate(emp2);
		
		manager.calcBonus();
	}

}
