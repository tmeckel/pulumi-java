// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.applicationinsights.outputs;

import com.pulumi.awsnative.applicationinsights.enums.ApplicationSubComponentTypeConfigurationSubComponentType;
import com.pulumi.awsnative.applicationinsights.outputs.ApplicationSubComponentConfigurationDetails;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ApplicationSubComponentTypeConfiguration {
    /**
     * @return The configuration settings of sub components.
     * 
     */
    private final ApplicationSubComponentConfigurationDetails subComponentConfigurationDetails;
    /**
     * @return The sub component type.
     * 
     */
    private final ApplicationSubComponentTypeConfigurationSubComponentType subComponentType;

    @CustomType.Constructor
    private ApplicationSubComponentTypeConfiguration(
        @CustomType.Parameter("subComponentConfigurationDetails") ApplicationSubComponentConfigurationDetails subComponentConfigurationDetails,
        @CustomType.Parameter("subComponentType") ApplicationSubComponentTypeConfigurationSubComponentType subComponentType) {
        this.subComponentConfigurationDetails = subComponentConfigurationDetails;
        this.subComponentType = subComponentType;
    }

    /**
     * @return The configuration settings of sub components.
     * 
     */
    public ApplicationSubComponentConfigurationDetails subComponentConfigurationDetails() {
        return this.subComponentConfigurationDetails;
    }
    /**
     * @return The sub component type.
     * 
     */
    public ApplicationSubComponentTypeConfigurationSubComponentType subComponentType() {
        return this.subComponentType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationSubComponentTypeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationSubComponentConfigurationDetails subComponentConfigurationDetails;
        private ApplicationSubComponentTypeConfigurationSubComponentType subComponentType;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationSubComponentTypeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subComponentConfigurationDetails = defaults.subComponentConfigurationDetails;
    	      this.subComponentType = defaults.subComponentType;
        }

        public Builder subComponentConfigurationDetails(ApplicationSubComponentConfigurationDetails subComponentConfigurationDetails) {
            this.subComponentConfigurationDetails = Objects.requireNonNull(subComponentConfigurationDetails);
            return this;
        }
        public Builder subComponentType(ApplicationSubComponentTypeConfigurationSubComponentType subComponentType) {
            this.subComponentType = Objects.requireNonNull(subComponentType);
            return this;
        }        public ApplicationSubComponentTypeConfiguration build() {
            return new ApplicationSubComponentTypeConfiguration(subComponentConfigurationDetails, subComponentType);
        }
    }
}
