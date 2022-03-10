// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.outputs;

import io.pulumi.azurenative.hybridnetwork.outputs.SshConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LinuxConfigurationResponse {
    /**
     * Specifies the ssh key configuration for a Linux OS.
     * 
     */
    private final @Nullable SshConfigurationResponse ssh;

    @OutputCustomType.Constructor
    private LinuxConfigurationResponse(@OutputCustomType.Parameter("ssh") @Nullable SshConfigurationResponse ssh) {
        this.ssh = ssh;
    }

    /**
     * Specifies the ssh key configuration for a Linux OS.
     * 
    */
    public Optional<SshConfigurationResponse> getSsh() {
        return Optional.ofNullable(this.ssh);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SshConfigurationResponse ssh;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ssh = defaults.ssh;
        }

        public Builder ssh(@Nullable SshConfigurationResponse ssh) {
            this.ssh = ssh;
            return this;
        }
        public LinuxConfigurationResponse build() {
            return new LinuxConfigurationResponse(ssh);
        }
    }
}
