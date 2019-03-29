package com.behavioral.command;

public class CommandClient {

    public static void main(String[] args) {
        EWSService service = new EWSService();
        AddMemberCommand c1=new AddMemberCommand(service,"aka@gmail.com", "pols" );

//        MailTasksRunner.getInstace().addCommand(c1);
//        etc...

//        create a thread executor to pass commnads
    }
}
