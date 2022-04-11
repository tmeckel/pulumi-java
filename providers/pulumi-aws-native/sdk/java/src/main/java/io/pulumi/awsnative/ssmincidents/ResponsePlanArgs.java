// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmincidents;

import io.pulumi.awsnative.ssmincidents.inputs.ResponsePlanActionArgs;
import io.pulumi.awsnative.ssmincidents.inputs.ResponsePlanChatChannelArgs;
import io.pulumi.awsnative.ssmincidents.inputs.ResponsePlanIncidentTemplateArgs;
import io.pulumi.awsnative.ssmincidents.inputs.ResponsePlanTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResponsePlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponsePlanArgs Empty = new ResponsePlanArgs();

    /**
     * The list of actions.
     * 
     */
    @Import(name="actions")
      private final @Nullable Output<List<ResponsePlanActionArgs>> actions;

    public Output<List<ResponsePlanActionArgs>> getActions() {
        return this.actions == null ? Codegen.empty() : this.actions;
    }

    @Import(name="chatChannel")
      private final @Nullable Output<ResponsePlanChatChannelArgs> chatChannel;

    public Output<ResponsePlanChatChannelArgs> getChatChannel() {
        return this.chatChannel == null ? Codegen.empty() : this.chatChannel;
    }

    /**
     * The display name of the response plan.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The list of engagements to use.
     * 
     */
    @Import(name="engagements")
      private final @Nullable Output<List<String>> engagements;

    public Output<List<String>> getEngagements() {
        return this.engagements == null ? Codegen.empty() : this.engagements;
    }

    @Import(name="incidentTemplate", required=true)
      private final Output<ResponsePlanIncidentTemplateArgs> incidentTemplate;

    public Output<ResponsePlanIncidentTemplateArgs> getIncidentTemplate() {
        return this.incidentTemplate;
    }

    /**
     * The name of the response plan.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The tags to apply to the response plan.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<ResponsePlanTagArgs>> tags;

    public Output<List<ResponsePlanTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ResponsePlanArgs(
        @Nullable Output<List<ResponsePlanActionArgs>> actions,
        @Nullable Output<ResponsePlanChatChannelArgs> chatChannel,
        @Nullable Output<String> displayName,
        @Nullable Output<List<String>> engagements,
        Output<ResponsePlanIncidentTemplateArgs> incidentTemplate,
        @Nullable Output<String> name,
        @Nullable Output<List<ResponsePlanTagArgs>> tags) {
        this.actions = actions;
        this.chatChannel = chatChannel;
        this.displayName = displayName;
        this.engagements = engagements;
        this.incidentTemplate = Objects.requireNonNull(incidentTemplate, "expected parameter 'incidentTemplate' to be non-null");
        this.name = name;
        this.tags = tags;
    }

    private ResponsePlanArgs() {
        this.actions = Codegen.empty();
        this.chatChannel = Codegen.empty();
        this.displayName = Codegen.empty();
        this.engagements = Codegen.empty();
        this.incidentTemplate = Codegen.empty();
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ResponsePlanActionArgs>> actions;
        private @Nullable Output<ResponsePlanChatChannelArgs> chatChannel;
        private @Nullable Output<String> displayName;
        private @Nullable Output<List<String>> engagements;
        private Output<ResponsePlanIncidentTemplateArgs> incidentTemplate;
        private @Nullable Output<String> name;
        private @Nullable Output<List<ResponsePlanTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponsePlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.chatChannel = defaults.chatChannel;
    	      this.displayName = defaults.displayName;
    	      this.engagements = defaults.engagements;
    	      this.incidentTemplate = defaults.incidentTemplate;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder actions(@Nullable Output<List<ResponsePlanActionArgs>> actions) {
            this.actions = actions;
            return this;
        }
        public Builder actions(@Nullable List<ResponsePlanActionArgs> actions) {
            this.actions = Codegen.ofNullable(actions);
            return this;
        }
        public Builder actions(ResponsePlanActionArgs... actions) {
            return actions(List.of(actions));
        }
        public Builder chatChannel(@Nullable Output<ResponsePlanChatChannelArgs> chatChannel) {
            this.chatChannel = chatChannel;
            return this;
        }
        public Builder chatChannel(@Nullable ResponsePlanChatChannelArgs chatChannel) {
            this.chatChannel = Codegen.ofNullable(chatChannel);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder engagements(@Nullable Output<List<String>> engagements) {
            this.engagements = engagements;
            return this;
        }
        public Builder engagements(@Nullable List<String> engagements) {
            this.engagements = Codegen.ofNullable(engagements);
            return this;
        }
        public Builder engagements(String... engagements) {
            return engagements(List.of(engagements));
        }
        public Builder incidentTemplate(Output<ResponsePlanIncidentTemplateArgs> incidentTemplate) {
            this.incidentTemplate = Objects.requireNonNull(incidentTemplate);
            return this;
        }
        public Builder incidentTemplate(ResponsePlanIncidentTemplateArgs incidentTemplate) {
            this.incidentTemplate = Output.of(Objects.requireNonNull(incidentTemplate));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<List<ResponsePlanTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ResponsePlanTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(ResponsePlanTagArgs... tags) {
            return tags(List.of(tags));
        }        public ResponsePlanArgs build() {
            return new ResponsePlanArgs(actions, chatChannel, displayName, engagements, incidentTemplate, name, tags);
        }
    }
}
