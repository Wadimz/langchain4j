package dev.langchain4j.model.chat;

import java.util.Collection;

/**
 * A chatLanguageModel provider result. It is used each time the AI service is called for that specific call.
 */
public class ChatLanguageModelProviderResult {

    private final Collection<ChatLanguageModel> chatLanguageModels;

    private ChatLanguageModelProviderResult(Collection<ChatLanguageModel> chatLanguageModels) {
        this.chatLanguageModels = chatLanguageModels;
    }

    public Collection<ChatLanguageModel> getChatLanguageModels() {
        return chatLanguageModels;
    }

    public static ChatLanguageModelProviderResult.Builder builder() {
        return new ChatLanguageModelProviderResult.Builder();
    }

    public static class Builder {
        private Collection<ChatLanguageModel> chatLanguageModels;

        public ChatLanguageModelProviderResult.Builder chatLanguageModels(Collection<ChatLanguageModel> chatLanguageModels) {
            this.chatLanguageModels = chatLanguageModels;
            return this;
        }

        public ChatLanguageModelProviderResult build() {
            return new ChatLanguageModelProviderResult(chatLanguageModels);
        }
    }
}
