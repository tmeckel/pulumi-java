// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for the Backup for GKE Agent.
 * 
 */
public final class GkeBackupAgentConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GkeBackupAgentConfigArgs Empty = new GkeBackupAgentConfigArgs();

    /**
     * Whether the Backup for GKE agent is enabled for this cluster.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    public GkeBackupAgentConfigArgs(@Nullable Input<Boolean> enabled) {
        this.enabled = enabled;
    }

    private GkeBackupAgentConfigArgs() {
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GkeBackupAgentConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GkeBackupAgentConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }
        public GkeBackupAgentConfigArgs build() {
            return new GkeBackupAgentConfigArgs(enabled);
        }
    }
}
