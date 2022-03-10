// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentConfigWorkloadsConfigWorkerArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentConfigWorkloadsConfigWorkerArgs Empty = new EnvironmentConfigWorkloadsConfigWorkerArgs();

    @InputImport(name="cpu")
      private final @Nullable Input<Double> cpu;

    public Input<Double> getCpu() {
        return this.cpu == null ? Input.empty() : this.cpu;
    }

    @InputImport(name="maxCount")
      private final @Nullable Input<Integer> maxCount;

    public Input<Integer> getMaxCount() {
        return this.maxCount == null ? Input.empty() : this.maxCount;
    }

    @InputImport(name="memoryGb")
      private final @Nullable Input<Double> memoryGb;

    public Input<Double> getMemoryGb() {
        return this.memoryGb == null ? Input.empty() : this.memoryGb;
    }

    @InputImport(name="minCount")
      private final @Nullable Input<Integer> minCount;

    public Input<Integer> getMinCount() {
        return this.minCount == null ? Input.empty() : this.minCount;
    }

    @InputImport(name="storageGb")
      private final @Nullable Input<Double> storageGb;

    public Input<Double> getStorageGb() {
        return this.storageGb == null ? Input.empty() : this.storageGb;
    }

    public EnvironmentConfigWorkloadsConfigWorkerArgs(
        @Nullable Input<Double> cpu,
        @Nullable Input<Integer> maxCount,
        @Nullable Input<Double> memoryGb,
        @Nullable Input<Integer> minCount,
        @Nullable Input<Double> storageGb) {
        this.cpu = cpu;
        this.maxCount = maxCount;
        this.memoryGb = memoryGb;
        this.minCount = minCount;
        this.storageGb = storageGb;
    }

    private EnvironmentConfigWorkloadsConfigWorkerArgs() {
        this.cpu = Input.empty();
        this.maxCount = Input.empty();
        this.memoryGb = Input.empty();
        this.minCount = Input.empty();
        this.storageGb = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigWorkloadsConfigWorkerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> cpu;
        private @Nullable Input<Integer> maxCount;
        private @Nullable Input<Double> memoryGb;
        private @Nullable Input<Integer> minCount;
        private @Nullable Input<Double> storageGb;

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

        public Builder cpu(@Nullable Input<Double> cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder cpu(@Nullable Double cpu) {
            this.cpu = Input.ofNullable(cpu);
            return this;
        }

        public Builder maxCount(@Nullable Input<Integer> maxCount) {
            this.maxCount = maxCount;
            return this;
        }

        public Builder maxCount(@Nullable Integer maxCount) {
            this.maxCount = Input.ofNullable(maxCount);
            return this;
        }

        public Builder memoryGb(@Nullable Input<Double> memoryGb) {
            this.memoryGb = memoryGb;
            return this;
        }

        public Builder memoryGb(@Nullable Double memoryGb) {
            this.memoryGb = Input.ofNullable(memoryGb);
            return this;
        }

        public Builder minCount(@Nullable Input<Integer> minCount) {
            this.minCount = minCount;
            return this;
        }

        public Builder minCount(@Nullable Integer minCount) {
            this.minCount = Input.ofNullable(minCount);
            return this;
        }

        public Builder storageGb(@Nullable Input<Double> storageGb) {
            this.storageGb = storageGb;
            return this;
        }

        public Builder storageGb(@Nullable Double storageGb) {
            this.storageGb = Input.ofNullable(storageGb);
            return this;
        }
        public EnvironmentConfigWorkloadsConfigWorkerArgs build() {
            return new EnvironmentConfigWorkloadsConfigWorkerArgs(cpu, maxCount, memoryGb, minCount, storageGb);
        }
    }
}
