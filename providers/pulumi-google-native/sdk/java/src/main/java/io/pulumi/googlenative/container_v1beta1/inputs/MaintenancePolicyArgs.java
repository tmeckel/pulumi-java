// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1beta1.inputs.MaintenanceWindowArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MaintenancePolicy defines the maintenance policy to be used for the cluster.
 * 
 */
public final class MaintenancePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaintenancePolicyArgs Empty = new MaintenancePolicyArgs();

    /**
     * A hash identifying the version of this policy, so that updates to fields of the policy won't accidentally undo intermediate changes (and so that users of the API unaware of some fields won't accidentally remove other fields). Make a `get()` request to the cluster to get the current resource version and include it with requests to set the policy.
     * 
     */
    @InputImport(name="resourceVersion")
    private final @Nullable Input<String> resourceVersion;

    public Input<String> getResourceVersion() {
        return this.resourceVersion == null ? Input.empty() : this.resourceVersion;
    }

    /**
     * Specifies the maintenance window in which maintenance may be performed.
     * 
     */
    @InputImport(name="window")
    private final @Nullable Input<MaintenanceWindowArgs> window;

    public Input<MaintenanceWindowArgs> getWindow() {
        return this.window == null ? Input.empty() : this.window;
    }

    public MaintenancePolicyArgs(
        @Nullable Input<String> resourceVersion,
        @Nullable Input<MaintenanceWindowArgs> window) {
        this.resourceVersion = resourceVersion;
        this.window = window;
    }

    private MaintenancePolicyArgs() {
        this.resourceVersion = Input.empty();
        this.window = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenancePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> resourceVersion;
        private @Nullable Input<MaintenanceWindowArgs> window;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenancePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceVersion = defaults.resourceVersion;
    	      this.window = defaults.window;
        }

        public Builder setResourceVersion(@Nullable Input<String> resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        public Builder setResourceVersion(@Nullable String resourceVersion) {
            this.resourceVersion = Input.ofNullable(resourceVersion);
            return this;
        }

        public Builder setWindow(@Nullable Input<MaintenanceWindowArgs> window) {
            this.window = window;
            return this;
        }

        public Builder setWindow(@Nullable MaintenanceWindowArgs window) {
            this.window = Input.ofNullable(window);
            return this;
        }

        public MaintenancePolicyArgs build() {
            return new MaintenancePolicyArgs(resourceVersion, window);
        }
    }
}
