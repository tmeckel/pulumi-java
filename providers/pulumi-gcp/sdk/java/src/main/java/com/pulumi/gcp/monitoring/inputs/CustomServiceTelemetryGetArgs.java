// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomServiceTelemetryGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomServiceTelemetryGetArgs Empty = new CustomServiceTelemetryGetArgs();

    /**
     * The full name of the resource that defines this service.
     * Formatted as described in
     * https://cloud.google.com/apis/design/resource_names.
     * 
     */
    @Import(name="resourceName")
    private @Nullable Output<String> resourceName;

    /**
     * @return The full name of the resource that defines this service.
     * Formatted as described in
     * https://cloud.google.com/apis/design/resource_names.
     * 
     */
    public Optional<Output<String>> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    private CustomServiceTelemetryGetArgs() {}

    private CustomServiceTelemetryGetArgs(CustomServiceTelemetryGetArgs $) {
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomServiceTelemetryGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomServiceTelemetryGetArgs $;

        public Builder() {
            $ = new CustomServiceTelemetryGetArgs();
        }

        public Builder(CustomServiceTelemetryGetArgs defaults) {
            $ = new CustomServiceTelemetryGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceName The full name of the resource that defines this service.
         * Formatted as described in
         * https://cloud.google.com/apis/design/resource_names.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(@Nullable Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The full name of the resource that defines this service.
         * Formatted as described in
         * https://cloud.google.com/apis/design/resource_names.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        public CustomServiceTelemetryGetArgs build() {
            return $;
        }
    }

}
