// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WarmStorageEnvironmentStatusResponse {
    /**
     * A value that represents the number of properties used by the environment for S1/S2 SKU and number of properties used by Warm Store for PAYG SKU
     * 
     */
    private final @Nullable Integer currentCount;
    /**
     * A value that represents the maximum number of properties used allowed by the environment for S1/S2 SKU and maximum number of properties allowed by Warm Store for PAYG SKU.
     * 
     */
    private final @Nullable Integer maxCount;
    /**
     * This string represents the state of warm storage properties usage. It can be "Ok", "Error", "Unknown".
     * 
     */
    private final @Nullable String state;

    @OutputCustomType.Constructor
    private WarmStorageEnvironmentStatusResponse(
        @OutputCustomType.Parameter("currentCount") @Nullable Integer currentCount,
        @OutputCustomType.Parameter("maxCount") @Nullable Integer maxCount,
        @OutputCustomType.Parameter("state") @Nullable String state) {
        this.currentCount = currentCount;
        this.maxCount = maxCount;
        this.state = state;
    }

    /**
     * A value that represents the number of properties used by the environment for S1/S2 SKU and number of properties used by Warm Store for PAYG SKU
     * 
    */
    public Optional<Integer> getCurrentCount() {
        return Optional.ofNullable(this.currentCount);
    }
    /**
     * A value that represents the maximum number of properties used allowed by the environment for S1/S2 SKU and maximum number of properties allowed by Warm Store for PAYG SKU.
     * 
    */
    public Optional<Integer> getMaxCount() {
        return Optional.ofNullable(this.maxCount);
    }
    /**
     * This string represents the state of warm storage properties usage. It can be "Ok", "Error", "Unknown".
     * 
    */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WarmStorageEnvironmentStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer currentCount;
        private @Nullable Integer maxCount;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(WarmStorageEnvironmentStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentCount = defaults.currentCount;
    	      this.maxCount = defaults.maxCount;
    	      this.state = defaults.state;
        }

        public Builder currentCount(@Nullable Integer currentCount) {
            this.currentCount = currentCount;
            return this;
        }

        public Builder maxCount(@Nullable Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public WarmStorageEnvironmentStatusResponse build() {
            return new WarmStorageEnvironmentStatusResponse(currentCount, maxCount, state);
        }
    }
}
