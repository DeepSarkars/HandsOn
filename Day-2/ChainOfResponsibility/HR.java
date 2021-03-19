package ChainOfResponsibility;

public class HR implements ILeaveRequestHandler {
	private ILeaveRequestHandler nextHandler;
	
	@Override
	public void nextHandler(ILeaveRequestHandler nextHandler) {
		this.nextHandler=nextHandler;
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		System.out.println("HR approved leave request");
	}

}
