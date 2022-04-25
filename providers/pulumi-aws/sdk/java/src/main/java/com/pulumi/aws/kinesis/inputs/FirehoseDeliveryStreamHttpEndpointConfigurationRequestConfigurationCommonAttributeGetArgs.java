// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeGetArgs Empty = new FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeGetArgs();

    /**
     * The name of the HTTP endpoint common attribute.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the HTTP endpoint common attribute.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The value of the HTTP endpoint common attribute.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value of the HTTP endpoint common attribute.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeGetArgs() {}

    private FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeGetArgs(FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeGetArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeGetArgs $;

        public Builder() {
            $ = new FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeGetArgs();
        }

        public Builder(FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeGetArgs defaults) {
            $ = new FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the HTTP endpoint common attribute.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the HTTP endpoint common attribute.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The value of the HTTP endpoint common attribute.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the HTTP endpoint common attribute.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeGetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
