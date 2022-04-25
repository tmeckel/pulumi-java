// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VirtualNodeSpecServiceDiscoveryDnsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecServiceDiscoveryDnsGetArgs Empty = new VirtualNodeSpecServiceDiscoveryDnsGetArgs();

    /**
     * The DNS host name for your virtual node.
     * 
     */
    @Import(name="hostname", required=true)
    private Output<String> hostname;

    /**
     * @return The DNS host name for your virtual node.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }

    private VirtualNodeSpecServiceDiscoveryDnsGetArgs() {}

    private VirtualNodeSpecServiceDiscoveryDnsGetArgs(VirtualNodeSpecServiceDiscoveryDnsGetArgs $) {
        this.hostname = $.hostname;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecServiceDiscoveryDnsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecServiceDiscoveryDnsGetArgs $;

        public Builder() {
            $ = new VirtualNodeSpecServiceDiscoveryDnsGetArgs();
        }

        public Builder(VirtualNodeSpecServiceDiscoveryDnsGetArgs defaults) {
            $ = new VirtualNodeSpecServiceDiscoveryDnsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostname The DNS host name for your virtual node.
         * 
         * @return builder
         * 
         */
        public Builder hostname(Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname The DNS host name for your virtual node.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        public VirtualNodeSpecServiceDiscoveryDnsGetArgs build() {
            $.hostname = Objects.requireNonNull($.hostname, "expected parameter 'hostname' to be non-null");
            return $;
        }
    }

}
