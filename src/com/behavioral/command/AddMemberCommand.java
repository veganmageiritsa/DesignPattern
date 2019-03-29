package com.behavioral.command;


// concrete command
public class AddMemberCommand implements Command {

    private EWSService service;
    private String emailAdress;
    private String emailList;

    public AddMemberCommand(EWSService service, String emailAdress, String emailList) {
        this.service = service;
        this.emailAdress = emailAdress;
        this.emailList = emailList;
    }


    @Override
    public void execute() {
        service.addMember(emailAdress, emailList);
    }

    public EWSService getService() {
        return service;
    }

    public void setService(EWSService service) {
        this.service = service;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getEmailList() {
        return emailList;
    }

    public void setEmailList(String emailList) {
        this.emailList = emailList;
    }
}
