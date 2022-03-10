// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DPMContainerExtendedInfoResponse {
    /**
     * Last refresh time of the DPMContainer.
     * 
     */
    private final @Nullable String lastRefreshedAt;

    @OutputCustomType.Constructor
    private DPMContainerExtendedInfoResponse(@OutputCustomType.Parameter("lastRefreshedAt") @Nullable String lastRefreshedAt) {
        this.lastRefreshedAt = lastRefreshedAt;
    }

    /**
     * Last refresh time of the DPMContainer.
     * 
    */
    public Optional<String> getLastRefreshedAt() {
        return Optional.ofNullable(this.lastRefreshedAt);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DPMContainerExtendedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lastRefreshedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(DPMContainerExtendedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastRefreshedAt = defaults.lastRefreshedAt;
        }

        public Builder lastRefreshedAt(@Nullable String lastRefreshedAt) {
            this.lastRefreshedAt = lastRefreshedAt;
            return this;
        }
        public DPMContainerExtendedInfoResponse build() {
            return new DPMContainerExtendedInfoResponse(lastRefreshedAt);
        }
    }
}
