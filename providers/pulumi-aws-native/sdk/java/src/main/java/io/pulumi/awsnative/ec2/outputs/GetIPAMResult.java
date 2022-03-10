// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.IPAMIpamOperatingRegion;
import io.pulumi.awsnative.ec2.outputs.IPAMTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIPAMResult {
    /**
     * The Amazon Resource Name (ARN) of the IPAM.
     * 
     */
    private final @Nullable String arn;
    private final @Nullable String description;
    /**
     * Id of the IPAM.
     * 
     */
    private final @Nullable String ipamId;
    /**
     * The regions IPAM is enabled for. Allows pools to be created in these regions, as well as enabling monitoring
     * 
     */
    private final @Nullable List<IPAMIpamOperatingRegion> operatingRegions;
    /**
     * The Id of the default scope for publicly routable IP space, created with this IPAM.
     * 
     */
    private final @Nullable String privateDefaultScopeId;
    /**
     * The Id of the default scope for publicly routable IP space, created with this IPAM.
     * 
     */
    private final @Nullable String publicDefaultScopeId;
    /**
     * The number of scopes that currently exist in this IPAM.
     * 
     */
    private final @Nullable Integer scopeCount;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<IPAMTag> tags;

    @OutputCustomType.Constructor
    private GetIPAMResult(
        @OutputCustomType.Parameter("arn") @Nullable String arn,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("ipamId") @Nullable String ipamId,
        @OutputCustomType.Parameter("operatingRegions") @Nullable List<IPAMIpamOperatingRegion> operatingRegions,
        @OutputCustomType.Parameter("privateDefaultScopeId") @Nullable String privateDefaultScopeId,
        @OutputCustomType.Parameter("publicDefaultScopeId") @Nullable String publicDefaultScopeId,
        @OutputCustomType.Parameter("scopeCount") @Nullable Integer scopeCount,
        @OutputCustomType.Parameter("tags") @Nullable List<IPAMTag> tags) {
        this.arn = arn;
        this.description = description;
        this.ipamId = ipamId;
        this.operatingRegions = operatingRegions;
        this.privateDefaultScopeId = privateDefaultScopeId;
        this.publicDefaultScopeId = publicDefaultScopeId;
        this.scopeCount = scopeCount;
        this.tags = tags;
    }

    /**
     * The Amazon Resource Name (ARN) of the IPAM.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Id of the IPAM.
     * 
    */
    public Optional<String> getIpamId() {
        return Optional.ofNullable(this.ipamId);
    }
    /**
     * The regions IPAM is enabled for. Allows pools to be created in these regions, as well as enabling monitoring
     * 
    */
    public List<IPAMIpamOperatingRegion> getOperatingRegions() {
        return this.operatingRegions == null ? List.of() : this.operatingRegions;
    }
    /**
     * The Id of the default scope for publicly routable IP space, created with this IPAM.
     * 
    */
    public Optional<String> getPrivateDefaultScopeId() {
        return Optional.ofNullable(this.privateDefaultScopeId);
    }
    /**
     * The Id of the default scope for publicly routable IP space, created with this IPAM.
     * 
    */
    public Optional<String> getPublicDefaultScopeId() {
        return Optional.ofNullable(this.publicDefaultScopeId);
    }
    /**
     * The number of scopes that currently exist in this IPAM.
     * 
    */
    public Optional<Integer> getScopeCount() {
        return Optional.ofNullable(this.scopeCount);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<IPAMTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIPAMResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable String ipamId;
        private @Nullable List<IPAMIpamOperatingRegion> operatingRegions;
        private @Nullable String privateDefaultScopeId;
        private @Nullable String publicDefaultScopeId;
        private @Nullable Integer scopeCount;
        private @Nullable List<IPAMTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIPAMResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.ipamId = defaults.ipamId;
    	      this.operatingRegions = defaults.operatingRegions;
    	      this.privateDefaultScopeId = defaults.privateDefaultScopeId;
    	      this.publicDefaultScopeId = defaults.publicDefaultScopeId;
    	      this.scopeCount = defaults.scopeCount;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder ipamId(@Nullable String ipamId) {
            this.ipamId = ipamId;
            return this;
        }

        public Builder operatingRegions(@Nullable List<IPAMIpamOperatingRegion> operatingRegions) {
            this.operatingRegions = operatingRegions;
            return this;
        }

        public Builder privateDefaultScopeId(@Nullable String privateDefaultScopeId) {
            this.privateDefaultScopeId = privateDefaultScopeId;
            return this;
        }

        public Builder publicDefaultScopeId(@Nullable String publicDefaultScopeId) {
            this.publicDefaultScopeId = publicDefaultScopeId;
            return this;
        }

        public Builder scopeCount(@Nullable Integer scopeCount) {
            this.scopeCount = scopeCount;
            return this;
        }

        public Builder tags(@Nullable List<IPAMTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetIPAMResult build() {
            return new GetIPAMResult(arn, description, ipamId, operatingRegions, privateDefaultScopeId, publicDefaultScopeId, scopeCount, tags);
        }
    }
}
