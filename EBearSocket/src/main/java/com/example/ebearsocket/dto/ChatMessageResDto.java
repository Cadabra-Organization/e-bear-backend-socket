package com.example.ebearsocket.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ChatMessageResDto {
    private boolean success;
    private String id;
    private String lastMessage;
    private LocalDateTime lastMessageTime;
    private Integer messageCount;
}
