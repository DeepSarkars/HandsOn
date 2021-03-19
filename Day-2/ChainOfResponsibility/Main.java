package ChainOfResponsibility;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LeaveRequest leaveRequest = new LeaveRequest();
		
		System.out.println("Enter the name of the employee:");
		String employeeName = sc.nextLine();
		leaveRequest.setEmployee(employeeName);
		
		System.out.println("Enter the number of days you want the leave for:");
		int leaveDays = sc.nextInt();
		leaveRequest.setLeaveDays(leaveDays);
		
		ILeaveRequestHandler supervisor = new Supervisor();
		ILeaveRequestHandler projectmanager = new ProjectManager();
		ILeaveRequestHandler hr = new HR();
		supervisor.nextHandler(projectmanager);
		projectmanager.nextHandler(hr);
		
		supervisor.handleRequest(leaveRequest);
	}
	
	
	

}
