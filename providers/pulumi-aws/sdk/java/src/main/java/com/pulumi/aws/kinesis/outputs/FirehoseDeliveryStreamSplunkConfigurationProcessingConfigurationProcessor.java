// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor {
    /**
     * @return Array of processor parameters. More details are given below
     * 
     */
    private final @Nullable List<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter> parameters;
    /**
     * @return The type of processor. Valid Values: `Lambda`
     * 
     */
    private final String type;

    @CustomType.Constructor
    private FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor(
        @CustomType.Parameter("parameters") @Nullable List<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter> parameters,
        @CustomType.Parameter("type") String type) {
        this.parameters = parameters;
        this.type = type;
    }

    /**
     * @return Array of processor parameters. More details are given below
     * 
     */
    public List<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    /**
     * @return The type of processor. Valid Values: `Lambda`
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter> parameters;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder parameters(@Nullable List<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor build() {
            return new FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor(parameters, type);
        }
    }
}
