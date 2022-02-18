// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The suggestion chip message that allows the user to jump out to the app or website associated with this agent.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse();

    /**
     * The name of the app or site this chip is linking to.
     * 
     */
    @InputImport(name="destinationName", required=true)
    private final String destinationName;

    public String getDestinationName() {
        return this.destinationName;
    }

    /**
     * The URI of the app or site to open when the user taps the suggestion chip.
     * 
     */
    @InputImport(name="uri", required=true)
    private final String uri;

    public String getUri() {
        return this.uri;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse(
        String destinationName,
        String uri) {
        this.destinationName = Objects.requireNonNull(destinationName, "expected parameter 'destinationName' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse() {
        this.destinationName = null;
        this.uri = null;
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
