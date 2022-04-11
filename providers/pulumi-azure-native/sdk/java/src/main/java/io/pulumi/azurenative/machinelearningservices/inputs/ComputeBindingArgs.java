// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Compute binding definition.
 * 
 */
public final class ComputeBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComputeBindingArgs Empty = new ComputeBindingArgs();

    /**
     * ID of the compute resource.
     * 
     */
    @Import(name="computeId")
      private final @Nullable Output<String> computeId;

    public Output<String> getComputeId() {
        return this.computeId == null ? Codegen.empty() : this.computeId;
    }

    /**
     * Number of nodes.
     * 
     */
    @Import(name="nodeCount")
      private final @Nullable Output<Integer> nodeCount;

    public Output<Integer> getNodeCount() {
        return this.nodeCount == null ? Codegen.empty() : this.nodeCount;
    }

    public ComputeBindingArgs(
        @Nullable Output<String> computeId,
        @Nullable Output<Integer> nodeCount) {
        this.computeId = computeId;
        this.nodeCount = nodeCount;
    }

    private ComputeBindingArgs() {
        this.computeId = Codegen.empty();
        this.nodeCount = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> computeId;
        private @Nullable Output<Integer> nodeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeId = defaults.computeId;
    	      this.nodeCount = defaults.nodeCount;
        }

        public Builder computeId(@Nullable Output<String> computeId) {
            this.computeId = computeId;
            return this;
        }
        public Builder computeId(@Nullable String computeId) {
            this.computeId = Codegen.ofNullable(computeId);
            return this;
        }
        public Builder nodeCount(@Nullable Output<Integer> nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Builder nodeCount(@Nullable Integer nodeCount) {
            this.nodeCount = Codegen.ofNullable(nodeCount);
            return this;
        }        public ComputeBindingArgs build() {
            return new ComputeBindingArgs(computeId, nodeCount);
        }
    }
}
