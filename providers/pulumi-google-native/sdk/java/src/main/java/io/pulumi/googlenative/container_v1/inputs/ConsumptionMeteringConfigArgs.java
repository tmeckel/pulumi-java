// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters for controlling consumption metering.
 * 
 */
public final class ConsumptionMeteringConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConsumptionMeteringConfigArgs Empty = new ConsumptionMeteringConfigArgs();

    /**
     * Whether to enable consumption metering for this cluster. If enabled, a second BigQuery table will be created to hold resource consumption records.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    public ConsumptionMeteringConfigArgs(@Nullable Input<Boolean> enabled) {
        this.enabled = enabled;
    }

    private ConsumptionMeteringConfigArgs() {
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsumptionMeteringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsumptionMeteringConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public ConsumptionMeteringConfigArgs build() {
            return new ConsumptionMeteringConfigArgs(enabled);
        }
    }
}
