// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MpiResponse {
    /**
     * Enum to determine the job distribution type.
     * Expected value is 'Mpi'.
     * 
     */
    private final String distributionType;
    /**
     * Number of processes per MPI node.
     * 
     */
    private final @Nullable Integer processCountPerInstance;

    @OutputCustomType.Constructor
    private MpiResponse(
        @OutputCustomType.Parameter("distributionType") String distributionType,
        @OutputCustomType.Parameter("processCountPerInstance") @Nullable Integer processCountPerInstance) {
        this.distributionType = distributionType;
        this.processCountPerInstance = processCountPerInstance;
    }

    /**
     * Enum to determine the job distribution type.
     * Expected value is 'Mpi'.
     * 
    */
    public String getDistributionType() {
        return this.distributionType;
    }
    /**
     * Number of processes per MPI node.
     * 
    */
    public Optional<Integer> getProcessCountPerInstance() {
        return Optional.ofNullable(this.processCountPerInstance);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MpiResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String distributionType;
        private @Nullable Integer processCountPerInstance;

        public Builder() {
    	      // Empty
        }

        public Builder(MpiResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionType = defaults.distributionType;
    	      this.processCountPerInstance = defaults.processCountPerInstance;
        }

        public Builder distributionType(String distributionType) {
            this.distributionType = Objects.requireNonNull(distributionType);
            return this;
        }

        public Builder processCountPerInstance(@Nullable Integer processCountPerInstance) {
            this.processCountPerInstance = processCountPerInstance;
            return this;
        }
        public MpiResponse build() {
            return new MpiResponse(distributionType, processCountPerInstance);
        }
    }
}
