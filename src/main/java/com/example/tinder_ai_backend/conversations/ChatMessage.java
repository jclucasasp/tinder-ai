package com.example.tinder_ai_backend.conversations;

import java.time.LocalDateTime;

public record ChatMessage(
        String messageText,
        String profileId,
        LocalDateTime messageTime
) {
}
