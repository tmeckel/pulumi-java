// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendDefaultsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsArgs Empty = new VirtualNodeSpecBackendDefaultsArgs();

    /**
     * The default client policy for virtual service backends. See above for details.
     * 
     */
    @InputImport(name="clientPolicy")
      private final @Nullable Input<VirtualNodeSpecBackendDefaultsClientPolicyArgs> clientPolicy;

    public Input<VirtualNodeSpecBackendDefaultsClientPolicyArgs> getClientPolicy() {
        return this.clientPolicy == null ? Input.empty() : this.clientPolicy;
    }

    public VirtualNodeSpecBackendDefaultsArgs(@Nullable Input<VirtualNodeSpecBackendDefaultsClientPolicyArgs> clientPolicy) {
        this.clientPolicy = clientPolicy;
    }

    private VirtualNodeSpecBackendDefaultsArgs() {
        this.clientPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualNodeSpecBackendDefaultsClientPolicyArgs> clientPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientPolicy = defaults.clientPolicy;
        }

        public Builder clientPolicy(@Nullable Input<VirtualNodeSpecBackendDefaultsClientPolicyArgs> clientPolicy) {
            this.clientPolicy = clientPolicy;
            return this;
        }

        public Builder clientPolicy(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyArgs clientPolicy) {
            this.clientPolicy = Input.ofNullable(clientPolicy);
            return this;
        }
        public VirtualNodeSpecBackendDefaultsArgs build() {
            return new VirtualNodeSpecBackendDefaultsArgs(clientPolicy);
        }
    }
}
