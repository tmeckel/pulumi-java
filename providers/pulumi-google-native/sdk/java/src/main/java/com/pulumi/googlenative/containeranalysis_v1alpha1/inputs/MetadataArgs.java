// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.CompletenessArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Other properties of the build.
 * 
 */
public final class MetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetadataArgs Empty = new MetadataArgs();

    /**
     * The timestamp of when the build completed.
     * 
     */
    @Import(name="buildFinishedOn")
    private @Nullable Output<String> buildFinishedOn;

    /**
     * @return The timestamp of when the build completed.
     * 
     */
    public Optional<Output<String>> buildFinishedOn() {
        return Optional.ofNullable(this.buildFinishedOn);
    }

    /**
     * Identifies the particular build invocation, which can be useful for finding associated logs or other ad-hoc analysis. The value SHOULD be globally unique, per in-toto Provenance spec.
     * 
     */
    @Import(name="buildInvocationId")
    private @Nullable Output<String> buildInvocationId;

    /**
     * @return Identifies the particular build invocation, which can be useful for finding associated logs or other ad-hoc analysis. The value SHOULD be globally unique, per in-toto Provenance spec.
     * 
     */
    public Optional<Output<String>> buildInvocationId() {
        return Optional.ofNullable(this.buildInvocationId);
    }

    /**
     * The timestamp of when the build started.
     * 
     */
    @Import(name="buildStartedOn")
    private @Nullable Output<String> buildStartedOn;

    /**
     * @return The timestamp of when the build started.
     * 
     */
    public Optional<Output<String>> buildStartedOn() {
        return Optional.ofNullable(this.buildStartedOn);
    }

    /**
     * Indicates that the builder claims certain fields in this message to be complete.
     * 
     */
    @Import(name="completeness")
    private @Nullable Output<CompletenessArgs> completeness;

    /**
     * @return Indicates that the builder claims certain fields in this message to be complete.
     * 
     */
    public Optional<Output<CompletenessArgs>> completeness() {
        return Optional.ofNullable(this.completeness);
    }

    /**
     * If true, the builder claims that running the recipe on materials will produce bit-for-bit identical output.
     * 
     */
    @Import(name="reproducible")
    private @Nullable Output<Boolean> reproducible;

    /**
     * @return If true, the builder claims that running the recipe on materials will produce bit-for-bit identical output.
     * 
     */
    public Optional<Output<Boolean>> reproducible() {
        return Optional.ofNullable(this.reproducible);
    }

    private MetadataArgs() {}

    private MetadataArgs(MetadataArgs $) {
        this.buildFinishedOn = $.buildFinishedOn;
        this.buildInvocationId = $.buildInvocationId;
        this.buildStartedOn = $.buildStartedOn;
        this.completeness = $.completeness;
        this.reproducible = $.reproducible;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetadataArgs $;

        public Builder() {
            $ = new MetadataArgs();
        }

        public Builder(MetadataArgs defaults) {
            $ = new MetadataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param buildFinishedOn The timestamp of when the build completed.
         * 
         * @return builder
         * 
         */
        public Builder buildFinishedOn(@Nullable Output<String> buildFinishedOn) {
            $.buildFinishedOn = buildFinishedOn;
            return this;
        }

        /**
         * @param buildFinishedOn The timestamp of when the build completed.
         * 
         * @return builder
         * 
         */
        public Builder buildFinishedOn(String buildFinishedOn) {
            return buildFinishedOn(Output.of(buildFinishedOn));
        }

        /**
         * @param buildInvocationId Identifies the particular build invocation, which can be useful for finding associated logs or other ad-hoc analysis. The value SHOULD be globally unique, per in-toto Provenance spec.
         * 
         * @return builder
         * 
         */
        public Builder buildInvocationId(@Nullable Output<String> buildInvocationId) {
            $.buildInvocationId = buildInvocationId;
            return this;
        }

        /**
         * @param buildInvocationId Identifies the particular build invocation, which can be useful for finding associated logs or other ad-hoc analysis. The value SHOULD be globally unique, per in-toto Provenance spec.
         * 
         * @return builder
         * 
         */
        public Builder buildInvocationId(String buildInvocationId) {
            return buildInvocationId(Output.of(buildInvocationId));
        }

        /**
         * @param buildStartedOn The timestamp of when the build started.
         * 
         * @return builder
         * 
         */
        public Builder buildStartedOn(@Nullable Output<String> buildStartedOn) {
            $.buildStartedOn = buildStartedOn;
            return this;
        }

        /**
         * @param buildStartedOn The timestamp of when the build started.
         * 
         * @return builder
         * 
         */
        public Builder buildStartedOn(String buildStartedOn) {
            return buildStartedOn(Output.of(buildStartedOn));
        }

        /**
         * @param completeness Indicates that the builder claims certain fields in this message to be complete.
         * 
         * @return builder
         * 
         */
        public Builder completeness(@Nullable Output<CompletenessArgs> completeness) {
            $.completeness = completeness;
            return this;
        }

        /**
         * @param completeness Indicates that the builder claims certain fields in this message to be complete.
         * 
         * @return builder
         * 
         */
        public Builder completeness(CompletenessArgs completeness) {
            return completeness(Output.of(completeness));
        }

        /**
         * @param reproducible If true, the builder claims that running the recipe on materials will produce bit-for-bit identical output.
         * 
         * @return builder
         * 
         */
        public Builder reproducible(@Nullable Output<Boolean> reproducible) {
            $.reproducible = reproducible;
            return this;
        }

        /**
         * @param reproducible If true, the builder claims that running the recipe on materials will produce bit-for-bit identical output.
         * 
         * @return builder
         * 
         */
        public Builder reproducible(Boolean reproducible) {
            return reproducible(Output.of(reproducible));
        }

        public MetadataArgs build() {
            return $;
        }
    }

}
