package com.structural.adapter;

public class BusinessCardDesigner {

    public String designCard(Customer customer){
           StringBuilder sb=new StringBuilder();
          return sb.append(customer.getName())
                  .append(customer.getDesignation())
                  .append(customer.getAdress())
                  .toString();
    }
}
