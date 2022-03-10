// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver.outputs;

import io.pulumi.awsnative.route53resolver.enums.ResolverDNSSECConfigValidationStatus;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetResolverDNSSECConfigResult {
    /**
     * Id
     * 
     */
    private final @Nullable String id;
    /**
     * AccountId
     * 
     */
    private final @Nullable String ownerId;
    /**
     * ResolverDNSSECValidationStatus, possible values are ENABLING, ENABLED, DISABLING AND DISABLED.
     * 
     */
    private final @Nullable ResolverDNSSECConfigValidationStatus validationStatus;

    @OutputCustomType.Constructor
    private GetResolverDNSSECConfigResult(
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("ownerId") @Nullable String ownerId,
        @OutputCustomType.Parameter("validationStatus") @Nullable ResolverDNSSECConfigValidationStatus validationStatus) {
        this.id = id;
        this.ownerId = ownerId;
        this.validationStatus = validationStatus;
    }

    /**
     * Id
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * AccountId
     * 
    */
    public Optional<String> getOwnerId() {
        return Optional.ofNullable(this.ownerId);
    }
    /**
     * ResolverDNSSECValidationStatus, possible values are ENABLING, ENABLED, DISABLING AND DISABLED.
     * 
    */
    public Optional<ResolverDNSSECConfigValidationStatus> getValidationStatus() {
        return Optional.ofNullable(this.validationStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResolverDNSSECConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String ownerId;
        private @Nullable ResolverDNSSECConfigValidationStatus validationStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResolverDNSSECConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ownerId = defaults.ownerId;
    	      this.validationStatus = defaults.validationStatus;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder validationStatus(@Nullable ResolverDNSSECConfigValidationStatus validationStatus) {
            this.validationStatus = validationStatus;
            return this;
        }
        public GetResolverDNSSECConfigResult build() {
            return new GetResolverDNSSECConfigResult(id, ownerId, validationStatus);
        }
    }
}
