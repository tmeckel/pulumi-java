// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HealthCheckLogConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final HealthCheckLogConfigGetArgs Empty = new HealthCheckLogConfigGetArgs();

    /**
     * Indicates whether or not to export logs. This is false by default,
     * which means no health check logging will be done.
     * 
     */
    @Import(name="enable")
      private final @Nullable Output<Boolean> enable;

    public Output<Boolean> getEnable() {
        return this.enable == null ? Codegen.empty() : this.enable;
    }

    public HealthCheckLogConfigGetArgs(@Nullable Output<Boolean> enable) {
        this.enable = enable;
    }

    private HealthCheckLogConfigGetArgs() {
        this.enable = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckLogConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enable;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckLogConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            this.enable = enable;
            return this;
        }
        public Builder enable(@Nullable Boolean enable) {
            this.enable = Codegen.ofNullable(enable);
            return this;
        }        public HealthCheckLogConfigGetArgs build() {
            return new HealthCheckLogConfigGetArgs(enable);
        }
    }
}
