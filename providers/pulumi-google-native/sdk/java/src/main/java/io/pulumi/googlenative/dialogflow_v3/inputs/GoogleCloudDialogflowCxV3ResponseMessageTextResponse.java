// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The text response message.
 * 
 */
public final class GoogleCloudDialogflowCxV3ResponseMessageTextResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3ResponseMessageTextResponse Empty = new GoogleCloudDialogflowCxV3ResponseMessageTextResponse();

    /**
     * Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request.
     * 
     */
    @InputImport(name="allowPlaybackInterruption", required=true)
      private final Boolean allowPlaybackInterruption;

    public Boolean getAllowPlaybackInterruption() {
        return this.allowPlaybackInterruption;
    }

    /**
     * A collection of text responses.
     * 
     */
    @InputImport(name="text", required=true)
      private final List<String> text;

    public List<String> getText() {
        return this.text;
    }

    public GoogleCloudDialogflowCxV3ResponseMessageTextResponse(
        Boolean allowPlaybackInterruption,
        List<String> text) {
        this.allowPlaybackInterruption = Objects.requireNonNull(allowPlaybackInterruption, "expected parameter 'allowPlaybackInterruption' to be non-null");
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
    }

    private GoogleCloudDialogflowCxV3ResponseMessageTextResponse() {
        this.allowPlaybackInterruption = null;
        this.text = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ResponseMessageTextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowPlaybackInterruption;
        private List<String> text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ResponseMessageTextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPlaybackInterruption = defaults.allowPlaybackInterruption;
    	      this.text = defaults.text;
        }

        public Builder allowPlaybackInterruption(Boolean allowPlaybackInterruption) {
            this.allowPlaybackInterruption = Objects.requireNonNull(allowPlaybackInterruption);
            return this;
        }

        public Builder text(List<String> text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public GoogleCloudDialogflowCxV3ResponseMessageTextResponse build() {
            return new GoogleCloudDialogflowCxV3ResponseMessageTextResponse(allowPlaybackInterruption, text);
        }
    }
}
