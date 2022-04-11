// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.inputs;

import io.pulumi.aws.servicecatalog.inputs.ProductProvisioningArtifactParametersGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="acceptLanguage")
      private final @Nullable Output<String> acceptLanguage;

    public Output<String> getAcceptLanguage() {
        return this.acceptLanguage == null ? Codegen.empty() : this.acceptLanguage;
    }

    /**
     * ARN of the product.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Time when the product was created.
     * 
     */
    @Import(name="createdTime")
      private final @Nullable Output<String> createdTime;

    public Output<String> getCreatedTime() {
        return this.createdTime == null ? Codegen.empty() : this.createdTime;
    }

    /**
     * Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Distributor (i.e., vendor) of the product.
     * 
     */
    @Import(name="distributor")
      private final @Nullable Output<String> distributor;

    public Output<String> getDistributor() {
        return this.distributor == null ? Codegen.empty() : this.distributor;
    }

    /**
     * Whether the product has a default path. If the product does not have a default path, call `ListLaunchPaths` to disambiguate between paths.  Otherwise, `ListLaunchPaths` is not required, and the output of ProductViewSummary can be used directly with `DescribeProvisioningParameters`.
     * 
     */
    @Import(name="hasDefaultPath")
      private final @Nullable Output<Boolean> hasDefaultPath;

    public Output<Boolean> getHasDefaultPath() {
        return this.hasDefaultPath == null ? Codegen.empty() : this.hasDefaultPath;
    }

    /**
     * Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Owner of the product.
     * 
     */
    @Import(name="owner")
      private final @Nullable Output<String> owner;

    public Output<String> getOwner() {
        return this.owner == null ? Codegen.empty() : this.owner;
    }

    /**
     * Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
     * 
     */
    @Import(name="provisioningArtifactParameters")
      private final @Nullable Output<ProductProvisioningArtifactParametersGetArgs> provisioningArtifactParameters;

    public Output<ProductProvisioningArtifactParametersGetArgs> getProvisioningArtifactParameters() {
        return this.provisioningArtifactParameters == null ? Codegen.empty() : this.provisioningArtifactParameters;
    }

    /**
     * Status of the product.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * Support information about the product.
     * 
     */
    @Import(name="supportDescription")
      private final @Nullable Output<String> supportDescription;

    public Output<String> getSupportDescription() {
        return this.supportDescription == null ? Codegen.empty() : this.supportDescription;
    }

    /**
     * Contact email for product support.
     * 
     */
    @Import(name="supportEmail")
      private final @Nullable Output<String> supportEmail;

    public Output<String> getSupportEmail() {
        return this.supportEmail == null ? Codegen.empty() : this.supportEmail;
    }

    /**
     * Contact URL for product support.
     * 
     */
    @Import(name="supportUrl")
      private final @Nullable Output<String> supportUrl;

    public Output<String> getSupportUrl() {
        return this.supportUrl == null ? Codegen.empty() : this.supportUrl;
    }

    /**
     * Tags to apply to the product. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * Type of provisioning artifact. Valid values: `CLOUD_FORMATION_TEMPLATE`, `MARKETPLACE_AMI`, `MARKETPLACE_CAR` (Marketplace Clusters and AWS Resources).
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public ProductState(
        @Nullable Output<String> acceptLanguage,
        @Nullable Output<String> arn,
        @Nullable Output<String> createdTime,
        @Nullable Output<String> description,
        @Nullable Output<String> distributor,
        @Nullable Output<Boolean> hasDefaultPath,
        @Nullable Output<String> name,
        @Nullable Output<String> owner,
        @Nullable Output<ProductProvisioningArtifactParametersGetArgs> provisioningArtifactParameters,
        @Nullable Output<String> status,
        @Nullable Output<String> supportDescription,
        @Nullable Output<String> supportEmail,
        @Nullable Output<String> supportUrl,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> type) {
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
        this.acceptLanguage = Codegen.empty();
        this.arn = Codegen.empty();
        this.createdTime = Codegen.empty();
        this.description = Codegen.empty();
        this.distributor = Codegen.empty();
        this.hasDefaultPath = Codegen.empty();
        this.name = Codegen.empty();
        this.owner = Codegen.empty();
        this.provisioningArtifactParameters = Codegen.empty();
        this.status = Codegen.empty();
        this.supportDescription = Codegen.empty();
        this.supportEmail = Codegen.empty();
        this.supportUrl = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> acceptLanguage;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> createdTime;
        private @Nullable Output<String> description;
        private @Nullable Output<String> distributor;
        private @Nullable Output<Boolean> hasDefaultPath;
        private @Nullable Output<String> name;
        private @Nullable Output<String> owner;
        private @Nullable Output<ProductProvisioningArtifactParametersGetArgs> provisioningArtifactParameters;
        private @Nullable Output<String> status;
        private @Nullable Output<String> supportDescription;
        private @Nullable Output<String> supportEmail;
        private @Nullable Output<String> supportUrl;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> type;

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

        public Builder acceptLanguage(@Nullable Output<String> acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }
        public Builder acceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = Codegen.ofNullable(acceptLanguage);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder createdTime(@Nullable Output<String> createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = Codegen.ofNullable(createdTime);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder distributor(@Nullable Output<String> distributor) {
            this.distributor = distributor;
            return this;
        }
        public Builder distributor(@Nullable String distributor) {
            this.distributor = Codegen.ofNullable(distributor);
            return this;
        }
        public Builder hasDefaultPath(@Nullable Output<Boolean> hasDefaultPath) {
            this.hasDefaultPath = hasDefaultPath;
            return this;
        }
        public Builder hasDefaultPath(@Nullable Boolean hasDefaultPath) {
            this.hasDefaultPath = Codegen.ofNullable(hasDefaultPath);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder owner(@Nullable Output<String> owner) {
            this.owner = owner;
            return this;
        }
        public Builder owner(@Nullable String owner) {
            this.owner = Codegen.ofNullable(owner);
            return this;
        }
        public Builder provisioningArtifactParameters(@Nullable Output<ProductProvisioningArtifactParametersGetArgs> provisioningArtifactParameters) {
            this.provisioningArtifactParameters = provisioningArtifactParameters;
            return this;
        }
        public Builder provisioningArtifactParameters(@Nullable ProductProvisioningArtifactParametersGetArgs provisioningArtifactParameters) {
            this.provisioningArtifactParameters = Codegen.ofNullable(provisioningArtifactParameters);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder supportDescription(@Nullable Output<String> supportDescription) {
            this.supportDescription = supportDescription;
            return this;
        }
        public Builder supportDescription(@Nullable String supportDescription) {
            this.supportDescription = Codegen.ofNullable(supportDescription);
            return this;
        }
        public Builder supportEmail(@Nullable Output<String> supportEmail) {
            this.supportEmail = supportEmail;
            return this;
        }
        public Builder supportEmail(@Nullable String supportEmail) {
            this.supportEmail = Codegen.ofNullable(supportEmail);
            return this;
        }
        public Builder supportUrl(@Nullable Output<String> supportUrl) {
            this.supportUrl = supportUrl;
            return this;
        }
        public Builder supportUrl(@Nullable String supportUrl) {
            this.supportUrl = Codegen.ofNullable(supportUrl);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public ProductState build() {
            return new ProductState(acceptLanguage, arn, createdTime, description, distributor, hasDefaultPath, name, owner, provisioningArtifactParameters, status, supportDescription, supportEmail, supportUrl, tags, tagsAll, type);
        }
    }
}
