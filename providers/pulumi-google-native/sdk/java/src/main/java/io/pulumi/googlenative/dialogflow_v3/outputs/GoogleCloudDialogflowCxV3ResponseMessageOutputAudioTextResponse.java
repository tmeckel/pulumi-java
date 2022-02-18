// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse {
    /**
     * Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request.
     * 
     */
    private final Boolean allowPlaybackInterruption;
    /**
     * The SSML text to be synthesized. For more information, see [SSML](/speech/text-to-speech/docs/ssml).
     * 
     */
    private final String ssml;
    /**
     * The raw text to be synthesized.
     * 
     */
    private final String text;

    @OutputCustomType.Constructor({"allowPlaybackInterruption","ssml","text"})
    private GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse(
        Boolean allowPlaybackInterruption,
        String ssml,
        String text) {
        this.allowPlaybackInterruption = Objects.requireNonNull(allowPlaybackInterruption);
        this.ssml = Objects.requireNonNull(ssml);
        this.text = Objects.requireNonNull(text);
    }

    /**
     * Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request.
     * 
     */
    public Boolean getAllowPlaybackInterruption() {
        return this.allowPlaybackInterruption;
    }
    /**
     * The SSML text to be synthesized. For more information, see [SSML](/speech/text-to-speech/docs/ssml).
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

    public static Builder builder(GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowPlaybackInterruption;
        private String ssml;
        private String text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPlaybackInterruption = defaults.allowPlaybackInterruption;
    	      this.ssml = defaults.ssml;
    	      this.text = defaults.text;
        }

        public Builder setAllowPlaybackInterruption(Boolean allowPlaybackInterruption) {
            this.allowPlaybackInterruption = Objects.requireNonNull(allowPlaybackInterruption);
            return this;
        }

        public Builder setSsml(String ssml) {
            this.ssml = Objects.requireNonNull(ssml);
            return this;
        }

        public Builder setText(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }

        public GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse build() {
            return new GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse(allowPlaybackInterruption, ssml, text);
        }
    }
}
