// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class VirtualNodeSpecListenerConnectionPoolTcpArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerConnectionPoolTcpArgs Empty = new VirtualNodeSpecListenerConnectionPoolTcpArgs();

    /**
     * Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    @Import(name="maxConnections", required=true)
    private Output<Integer> maxConnections;

    /**
     * @return Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    public Output<Integer> maxConnections() {
        return this.maxConnections;
    }

    private VirtualNodeSpecListenerConnectionPoolTcpArgs() {}

    private VirtualNodeSpecListenerConnectionPoolTcpArgs(VirtualNodeSpecListenerConnectionPoolTcpArgs $) {
        this.maxConnections = $.maxConnections;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecListenerConnectionPoolTcpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecListenerConnectionPoolTcpArgs $;

        public Builder() {
            $ = new VirtualNodeSpecListenerConnectionPoolTcpArgs();
        }

        public Builder(VirtualNodeSpecListenerConnectionPoolTcpArgs defaults) {
            $ = new VirtualNodeSpecListenerConnectionPoolTcpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxConnections Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster. Minimum value of `1`.
         * 
         * @return builder
         * 
         */
        public Builder maxConnections(Output<Integer> maxConnections) {
            $.maxConnections = maxConnections;
            return this;
        }

        /**
         * @param maxConnections Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster. Minimum value of `1`.
         * 
         * @return builder
         * 
         */
        public Builder maxConnections(Integer maxConnections) {
            return maxConnections(Output.of(maxConnections));
        }

        public VirtualNodeSpecListenerConnectionPoolTcpArgs build() {
            $.maxConnections = Objects.requireNonNull($.maxConnections, "expected parameter 'maxConnections' to be non-null");
            return $;
        }
    }

}
