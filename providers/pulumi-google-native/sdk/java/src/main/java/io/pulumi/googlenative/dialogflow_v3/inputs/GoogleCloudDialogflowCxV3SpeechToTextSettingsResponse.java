// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Settings related to speech recognition.
 * 
 */
public final class GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse Empty = new GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse();

    /**
     * Whether to use speech adaptation for speech recognition.
     * 
     */
    @InputImport(name="enableSpeechAdaptation", required=true)
      private final Boolean enableSpeechAdaptation;

    public Boolean getEnableSpeechAdaptation() {
        return this.enableSpeechAdaptation;
    }

    public GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse(Boolean enableSpeechAdaptation) {
        this.enableSpeechAdaptation = Objects.requireNonNull(enableSpeechAdaptation, "expected parameter 'enableSpeechAdaptation' to be non-null");
    }

    private GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse() {
        this.enableSpeechAdaptation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableSpeechAdaptation;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableSpeechAdaptation = defaults.enableSpeechAdaptation;
        }

        public Builder enableSpeechAdaptation(Boolean enableSpeechAdaptation) {
            this.enableSpeechAdaptation = Objects.requireNonNull(enableSpeechAdaptation);
            return this;
        }
        public GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse build() {
            return new GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse(enableSpeechAdaptation);
        }
    }
}
