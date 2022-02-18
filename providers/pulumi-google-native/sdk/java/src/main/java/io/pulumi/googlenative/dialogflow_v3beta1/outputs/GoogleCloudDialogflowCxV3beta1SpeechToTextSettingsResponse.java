// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsResponse {
    /**
     * Whether to use speech adaptation for speech recognition.
     * 
     */
    private final Boolean enableSpeechAdaptation;

    @OutputCustomType.Constructor({"enableSpeechAdaptation"})
    private GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsResponse(Boolean enableSpeechAdaptation) {
        this.enableSpeechAdaptation = Objects.requireNonNull(enableSpeechAdaptation);
    }

    /**
     * Whether to use speech adaptation for speech recognition.
     * 
     */
    public Boolean getEnableSpeechAdaptation() {
        return this.enableSpeechAdaptation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableSpeechAdaptation;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableSpeechAdaptation = defaults.enableSpeechAdaptation;
        }

        public Builder setEnableSpeechAdaptation(Boolean enableSpeechAdaptation) {
            this.enableSpeechAdaptation = Objects.requireNonNull(enableSpeechAdaptation);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsResponse build() {
            return new GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsResponse(enableSpeechAdaptation);
        }
    }
}
