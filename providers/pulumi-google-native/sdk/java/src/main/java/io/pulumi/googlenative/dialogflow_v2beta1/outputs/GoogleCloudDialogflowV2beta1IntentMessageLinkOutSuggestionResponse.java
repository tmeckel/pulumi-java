// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse {
    /**
     * The name of the app or site this chip is linking to.
     * 
     */
    private final String destinationName;
    /**
     * The URI of the app or site to open when the user taps the suggestion chip.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor({"destinationName","uri"})
    private GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse(
        String destinationName,
        String uri) {
        this.destinationName = Objects.requireNonNull(destinationName);
        this.uri = Objects.requireNonNull(uri);
    }

    /**
     * The name of the app or site this chip is linking to.
     * 
     */
    public String getDestinationName() {
        return this.destinationName;
    }
    /**
     * The URI of the app or site to open when the user taps the suggestion chip.
     * 
     */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destinationName;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationName = defaults.destinationName;
    	      this.uri = defaults.uri;
        }

        public Builder setDestinationName(String destinationName) {
            this.destinationName = Objects.requireNonNull(destinationName);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse(destinationName, uri);
        }
    }
}
