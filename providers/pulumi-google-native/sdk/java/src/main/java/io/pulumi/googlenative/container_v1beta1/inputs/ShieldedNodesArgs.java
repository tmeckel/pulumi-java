// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration of Shielded Nodes feature.
 * 
 */
public final class ShieldedNodesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ShieldedNodesArgs Empty = new ShieldedNodesArgs();

    /**
     * Whether Shielded Nodes features are enabled on all nodes in this cluster.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    public ShieldedNodesArgs(@Nullable Output<Boolean> enabled) {
        this.enabled = enabled;
    }

    private ShieldedNodesArgs() {
        this.enabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShieldedNodesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ShieldedNodesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }        public ShieldedNodesArgs build() {
            return new ShieldedNodesArgs(enabled);
        }
    }
}
