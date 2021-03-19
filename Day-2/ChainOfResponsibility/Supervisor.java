package ChainOfResponsibility;

public class Supervisor implements ILeaveRequestHandler {
	private ILeaveRequestHandler nextHandler;

	@Override
	public void nextHandler(ILeaveRequestHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		int leaveDays = leaveRequest.getLeaveDays();
		if (leaveDays >= 1 && leaveDays <= 3) {
			System.out.println("Supervisor approved leave request");
		} else {
			nextHandler.handleRequest(leaveRequest);
		}

	}

}
