// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings related to speech recognition.
 * 
 */
public final class GoogleCloudDialogflowCxV3SpeechToTextSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3SpeechToTextSettingsArgs Empty = new GoogleCloudDialogflowCxV3SpeechToTextSettingsArgs();

    /**
     * Whether to use speech adaptation for speech recognition.
     * 
     */
    @InputImport(name="enableSpeechAdaptation")
      private final @Nullable Input<Boolean> enableSpeechAdaptation;

    public Input<Boolean> getEnableSpeechAdaptation() {
        return this.enableSpeechAdaptation == null ? Input.empty() : this.enableSpeechAdaptation;
    }

    public GoogleCloudDialogflowCxV3SpeechToTextSettingsArgs(@Nullable Input<Boolean> enableSpeechAdaptation) {
        this.enableSpeechAdaptation = enableSpeechAdaptation;
    }

    private GoogleCloudDialogflowCxV3SpeechToTextSettingsArgs() {
        this.enableSpeechAdaptation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3SpeechToTextSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableSpeechAdaptation;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3SpeechToTextSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableSpeechAdaptation = defaults.enableSpeechAdaptation;
        }

        public Builder enableSpeechAdaptation(@Nullable Input<Boolean> enableSpeechAdaptation) {
            this.enableSpeechAdaptation = enableSpeechAdaptation;
            return this;
        }

        public Builder enableSpeechAdaptation(@Nullable Boolean enableSpeechAdaptation) {
            this.enableSpeechAdaptation = Input.ofNullable(enableSpeechAdaptation);
            return this;
        }
        public GoogleCloudDialogflowCxV3SpeechToTextSettingsArgs build() {
            return new GoogleCloudDialogflowCxV3SpeechToTextSettingsArgs(enableSpeechAdaptation);
        }
    }
}
