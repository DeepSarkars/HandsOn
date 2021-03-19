package ChainOfResponsibility;

public class ProjectManager implements ILeaveRequestHandler {
	private ILeaveRequestHandler nextHandler;
	@Override
	public void nextHandler(ILeaveRequestHandler nextHandler) {
		this.nextHandler=nextHandler;
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		int leaveDays=leaveRequest.getLeaveDays();
		if(leaveDays > 3 && leaveDays <= 5) {
			System.out.println("Project Manager approved leave request");
		}else {
			nextHandler.handleRequest(leaveRequest);
		}
	}

}
