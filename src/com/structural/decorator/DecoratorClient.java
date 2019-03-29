package com.structural.decorator;

public class DecoratorClient {

    public static void main(String[] args) {

        Message m = new TextMessage("The force is strong inside you");
        System.out.println(m.getContent());


         Message htmlDecorator = new HtmlEncodedMessage(m);
        System.out.println(htmlDecorator.getContent());

        Message base64Decorator = new Base64EncodedMessage(m);
        System.out.println(base64Decorator.getContent());
    }
}
