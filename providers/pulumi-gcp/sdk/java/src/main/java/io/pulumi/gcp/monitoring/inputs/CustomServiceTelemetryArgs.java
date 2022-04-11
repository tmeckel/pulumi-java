// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomServiceTelemetryArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomServiceTelemetryArgs Empty = new CustomServiceTelemetryArgs();

    /**
     * The full name of the resource that defines this service.
     * Formatted as described in
     * https://cloud.google.com/apis/design/resource_names.
     * 
     */
    @Import(name="resourceName")
      private final @Nullable Output<String> resourceName;

    public Output<String> getPropResourceName() {
        return this.resourceName == null ? Codegen.empty() : this.resourceName;
    }

    public CustomServiceTelemetryArgs(@Nullable Output<String> resourceName) {
        this.resourceName = resourceName;
    }

    private CustomServiceTelemetryArgs() {
        this.resourceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomServiceTelemetryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomServiceTelemetryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceName = defaults.resourceName;
        }

        public Builder resourceName(@Nullable Output<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = Codegen.ofNullable(resourceName);
            return this;
        }        public CustomServiceTelemetryArgs build() {
            return new CustomServiceTelemetryArgs(resourceName);
        }
    }
}
