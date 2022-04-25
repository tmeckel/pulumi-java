// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIPAMAllocationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIPAMAllocationArgs Empty = new GetIPAMAllocationArgs();

    @Import(name="cidr", required=true)
    private String cidr;

    public String cidr() {
        return this.cidr;
    }

    /**
     * Id of the allocation.
     * 
     */
    @Import(name="ipamPoolAllocationId", required=true)
    private String ipamPoolAllocationId;

    /**
     * @return Id of the allocation.
     * 
     */
    public String ipamPoolAllocationId() {
        return this.ipamPoolAllocationId;
    }

    /**
     * Id of the IPAM Pool.
     * 
     */
    @Import(name="ipamPoolId", required=true)
    private String ipamPoolId;

    /**
     * @return Id of the IPAM Pool.
     * 
     */
    public String ipamPoolId() {
        return this.ipamPoolId;
    }

    private GetIPAMAllocationArgs() {}

    private GetIPAMAllocationArgs(GetIPAMAllocationArgs $) {
        this.cidr = $.cidr;
        this.ipamPoolAllocationId = $.ipamPoolAllocationId;
        this.ipamPoolId = $.ipamPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIPAMAllocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIPAMAllocationArgs $;

        public Builder() {
            $ = new GetIPAMAllocationArgs();
        }

        public Builder(GetIPAMAllocationArgs defaults) {
            $ = new GetIPAMAllocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder cidr(String cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param ipamPoolAllocationId Id of the allocation.
         * 
         * @return builder
         * 
         */
        public Builder ipamPoolAllocationId(String ipamPoolAllocationId) {
            $.ipamPoolAllocationId = ipamPoolAllocationId;
            return this;
        }

        /**
         * @param ipamPoolId Id of the IPAM Pool.
         * 
         * @return builder
         * 
         */
        public Builder ipamPoolId(String ipamPoolId) {
            $.ipamPoolId = ipamPoolId;
            return this;
        }

        public GetIPAMAllocationArgs build() {
            $.cidr = Objects.requireNonNull($.cidr, "expected parameter 'cidr' to be non-null");
            $.ipamPoolAllocationId = Objects.requireNonNull($.ipamPoolAllocationId, "expected parameter 'ipamPoolAllocationId' to be non-null");
            $.ipamPoolId = Objects.requireNonNull($.ipamPoolId, "expected parameter 'ipamPoolId' to be non-null");
            return $;
        }
    }

}
