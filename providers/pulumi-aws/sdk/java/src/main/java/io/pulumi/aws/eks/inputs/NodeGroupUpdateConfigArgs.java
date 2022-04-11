// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeGroupUpdateConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupUpdateConfigArgs Empty = new NodeGroupUpdateConfigArgs();

    /**
     * Desired max number of unavailable worker nodes during node group update.
     * 
     */
    @Import(name="maxUnavailable")
      private final @Nullable Output<Integer> maxUnavailable;

    public Output<Integer> getMaxUnavailable() {
        return this.maxUnavailable == null ? Codegen.empty() : this.maxUnavailable;
    }

    /**
     * Desired max percentage of unavailable worker nodes during node group update.
     * 
     */
    @Import(name="maxUnavailablePercentage")
      private final @Nullable Output<Integer> maxUnavailablePercentage;

    public Output<Integer> getMaxUnavailablePercentage() {
        return this.maxUnavailablePercentage == null ? Codegen.empty() : this.maxUnavailablePercentage;
    }

    public NodeGroupUpdateConfigArgs(
        @Nullable Output<Integer> maxUnavailable,
        @Nullable Output<Integer> maxUnavailablePercentage) {
        this.maxUnavailable = maxUnavailable;
        this.maxUnavailablePercentage = maxUnavailablePercentage;
    }

    private NodeGroupUpdateConfigArgs() {
        this.maxUnavailable = Codegen.empty();
        this.maxUnavailablePercentage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupUpdateConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxUnavailable;
        private @Nullable Output<Integer> maxUnavailablePercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupUpdateConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxUnavailable = defaults.maxUnavailable;
    	      this.maxUnavailablePercentage = defaults.maxUnavailablePercentage;
        }

        public Builder maxUnavailable(@Nullable Output<Integer> maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public Builder maxUnavailable(@Nullable Integer maxUnavailable) {
            this.maxUnavailable = Codegen.ofNullable(maxUnavailable);
            return this;
        }
        public Builder maxUnavailablePercentage(@Nullable Output<Integer> maxUnavailablePercentage) {
            this.maxUnavailablePercentage = maxUnavailablePercentage;
            return this;
        }
        public Builder maxUnavailablePercentage(@Nullable Integer maxUnavailablePercentage) {
            this.maxUnavailablePercentage = Codegen.ofNullable(maxUnavailablePercentage);
            return this;
        }        public NodeGroupUpdateConfigArgs build() {
            return new NodeGroupUpdateConfigArgs(maxUnavailable, maxUnavailablePercentage);
        }
    }
}
