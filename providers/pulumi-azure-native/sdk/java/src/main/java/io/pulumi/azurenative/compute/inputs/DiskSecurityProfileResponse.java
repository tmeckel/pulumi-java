// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains the security related information for the resource.
 * 
 */
public final class DiskSecurityProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiskSecurityProfileResponse Empty = new DiskSecurityProfileResponse();

    /**
     * Specifies the SecurityType of the VM. Applicable for OS disks only.
     * 
     */
    @InputImport(name="securityType")
      private final @Nullable String securityType;

    public Optional<String> getSecurityType() {
        return this.securityType == null ? Optional.empty() : Optional.ofNullable(this.securityType);
    }

    public DiskSecurityProfileResponse(@Nullable String securityType) {
        this.securityType = securityType;
    }

    private DiskSecurityProfileResponse() {
        this.securityType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskSecurityProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String securityType;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskSecurityProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityType = defaults.securityType;
        }

        public Builder securityType(@Nullable String securityType) {
            this.securityType = securityType;
            return this;
        }
        public DiskSecurityProfileResponse build() {
            return new DiskSecurityProfileResponse(securityType);
        }
    }
}
