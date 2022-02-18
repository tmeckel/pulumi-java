// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ForwardInfoResponse {
    /**
     * URI of the resource that the packet is forwarded to.
     * 
     */
    private final String resourceUri;
    /**
     * Target type where this packet is forwarded to.
     * 
     */
    private final String target;

    @OutputCustomType.Constructor({"resourceUri","target"})
    private ForwardInfoResponse(
        String resourceUri,
        String target) {
        this.resourceUri = Objects.requireNonNull(resourceUri);
        this.target = Objects.requireNonNull(target);
    }

    /**
     * URI of the resource that the packet is forwarded to.
     * 
     */
    public String getResourceUri() {
        return this.resourceUri;
    }
    /**
     * Target type where this packet is forwarded to.
     * 
     */
    public String getTarget() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForwardInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceUri;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ForwardInfoResponse defaults) {
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

        public ForwardInfoResponse build() {
            return new ForwardInfoResponse(resourceUri, target);
        }
    }
}
