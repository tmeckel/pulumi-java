// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class VirtualNodeSpecListenerOutlierDetectionIntervalGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerOutlierDetectionIntervalGetArgs Empty = new VirtualNodeSpecListenerOutlierDetectionIntervalGetArgs();

    /**
     * The unit of time. Valid values: `ms`, `s`.
     * 
     */
    @Import(name="unit", required=true)
    private Output<String> unit;

    /**
     * @return The unit of time. Valid values: `ms`, `s`.
     * 
     */
    public Output<String> unit() {
        return this.unit;
    }

    /**
     * The number of time units. Minimum value of `0`.
     * 
     */
    @Import(name="value", required=true)
    private Output<Integer> value;

    /**
     * @return The number of time units. Minimum value of `0`.
     * 
     */
    public Output<Integer> value() {
        return this.value;
    }

    private VirtualNodeSpecListenerOutlierDetectionIntervalGetArgs() {}

    private VirtualNodeSpecListenerOutlierDetectionIntervalGetArgs(VirtualNodeSpecListenerOutlierDetectionIntervalGetArgs $) {
        this.unit = $.unit;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecListenerOutlierDetectionIntervalGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecListenerOutlierDetectionIntervalGetArgs $;

        public Builder() {
            $ = new VirtualNodeSpecListenerOutlierDetectionIntervalGetArgs();
        }

        public Builder(VirtualNodeSpecListenerOutlierDetectionIntervalGetArgs defaults) {
            $ = new VirtualNodeSpecListenerOutlierDetectionIntervalGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param unit The unit of time. Valid values: `ms`, `s`.
         * 
         * @return builder
         * 
         */
        public Builder unit(Output<String> unit) {
            $.unit = unit;
            return this;
        }

        /**
         * @param unit The unit of time. Valid values: `ms`, `s`.
         * 
         * @return builder
         * 
         */
        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        /**
         * @param value The number of time units. Minimum value of `0`.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<Integer> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The number of time units. Minimum value of `0`.
         * 
         * @return builder
         * 
         */
        public Builder value(Integer value) {
            return value(Output.of(value));
        }

        public VirtualNodeSpecListenerOutlierDetectionIntervalGetArgs build() {
            $.unit = Objects.requireNonNull($.unit, "expected parameter 'unit' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
