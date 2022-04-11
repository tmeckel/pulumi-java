// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Custom conversation models used in agent assist feature. Supported feature: ARTICLE_SUGGESTION, SMART_COMPOSE, SMART_REPLY.
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs Empty = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs();

    /**
     * Conversation model resource name. Format: `projects//conversationModels/`.
     * 
     */
    @Import(name="model")
      private final @Nullable Output<String> model;

    public Output<String> getModel() {
        return this.model == null ? Codegen.empty() : this.model;
    }

    public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs(@Nullable Output<String> model) {
        this.model = model;
    }

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs() {
        this.model = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> model;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.model = defaults.model;
        }

        public Builder model(@Nullable Output<String> model) {
            this.model = model;
            return this;
        }
        public Builder model(@Nullable String model) {
            this.model = Codegen.ofNullable(model);
            return this;
        }        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs build() {
            return new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs(model);
        }
    }
}
