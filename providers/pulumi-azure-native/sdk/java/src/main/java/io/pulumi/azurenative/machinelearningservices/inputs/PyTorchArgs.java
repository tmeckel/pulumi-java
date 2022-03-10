// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PyTorch distribution configuration.
 * 
 */
public final class PyTorchArgs extends io.pulumi.resources.ResourceArgs {

    public static final PyTorchArgs Empty = new PyTorchArgs();

    /**
     * Enum to determine the job distribution type.
     * Expected value is 'PyTorch'.
     * 
     */
    @InputImport(name="distributionType", required=true)
      private final Input<String> distributionType;

    public Input<String> getDistributionType() {
        return this.distributionType;
    }

    /**
     * Total process count for the distributed job.
     * 
     */
    @InputImport(name="processCount")
      private final @Nullable Input<Integer> processCount;

    public Input<Integer> getProcessCount() {
        return this.processCount == null ? Input.empty() : this.processCount;
    }

    public PyTorchArgs(
        Input<String> distributionType,
        @Nullable Input<Integer> processCount) {
        this.distributionType = Objects.requireNonNull(distributionType, "expected parameter 'distributionType' to be non-null");
        this.processCount = processCount;
    }

    private PyTorchArgs() {
        this.distributionType = Input.empty();
        this.processCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PyTorchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> distributionType;
        private @Nullable Input<Integer> processCount;

        public Builder() {
    	      // Empty
        }

        public Builder(PyTorchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionType = defaults.distributionType;
    	      this.processCount = defaults.processCount;
        }

        public Builder distributionType(Input<String> distributionType) {
            this.distributionType = Objects.requireNonNull(distributionType);
            return this;
        }

        public Builder distributionType(String distributionType) {
            this.distributionType = Input.of(Objects.requireNonNull(distributionType));
            return this;
        }

        public Builder processCount(@Nullable Input<Integer> processCount) {
            this.processCount = processCount;
            return this;
        }

        public Builder processCount(@Nullable Integer processCount) {
            this.processCount = Input.ofNullable(processCount);
            return this;
        }
        public PyTorchArgs build() {
            return new PyTorchArgs(distributionType, processCount);
        }
    }
}
