// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.applicationinsights.inputs;

import com.pulumi.awsnative.applicationinsights.inputs.ApplicationConfigurationDetailsArgs;
import com.pulumi.awsnative.applicationinsights.inputs.ApplicationSubComponentTypeConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration settings of the component.
 * 
 */
public final class ApplicationComponentConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationComponentConfigurationArgs Empty = new ApplicationComponentConfigurationArgs();

    /**
     * The configuration settings
     * 
     */
    @Import(name="configurationDetails")
    private @Nullable Output<ApplicationConfigurationDetailsArgs> configurationDetails;

    /**
     * @return The configuration settings
     * 
     */
    public Optional<Output<ApplicationConfigurationDetailsArgs>> configurationDetails() {
        return Optional.ofNullable(this.configurationDetails);
    }

    /**
     * Sub component configurations of the component.
     * 
     */
    @Import(name="subComponentTypeConfigurations")
    private @Nullable Output<List<ApplicationSubComponentTypeConfigurationArgs>> subComponentTypeConfigurations;

    /**
     * @return Sub component configurations of the component.
     * 
     */
    public Optional<Output<List<ApplicationSubComponentTypeConfigurationArgs>>> subComponentTypeConfigurations() {
        return Optional.ofNullable(this.subComponentTypeConfigurations);
    }

    private ApplicationComponentConfigurationArgs() {}

    private ApplicationComponentConfigurationArgs(ApplicationComponentConfigurationArgs $) {
        this.configurationDetails = $.configurationDetails;
        this.subComponentTypeConfigurations = $.subComponentTypeConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationComponentConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationComponentConfigurationArgs $;

        public Builder() {
            $ = new ApplicationComponentConfigurationArgs();
        }

        public Builder(ApplicationComponentConfigurationArgs defaults) {
            $ = new ApplicationComponentConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationDetails The configuration settings
         * 
         * @return builder
         * 
         */
        public Builder configurationDetails(@Nullable Output<ApplicationConfigurationDetailsArgs> configurationDetails) {
            $.configurationDetails = configurationDetails;
            return this;
        }

        /**
         * @param configurationDetails The configuration settings
         * 
         * @return builder
         * 
         */
        public Builder configurationDetails(ApplicationConfigurationDetailsArgs configurationDetails) {
            return configurationDetails(Output.of(configurationDetails));
        }

        /**
         * @param subComponentTypeConfigurations Sub component configurations of the component.
         * 
         * @return builder
         * 
         */
        public Builder subComponentTypeConfigurations(@Nullable Output<List<ApplicationSubComponentTypeConfigurationArgs>> subComponentTypeConfigurations) {
            $.subComponentTypeConfigurations = subComponentTypeConfigurations;
            return this;
        }

        /**
         * @param subComponentTypeConfigurations Sub component configurations of the component.
         * 
         * @return builder
         * 
         */
        public Builder subComponentTypeConfigurations(List<ApplicationSubComponentTypeConfigurationArgs> subComponentTypeConfigurations) {
            return subComponentTypeConfigurations(Output.of(subComponentTypeConfigurations));
        }

        /**
         * @param subComponentTypeConfigurations Sub component configurations of the component.
         * 
         * @return builder
         * 
         */
        public Builder subComponentTypeConfigurations(ApplicationSubComponentTypeConfigurationArgs... subComponentTypeConfigurations) {
            return subComponentTypeConfigurations(List.of(subComponentTypeConfigurations));
        }

        public ApplicationComponentConfigurationArgs build() {
            return $;
        }
    }

}
