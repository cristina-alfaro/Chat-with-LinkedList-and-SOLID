package com.kodigo.jd20.chat.application;

import com.kodigo.jd20.chat.model.Chat;
import com.kodigo.jd20.chat.model.IMessage;
import com.kodigo.jd20.chat.model.TextMessage;
import com.kodigo.jd20.chat.model.User;
import com.kodigo.jd20.chat.service.ChatService;
import com.kodigo.jd20.chat.service.UserService;

public class Main {
    public static void main(String[] args) {

        // Creamos nuestros servicios: repositorios y manejo de usuarios y chats
        UserService userService = new UserService();
        ChatService chatService = new ChatService();

        //Creamos nuestros objetos usuarios
        User luis = userService.createUser("1", "Luis");
        User ana = userService.createUser("2", "Ana");

        Chat chat = chatService.createChat();
        chatService.addUserToChat(chat.getId(),luis);
        chatService.addUserToChat(chat.getId(),ana);

        chatService.sendMessage(chat.getId(), new TextMessage(luis, "Hola Ana, ¿Todavía estas trabajando en el mismo lugar?"));
        chatService.sendMessage(chat.getId(), new TextMessage(ana, "JAJAJA, Sigo a aquí de necia, cada ves mas estresada"));
        chatService.sendMessage(chat.getId(), new TextMessage(luis, "Mandales saludos de mi parte, yo ya ni se si trabajo si soy un NPC de la oficina 😆."));

        chatService.getMessage("chat1");
        for (IMessage message : chatService.getMessage(chat.getId())){
            System.out.println(message.getFormatedText());
        }
    }
}
