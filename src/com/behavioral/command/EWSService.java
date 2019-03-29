package com.behavioral.command;


//receiver class
public class EWSService {

    public void addMember(String contact, String group){
        System.out.println("Added " + contact + " to " + group );
    }

    public void removeMember(String contact, String group){
        System.out.println("Removed " + contact + " to " + group );
    }
}
