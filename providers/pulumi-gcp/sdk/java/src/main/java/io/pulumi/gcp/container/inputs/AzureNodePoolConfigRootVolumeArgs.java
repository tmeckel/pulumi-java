// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureNodePoolConfigRootVolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureNodePoolConfigRootVolumeArgs Empty = new AzureNodePoolConfigRootVolumeArgs();

    /**
     * Optional. The size of the disk, in GiBs. When unspecified, a default value is provided. See the specific reference in the parent resource.
     * 
     */
    @InputImport(name="sizeGib")
      private final @Nullable Input<Integer> sizeGib;

    public Input<Integer> getSizeGib() {
        return this.sizeGib == null ? Input.empty() : this.sizeGib;
    }

    public AzureNodePoolConfigRootVolumeArgs(@Nullable Input<Integer> sizeGib) {
        this.sizeGib = sizeGib;
    }

    private AzureNodePoolConfigRootVolumeArgs() {
        this.sizeGib = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureNodePoolConfigRootVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> sizeGib;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureNodePoolConfigRootVolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sizeGib = defaults.sizeGib;
        }

        public Builder sizeGib(@Nullable Input<Integer> sizeGib) {
            this.sizeGib = sizeGib;
            return this;
        }

        public Builder sizeGib(@Nullable Integer sizeGib) {
            this.sizeGib = Input.ofNullable(sizeGib);
            return this;
        }
        public AzureNodePoolConfigRootVolumeArgs build() {
            return new AzureNodePoolConfigRootVolumeArgs(sizeGib);
        }
    }
}
