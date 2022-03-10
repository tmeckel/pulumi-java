// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor {
    /**
     * Array of processor parameters. More details are given below
     * 
     */
    private final @Nullable List<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameter> parameters;
    /**
     * The type of processor. Valid Values: `Lambda`
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor(
        @OutputCustomType.Parameter("parameters") @Nullable List<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameter> parameters,
        @OutputCustomType.Parameter("type") String type) {
        this.parameters = parameters;
        this.type = type;
    }

    /**
     * Array of processor parameters. More details are given below
     * 
    */
    public List<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameter> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    /**
     * The type of processor. Valid Values: `Lambda`
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameter> parameters;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder parameters(@Nullable List<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameter> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor build() {
            return new FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor(parameters, type);
        }
    }
}
