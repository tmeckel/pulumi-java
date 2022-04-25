// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs Empty = new ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs();

    /**
     * The key that identifies a provisioning parameter.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The key that identifies a provisioning parameter.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The value of the provisioning parameter.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the provisioning parameter.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs() {}

    private ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs(ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs $;

        public Builder() {
            $ = new ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs();
        }

        public Builder(ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs defaults) {
            $ = new ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The key that identifies a provisioning parameter.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key that identifies a provisioning parameter.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value The value of the provisioning parameter.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the provisioning parameter.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ProjectServiceCatalogProvisioningDetailsProvisioningParameterArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
