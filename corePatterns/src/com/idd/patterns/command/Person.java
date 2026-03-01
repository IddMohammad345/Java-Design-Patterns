package com.idd.patterns.command;

public class Person {

	public static void main(String[] args) {
		Television television=new Television();
		
		RemoteControl remoteControl=new RemoteControl();
		
		OnCommand OnCommand = new OnCommand(television);
		
		remoteControl.setCommand(OnCommand);
		
		remoteControl.pressButton();
	}

}
