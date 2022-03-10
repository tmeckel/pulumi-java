// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.redis_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Node specific properties.
 * 
 */
public final class NodeInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final NodeInfoResponse Empty = new NodeInfoResponse();

    /**
     * Location of the node.
     * 
     */
    @InputImport(name="zone", required=true)
      private final String zone;

    public String getZone() {
        return this.zone;
    }

    public NodeInfoResponse(String zone) {
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private NodeInfoResponse() {
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.zone = defaults.zone;
        }

        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public NodeInfoResponse build() {
            return new NodeInfoResponse(zone);
        }
    }
}
