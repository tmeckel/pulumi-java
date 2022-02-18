// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.domains_v1.enums.ManagementSettingsTransferLockState;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines renewal, billing, and transfer settings for a `Registration`.
 * 
 */
public final class ManagementSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementSettingsArgs Empty = new ManagementSettingsArgs();

    /**
     * Controls whether the domain can be transferred to another registrar.
     * 
     */
    @InputImport(name="transferLockState")
    private final @Nullable Input<ManagementSettingsTransferLockState> transferLockState;

    public Input<ManagementSettingsTransferLockState> getTransferLockState() {
        return this.transferLockState == null ? Input.empty() : this.transferLockState;
    }

    public ManagementSettingsArgs(@Nullable Input<ManagementSettingsTransferLockState> transferLockState) {
        this.transferLockState = transferLockState;
    }

    private ManagementSettingsArgs() {
        this.transferLockState = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ManagementSettingsTransferLockState> transferLockState;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transferLockState = defaults.transferLockState;
        }

        public Builder setTransferLockState(@Nullable Input<ManagementSettingsTransferLockState> transferLockState) {
            this.transferLockState = transferLockState;
            return this;
        }

        public Builder setTransferLockState(@Nullable ManagementSettingsTransferLockState transferLockState) {
            this.transferLockState = Input.ofNullable(transferLockState);
            return this;
        }

        public ManagementSettingsArgs build() {
            return new ManagementSettingsArgs(transferLockState);
        }
    }
}
