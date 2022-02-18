// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Details of the final state "deliver" and associated resource.
 * 
 */
public final class DeliverInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeliverInfoResponse Empty = new DeliverInfoResponse();

    /**
     * URI of the resource that the packet is delivered to.
     * 
     */
    @InputImport(name="resourceUri", required=true)
    private final String resourceUri;

    public String getResourceUri() {
        return this.resourceUri;
    }

    /**
     * Target type where the packet is delivered to.
     * 
     */
    @InputImport(name="target", required=true)
    private final String target;

    public String getTarget() {
        return this.target;
    }

    public DeliverInfoResponse(
        String resourceUri,
        String target) {
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private DeliverInfoResponse() {
        this.resourceUri = null;
        this.target = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliverInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceUri;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliverInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceUri = defaults.resourceUri;
    	      this.target = defaults.target;
        }

        public Builder setResourceUri(String resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }

        public Builder setTarget(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public DeliverInfoResponse build() {
            return new DeliverInfoResponse(resourceUri, target);
        }
    }
}
