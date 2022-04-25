// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.applicationinsights.inputs;

import com.pulumi.awsnative.applicationinsights.enums.ApplicationSubComponentTypeConfigurationSubComponentType;
import com.pulumi.awsnative.applicationinsights.inputs.ApplicationSubComponentConfigurationDetailsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * One type sub component configurations for the component.
 * 
 */
public final class ApplicationSubComponentTypeConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationSubComponentTypeConfigurationArgs Empty = new ApplicationSubComponentTypeConfigurationArgs();

    /**
     * The configuration settings of sub components.
     * 
     */
    @Import(name="subComponentConfigurationDetails", required=true)
    private Output<ApplicationSubComponentConfigurationDetailsArgs> subComponentConfigurationDetails;

    /**
     * @return The configuration settings of sub components.
     * 
     */
    public Output<ApplicationSubComponentConfigurationDetailsArgs> subComponentConfigurationDetails() {
        return this.subComponentConfigurationDetails;
    }

    /**
     * The sub component type.
     * 
     */
    @Import(name="subComponentType", required=true)
    private Output<ApplicationSubComponentTypeConfigurationSubComponentType> subComponentType;

    /**
     * @return The sub component type.
     * 
     */
    public Output<ApplicationSubComponentTypeConfigurationSubComponentType> subComponentType() {
        return this.subComponentType;
    }

    private ApplicationSubComponentTypeConfigurationArgs() {}

    private ApplicationSubComponentTypeConfigurationArgs(ApplicationSubComponentTypeConfigurationArgs $) {
        this.subComponentConfigurationDetails = $.subComponentConfigurationDetails;
        this.subComponentType = $.subComponentType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationSubComponentTypeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationSubComponentTypeConfigurationArgs $;

        public Builder() {
            $ = new ApplicationSubComponentTypeConfigurationArgs();
        }

        public Builder(ApplicationSubComponentTypeConfigurationArgs defaults) {
            $ = new ApplicationSubComponentTypeConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param subComponentConfigurationDetails The configuration settings of sub components.
         * 
         * @return builder
         * 
         */
        public Builder subComponentConfigurationDetails(Output<ApplicationSubComponentConfigurationDetailsArgs> subComponentConfigurationDetails) {
            $.subComponentConfigurationDetails = subComponentConfigurationDetails;
            return this;
        }

        /**
         * @param subComponentConfigurationDetails The configuration settings of sub components.
         * 
         * @return builder
         * 
         */
        public Builder subComponentConfigurationDetails(ApplicationSubComponentConfigurationDetailsArgs subComponentConfigurationDetails) {
            return subComponentConfigurationDetails(Output.of(subComponentConfigurationDetails));
        }

        /**
         * @param subComponentType The sub component type.
         * 
         * @return builder
         * 
         */
        public Builder subComponentType(Output<ApplicationSubComponentTypeConfigurationSubComponentType> subComponentType) {
            $.subComponentType = subComponentType;
            return this;
        }

        /**
         * @param subComponentType The sub component type.
         * 
         * @return builder
         * 
         */
        public Builder subComponentType(ApplicationSubComponentTypeConfigurationSubComponentType subComponentType) {
            return subComponentType(Output.of(subComponentType));
        }

        public ApplicationSubComponentTypeConfigurationArgs build() {
            $.subComponentConfigurationDetails = Objects.requireNonNull($.subComponentConfigurationDetails, "expected parameter 'subComponentConfigurationDetails' to be non-null");
            $.subComponentType = Objects.requireNonNull($.subComponentType, "expected parameter 'subComponentType' to be non-null");
            return $;
        }
    }

}
