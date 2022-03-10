// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Dialogflow source of conversation data.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1DialogflowSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudContactcenterinsightsV1DialogflowSourceArgs Empty = new GoogleCloudContactcenterinsightsV1DialogflowSourceArgs();

    /**
     * Cloud Storage URI that points to a file that contains the conversation audio.
     * 
     */
    @InputImport(name="audioUri")
      private final @Nullable Input<String> audioUri;

    public Input<String> getAudioUri() {
        return this.audioUri == null ? Input.empty() : this.audioUri;
    }

    public GoogleCloudContactcenterinsightsV1DialogflowSourceArgs(@Nullable Input<String> audioUri) {
        this.audioUri = audioUri;
    }

    private GoogleCloudContactcenterinsightsV1DialogflowSourceArgs() {
        this.audioUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1DialogflowSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> audioUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1DialogflowSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioUri = defaults.audioUri;
        }

        public Builder audioUri(@Nullable Input<String> audioUri) {
            this.audioUri = audioUri;
            return this;
        }

        public Builder audioUri(@Nullable String audioUri) {
            this.audioUri = Input.ofNullable(audioUri);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1DialogflowSourceArgs build() {
            return new GoogleCloudContactcenterinsightsV1DialogflowSourceArgs(audioUri);
        }
    }
}
