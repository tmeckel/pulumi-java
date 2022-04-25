// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cognitiveservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of Cognitive Services account deployment model.
 * 
 */
public final class DeploymentModelArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentModelArgs Empty = new DeploymentModelArgs();

    /**
     * Deployment model format.
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    /**
     * @return Deployment model format.
     * 
     */
    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * Deployment model name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Deployment model name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Deployment model version.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Deployment model version.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private DeploymentModelArgs() {}

    private DeploymentModelArgs(DeploymentModelArgs $) {
        this.format = $.format;
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentModelArgs $;

        public Builder() {
            $ = new DeploymentModelArgs();
        }

        public Builder(DeploymentModelArgs defaults) {
            $ = new DeploymentModelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param format Deployment model format.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Deployment model format.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param name Deployment model name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Deployment model name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param version Deployment model version.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Deployment model version.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public DeploymentModelArgs build() {
            return $;
        }
    }

}
