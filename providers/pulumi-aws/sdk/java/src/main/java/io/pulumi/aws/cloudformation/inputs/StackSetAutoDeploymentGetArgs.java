// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudformation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StackSetAutoDeploymentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final StackSetAutoDeploymentGetArgs Empty = new StackSetAutoDeploymentGetArgs();

    /**
     * Whether or not auto-deployment is enabled.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Whether or not to retain stacks when the account is removed.
     * 
     */
    @InputImport(name="retainStacksOnAccountRemoval")
      private final @Nullable Input<Boolean> retainStacksOnAccountRemoval;

    public Input<Boolean> getRetainStacksOnAccountRemoval() {
        return this.retainStacksOnAccountRemoval == null ? Input.empty() : this.retainStacksOnAccountRemoval;
    }

    public StackSetAutoDeploymentGetArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<Boolean> retainStacksOnAccountRemoval) {
        this.enabled = enabled;
        this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
    }

    private StackSetAutoDeploymentGetArgs() {
        this.enabled = Input.empty();
        this.retainStacksOnAccountRemoval = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetAutoDeploymentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<Boolean> retainStacksOnAccountRemoval;

        public Builder() {
    	      // Empty
        }

        public Builder(StackSetAutoDeploymentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.retainStacksOnAccountRemoval = defaults.retainStacksOnAccountRemoval;
        }

        public Builder enabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder retainStacksOnAccountRemoval(@Nullable Input<Boolean> retainStacksOnAccountRemoval) {
            this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
            return this;
        }

        public Builder retainStacksOnAccountRemoval(@Nullable Boolean retainStacksOnAccountRemoval) {
            this.retainStacksOnAccountRemoval = Input.ofNullable(retainStacksOnAccountRemoval);
            return this;
        }
        public StackSetAutoDeploymentGetArgs build() {
            return new StackSetAutoDeploymentGetArgs(enabled, retainStacksOnAccountRemoval);
        }
    }
}
