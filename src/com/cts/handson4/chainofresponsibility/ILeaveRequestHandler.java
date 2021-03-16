package com.cts.handson4.chainofresponsibility;

public interface ILeaveRequestHandler {
	ILeaveRequestHandler nextHandler = null;
	public void handleRequest(LeaveRequest leaveRequest);
}
