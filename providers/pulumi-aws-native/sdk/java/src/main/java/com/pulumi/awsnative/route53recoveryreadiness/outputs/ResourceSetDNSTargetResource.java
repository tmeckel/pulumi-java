// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoveryreadiness.outputs;

import com.pulumi.awsnative.route53recoveryreadiness.outputs.ResourceSetTargetResource;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceSetDNSTargetResource {
    /**
     * @return The domain name that acts as an ingress point to a portion of the customer application.
     * 
     */
    private final @Nullable String domainName;
    /**
     * @return The hosted zone Amazon Resource Name (ARN) that contains the DNS record with the provided name of the target resource.
     * 
     */
    private final @Nullable String hostedZoneArn;
    /**
     * @return The Route 53 record set ID that will uniquely identify a DNS record, given a name and a type.
     * 
     */
    private final @Nullable String recordSetId;
    /**
     * @return The type of DNS record of the target resource.
     * 
     */
    private final @Nullable String recordType;
    private final @Nullable ResourceSetTargetResource targetResource;

    @CustomType.Constructor
    private ResourceSetDNSTargetResource(
        @CustomType.Parameter("domainName") @Nullable String domainName,
        @CustomType.Parameter("hostedZoneArn") @Nullable String hostedZoneArn,
        @CustomType.Parameter("recordSetId") @Nullable String recordSetId,
        @CustomType.Parameter("recordType") @Nullable String recordType,
        @CustomType.Parameter("targetResource") @Nullable ResourceSetTargetResource targetResource) {
        this.domainName = domainName;
        this.hostedZoneArn = hostedZoneArn;
        this.recordSetId = recordSetId;
        this.recordType = recordType;
        this.targetResource = targetResource;
    }

    /**
     * @return The domain name that acts as an ingress point to a portion of the customer application.
     * 
     */
    public Optional<String> domainName() {
        return Optional.ofNullable(this.domainName);
    }
    /**
     * @return The hosted zone Amazon Resource Name (ARN) that contains the DNS record with the provided name of the target resource.
     * 
     */
    public Optional<String> hostedZoneArn() {
        return Optional.ofNullable(this.hostedZoneArn);
    }
    /**
     * @return The Route 53 record set ID that will uniquely identify a DNS record, given a name and a type.
     * 
     */
    public Optional<String> recordSetId() {
        return Optional.ofNullable(this.recordSetId);
    }
    /**
     * @return The type of DNS record of the target resource.
     * 
     */
    public Optional<String> recordType() {
        return Optional.ofNullable(this.recordType);
    }
    public Optional<ResourceSetTargetResource> targetResource() {
        return Optional.ofNullable(this.targetResource);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetDNSTargetResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String domainName;
        private @Nullable String hostedZoneArn;
        private @Nullable String recordSetId;
        private @Nullable String recordType;
        private @Nullable ResourceSetTargetResource targetResource;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetDNSTargetResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.hostedZoneArn = defaults.hostedZoneArn;
    	      this.recordSetId = defaults.recordSetId;
    	      this.recordType = defaults.recordType;
    	      this.targetResource = defaults.targetResource;
        }

        public Builder domainName(@Nullable String domainName) {
            this.domainName = domainName;
            return this;
        }
        public Builder hostedZoneArn(@Nullable String hostedZoneArn) {
            this.hostedZoneArn = hostedZoneArn;
            return this;
        }
        public Builder recordSetId(@Nullable String recordSetId) {
            this.recordSetId = recordSetId;
            return this;
        }
        public Builder recordType(@Nullable String recordType) {
            this.recordType = recordType;
            return this;
        }
        public Builder targetResource(@Nullable ResourceSetTargetResource targetResource) {
            this.targetResource = targetResource;
            return this;
        }        public ResourceSetDNSTargetResource build() {
            return new ResourceSetDNSTargetResource(domainName, hostedZoneArn, recordSetId, recordType, targetResource);
        }
    }
}
