// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings of suggestion trigger.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettingsArgs Empty = new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettingsArgs();

    /**
     * Do not trigger if last utterance is small talk.
     * 
     */
    @InputImport(name="noSmalltalk")
    private final @Nullable Input<Boolean> noSmalltalk;

    public Input<Boolean> getNoSmalltalk() {
        return this.noSmalltalk == null ? Input.empty() : this.noSmalltalk;
    }

    /**
     * Only trigger suggestion if participant role of last utterance is END_USER.
     * 
     */
    @InputImport(name="onlyEndUser")
    private final @Nullable Input<Boolean> onlyEndUser;

    public Input<Boolean> getOnlyEndUser() {
        return this.onlyEndUser == null ? Input.empty() : this.onlyEndUser;
    }

    public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettingsArgs(
        @Nullable Input<Boolean> noSmalltalk,
        @Nullable Input<Boolean> onlyEndUser) {
        this.noSmalltalk = noSmalltalk;
        this.onlyEndUser = onlyEndUser;
    }

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettingsArgs() {
        this.noSmalltalk = Input.empty();
        this.onlyEndUser = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> noSmalltalk;
        private @Nullable Input<Boolean> onlyEndUser;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.noSmalltalk = defaults.noSmalltalk;
    	      this.onlyEndUser = defaults.onlyEndUser;
        }

        public Builder setNoSmalltalk(@Nullable Input<Boolean> noSmalltalk) {
            this.noSmalltalk = noSmalltalk;
            return this;
        }

        public Builder setNoSmalltalk(@Nullable Boolean noSmalltalk) {
            this.noSmalltalk = Input.ofNullable(noSmalltalk);
            return this;
        }

        public Builder setOnlyEndUser(@Nullable Input<Boolean> onlyEndUser) {
            this.onlyEndUser = onlyEndUser;
            return this;
        }

        public Builder setOnlyEndUser(@Nullable Boolean onlyEndUser) {
            this.onlyEndUser = Input.ofNullable(onlyEndUser);
            return this;
        }

        public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettingsArgs build() {
            return new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettingsArgs(noSmalltalk, onlyEndUser);
        }
    }
}
