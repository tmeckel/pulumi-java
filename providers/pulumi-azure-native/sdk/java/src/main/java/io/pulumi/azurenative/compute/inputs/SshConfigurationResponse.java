// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.SshPublicKeyResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SSH configuration for Linux based VMs running on Azure
 * 
 */
public final class SshConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final SshConfigurationResponse Empty = new SshConfigurationResponse();

    /**
     * The list of SSH public keys used to authenticate with linux based VMs.
     * 
     */
    @InputImport(name="publicKeys")
      private final @Nullable List<SshPublicKeyResponse> publicKeys;

    public List<SshPublicKeyResponse> getPublicKeys() {
        return this.publicKeys == null ? List.of() : this.publicKeys;
    }

    public SshConfigurationResponse(@Nullable List<SshPublicKeyResponse> publicKeys) {
        this.publicKeys = publicKeys;
    }

    private SshConfigurationResponse() {
        this.publicKeys = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SshPublicKeyResponse> publicKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(SshConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeys = defaults.publicKeys;
        }

        public Builder publicKeys(@Nullable List<SshPublicKeyResponse> publicKeys) {
            this.publicKeys = publicKeys;
            return this;
        }
        public SshConfigurationResponse build() {
            return new SshConfigurationResponse(publicKeys);
        }
    }
}
