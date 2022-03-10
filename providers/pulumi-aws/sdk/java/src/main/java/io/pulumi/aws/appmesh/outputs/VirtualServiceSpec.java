// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualServiceSpecProvider;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualServiceSpec {
    /**
     * The App Mesh object that is acting as the provider for a virtual service. You can specify a single virtual node or virtual router.
     * 
     */
    private final @Nullable VirtualServiceSpecProvider provider;

    @OutputCustomType.Constructor
    private VirtualServiceSpec(@OutputCustomType.Parameter("provider") @Nullable VirtualServiceSpecProvider provider) {
        this.provider = provider;
    }

    /**
     * The App Mesh object that is acting as the provider for a virtual service. You can specify a single virtual node or virtual router.
     * 
    */
    public Optional<VirtualServiceSpecProvider> getProvider() {
        return Optional.ofNullable(this.provider);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualServiceSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualServiceSpecProvider provider;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualServiceSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provider = defaults.provider;
        }

        public Builder provider(@Nullable VirtualServiceSpecProvider provider) {
            this.provider = provider;
            return this;
        }
        public VirtualServiceSpec build() {
            return new VirtualServiceSpec(provider);
        }
    }
}
