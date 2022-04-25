// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.inputs;

import com.pulumi.awsnative.imagebuilder.inputs.DistributionConfigurationTargetContainerRepository;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container distribution settings for encryption, licensing, and sharing in a specific Region.
 * 
 */
public final class DistributionConfigurationDistributionContainerDistributionConfigurationProperties extends com.pulumi.resources.InvokeArgs {

    public static final DistributionConfigurationDistributionContainerDistributionConfigurationProperties Empty = new DistributionConfigurationDistributionContainerDistributionConfigurationProperties();

    /**
     * Tags that are attached to the container distribution configuration.
     * 
     */
    @Import(name="containerTags")
    private @Nullable List<String> containerTags;

    /**
     * @return Tags that are attached to the container distribution configuration.
     * 
     */
    public Optional<List<String>> containerTags() {
        return Optional.ofNullable(this.containerTags);
    }

    /**
     * The description of the container distribution configuration.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return The description of the container distribution configuration.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The destination repository for the container distribution configuration.
     * 
     */
    @Import(name="targetRepository")
    private @Nullable DistributionConfigurationTargetContainerRepository targetRepository;

    /**
     * @return The destination repository for the container distribution configuration.
     * 
     */
    public Optional<DistributionConfigurationTargetContainerRepository> targetRepository() {
        return Optional.ofNullable(this.targetRepository);
    }

    private DistributionConfigurationDistributionContainerDistributionConfigurationProperties() {}

    private DistributionConfigurationDistributionContainerDistributionConfigurationProperties(DistributionConfigurationDistributionContainerDistributionConfigurationProperties $) {
        this.containerTags = $.containerTags;
        this.description = $.description;
        this.targetRepository = $.targetRepository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionConfigurationDistributionContainerDistributionConfigurationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionConfigurationDistributionContainerDistributionConfigurationProperties $;

        public Builder() {
            $ = new DistributionConfigurationDistributionContainerDistributionConfigurationProperties();
        }

        public Builder(DistributionConfigurationDistributionContainerDistributionConfigurationProperties defaults) {
            $ = new DistributionConfigurationDistributionContainerDistributionConfigurationProperties(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerTags Tags that are attached to the container distribution configuration.
         * 
         * @return builder
         * 
         */
        public Builder containerTags(@Nullable List<String> containerTags) {
            $.containerTags = containerTags;
            return this;
        }

        /**
         * @param containerTags Tags that are attached to the container distribution configuration.
         * 
         * @return builder
         * 
         */
        public Builder containerTags(String... containerTags) {
            return containerTags(List.of(containerTags));
        }

        /**
         * @param description The description of the container distribution configuration.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param targetRepository The destination repository for the container distribution configuration.
         * 
         * @return builder
         * 
         */
        public Builder targetRepository(@Nullable DistributionConfigurationTargetContainerRepository targetRepository) {
            $.targetRepository = targetRepository;
            return this;
        }

        public DistributionConfigurationDistributionContainerDistributionConfigurationProperties build() {
            return $;
        }
    }

}
