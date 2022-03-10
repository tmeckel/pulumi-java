// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterConfigLifecycleConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigLifecycleConfigArgs Empty = new ClusterClusterConfigLifecycleConfigArgs();

    /**
     * The time when cluster will be auto-deleted.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds.
     * Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @InputImport(name="autoDeleteTime")
      private final @Nullable Input<String> autoDeleteTime;

    public Input<String> getAutoDeleteTime() {
        return this.autoDeleteTime == null ? Input.empty() : this.autoDeleteTime;
    }

    /**
     * The duration to keep the cluster alive while idling
     * (no jobs running). After this TTL, the cluster will be deleted. Valid range: [10m, 14d].
     * 
     */
    @InputImport(name="idleDeleteTtl")
      private final @Nullable Input<String> idleDeleteTtl;

    public Input<String> getIdleDeleteTtl() {
        return this.idleDeleteTtl == null ? Input.empty() : this.idleDeleteTtl;
    }

    @InputImport(name="idleStartTime")
      private final @Nullable Input<String> idleStartTime;

    public Input<String> getIdleStartTime() {
        return this.idleStartTime == null ? Input.empty() : this.idleStartTime;
    }

    public ClusterClusterConfigLifecycleConfigArgs(
        @Nullable Input<String> autoDeleteTime,
        @Nullable Input<String> idleDeleteTtl,
        @Nullable Input<String> idleStartTime) {
        this.autoDeleteTime = autoDeleteTime;
        this.idleDeleteTtl = idleDeleteTtl;
        this.idleStartTime = idleStartTime;
    }

    private ClusterClusterConfigLifecycleConfigArgs() {
        this.autoDeleteTime = Input.empty();
        this.idleDeleteTtl = Input.empty();
        this.idleStartTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigLifecycleConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> autoDeleteTime;
        private @Nullable Input<String> idleDeleteTtl;
        private @Nullable Input<String> idleStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigLifecycleConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDeleteTime = defaults.autoDeleteTime;
    	      this.idleDeleteTtl = defaults.idleDeleteTtl;
    	      this.idleStartTime = defaults.idleStartTime;
        }

        public Builder autoDeleteTime(@Nullable Input<String> autoDeleteTime) {
            this.autoDeleteTime = autoDeleteTime;
            return this;
        }

        public Builder autoDeleteTime(@Nullable String autoDeleteTime) {
            this.autoDeleteTime = Input.ofNullable(autoDeleteTime);
            return this;
        }

        public Builder idleDeleteTtl(@Nullable Input<String> idleDeleteTtl) {
            this.idleDeleteTtl = idleDeleteTtl;
            return this;
        }

        public Builder idleDeleteTtl(@Nullable String idleDeleteTtl) {
            this.idleDeleteTtl = Input.ofNullable(idleDeleteTtl);
            return this;
        }

        public Builder idleStartTime(@Nullable Input<String> idleStartTime) {
            this.idleStartTime = idleStartTime;
            return this;
        }

        public Builder idleStartTime(@Nullable String idleStartTime) {
            this.idleStartTime = Input.ofNullable(idleStartTime);
            return this;
        }
        public ClusterClusterConfigLifecycleConfigArgs build() {
            return new ClusterClusterConfigLifecycleConfigArgs(autoDeleteTime, idleDeleteTtl, idleStartTime);
        }
    }
}
