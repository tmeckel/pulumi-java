// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot;

import com.pulumi.awsnative.iot.enums.CustomMetricMetricType;
import com.pulumi.awsnative.iot.inputs.CustomMetricTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomMetricArgs Empty = new CustomMetricArgs();

    /**
     * Field represents a friendly name in the console for the custom metric; it doesn&#39;t have to be unique. Don&#39;t use this name as the metric identifier in the device metric report. Can be updated once defined.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Field represents a friendly name in the console for the custom metric; it doesn&#39;t have to be unique. Don&#39;t use this name as the metric identifier in the device metric report. Can be updated once defined.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The name of the custom metric. This will be used in the metric report submitted from the device/thing. Shouldn&#39;t begin with aws: . Cannot be updated once defined.
     * 
     */
    @Import(name="metricName")
    private @Nullable Output<String> metricName;

    /**
     * @return The name of the custom metric. This will be used in the metric report submitted from the device/thing. Shouldn&#39;t begin with aws: . Cannot be updated once defined.
     * 
     */
    public Optional<Output<String>> metricName() {
        return Optional.ofNullable(this.metricName);
    }

    /**
     * The type of the custom metric. Types include string-list, ip-address-list, number-list, and number.
     * 
     */
    @Import(name="metricType", required=true)
    private Output<CustomMetricMetricType> metricType;

    /**
     * @return The type of the custom metric. Types include string-list, ip-address-list, number-list, and number.
     * 
     */
    public Output<CustomMetricMetricType> metricType() {
        return this.metricType;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<CustomMetricTagArgs>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Optional<Output<List<CustomMetricTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private CustomMetricArgs() {}

    private CustomMetricArgs(CustomMetricArgs $) {
        this.displayName = $.displayName;
        this.metricName = $.metricName;
        this.metricType = $.metricType;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomMetricArgs $;

        public Builder() {
            $ = new CustomMetricArgs();
        }

        public Builder(CustomMetricArgs defaults) {
            $ = new CustomMetricArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName Field represents a friendly name in the console for the custom metric; it doesn&#39;t have to be unique. Don&#39;t use this name as the metric identifier in the device metric report. Can be updated once defined.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Field represents a friendly name in the console for the custom metric; it doesn&#39;t have to be unique. Don&#39;t use this name as the metric identifier in the device metric report. Can be updated once defined.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param metricName The name of the custom metric. This will be used in the metric report submitted from the device/thing. Shouldn&#39;t begin with aws: . Cannot be updated once defined.
         * 
         * @return builder
         * 
         */
        public Builder metricName(@Nullable Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        /**
         * @param metricName The name of the custom metric. This will be used in the metric report submitted from the device/thing. Shouldn&#39;t begin with aws: . Cannot be updated once defined.
         * 
         * @return builder
         * 
         */
        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        /**
         * @param metricType The type of the custom metric. Types include string-list, ip-address-list, number-list, and number.
         * 
         * @return builder
         * 
         */
        public Builder metricType(Output<CustomMetricMetricType> metricType) {
            $.metricType = metricType;
            return this;
        }

        /**
         * @param metricType The type of the custom metric. Types include string-list, ip-address-list, number-list, and number.
         * 
         * @return builder
         * 
         */
        public Builder metricType(CustomMetricMetricType metricType) {
            return metricType(Output.of(metricType));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<CustomMetricTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<CustomMetricTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(CustomMetricTagArgs... tags) {
            return tags(List.of(tags));
        }

        public CustomMetricArgs build() {
            $.metricType = Objects.requireNonNull($.metricType, "expected parameter 'metricType' to be non-null");
            return $;
        }
    }

}
