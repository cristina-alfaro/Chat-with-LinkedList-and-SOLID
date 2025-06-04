package com.kodigo.jd20.chat.service;

import com.kodigo.jd20.chat.model.Chat;
import com.kodigo.jd20.chat.model.IMessage;
import com.kodigo.jd20.chat.model.Message;
import com.kodigo.jd20.chat.model.User;

import java.util.*;

// 6
public class ChatService {
    private final Map<String, Chat> chats = new HashMap<>();

    public Chat createChat() {
        Chat chat = new Chat();
        chats.put(chat.getId(), chat);
        return chat;
    }

    //nuevo metodo
    public void addUserToChat(String chatId, User user){
        Chat chat = chats.get(chatId);
        if (chat != null){
            chat.addParticipant(user);
        }
    }

    //public void sendMessage(String chatId, User user, String content) {
    public void sendMessage(String chatId, IMessage message) {
        Chat chat = chats.get(chatId);
        if (chat != null) {
            //chat.addMessage(new Message(user, content));
            chat.addMessage(message);
        } else {
            System.out.println("Chat no encontrado.");
        }
    }

    //public void getMessage(String chatId) {
    public List<IMessage> getMessage(String chatId) {
        Chat chat = chats.get(chatId);
        if (chat != null) {
            return chat.getMessages().getAll();
        } else {
            System.out.println("Chat no encontrado.");
        }
        return Collections.emptyList();
    }

}
