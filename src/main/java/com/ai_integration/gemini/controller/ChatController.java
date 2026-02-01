package com.ai_integration.gemini.controller;

import com.ai_integration.gemini.service.ChatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService){
        this.chatService = chatService;
    }

    @GetMapping("/chat")
    public String chat(@RequestParam String prompt){
       return chatService.ask(prompt);
    }


}
