// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamInputFormatConfigurationArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamOutputFormatConfigurationArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamSchemaConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamDataFormatConversionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamDataFormatConversionConfigurationArgs Empty = new DeliveryStreamDataFormatConversionConfigurationArgs();

    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    @InputImport(name="inputFormatConfiguration")
      private final @Nullable Input<DeliveryStreamInputFormatConfigurationArgs> inputFormatConfiguration;

    public Input<DeliveryStreamInputFormatConfigurationArgs> getInputFormatConfiguration() {
        return this.inputFormatConfiguration == null ? Input.empty() : this.inputFormatConfiguration;
    }

    @InputImport(name="outputFormatConfiguration")
      private final @Nullable Input<DeliveryStreamOutputFormatConfigurationArgs> outputFormatConfiguration;

    public Input<DeliveryStreamOutputFormatConfigurationArgs> getOutputFormatConfiguration() {
        return this.outputFormatConfiguration == null ? Input.empty() : this.outputFormatConfiguration;
    }

    @InputImport(name="schemaConfiguration")
      private final @Nullable Input<DeliveryStreamSchemaConfigurationArgs> schemaConfiguration;

    public Input<DeliveryStreamSchemaConfigurationArgs> getSchemaConfiguration() {
        return this.schemaConfiguration == null ? Input.empty() : this.schemaConfiguration;
    }

    public DeliveryStreamDataFormatConversionConfigurationArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<DeliveryStreamInputFormatConfigurationArgs> inputFormatConfiguration,
        @Nullable Input<DeliveryStreamOutputFormatConfigurationArgs> outputFormatConfiguration,
        @Nullable Input<DeliveryStreamSchemaConfigurationArgs> schemaConfiguration) {
        this.enabled = enabled;
        this.inputFormatConfiguration = inputFormatConfiguration;
        this.outputFormatConfiguration = outputFormatConfiguration;
        this.schemaConfiguration = schemaConfiguration;
    }

    private DeliveryStreamDataFormatConversionConfigurationArgs() {
        this.enabled = Input.empty();
        this.inputFormatConfiguration = Input.empty();
        this.outputFormatConfiguration = Input.empty();
        this.schemaConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamDataFormatConversionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<DeliveryStreamInputFormatConfigurationArgs> inputFormatConfiguration;
        private @Nullable Input<DeliveryStreamOutputFormatConfigurationArgs> outputFormatConfiguration;
        private @Nullable Input<DeliveryStreamSchemaConfigurationArgs> schemaConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamDataFormatConversionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.inputFormatConfiguration = defaults.inputFormatConfiguration;
    	      this.outputFormatConfiguration = defaults.outputFormatConfiguration;
    	      this.schemaConfiguration = defaults.schemaConfiguration;
        }

        public Builder enabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder inputFormatConfiguration(@Nullable Input<DeliveryStreamInputFormatConfigurationArgs> inputFormatConfiguration) {
            this.inputFormatConfiguration = inputFormatConfiguration;
            return this;
        }

        public Builder inputFormatConfiguration(@Nullable DeliveryStreamInputFormatConfigurationArgs inputFormatConfiguration) {
            this.inputFormatConfiguration = Input.ofNullable(inputFormatConfiguration);
            return this;
        }

        public Builder outputFormatConfiguration(@Nullable Input<DeliveryStreamOutputFormatConfigurationArgs> outputFormatConfiguration) {
            this.outputFormatConfiguration = outputFormatConfiguration;
            return this;
        }

        public Builder outputFormatConfiguration(@Nullable DeliveryStreamOutputFormatConfigurationArgs outputFormatConfiguration) {
            this.outputFormatConfiguration = Input.ofNullable(outputFormatConfiguration);
            return this;
        }

        public Builder schemaConfiguration(@Nullable Input<DeliveryStreamSchemaConfigurationArgs> schemaConfiguration) {
            this.schemaConfiguration = schemaConfiguration;
            return this;
        }

        public Builder schemaConfiguration(@Nullable DeliveryStreamSchemaConfigurationArgs schemaConfiguration) {
            this.schemaConfiguration = Input.ofNullable(schemaConfiguration);
            return this;
        }
        public DeliveryStreamDataFormatConversionConfigurationArgs build() {
            return new DeliveryStreamDataFormatConversionConfigurationArgs(enabled, inputFormatConfiguration, outputFormatConfiguration, schemaConfiguration);
        }
    }
}
