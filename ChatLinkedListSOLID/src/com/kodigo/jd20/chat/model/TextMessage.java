package com.kodigo.jd20.chat.model;

import java.time.LocalDateTime;
//v2 paso 2 OCP
public class TextMessage implements IMessage{
    private final User sender;
    private final String content;
    private final LocalDateTime timestamp;

    public TextMessage(User sender, String content) {
        this.sender = sender;
        this.content = content;
        this.timestamp = LocalDateTime.now();;
    }

    @Override
    public User getSender() {
        return sender;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String getFormatedText() {
        return timestamp + "["  + sender.getName() + "]: " + content;
    }
}
