package com.websocketChatApp.demo.chat;

import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    public ChatMessage sendMessage (
            @Payload ChatMessage
    ) {

    }

}
