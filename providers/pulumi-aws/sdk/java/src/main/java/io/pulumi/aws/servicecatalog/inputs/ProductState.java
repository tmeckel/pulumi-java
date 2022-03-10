// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.inputs;

import io.pulumi.aws.servicecatalog.inputs.ProductProvisioningArtifactParametersGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProductState extends io.pulumi.resources.ResourceArgs {

    public static final ProductState Empty = new ProductState();

    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @InputImport(name="acceptLanguage")
      private final @Nullable Input<String> acceptLanguage;

    public Input<String> getAcceptLanguage() {
        return this.acceptLanguage == null ? Input.empty() : this.acceptLanguage;
    }

    /**
     * ARN of the product.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Time when the product was created.
     * 
     */
    @InputImport(name="createdTime")
      private final @Nullable Input<String> createdTime;

    public Input<String> getCreatedTime() {
        return this.createdTime == null ? Input.empty() : this.createdTime;
    }

    /**
     * Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Distributor (i.e., vendor) of the product.
     * 
     */
    @InputImport(name="distributor")
      private final @Nullable Input<String> distributor;

    public Input<String> getDistributor() {
        return this.distributor == null ? Input.empty() : this.distributor;
    }

    /**
     * Whether the product has a default path. If the product does not have a default path, call `ListLaunchPaths` to disambiguate between paths.  Otherwise, `ListLaunchPaths` is not required, and the output of ProductViewSummary can be used directly with `DescribeProvisioningParameters`.
     * 
     */
    @InputImport(name="hasDefaultPath")
      private final @Nullable Input<Boolean> hasDefaultPath;

    public Input<Boolean> getHasDefaultPath() {
        return this.hasDefaultPath == null ? Input.empty() : this.hasDefaultPath;
    }

    /**
     * Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Owner of the product.
     * 
     */
    @InputImport(name="owner")
      private final @Nullable Input<String> owner;

    public Input<String> getOwner() {
        return this.owner == null ? Input.empty() : this.owner;
    }

    /**
     * Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
     * 
     */
    @InputImport(name="provisioningArtifactParameters")
      private final @Nullable Input<ProductProvisioningArtifactParametersGetArgs> provisioningArtifactParameters;

    public Input<ProductProvisioningArtifactParametersGetArgs> getProvisioningArtifactParameters() {
        return this.provisioningArtifactParameters == null ? Input.empty() : this.provisioningArtifactParameters;
    }

    /**
     * Status of the product.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * Support information about the product.
     * 
     */
    @InputImport(name="supportDescription")
      private final @Nullable Input<String> supportDescription;

    public Input<String> getSupportDescription() {
        return this.supportDescription == null ? Input.empty() : this.supportDescription;
    }

    /**
     * Contact email for product support.
     * 
     */
    @InputImport(name="supportEmail")
      private final @Nullable Input<String> supportEmail;

    public Input<String> getSupportEmail() {
        return this.supportEmail == null ? Input.empty() : this.supportEmail;
    }

    /**
     * Contact URL for product support.
     * 
     */
    @InputImport(name="supportUrl")
      private final @Nullable Input<String> supportUrl;

    public Input<String> getSupportUrl() {
        return this.supportUrl == null ? Input.empty() : this.supportUrl;
    }

    /**
     * Tags to apply to the product. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Type of provisioning artifact. Valid values: `CLOUD_FORMATION_TEMPLATE`, `MARKETPLACE_AMI`, `MARKETPLACE_CAR` (Marketplace Clusters and AWS Resources).
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ProductState(
        @Nullable Input<String> acceptLanguage,
        @Nullable Input<String> arn,
        @Nullable Input<String> createdTime,
        @Nullable Input<String> description,
        @Nullable Input<String> distributor,
        @Nullable Input<Boolean> hasDefaultPath,
        @Nullable Input<String> name,
        @Nullable Input<String> owner,
        @Nullable Input<ProductProvisioningArtifactParametersGetArgs> provisioningArtifactParameters,
        @Nullable Input<String> status,
        @Nullable Input<String> supportDescription,
        @Nullable Input<String> supportEmail,
        @Nullable Input<String> supportUrl,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> type) {
        this.acceptLanguage = acceptLanguage;
        this.arn = arn;
        this.createdTime = createdTime;
        this.description = description;
        this.distributor = distributor;
        this.hasDefaultPath = hasDefaultPath;
        this.name = name;
        this.owner = owner;
        this.provisioningArtifactParameters = provisioningArtifactParameters;
        this.status = status;
        this.supportDescription = supportDescription;
        this.supportEmail = supportEmail;
        this.supportUrl = supportUrl;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.type = type;
    }

    private ProductState() {
        this.acceptLanguage = Input.empty();
        this.arn = Input.empty();
        this.createdTime = Input.empty();
        this.description = Input.empty();
        this.distributor = Input.empty();
        this.hasDefaultPath = Input.empty();
        this.name = Input.empty();
        this.owner = Input.empty();
        this.provisioningArtifactParameters = Input.empty();
        this.status = Input.empty();
        this.supportDescription = Input.empty();
        this.supportEmail = Input.empty();
        this.supportUrl = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> acceptLanguage;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> createdTime;
        private @Nullable Input<String> description;
        private @Nullable Input<String> distributor;
        private @Nullable Input<Boolean> hasDefaultPath;
        private @Nullable Input<String> name;
        private @Nullable Input<String> owner;
        private @Nullable Input<ProductProvisioningArtifactParametersGetArgs> provisioningArtifactParameters;
        private @Nullable Input<String> status;
        private @Nullable Input<String> supportDescription;
        private @Nullable Input<String> supportEmail;
        private @Nullable Input<String> supportUrl;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.distributor = defaults.distributor;
    	      this.hasDefaultPath = defaults.hasDefaultPath;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.provisioningArtifactParameters = defaults.provisioningArtifactParameters;
    	      this.status = defaults.status;
    	      this.supportDescription = defaults.supportDescription;
    	      this.supportEmail = defaults.supportEmail;
    	      this.supportUrl = defaults.supportUrl;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.type = defaults.type;
        }

        public Builder acceptLanguage(@Nullable Input<String> acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        public Builder acceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = Input.ofNullable(acceptLanguage);
            return this;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder createdTime(@Nullable Input<String> createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = Input.ofNullable(createdTime);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder distributor(@Nullable Input<String> distributor) {
            this.distributor = distributor;
            return this;
        }

        public Builder distributor(@Nullable String distributor) {
            this.distributor = Input.ofNullable(distributor);
            return this;
        }

        public Builder hasDefaultPath(@Nullable Input<Boolean> hasDefaultPath) {
            this.hasDefaultPath = hasDefaultPath;
            return this;
        }

        public Builder hasDefaultPath(@Nullable Boolean hasDefaultPath) {
            this.hasDefaultPath = Input.ofNullable(hasDefaultPath);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder owner(@Nullable Input<String> owner) {
            this.owner = owner;
            return this;
        }

        public Builder owner(@Nullable String owner) {
            this.owner = Input.ofNullable(owner);
            return this;
        }

        public Builder provisioningArtifactParameters(@Nullable Input<ProductProvisioningArtifactParametersGetArgs> provisioningArtifactParameters) {
            this.provisioningArtifactParameters = provisioningArtifactParameters;
            return this;
        }

        public Builder provisioningArtifactParameters(@Nullable ProductProvisioningArtifactParametersGetArgs provisioningArtifactParameters) {
            this.provisioningArtifactParameters = Input.ofNullable(provisioningArtifactParameters);
            return this;
        }

        public Builder status(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder supportDescription(@Nullable Input<String> supportDescription) {
            this.supportDescription = supportDescription;
            return this;
        }

        public Builder supportDescription(@Nullable String supportDescription) {
            this.supportDescription = Input.ofNullable(supportDescription);
            return this;
        }

        public Builder supportEmail(@Nullable Input<String> supportEmail) {
            this.supportEmail = supportEmail;
            return this;
        }

        public Builder supportEmail(@Nullable String supportEmail) {
            this.supportEmail = Input.ofNullable(supportEmail);
            return this;
        }

        public Builder supportUrl(@Nullable Input<String> supportUrl) {
            this.supportUrl = supportUrl;
            return this;
        }

        public Builder supportUrl(@Nullable String supportUrl) {
            this.supportUrl = Input.ofNullable(supportUrl);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ProductState build() {
            return new ProductState(acceptLanguage, arn, createdTime, description, distributor, hasDefaultPath, name, owner, provisioningArtifactParameters, status, supportDescription, supportEmail, supportUrl, tags, tagsAll, type);
        }
    }
}
