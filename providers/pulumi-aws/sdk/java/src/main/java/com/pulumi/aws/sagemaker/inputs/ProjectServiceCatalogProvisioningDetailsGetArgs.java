// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.aws.sagemaker.inputs.ProjectServiceCatalogProvisioningDetailsProvisioningParameterGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectServiceCatalogProvisioningDetailsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectServiceCatalogProvisioningDetailsGetArgs Empty = new ProjectServiceCatalogProvisioningDetailsGetArgs();

    /**
     * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path.
     * 
     */
    @Import(name="pathId")
    private @Nullable Output<String> pathId;

    /**
     * @return The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path.
     * 
     */
    public Optional<Output<String>> pathId() {
        return Optional.ofNullable(this.pathId);
    }

    /**
     * The ID of the product to provision.
     * 
     */
    @Import(name="productId", required=true)
    private Output<String> productId;

    /**
     * @return The ID of the product to provision.
     * 
     */
    public Output<String> productId() {
        return this.productId;
    }

    /**
     * The ID of the provisioning artifact.
     * 
     */
    @Import(name="provisioningArtifactId")
    private @Nullable Output<String> provisioningArtifactId;

    /**
     * @return The ID of the provisioning artifact.
     * 
     */
    public Optional<Output<String>> provisioningArtifactId() {
        return Optional.ofNullable(this.provisioningArtifactId);
    }

    /**
     * A list of key value pairs that you specify when you provision a product. See Provisioning Parameter below.
     * 
     */
    @Import(name="provisioningParameters")
    private @Nullable Output<List<ProjectServiceCatalogProvisioningDetailsProvisioningParameterGetArgs>> provisioningParameters;

    /**
     * @return A list of key value pairs that you specify when you provision a product. See Provisioning Parameter below.
     * 
     */
    public Optional<Output<List<ProjectServiceCatalogProvisioningDetailsProvisioningParameterGetArgs>>> provisioningParameters() {
        return Optional.ofNullable(this.provisioningParameters);
    }

    private ProjectServiceCatalogProvisioningDetailsGetArgs() {}

    private ProjectServiceCatalogProvisioningDetailsGetArgs(ProjectServiceCatalogProvisioningDetailsGetArgs $) {
        this.pathId = $.pathId;
        this.productId = $.productId;
        this.provisioningArtifactId = $.provisioningArtifactId;
        this.provisioningParameters = $.provisioningParameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectServiceCatalogProvisioningDetailsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectServiceCatalogProvisioningDetailsGetArgs $;

        public Builder() {
            $ = new ProjectServiceCatalogProvisioningDetailsGetArgs();
        }

        public Builder(ProjectServiceCatalogProvisioningDetailsGetArgs defaults) {
            $ = new ProjectServiceCatalogProvisioningDetailsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pathId The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path.
         * 
         * @return builder
         * 
         */
        public Builder pathId(@Nullable Output<String> pathId) {
            $.pathId = pathId;
            return this;
        }

        /**
         * @param pathId The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path.
         * 
         * @return builder
         * 
         */
        public Builder pathId(String pathId) {
            return pathId(Output.of(pathId));
        }

        /**
         * @param productId The ID of the product to provision.
         * 
         * @return builder
         * 
         */
        public Builder productId(Output<String> productId) {
            $.productId = productId;
            return this;
        }

        /**
         * @param productId The ID of the product to provision.
         * 
         * @return builder
         * 
         */
        public Builder productId(String productId) {
            return productId(Output.of(productId));
        }

        /**
         * @param provisioningArtifactId The ID of the provisioning artifact.
         * 
         * @return builder
         * 
         */
        public Builder provisioningArtifactId(@Nullable Output<String> provisioningArtifactId) {
            $.provisioningArtifactId = provisioningArtifactId;
            return this;
        }

        /**
         * @param provisioningArtifactId The ID of the provisioning artifact.
         * 
         * @return builder
         * 
         */
        public Builder provisioningArtifactId(String provisioningArtifactId) {
            return provisioningArtifactId(Output.of(provisioningArtifactId));
        }

        /**
         * @param provisioningParameters A list of key value pairs that you specify when you provision a product. See Provisioning Parameter below.
         * 
         * @return builder
         * 
         */
        public Builder provisioningParameters(@Nullable Output<List<ProjectServiceCatalogProvisioningDetailsProvisioningParameterGetArgs>> provisioningParameters) {
            $.provisioningParameters = provisioningParameters;
            return this;
        }

        /**
         * @param provisioningParameters A list of key value pairs that you specify when you provision a product. See Provisioning Parameter below.
         * 
         * @return builder
         * 
         */
        public Builder provisioningParameters(List<ProjectServiceCatalogProvisioningDetailsProvisioningParameterGetArgs> provisioningParameters) {
            return provisioningParameters(Output.of(provisioningParameters));
        }

        /**
         * @param provisioningParameters A list of key value pairs that you specify when you provision a product. See Provisioning Parameter below.
         * 
         * @return builder
         * 
         */
        public Builder provisioningParameters(ProjectServiceCatalogProvisioningDetailsProvisioningParameterGetArgs... provisioningParameters) {
            return provisioningParameters(List.of(provisioningParameters));
        }

        public ProjectServiceCatalogProvisioningDetailsGetArgs build() {
            $.productId = Objects.requireNonNull($.productId, "expected parameter 'productId' to be non-null");
            return $;
        }
    }

}
