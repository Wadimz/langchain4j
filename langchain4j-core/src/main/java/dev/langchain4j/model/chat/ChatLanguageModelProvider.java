package dev.langchain4j.model.chat;

/**
 * A chatLanguageModel provider. It is used each time the AI service is called for that specific call.
 * <p>
 * {@link ChatLanguageModel} returned in {@link ChatLanguageModelProviderResult} will be included in the request to the LLM.
 **/
public interface ChatLanguageModelProvider {

    /**
     * Provides chatLanguageModel for the request to the LLM.
     *
     * @param request {@link ChatLanguageModelProviderRequest}
     * @return {@link ChatLanguageModelProviderResult} contains chatLanguageModel that should be used in the request to the LLM.
     */
    ChatLanguageModelProviderResult provideChatLanguageModel(ChatLanguageModelProviderRequest request);
}
