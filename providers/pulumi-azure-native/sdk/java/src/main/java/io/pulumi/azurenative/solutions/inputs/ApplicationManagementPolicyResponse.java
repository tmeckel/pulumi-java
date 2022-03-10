// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed application management policy.
 * 
 */
public final class ApplicationManagementPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationManagementPolicyResponse Empty = new ApplicationManagementPolicyResponse();

    /**
     * The managed application management mode.
     * 
     */
    @InputImport(name="mode")
      private final @Nullable String mode;

    public Optional<String> getMode() {
        return this.mode == null ? Optional.empty() : Optional.ofNullable(this.mode);
    }

    public ApplicationManagementPolicyResponse(@Nullable String mode) {
        this.mode = mode;
    }

    private ApplicationManagementPolicyResponse() {
        this.mode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationManagementPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationManagementPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public ApplicationManagementPolicyResponse build() {
            return new ApplicationManagementPolicyResponse(mode);
        }
    }
}
