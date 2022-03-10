// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PipelineSourceTriggerDescriptorResponse {
    /**
     * The timestamp when the source update happened.
     * 
     */
    private final @Nullable String timestamp;

    @OutputCustomType.Constructor
    private PipelineSourceTriggerDescriptorResponse(@OutputCustomType.Parameter("timestamp") @Nullable String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * The timestamp when the source update happened.
     * 
    */
    public Optional<String> getTimestamp() {
        return Optional.ofNullable(this.timestamp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineSourceTriggerDescriptorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String timestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineSourceTriggerDescriptorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timestamp = defaults.timestamp;
        }

        public Builder timestamp(@Nullable String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public PipelineSourceTriggerDescriptorResponse build() {
            return new PipelineSourceTriggerDescriptorResponse(timestamp);
        }
    }
}
