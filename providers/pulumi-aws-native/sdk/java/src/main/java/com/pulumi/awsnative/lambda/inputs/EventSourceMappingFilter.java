// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lambda.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The filter object that defines parameters for ESM filtering.
 * 
 */
public final class EventSourceMappingFilter extends com.pulumi.resources.InvokeArgs {

    public static final EventSourceMappingFilter Empty = new EventSourceMappingFilter();

    /**
     * The filter pattern that defines which events should be passed for invocations.
     * 
     */
    @Import(name="pattern")
    private @Nullable String pattern;

    /**
     * @return The filter pattern that defines which events should be passed for invocations.
     * 
     */
    public Optional<String> pattern() {
        return Optional.ofNullable(this.pattern);
    }

    private EventSourceMappingFilter() {}

    private EventSourceMappingFilter(EventSourceMappingFilter $) {
        this.pattern = $.pattern;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventSourceMappingFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventSourceMappingFilter $;

        public Builder() {
            $ = new EventSourceMappingFilter();
        }

        public Builder(EventSourceMappingFilter defaults) {
            $ = new EventSourceMappingFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param pattern The filter pattern that defines which events should be passed for invocations.
         * 
         * @return builder
         * 
         */
        public Builder pattern(@Nullable String pattern) {
            $.pattern = pattern;
            return this;
        }

        public EventSourceMappingFilter build() {
            return $;
        }
    }

}
