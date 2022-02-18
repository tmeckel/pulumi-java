// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for the Compute Engine PD CSI driver.
 * 
 */
public final class GcePersistentDiskCsiDriverConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GcePersistentDiskCsiDriverConfigArgs Empty = new GcePersistentDiskCsiDriverConfigArgs();

    /**
     * Whether the Compute Engine PD CSI driver is enabled for this cluster.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    public GcePersistentDiskCsiDriverConfigArgs(@Nullable Input<Boolean> enabled) {
        this.enabled = enabled;
    }

    private GcePersistentDiskCsiDriverConfigArgs() {
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcePersistentDiskCsiDriverConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GcePersistentDiskCsiDriverConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public GcePersistentDiskCsiDriverConfigArgs build() {
            return new GcePersistentDiskCsiDriverConfigArgs(enabled);
        }
    }
}
