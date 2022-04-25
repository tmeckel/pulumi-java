// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


/**
 * Object to define the number of days after creation.
 * 
 */
public final class DateAfterCreationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DateAfterCreationArgs Empty = new DateAfterCreationArgs();

    /**
     * Value indicating the age in days after creation
     * 
     */
    @Import(name="daysAfterCreationGreaterThan", required=true)
    private Output<Double> daysAfterCreationGreaterThan;

    /**
     * @return Value indicating the age in days after creation
     * 
     */
    public Output<Double> daysAfterCreationGreaterThan() {
        return this.daysAfterCreationGreaterThan;
    }

    private DateAfterCreationArgs() {}

    private DateAfterCreationArgs(DateAfterCreationArgs $) {
        this.daysAfterCreationGreaterThan = $.daysAfterCreationGreaterThan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DateAfterCreationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DateAfterCreationArgs $;

        public Builder() {
            $ = new DateAfterCreationArgs();
        }

        public Builder(DateAfterCreationArgs defaults) {
            $ = new DateAfterCreationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param daysAfterCreationGreaterThan Value indicating the age in days after creation
         * 
         * @return builder
         * 
         */
        public Builder daysAfterCreationGreaterThan(Output<Double> daysAfterCreationGreaterThan) {
            $.daysAfterCreationGreaterThan = daysAfterCreationGreaterThan;
            return this;
        }

        /**
         * @param daysAfterCreationGreaterThan Value indicating the age in days after creation
         * 
         * @return builder
         * 
         */
        public Builder daysAfterCreationGreaterThan(Double daysAfterCreationGreaterThan) {
            return daysAfterCreationGreaterThan(Output.of(daysAfterCreationGreaterThan));
        }

        public DateAfterCreationArgs build() {
            $.daysAfterCreationGreaterThan = Objects.requireNonNull($.daysAfterCreationGreaterThan, "expected parameter 'daysAfterCreationGreaterThan' to be non-null");
            return $;
        }
    }

}
