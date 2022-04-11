// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentConfigWorkloadsConfigWorkerArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentConfigWorkloadsConfigWorkerArgs Empty = new EnvironmentConfigWorkloadsConfigWorkerArgs();

    @Import(name="cpu")
      private final @Nullable Output<Double> cpu;

    public Output<Double> getCpu() {
        return this.cpu == null ? Codegen.empty() : this.cpu;
    }

    @Import(name="maxCount")
      private final @Nullable Output<Integer> maxCount;

    public Output<Integer> getMaxCount() {
        return this.maxCount == null ? Codegen.empty() : this.maxCount;
    }

    @Import(name="memoryGb")
      private final @Nullable Output<Double> memoryGb;

    public Output<Double> getMemoryGb() {
        return this.memoryGb == null ? Codegen.empty() : this.memoryGb;
    }

    @Import(name="minCount")
      private final @Nullable Output<Integer> minCount;

    public Output<Integer> getMinCount() {
        return this.minCount == null ? Codegen.empty() : this.minCount;
    }

    @Import(name="storageGb")
      private final @Nullable Output<Double> storageGb;

    public Output<Double> getStorageGb() {
        return this.storageGb == null ? Codegen.empty() : this.storageGb;
    }

    public EnvironmentConfigWorkloadsConfigWorkerArgs(
        @Nullable Output<Double> cpu,
        @Nullable Output<Integer> maxCount,
        @Nullable Output<Double> memoryGb,
        @Nullable Output<Integer> minCount,
        @Nullable Output<Double> storageGb) {
        this.cpu = cpu;
        this.maxCount = maxCount;
        this.memoryGb = memoryGb;
        this.minCount = minCount;
        this.storageGb = storageGb;
    }

    private EnvironmentConfigWorkloadsConfigWorkerArgs() {
        this.cpu = Codegen.empty();
        this.maxCount = Codegen.empty();
        this.memoryGb = Codegen.empty();
        this.minCount = Codegen.empty();
        this.storageGb = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigWorkloadsConfigWorkerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> cpu;
        private @Nullable Output<Integer> maxCount;
        private @Nullable Output<Double> memoryGb;
        private @Nullable Output<Integer> minCount;
        private @Nullable Output<Double> storageGb;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigWorkloadsConfigWorkerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.maxCount = defaults.maxCount;
    	      this.memoryGb = defaults.memoryGb;
    	      this.minCount = defaults.minCount;
    	      this.storageGb = defaults.storageGb;
        }

        public Builder cpu(@Nullable Output<Double> cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder cpu(@Nullable Double cpu) {
            this.cpu = Codegen.ofNullable(cpu);
            return this;
        }
        public Builder maxCount(@Nullable Output<Integer> maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public Builder maxCount(@Nullable Integer maxCount) {
            this.maxCount = Codegen.ofNullable(maxCount);
            return this;
        }
        public Builder memoryGb(@Nullable Output<Double> memoryGb) {
            this.memoryGb = memoryGb;
            return this;
        }
        public Builder memoryGb(@Nullable Double memoryGb) {
            this.memoryGb = Codegen.ofNullable(memoryGb);
            return this;
        }
        public Builder minCount(@Nullable Output<Integer> minCount) {
            this.minCount = minCount;
            return this;
        }
        public Builder minCount(@Nullable Integer minCount) {
            this.minCount = Codegen.ofNullable(minCount);
            return this;
        }
        public Builder storageGb(@Nullable Output<Double> storageGb) {
            this.storageGb = storageGb;
            return this;
        }
        public Builder storageGb(@Nullable Double storageGb) {
            this.storageGb = Codegen.ofNullable(storageGb);
            return this;
        }        public EnvironmentConfigWorkloadsConfigWorkerArgs build() {
            return new EnvironmentConfigWorkloadsConfigWorkerArgs(cpu, maxCount, memoryGb, minCount, storageGb);
        }
    }
}
