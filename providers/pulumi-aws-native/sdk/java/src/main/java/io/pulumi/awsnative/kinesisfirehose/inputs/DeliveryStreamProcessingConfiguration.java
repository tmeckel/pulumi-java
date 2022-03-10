// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamProcessor;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamProcessingConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamProcessingConfiguration Empty = new DeliveryStreamProcessingConfiguration();

    @InputImport(name="enabled")
      private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    @InputImport(name="processors")
      private final @Nullable List<DeliveryStreamProcessor> processors;

    public List<DeliveryStreamProcessor> getProcessors() {
        return this.processors == null ? List.of() : this.processors;
    }

    public DeliveryStreamProcessingConfiguration(
        @Nullable Boolean enabled,
        @Nullable List<DeliveryStreamProcessor> processors) {
        this.enabled = enabled;
        this.processors = processors;
    }

    private DeliveryStreamProcessingConfiguration() {
        this.enabled = null;
        this.processors = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamProcessingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable List<DeliveryStreamProcessor> processors;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamProcessingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.processors = defaults.processors;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder processors(@Nullable List<DeliveryStreamProcessor> processors) {
            this.processors = processors;
            return this;
        }
        public DeliveryStreamProcessingConfiguration build() {
            return new DeliveryStreamProcessingConfiguration(enabled, processors);
        }
    }
}
