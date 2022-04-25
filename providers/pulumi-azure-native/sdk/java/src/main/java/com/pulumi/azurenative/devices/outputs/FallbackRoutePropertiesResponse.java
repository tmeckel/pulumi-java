// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FallbackRoutePropertiesResponse {
    /**
     * @return The condition which is evaluated in order to apply the fallback route. If the condition is not provided it will evaluate to true by default. For grammar, See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language
     * 
     */
    private final @Nullable String condition;
    /**
     * @return The list of endpoints to which the messages that satisfy the condition are routed to. Currently only 1 endpoint is allowed.
     * 
     */
    private final List<String> endpointNames;
    /**
     * @return Used to specify whether the fallback route is enabled.
     * 
     */
    private final Boolean isEnabled;
    /**
     * @return The name of the route. The name can only include alphanumeric characters, periods, underscores, hyphens, has a maximum length of 64 characters, and must be unique.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The source to which the routing rule is to be applied to. For example, DeviceMessages
     * 
     */
    private final String source;

    @CustomType.Constructor
    private FallbackRoutePropertiesResponse(
        @CustomType.Parameter("condition") @Nullable String condition,
        @CustomType.Parameter("endpointNames") List<String> endpointNames,
        @CustomType.Parameter("isEnabled") Boolean isEnabled,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("source") String source) {
        this.condition = condition;
        this.endpointNames = endpointNames;
        this.isEnabled = isEnabled;
        this.name = name;
        this.source = source;
    }

    /**
     * @return The condition which is evaluated in order to apply the fallback route. If the condition is not provided it will evaluate to true by default. For grammar, See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language
     * 
     */
    public Optional<String> condition() {
        return Optional.ofNullable(this.condition);
    }
    /**
     * @return The list of endpoints to which the messages that satisfy the condition are routed to. Currently only 1 endpoint is allowed.
     * 
     */
    public List<String> endpointNames() {
        return this.endpointNames;
    }
    /**
     * @return Used to specify whether the fallback route is enabled.
     * 
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    /**
     * @return The name of the route. The name can only include alphanumeric characters, periods, underscores, hyphens, has a maximum length of 64 characters, and must be unique.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The source to which the routing rule is to be applied to. For example, DeviceMessages
     * 
     */
    public String source() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FallbackRoutePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String condition;
        private List<String> endpointNames;
        private Boolean isEnabled;
        private @Nullable String name;
        private String source;

        public Builder() {
    	      // Empty
        }

        public Builder(FallbackRoutePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.endpointNames = defaults.endpointNames;
    	      this.isEnabled = defaults.isEnabled;
    	      this.name = defaults.name;
    	      this.source = defaults.source;
        }

        public Builder condition(@Nullable String condition) {
            this.condition = condition;
            return this;
        }
        public Builder endpointNames(List<String> endpointNames) {
            this.endpointNames = Objects.requireNonNull(endpointNames);
            return this;
        }
        public Builder endpointNames(String... endpointNames) {
            return endpointNames(List.of(endpointNames));
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }        public FallbackRoutePropertiesResponse build() {
            return new FallbackRoutePropertiesResponse(condition, endpointNames, isEnabled, name, source);
        }
    }
}
