// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InventoryScheduleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InventoryScheduleGetArgs Empty = new InventoryScheduleGetArgs();

    /**
     * Specifies how frequently inventory results are produced. Valid values: `Daily`, `Weekly`.
     * 
     */
    @Import(name="frequency", required=true)
    private Output<String> frequency;

    /**
     * @return Specifies how frequently inventory results are produced. Valid values: `Daily`, `Weekly`.
     * 
     */
    public Output<String> frequency() {
        return this.frequency;
    }

    private InventoryScheduleGetArgs() {}

    private InventoryScheduleGetArgs(InventoryScheduleGetArgs $) {
        this.frequency = $.frequency;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InventoryScheduleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InventoryScheduleGetArgs $;

        public Builder() {
            $ = new InventoryScheduleGetArgs();
        }

        public Builder(InventoryScheduleGetArgs defaults) {
            $ = new InventoryScheduleGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param frequency Specifies how frequently inventory results are produced. Valid values: `Daily`, `Weekly`.
         * 
         * @return builder
         * 
         */
        public Builder frequency(Output<String> frequency) {
            $.frequency = frequency;
            return this;
        }

        /**
         * @param frequency Specifies how frequently inventory results are produced. Valid values: `Daily`, `Weekly`.
         * 
         * @return builder
         * 
         */
        public Builder frequency(String frequency) {
            return frequency(Output.of(frequency));
        }

        public InventoryScheduleGetArgs build() {
            $.frequency = Objects.requireNonNull($.frequency, "expected parameter 'frequency' to be non-null");
            return $;
        }
    }

}
