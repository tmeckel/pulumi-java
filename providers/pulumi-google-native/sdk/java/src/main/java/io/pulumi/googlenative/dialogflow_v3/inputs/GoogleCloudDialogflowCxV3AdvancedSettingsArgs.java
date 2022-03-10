// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Hierarchical advanced settings for agent/flow/page/fulfillment/parameter. Settings exposed at lower level overrides the settings exposed at higher level. Hierarchy: Agent->Flow->Page->Fulfillment/Parameter.
 * 
 */
public final class GoogleCloudDialogflowCxV3AdvancedSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3AdvancedSettingsArgs Empty = new GoogleCloudDialogflowCxV3AdvancedSettingsArgs();

    /**
     * Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver logs, and speech logging. Exposed at the following levels: - Agent level.
     * 
     */
    @InputImport(name="loggingSettings")
      private final @Nullable Input<GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsArgs> loggingSettings;

    public Input<GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsArgs> getLoggingSettings() {
        return this.loggingSettings == null ? Input.empty() : this.loggingSettings;
    }

    public GoogleCloudDialogflowCxV3AdvancedSettingsArgs(@Nullable Input<GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsArgs> loggingSettings) {
        this.loggingSettings = loggingSettings;
    }

    private GoogleCloudDialogflowCxV3AdvancedSettingsArgs() {
        this.loggingSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3AdvancedSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsArgs> loggingSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3AdvancedSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loggingSettings = defaults.loggingSettings;
        }

        public Builder loggingSettings(@Nullable Input<GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsArgs> loggingSettings) {
            this.loggingSettings = loggingSettings;
            return this;
        }

        public Builder loggingSettings(@Nullable GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsArgs loggingSettings) {
            this.loggingSettings = Input.ofNullable(loggingSettings);
            return this;
        }
        public GoogleCloudDialogflowCxV3AdvancedSettingsArgs build() {
            return new GoogleCloudDialogflowCxV3AdvancedSettingsArgs(loggingSettings);
        }
    }
}
