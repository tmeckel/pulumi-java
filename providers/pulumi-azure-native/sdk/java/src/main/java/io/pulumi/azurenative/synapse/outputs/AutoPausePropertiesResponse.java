// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutoPausePropertiesResponse {
    /**
     * Number of minutes of idle time before the Big Data pool is automatically paused.
     * 
     */
    private final @Nullable Integer delayInMinutes;
    /**
     * Whether auto-pausing is enabled for the Big Data pool.
     * 
     */
    private final @Nullable Boolean enabled;

    @OutputCustomType.Constructor
    private AutoPausePropertiesResponse(
        @OutputCustomType.Parameter("delayInMinutes") @Nullable Integer delayInMinutes,
        @OutputCustomType.Parameter("enabled") @Nullable Boolean enabled) {
        this.delayInMinutes = delayInMinutes;
        this.enabled = enabled;
    }

    /**
     * Number of minutes of idle time before the Big Data pool is automatically paused.
     * 
    */
    public Optional<Integer> getDelayInMinutes() {
        return Optional.ofNullable(this.delayInMinutes);
    }
    /**
     * Whether auto-pausing is enabled for the Big Data pool.
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoPausePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer delayInMinutes;
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoPausePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delayInMinutes = defaults.delayInMinutes;
    	      this.enabled = defaults.enabled;
        }

        public Builder delayInMinutes(@Nullable Integer delayInMinutes) {
            this.delayInMinutes = delayInMinutes;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public AutoPausePropertiesResponse build() {
            return new AutoPausePropertiesResponse(delayInMinutes, enabled);
        }
    }
}
