package ChainOfResponsibility;

public interface ILeaveRequestHandler {
	void nextHandler(ILeaveRequestHandler nextHandler);
	void handleRequest(LeaveRequest leaveRequest);
}
