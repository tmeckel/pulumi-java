// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Managed application notification endpoint.
 * 
 */
public final class ApplicationNotificationEndpointResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationNotificationEndpointResponse Empty = new ApplicationNotificationEndpointResponse();

    /**
     * The managed application notification endpoint uri.
     * 
     */
    @InputImport(name="uri", required=true)
      private final String uri;

    public String getUri() {
        return this.uri;
    }

    public ApplicationNotificationEndpointResponse(String uri) {
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private ApplicationNotificationEndpointResponse() {
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationNotificationEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationNotificationEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uri = defaults.uri;
        }

        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public ApplicationNotificationEndpointResponse build() {
            return new ApplicationNotificationEndpointResponse(uri);
        }
    }
}
