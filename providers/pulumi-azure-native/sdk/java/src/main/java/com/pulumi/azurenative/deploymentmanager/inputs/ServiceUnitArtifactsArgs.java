// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the artifacts of a service unit.
 * 
 */
public final class ServiceUnitArtifactsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceUnitArtifactsArgs Empty = new ServiceUnitArtifactsArgs();

    /**
     * The path to the ARM parameters file relative to the artifact source.
     * 
     */
    @Import(name="parametersArtifactSourceRelativePath")
    private @Nullable Output<String> parametersArtifactSourceRelativePath;

    /**
     * @return The path to the ARM parameters file relative to the artifact source.
     * 
     */
    public Optional<Output<String>> parametersArtifactSourceRelativePath() {
        return Optional.ofNullable(this.parametersArtifactSourceRelativePath);
    }

    /**
     * The full URI of the ARM parameters file with the SAS token.
     * 
     */
    @Import(name="parametersUri")
    private @Nullable Output<String> parametersUri;

    /**
     * @return The full URI of the ARM parameters file with the SAS token.
     * 
     */
    public Optional<Output<String>> parametersUri() {
        return Optional.ofNullable(this.parametersUri);
    }

    /**
     * The path to the ARM template file relative to the artifact source.
     * 
     */
    @Import(name="templateArtifactSourceRelativePath")
    private @Nullable Output<String> templateArtifactSourceRelativePath;

    /**
     * @return The path to the ARM template file relative to the artifact source.
     * 
     */
    public Optional<Output<String>> templateArtifactSourceRelativePath() {
        return Optional.ofNullable(this.templateArtifactSourceRelativePath);
    }

    /**
     * The full URI of the ARM template file with the SAS token.
     * 
     */
    @Import(name="templateUri")
    private @Nullable Output<String> templateUri;

    /**
     * @return The full URI of the ARM template file with the SAS token.
     * 
     */
    public Optional<Output<String>> templateUri() {
        return Optional.ofNullable(this.templateUri);
    }

    private ServiceUnitArtifactsArgs() {}

    private ServiceUnitArtifactsArgs(ServiceUnitArtifactsArgs $) {
        this.parametersArtifactSourceRelativePath = $.parametersArtifactSourceRelativePath;
        this.parametersUri = $.parametersUri;
        this.templateArtifactSourceRelativePath = $.templateArtifactSourceRelativePath;
        this.templateUri = $.templateUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceUnitArtifactsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceUnitArtifactsArgs $;

        public Builder() {
            $ = new ServiceUnitArtifactsArgs();
        }

        public Builder(ServiceUnitArtifactsArgs defaults) {
            $ = new ServiceUnitArtifactsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parametersArtifactSourceRelativePath The path to the ARM parameters file relative to the artifact source.
         * 
         * @return builder
         * 
         */
        public Builder parametersArtifactSourceRelativePath(@Nullable Output<String> parametersArtifactSourceRelativePath) {
            $.parametersArtifactSourceRelativePath = parametersArtifactSourceRelativePath;
            return this;
        }

        /**
         * @param parametersArtifactSourceRelativePath The path to the ARM parameters file relative to the artifact source.
         * 
         * @return builder
         * 
         */
        public Builder parametersArtifactSourceRelativePath(String parametersArtifactSourceRelativePath) {
            return parametersArtifactSourceRelativePath(Output.of(parametersArtifactSourceRelativePath));
        }

        /**
         * @param parametersUri The full URI of the ARM parameters file with the SAS token.
         * 
         * @return builder
         * 
         */
        public Builder parametersUri(@Nullable Output<String> parametersUri) {
            $.parametersUri = parametersUri;
            return this;
        }

        /**
         * @param parametersUri The full URI of the ARM parameters file with the SAS token.
         * 
         * @return builder
         * 
         */
        public Builder parametersUri(String parametersUri) {
            return parametersUri(Output.of(parametersUri));
        }

        /**
         * @param templateArtifactSourceRelativePath The path to the ARM template file relative to the artifact source.
         * 
         * @return builder
         * 
         */
        public Builder templateArtifactSourceRelativePath(@Nullable Output<String> templateArtifactSourceRelativePath) {
            $.templateArtifactSourceRelativePath = templateArtifactSourceRelativePath;
            return this;
        }

        /**
         * @param templateArtifactSourceRelativePath The path to the ARM template file relative to the artifact source.
         * 
         * @return builder
         * 
         */
        public Builder templateArtifactSourceRelativePath(String templateArtifactSourceRelativePath) {
            return templateArtifactSourceRelativePath(Output.of(templateArtifactSourceRelativePath));
        }

        /**
         * @param templateUri The full URI of the ARM template file with the SAS token.
         * 
         * @return builder
         * 
         */
        public Builder templateUri(@Nullable Output<String> templateUri) {
            $.templateUri = templateUri;
            return this;
        }

        /**
         * @param templateUri The full URI of the ARM template file with the SAS token.
         * 
         * @return builder
         * 
         */
        public Builder templateUri(String templateUri) {
            return templateUri(Output.of(templateUri));
        }

        public ServiceUnitArtifactsArgs build() {
            return $;
        }
    }

}
