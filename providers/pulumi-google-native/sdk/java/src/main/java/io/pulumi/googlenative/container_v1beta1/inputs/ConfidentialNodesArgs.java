// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ConfidentialNodes is configuration for the confidential nodes feature, which makes nodes run on confidential VMs.
 * 
 */
public final class ConfidentialNodesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfidentialNodesArgs Empty = new ConfidentialNodesArgs();

    /**
     * Whether Confidential Nodes feature is enabled.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    public ConfidentialNodesArgs(@Nullable Input<Boolean> enabled) {
        this.enabled = enabled;
    }

    private ConfidentialNodesArgs() {
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfidentialNodesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfidentialNodesArgs defaults) {
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

        public ConfidentialNodesArgs build() {
            return new ConfidentialNodesArgs(enabled);
        }
    }
}
