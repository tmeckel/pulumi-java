// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionFilter;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcPeeringConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVpcPeeringConnectionArgs Empty = new GetVpcPeeringConnectionArgs();

    /**
     * The primary CIDR block of the requester VPC of the specific VPC Peering Connection to retrieve.
     * 
     */
    @InputImport(name="cidrBlock")
      private final @Nullable String cidrBlock;

    public Optional<String> getCidrBlock() {
        return this.cidrBlock == null ? Optional.empty() : Optional.ofNullable(this.cidrBlock);
    }

    /**
     * Custom filter block as described below.
     * 
     */
    @InputImport(name="filters")
      private final @Nullable List<GetVpcPeeringConnectionFilter> filters;

    public List<GetVpcPeeringConnectionFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * The ID of the specific VPC Peering Connection to retrieve.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The AWS account ID of the owner of the requester VPC of the specific VPC Peering Connection to retrieve.
     * 
     */
    @InputImport(name="ownerId")
      private final @Nullable String ownerId;

    public Optional<String> getOwnerId() {
        return this.ownerId == null ? Optional.empty() : Optional.ofNullable(this.ownerId);
    }

    /**
     * The primary CIDR block of the accepter VPC of the specific VPC Peering Connection to retrieve.
     * 
     */
    @InputImport(name="peerCidrBlock")
      private final @Nullable String peerCidrBlock;

    public Optional<String> getPeerCidrBlock() {
        return this.peerCidrBlock == null ? Optional.empty() : Optional.ofNullable(this.peerCidrBlock);
    }

    /**
     * The AWS account ID of the owner of the accepter VPC of the specific VPC Peering Connection to retrieve.
     * 
     */
    @InputImport(name="peerOwnerId")
      private final @Nullable String peerOwnerId;

    public Optional<String> getPeerOwnerId() {
        return this.peerOwnerId == null ? Optional.empty() : Optional.ofNullable(this.peerOwnerId);
    }

    /**
     * The region of the accepter VPC of the specific VPC Peering Connection to retrieve.
     * 
     */
    @InputImport(name="peerRegion")
      private final @Nullable String peerRegion;

    public Optional<String> getPeerRegion() {
        return this.peerRegion == null ? Optional.empty() : Optional.ofNullable(this.peerRegion);
    }

    /**
     * The ID of the accepter VPC of the specific VPC Peering Connection to retrieve.
     * 
     */
    @InputImport(name="peerVpcId")
      private final @Nullable String peerVpcId;

    public Optional<String> getPeerVpcId() {
        return this.peerVpcId == null ? Optional.empty() : Optional.ofNullable(this.peerVpcId);
    }

    /**
     * The region of the requester VPC of the specific VPC Peering Connection to retrieve.
     * 
     */
    @InputImport(name="region")
      private final @Nullable String region;

    public Optional<String> getRegion() {
        return this.region == null ? Optional.empty() : Optional.ofNullable(this.region);
    }

    /**
     * The status of the specific VPC Peering Connection to retrieve.
     * 
     */
    @InputImport(name="status")
      private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired VPC Peering Connection.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    /**
     * The ID of the requester VPC of the specific VPC Peering Connection to retrieve.
     * 
     */
    @InputImport(name="vpcId")
      private final @Nullable String vpcId;

    public Optional<String> getVpcId() {
        return this.vpcId == null ? Optional.empty() : Optional.ofNullable(this.vpcId);
    }

    public GetVpcPeeringConnectionArgs(
        @Nullable String cidrBlock,
        @Nullable List<GetVpcPeeringConnectionFilter> filters,
        @Nullable String id,
        @Nullable String ownerId,
        @Nullable String peerCidrBlock,
        @Nullable String peerOwnerId,
        @Nullable String peerRegion,
        @Nullable String peerVpcId,
        @Nullable String region,
        @Nullable String status,
        @Nullable Map<String,String> tags,
        @Nullable String vpcId) {
        this.cidrBlock = cidrBlock;
        this.filters = filters;
        this.id = id;
        this.ownerId = ownerId;
        this.peerCidrBlock = peerCidrBlock;
        this.peerOwnerId = peerOwnerId;
        this.peerRegion = peerRegion;
        this.peerVpcId = peerVpcId;
        this.region = region;
        this.status = status;
        this.tags = tags;
        this.vpcId = vpcId;
    }

    private GetVpcPeeringConnectionArgs() {
        this.cidrBlock = null;
        this.filters = List.of();
        this.id = null;
        this.ownerId = null;
        this.peerCidrBlock = null;
        this.peerOwnerId = null;
        this.peerRegion = null;
        this.peerVpcId = null;
        this.region = null;
        this.status = null;
        this.tags = Map.of();
        this.vpcId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcPeeringConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cidrBlock;
        private @Nullable List<GetVpcPeeringConnectionFilter> filters;
        private @Nullable String id;
        private @Nullable String ownerId;
        private @Nullable String peerCidrBlock;
        private @Nullable String peerOwnerId;
        private @Nullable String peerRegion;
        private @Nullable String peerVpcId;
        private @Nullable String region;
        private @Nullable String status;
        private @Nullable Map<String,String> tags;
        private @Nullable String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcPeeringConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ownerId = defaults.ownerId;
    	      this.peerCidrBlock = defaults.peerCidrBlock;
    	      this.peerOwnerId = defaults.peerOwnerId;
    	      this.peerRegion = defaults.peerRegion;
    	      this.peerVpcId = defaults.peerVpcId;
    	      this.region = defaults.region;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder cidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        public Builder filters(@Nullable List<GetVpcPeeringConnectionFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder peerCidrBlock(@Nullable String peerCidrBlock) {
            this.peerCidrBlock = peerCidrBlock;
            return this;
        }

        public Builder peerOwnerId(@Nullable String peerOwnerId) {
            this.peerOwnerId = peerOwnerId;
            return this;
        }

        public Builder peerRegion(@Nullable String peerRegion) {
            this.peerRegion = peerRegion;
            return this;
        }

        public Builder peerVpcId(@Nullable String peerVpcId) {
            this.peerVpcId = peerVpcId;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public GetVpcPeeringConnectionArgs build() {
            return new GetVpcPeeringConnectionArgs(cidrBlock, filters, id, ownerId, peerCidrBlock, peerOwnerId, peerRegion, peerVpcId, region, status, tags, vpcId);
        }
    }
}
