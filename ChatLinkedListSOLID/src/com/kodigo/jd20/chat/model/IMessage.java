package com.kodigo.jd20.chat.model;

import java.time.LocalDateTime;
// v2 paso 1 OCP  DIP
public interface IMessage {
    User getSender();

    String getContent();

    String getFormatedText();

}
