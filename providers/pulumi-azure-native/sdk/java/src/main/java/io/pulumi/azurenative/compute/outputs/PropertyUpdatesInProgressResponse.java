// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PropertyUpdatesInProgressResponse {
    /**
     * The target performance tier of the disk if a tier change operation is in progress.
     * 
     */
    private final @Nullable String targetTier;

    @OutputCustomType.Constructor
    private PropertyUpdatesInProgressResponse(@OutputCustomType.Parameter("targetTier") @Nullable String targetTier) {
        this.targetTier = targetTier;
    }

    /**
     * The target performance tier of the disk if a tier change operation is in progress.
     * 
    */
    public Optional<String> getTargetTier() {
        return Optional.ofNullable(this.targetTier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PropertyUpdatesInProgressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String targetTier;

        public Builder() {
    	      // Empty
        }

        public Builder(PropertyUpdatesInProgressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetTier = defaults.targetTier;
        }

        public Builder targetTier(@Nullable String targetTier) {
            this.targetTier = targetTier;
            return this;
        }
        public PropertyUpdatesInProgressResponse build() {
            return new PropertyUpdatesInProgressResponse(targetTier);
        }
    }
}
