package dev.langchain4j.model.chat;

import dev.langchain4j.data.message.UserMessage;

/**
 * A request to the {@link ChatLanguageModelProvider}.
 */
public class ChatLanguageModelProviderRequest {
    private final Object memoryId;
    private final UserMessage userMessage;

    private ChatLanguageModelProviderRequest(Object memoryId, UserMessage userMessage) {
        this.memoryId = memoryId;
        this.userMessage = userMessage;
    }

    public static ChatLanguageModelProviderRequestBuilder builder() {
        return new ChatLanguageModelProviderRequestBuilder();
    }

    public Object memoryId() {
        return memoryId;
    }

    public UserMessage userMessage() {
        return userMessage;
    }

    public static class ChatLanguageModelProviderRequestBuilder {
        private Object memoryId;
        private UserMessage userMessage;

        public ChatLanguageModelProviderRequestBuilder memoryId(Object memoryId) {
            this.memoryId = memoryId;
            return this;
        }

        public ChatLanguageModelProviderRequestBuilder userMessage(UserMessage userMessage) {
            this.userMessage = userMessage;
            return this;
        }

        public ChatLanguageModelProviderRequest build() {
            return new ChatLanguageModelProviderRequest(memoryId, userMessage);
        }
    }
}
