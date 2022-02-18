// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse {
    /**
     * The SSML to be synthesized. For more information, see [SSML](https://developers.google.com/actions/reference/ssml).
     * 
     */
    private final String ssml;
    /**
     * The raw text to be synthesized.
     * 
     */
    private final String text;

    @OutputCustomType.Constructor({"ssml","text"})
    private GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse(
        String ssml,
        String text) {
        this.ssml = Objects.requireNonNull(ssml);
        this.text = Objects.requireNonNull(text);
    }

    /**
     * The SSML to be synthesized. For more information, see [SSML](https://developers.google.com/actions/reference/ssml).
     * 
     */
    public String getSsml() {
        return this.ssml;
    }
    /**
     * The raw text to be synthesized.
     * 
     */
    public String getText() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ssml;
        private String text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ssml = defaults.ssml;
    	      this.text = defaults.text;
        }

        public Builder setSsml(String ssml) {
            this.ssml = Objects.requireNonNull(ssml);
            return this;
        }

        public Builder setText(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }

        public GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse(ssml, text);
        }
    }
}
