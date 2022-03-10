// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomServiceTelemetry {
    /**
     * The full name of the resource that defines this service.
     * Formatted as described in
     * https://cloud.google.com/apis/design/resource_names.
     * 
     */
    private final @Nullable String resourceName;

    @OutputCustomType.Constructor
    private CustomServiceTelemetry(@OutputCustomType.Parameter("resourceName") @Nullable String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * The full name of the resource that defines this service.
     * Formatted as described in
     * https://cloud.google.com/apis/design/resource_names.
     * 
    */
    public Optional<String> getPropResourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomServiceTelemetry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomServiceTelemetry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceName = defaults.resourceName;
        }

        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public CustomServiceTelemetry build() {
            return new CustomServiceTelemetry(resourceName);
        }
    }
}
