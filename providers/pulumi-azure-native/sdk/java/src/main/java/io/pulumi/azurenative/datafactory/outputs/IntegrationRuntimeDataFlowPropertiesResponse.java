// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IntegrationRuntimeDataFlowPropertiesResponse {
    /**
     * Cluster will not be recycled and it will be used in next data flow activity run until TTL (time to live) is reached if this is set as false. Default is true.
     * 
     */
    private final @Nullable Boolean cleanup;
    /**
     * Compute type of the cluster which will execute data flow job.
     * 
     */
    private final @Nullable String computeType;
    /**
     * Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272.
     * 
     */
    private final @Nullable Integer coreCount;
    /**
     * Time to live (in minutes) setting of the cluster which will execute data flow job.
     * 
     */
    private final @Nullable Integer timeToLive;

    @OutputCustomType.Constructor
    private IntegrationRuntimeDataFlowPropertiesResponse(
        @OutputCustomType.Parameter("cleanup") @Nullable Boolean cleanup,
        @OutputCustomType.Parameter("computeType") @Nullable String computeType,
        @OutputCustomType.Parameter("coreCount") @Nullable Integer coreCount,
        @OutputCustomType.Parameter("timeToLive") @Nullable Integer timeToLive) {
        this.cleanup = cleanup;
        this.computeType = computeType;
        this.coreCount = coreCount;
        this.timeToLive = timeToLive;
    }

    /**
     * Cluster will not be recycled and it will be used in next data flow activity run until TTL (time to live) is reached if this is set as false. Default is true.
     * 
    */
    public Optional<Boolean> getCleanup() {
        return Optional.ofNullable(this.cleanup);
    }
    /**
     * Compute type of the cluster which will execute data flow job.
     * 
    */
    public Optional<String> getComputeType() {
        return Optional.ofNullable(this.computeType);
    }
    /**
     * Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272.
     * 
    */
    public Optional<Integer> getCoreCount() {
        return Optional.ofNullable(this.coreCount);
    }
    /**
     * Time to live (in minutes) setting of the cluster which will execute data flow job.
     * 
    */
    public Optional<Integer> getTimeToLive() {
        return Optional.ofNullable(this.timeToLive);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeDataFlowPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean cleanup;
        private @Nullable String computeType;
        private @Nullable Integer coreCount;
        private @Nullable Integer timeToLive;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeDataFlowPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cleanup = defaults.cleanup;
    	      this.computeType = defaults.computeType;
    	      this.coreCount = defaults.coreCount;
    	      this.timeToLive = defaults.timeToLive;
        }

        public Builder cleanup(@Nullable Boolean cleanup) {
            this.cleanup = cleanup;
            return this;
        }

        public Builder computeType(@Nullable String computeType) {
            this.computeType = computeType;
            return this;
        }

        public Builder coreCount(@Nullable Integer coreCount) {
            this.coreCount = coreCount;
            return this;
        }

        public Builder timeToLive(@Nullable Integer timeToLive) {
            this.timeToLive = timeToLive;
            return this;
        }
        public IntegrationRuntimeDataFlowPropertiesResponse build() {
            return new IntegrationRuntimeDataFlowPropertiesResponse(cleanup, computeType, coreCount, timeToLive);
        }
    }
}
