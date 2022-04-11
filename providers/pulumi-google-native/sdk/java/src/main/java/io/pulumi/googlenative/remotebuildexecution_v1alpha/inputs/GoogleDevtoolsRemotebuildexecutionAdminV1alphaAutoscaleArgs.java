// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.remotebuildexecution_v1alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Autoscale defines the autoscaling policy of a worker pool.
 * 
 */
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleArgs Empty = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleArgs();

    /**
     * The maximal number of workers. Must be equal to or greater than min_size.
     * 
     */
    @Import(name="maxSize")
      private final @Nullable Output<String> maxSize;

    public Output<String> getMaxSize() {
        return this.maxSize == null ? Codegen.empty() : this.maxSize;
    }

    /**
     * The minimal number of workers. Must be greater than 0.
     * 
     */
    @Import(name="minSize")
      private final @Nullable Output<String> minSize;

    public Output<String> getMinSize() {
        return this.minSize == null ? Codegen.empty() : this.minSize;
    }

    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleArgs(
        @Nullable Output<String> maxSize,
        @Nullable Output<String> minSize) {
        this.maxSize = maxSize;
        this.minSize = minSize;
    }

    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleArgs() {
        this.maxSize = Codegen.empty();
        this.minSize = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> maxSize;
        private @Nullable Output<String> minSize;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSize = defaults.maxSize;
    	      this.minSize = defaults.minSize;
        }

        public Builder maxSize(@Nullable Output<String> maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Builder maxSize(@Nullable String maxSize) {
            this.maxSize = Codegen.ofNullable(maxSize);
            return this;
        }
        public Builder minSize(@Nullable Output<String> minSize) {
            this.minSize = minSize;
            return this;
        }
        public Builder minSize(@Nullable String minSize) {
            this.minSize = Codegen.ofNullable(minSize);
            return this;
        }        public GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleArgs build() {
            return new GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleArgs(maxSize, minSize);
        }
    }
}
