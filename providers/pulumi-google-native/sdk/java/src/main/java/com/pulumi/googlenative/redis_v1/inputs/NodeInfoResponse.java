// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.redis_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Node specific properties.
 * 
 */
public final class NodeInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final NodeInfoResponse Empty = new NodeInfoResponse();

    /**
     * Location of the node.
     * 
     */
    @Import(name="zone", required=true)
    private String zone;

    /**
     * @return Location of the node.
     * 
     */
    public String zone() {
        return this.zone;
    }

    private NodeInfoResponse() {}

    private NodeInfoResponse(NodeInfoResponse $) {
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeInfoResponse $;

        public Builder() {
            $ = new NodeInfoResponse();
        }

        public Builder(NodeInfoResponse defaults) {
            $ = new NodeInfoResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param zone Location of the node.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            $.zone = zone;
            return this;
        }

        public NodeInfoResponse build() {
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
