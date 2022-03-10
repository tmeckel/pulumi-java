// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Details of the final state "abort" and associated resource.
 * 
 */
public final class AbortInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final AbortInfoResponse Empty = new AbortInfoResponse();

    /**
     * Causes that the analysis is aborted.
     * 
     */
    @InputImport(name="cause", required=true)
      private final String cause;

    public String getCause() {
        return this.cause;
    }

    /**
     * URI of the resource that caused the abort.
     * 
     */
    @InputImport(name="resourceUri", required=true)
      private final String resourceUri;

    public String getResourceUri() {
        return this.resourceUri;
    }

    public AbortInfoResponse(
        String cause,
        String resourceUri) {
        this.cause = Objects.requireNonNull(cause, "expected parameter 'cause' to be non-null");
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
    }

    private AbortInfoResponse() {
        this.cause = null;
        this.resourceUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AbortInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cause;
        private String resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(AbortInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cause = defaults.cause;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder cause(String cause) {
            this.cause = Objects.requireNonNull(cause);
            return this;
        }

        public Builder resourceUri(String resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }
        public AbortInfoResponse build() {
            return new AbortInfoResponse(cause, resourceUri);
        }
    }
}
