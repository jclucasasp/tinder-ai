package com.example.tinder_ai_backend.conversations;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConversationRepo extends MongoRepository<Conversation, String> {
}
