// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionAmiDistributionConfigurationArgs;
import com.pulumi.aws.imagebuilder.inputs.DistributionConfigurationDistributionContainerDistributionConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionConfigurationDistributionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionConfigurationDistributionArgs Empty = new DistributionConfigurationDistributionArgs();

    /**
     * Configuration block with Amazon Machine Image (AMI) distribution settings. Detailed below.
     * 
     */
    @Import(name="amiDistributionConfiguration")
    private @Nullable Output<DistributionConfigurationDistributionAmiDistributionConfigurationArgs> amiDistributionConfiguration;

    /**
     * @return Configuration block with Amazon Machine Image (AMI) distribution settings. Detailed below.
     * 
     */
    public Optional<Output<DistributionConfigurationDistributionAmiDistributionConfigurationArgs>> amiDistributionConfiguration() {
        return Optional.ofNullable(this.amiDistributionConfiguration);
    }

    /**
     * Configuration block with container distribution settings. Detailed below.
     * 
     */
    @Import(name="containerDistributionConfiguration")
    private @Nullable Output<DistributionConfigurationDistributionContainerDistributionConfigurationArgs> containerDistributionConfiguration;

    /**
     * @return Configuration block with container distribution settings. Detailed below.
     * 
     */
    public Optional<Output<DistributionConfigurationDistributionContainerDistributionConfigurationArgs>> containerDistributionConfiguration() {
        return Optional.ofNullable(this.containerDistributionConfiguration);
    }

    /**
     * Set of Amazon Resource Names (ARNs) of License Manager License Configurations.
     * 
     */
    @Import(name="licenseConfigurationArns")
    private @Nullable Output<List<String>> licenseConfigurationArns;

    /**
     * @return Set of Amazon Resource Names (ARNs) of License Manager License Configurations.
     * 
     */
    public Optional<Output<List<String>>> licenseConfigurationArns() {
        return Optional.ofNullable(this.licenseConfigurationArns);
    }

    /**
     * AWS Region for the distribution.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return AWS Region for the distribution.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    private DistributionConfigurationDistributionArgs() {}

    private DistributionConfigurationDistributionArgs(DistributionConfigurationDistributionArgs $) {
        this.amiDistributionConfiguration = $.amiDistributionConfiguration;
        this.containerDistributionConfiguration = $.containerDistributionConfiguration;
        this.licenseConfigurationArns = $.licenseConfigurationArns;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionConfigurationDistributionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionConfigurationDistributionArgs $;

        public Builder() {
            $ = new DistributionConfigurationDistributionArgs();
        }

        public Builder(DistributionConfigurationDistributionArgs defaults) {
            $ = new DistributionConfigurationDistributionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param amiDistributionConfiguration Configuration block with Amazon Machine Image (AMI) distribution settings. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder amiDistributionConfiguration(@Nullable Output<DistributionConfigurationDistributionAmiDistributionConfigurationArgs> amiDistributionConfiguration) {
            $.amiDistributionConfiguration = amiDistributionConfiguration;
            return this;
        }

        /**
         * @param amiDistributionConfiguration Configuration block with Amazon Machine Image (AMI) distribution settings. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder amiDistributionConfiguration(DistributionConfigurationDistributionAmiDistributionConfigurationArgs amiDistributionConfiguration) {
            return amiDistributionConfiguration(Output.of(amiDistributionConfiguration));
        }

        /**
         * @param containerDistributionConfiguration Configuration block with container distribution settings. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder containerDistributionConfiguration(@Nullable Output<DistributionConfigurationDistributionContainerDistributionConfigurationArgs> containerDistributionConfiguration) {
            $.containerDistributionConfiguration = containerDistributionConfiguration;
            return this;
        }

        /**
         * @param containerDistributionConfiguration Configuration block with container distribution settings. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder containerDistributionConfiguration(DistributionConfigurationDistributionContainerDistributionConfigurationArgs containerDistributionConfiguration) {
            return containerDistributionConfiguration(Output.of(containerDistributionConfiguration));
        }

        /**
         * @param licenseConfigurationArns Set of Amazon Resource Names (ARNs) of License Manager License Configurations.
         * 
         * @return builder
         * 
         */
        public Builder licenseConfigurationArns(@Nullable Output<List<String>> licenseConfigurationArns) {
            $.licenseConfigurationArns = licenseConfigurationArns;
            return this;
        }

        /**
         * @param licenseConfigurationArns Set of Amazon Resource Names (ARNs) of License Manager License Configurations.
         * 
         * @return builder
         * 
         */
        public Builder licenseConfigurationArns(List<String> licenseConfigurationArns) {
            return licenseConfigurationArns(Output.of(licenseConfigurationArns));
        }

        /**
         * @param licenseConfigurationArns Set of Amazon Resource Names (ARNs) of License Manager License Configurations.
         * 
         * @return builder
         * 
         */
        public Builder licenseConfigurationArns(String... licenseConfigurationArns) {
            return licenseConfigurationArns(List.of(licenseConfigurationArns));
        }

        /**
         * @param region AWS Region for the distribution.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region AWS Region for the distribution.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public DistributionConfigurationDistributionArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
