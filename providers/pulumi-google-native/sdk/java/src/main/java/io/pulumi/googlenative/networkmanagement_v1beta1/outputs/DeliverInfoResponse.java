// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DeliverInfoResponse {
    /**
     * URI of the resource that the packet is delivered to.
     * 
     */
    private final String resourceUri;
    /**
     * Target type where the packet is delivered to.
     * 
     */
    private final String target;

    @OutputCustomType.Constructor({"resourceUri","target"})
    private DeliverInfoResponse(
        String resourceUri,
        String target) {
        this.resourceUri = Objects.requireNonNull(resourceUri);
        this.target = Objects.requireNonNull(target);
    }

    /**
     * URI of the resource that the packet is delivered to.
     * 
     */
    public String getResourceUri() {
        return this.resourceUri;
    }
    /**
     * Target type where the packet is delivered to.
     * 
     */
    public String getTarget() {
        return this.target;
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
