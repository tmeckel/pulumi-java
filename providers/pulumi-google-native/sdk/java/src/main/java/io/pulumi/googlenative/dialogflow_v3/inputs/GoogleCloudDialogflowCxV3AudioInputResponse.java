// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3InputAudioConfigResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Represents the natural speech audio to be processed.
 * 
 */
public final class GoogleCloudDialogflowCxV3AudioInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3AudioInputResponse Empty = new GoogleCloudDialogflowCxV3AudioInputResponse();

    /**
     * The natural language speech audio to be processed. A single request can contain up to 1 minute of speech audio data. The transcribed text cannot contain more than 256 bytes. For non-streaming audio detect intent, both `config` and `audio` must be provided. For streaming audio detect intent, `config` must be provided in the first request and `audio` must be provided in all following requests.
     * 
     */
    @InputImport(name="audio", required=true)
      private final String audio;

    public String getAudio() {
        return this.audio;
    }

    /**
     * Instructs the speech recognizer how to process the speech audio.
     * 
     */
    @InputImport(name="config", required=true)
      private final GoogleCloudDialogflowCxV3InputAudioConfigResponse config;

    public GoogleCloudDialogflowCxV3InputAudioConfigResponse getConfig() {
        return this.config;
    }

    public GoogleCloudDialogflowCxV3AudioInputResponse(
        String audio,
        GoogleCloudDialogflowCxV3InputAudioConfigResponse config) {
        this.audio = Objects.requireNonNull(audio, "expected parameter 'audio' to be non-null");
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
    }

    private GoogleCloudDialogflowCxV3AudioInputResponse() {
        this.audio = null;
        this.config = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3AudioInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String audio;
        private GoogleCloudDialogflowCxV3InputAudioConfigResponse config;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3AudioInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audio = defaults.audio;
    	      this.config = defaults.config;
        }

        public Builder audio(String audio) {
            this.audio = Objects.requireNonNull(audio);
            return this;
        }

        public Builder config(GoogleCloudDialogflowCxV3InputAudioConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public GoogleCloudDialogflowCxV3AudioInputResponse build() {
            return new GoogleCloudDialogflowCxV3AudioInputResponse(audio, config);
        }
    }
}
