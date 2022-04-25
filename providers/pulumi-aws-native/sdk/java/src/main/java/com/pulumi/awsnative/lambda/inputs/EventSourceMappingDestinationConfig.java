// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lambda.inputs;

import com.pulumi.awsnative.lambda.inputs.EventSourceMappingOnFailure;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
 * 
 */
public final class EventSourceMappingDestinationConfig extends com.pulumi.resources.InvokeArgs {

    public static final EventSourceMappingDestinationConfig Empty = new EventSourceMappingDestinationConfig();

    /**
     * The destination configuration for failed invocations.
     * 
     */
    @Import(name="onFailure")
    private @Nullable EventSourceMappingOnFailure onFailure;

    /**
     * @return The destination configuration for failed invocations.
     * 
     */
    public Optional<EventSourceMappingOnFailure> onFailure() {
        return Optional.ofNullable(this.onFailure);
    }

    private EventSourceMappingDestinationConfig() {}

    private EventSourceMappingDestinationConfig(EventSourceMappingDestinationConfig $) {
        this.onFailure = $.onFailure;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventSourceMappingDestinationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventSourceMappingDestinationConfig $;

        public Builder() {
            $ = new EventSourceMappingDestinationConfig();
        }

        public Builder(EventSourceMappingDestinationConfig defaults) {
            $ = new EventSourceMappingDestinationConfig(Objects.requireNonNull(defaults));
        }

        /**
         * @param onFailure The destination configuration for failed invocations.
         * 
         * @return builder
         * 
         */
        public Builder onFailure(@Nullable EventSourceMappingOnFailure onFailure) {
            $.onFailure = onFailure;
            return this;
        }

        public EventSourceMappingDestinationConfig build() {
            return $;
        }
    }

}
