// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Cloud Storage source of conversation data.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1GcsSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudContactcenterinsightsV1GcsSourceArgs Empty = new GoogleCloudContactcenterinsightsV1GcsSourceArgs();

    /**
     * Cloud Storage URI that points to a file that contains the conversation audio.
     * 
     */
    @InputImport(name="audioUri")
      private final @Nullable Input<String> audioUri;

    public Input<String> getAudioUri() {
        return this.audioUri == null ? Input.empty() : this.audioUri;
    }

    /**
     * Immutable. Cloud Storage URI that points to a file that contains the conversation transcript.
     * 
     */
    @InputImport(name="transcriptUri")
      private final @Nullable Input<String> transcriptUri;

    public Input<String> getTranscriptUri() {
        return this.transcriptUri == null ? Input.empty() : this.transcriptUri;
    }

    public GoogleCloudContactcenterinsightsV1GcsSourceArgs(
        @Nullable Input<String> audioUri,
        @Nullable Input<String> transcriptUri) {
        this.audioUri = audioUri;
        this.transcriptUri = transcriptUri;
    }

    private GoogleCloudContactcenterinsightsV1GcsSourceArgs() {
        this.audioUri = Input.empty();
        this.transcriptUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1GcsSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> audioUri;
        private @Nullable Input<String> transcriptUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1GcsSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioUri = defaults.audioUri;
    	      this.transcriptUri = defaults.transcriptUri;
        }

        public Builder audioUri(@Nullable Input<String> audioUri) {
            this.audioUri = audioUri;
            return this;
        }

        public Builder audioUri(@Nullable String audioUri) {
            this.audioUri = Input.ofNullable(audioUri);
            return this;
        }

        public Builder transcriptUri(@Nullable Input<String> transcriptUri) {
            this.transcriptUri = transcriptUri;
            return this;
        }

        public Builder transcriptUri(@Nullable String transcriptUri) {
            this.transcriptUri = Input.ofNullable(transcriptUri);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1GcsSourceArgs build() {
            return new GoogleCloudContactcenterinsightsV1GcsSourceArgs(audioUri, transcriptUri);
        }
    }
}
