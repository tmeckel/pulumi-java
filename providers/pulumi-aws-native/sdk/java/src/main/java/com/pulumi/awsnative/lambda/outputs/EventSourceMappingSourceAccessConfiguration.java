// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lambda.outputs;

import com.pulumi.awsnative.lambda.enums.EventSourceMappingSourceAccessConfigurationType;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventSourceMappingSourceAccessConfiguration {
    /**
     * @return The type of source access configuration.
     * 
     */
    private final @Nullable EventSourceMappingSourceAccessConfigurationType type;
    /**
     * @return The URI for the source access configuration resource.
     * 
     */
    private final @Nullable String uRI;

    @CustomType.Constructor
    private EventSourceMappingSourceAccessConfiguration(
        @CustomType.Parameter("type") @Nullable EventSourceMappingSourceAccessConfigurationType type,
        @CustomType.Parameter("uRI") @Nullable String uRI) {
        this.type = type;
        this.uRI = uRI;
    }

    /**
     * @return The type of source access configuration.
     * 
     */
    public Optional<EventSourceMappingSourceAccessConfigurationType> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return The URI for the source access configuration resource.
     * 
     */
    public Optional<String> uRI() {
        return Optional.ofNullable(this.uRI);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingSourceAccessConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EventSourceMappingSourceAccessConfigurationType type;
        private @Nullable String uRI;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingSourceAccessConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.uRI = defaults.uRI;
        }

        public Builder type(@Nullable EventSourceMappingSourceAccessConfigurationType type) {
            this.type = type;
            return this;
        }
        public Builder uRI(@Nullable String uRI) {
            this.uRI = uRI;
            return this;
        }        public EventSourceMappingSourceAccessConfiguration build() {
            return new EventSourceMappingSourceAccessConfiguration(type, uRI);
        }
    }
}
