// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIpamPreviewNextCidrResult {
    /**
     * @return The previewed CIDR from the pool.
     * 
     */
    private final String cidr;
    private final @Nullable List<String> disallowedCidrs;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String ipamPoolId;
    private final @Nullable Integer netmaskLength;

    @CustomType.Constructor
    private GetIpamPreviewNextCidrResult(
        @CustomType.Parameter("cidr") String cidr,
        @CustomType.Parameter("disallowedCidrs") @Nullable List<String> disallowedCidrs,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ipamPoolId") String ipamPoolId,
        @CustomType.Parameter("netmaskLength") @Nullable Integer netmaskLength) {
        this.cidr = cidr;
        this.disallowedCidrs = disallowedCidrs;
        this.id = id;
        this.ipamPoolId = ipamPoolId;
        this.netmaskLength = netmaskLength;
    }

    /**
     * @return The previewed CIDR from the pool.
     * 
     */
    public String cidr() {
        return this.cidr;
    }
    public List<String> disallowedCidrs() {
        return this.disallowedCidrs == null ? List.of() : this.disallowedCidrs;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String ipamPoolId() {
        return this.ipamPoolId;
    }
    public Optional<Integer> netmaskLength() {
        return Optional.ofNullable(this.netmaskLength);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpamPreviewNextCidrResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cidr;
        private @Nullable List<String> disallowedCidrs;
        private String id;
        private String ipamPoolId;
        private @Nullable Integer netmaskLength;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIpamPreviewNextCidrResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.disallowedCidrs = defaults.disallowedCidrs;
    	      this.id = defaults.id;
    	      this.ipamPoolId = defaults.ipamPoolId;
    	      this.netmaskLength = defaults.netmaskLength;
        }

        public Builder cidr(String cidr) {
            this.cidr = Objects.requireNonNull(cidr);
            return this;
        }
        public Builder disallowedCidrs(@Nullable List<String> disallowedCidrs) {
            this.disallowedCidrs = disallowedCidrs;
            return this;
        }
        public Builder disallowedCidrs(String... disallowedCidrs) {
            return disallowedCidrs(List.of(disallowedCidrs));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ipamPoolId(String ipamPoolId) {
            this.ipamPoolId = Objects.requireNonNull(ipamPoolId);
            return this;
        }
        public Builder netmaskLength(@Nullable Integer netmaskLength) {
            this.netmaskLength = netmaskLength;
            return this;
        }        public GetIpamPreviewNextCidrResult build() {
            return new GetIpamPreviewNextCidrResult(cidr, disallowedCidrs, id, ipamPoolId, netmaskLength);
        }
    }
}
