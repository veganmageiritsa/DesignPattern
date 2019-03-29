package com.structural.decorator;

public class HtmlEncodedMessage implements Message {

    private Message message;

    public HtmlEncodedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<html>");
        htmlBuilder.append("<head><title>Hello </title></head>");
        htmlBuilder.append((message.getContent()));
        htmlBuilder.append("</html>");
        return htmlBuilder.toString();

    }
}
