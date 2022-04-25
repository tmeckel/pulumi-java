// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendDefaultsClientPolicy;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNodeSpecBackendDefaults {
    /**
     * @return The default client policy for virtual service backends. See above for details.
     * 
     */
    private final @Nullable VirtualNodeSpecBackendDefaultsClientPolicy clientPolicy;

    @CustomType.Constructor
    private VirtualNodeSpecBackendDefaults(@CustomType.Parameter("clientPolicy") @Nullable VirtualNodeSpecBackendDefaultsClientPolicy clientPolicy) {
        this.clientPolicy = clientPolicy;
    }

    /**
     * @return The default client policy for virtual service backends. See above for details.
     * 
     */
    public Optional<VirtualNodeSpecBackendDefaultsClientPolicy> clientPolicy() {
        return Optional.ofNullable(this.clientPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaults defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecBackendDefaultsClientPolicy clientPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaults defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientPolicy = defaults.clientPolicy;
        }

        public Builder clientPolicy(@Nullable VirtualNodeSpecBackendDefaultsClientPolicy clientPolicy) {
            this.clientPolicy = clientPolicy;
            return this;
        }        public VirtualNodeSpecBackendDefaults build() {
            return new VirtualNodeSpecBackendDefaults(clientPolicy);
        }
    }
}
