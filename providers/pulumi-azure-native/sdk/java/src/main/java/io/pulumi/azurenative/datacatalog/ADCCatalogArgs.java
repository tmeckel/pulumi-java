// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datacatalog;

import io.pulumi.azurenative.datacatalog.enums.SkuType;
import io.pulumi.azurenative.datacatalog.inputs.PrincipalsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ADCCatalogArgs extends io.pulumi.resources.ResourceArgs {

    public static final ADCCatalogArgs Empty = new ADCCatalogArgs();

    /**
     * Azure data catalog admin list.
     * 
     */
    @Import(name="admins")
      private final @Nullable Output<List<PrincipalsArgs>> admins;

    public Output<List<PrincipalsArgs>> getAdmins() {
        return this.admins == null ? Codegen.empty() : this.admins;
    }

    /**
     * The name of the data catalog in the specified subscription and resource group.
     * 
     */
    @Import(name="catalogName")
      private final @Nullable Output<String> catalogName;

    public Output<String> getCatalogName() {
        return this.catalogName == null ? Codegen.empty() : this.catalogName;
    }

    /**
     * Automatic unit adjustment enabled or not.
     * 
     */
    @Import(name="enableAutomaticUnitAdjustment")
      private final @Nullable Output<Boolean> enableAutomaticUnitAdjustment;

    public Output<Boolean> getEnableAutomaticUnitAdjustment() {
        return this.enableAutomaticUnitAdjustment == null ? Codegen.empty() : this.enableAutomaticUnitAdjustment;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Azure data catalog SKU.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<Either<String,SkuType>> sku;

    public Output<Either<String,SkuType>> getSku() {
        return this.sku == null ? Codegen.empty() : this.sku;
    }

    /**
     * Azure data catalog provision status.
     * 
     */
    @Import(name="successfullyProvisioned")
      private final @Nullable Output<Boolean> successfullyProvisioned;

    public Output<Boolean> getSuccessfullyProvisioned() {
        return this.successfullyProvisioned == null ? Codegen.empty() : this.successfullyProvisioned;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Azure data catalog units.
     * 
     */
    @Import(name="units")
      private final @Nullable Output<Integer> units;

    public Output<Integer> getUnits() {
        return this.units == null ? Codegen.empty() : this.units;
    }

    /**
     * Azure data catalog user list.
     * 
     */
    @Import(name="users")
      private final @Nullable Output<List<PrincipalsArgs>> users;

    public Output<List<PrincipalsArgs>> getUsers() {
        return this.users == null ? Codegen.empty() : this.users;
    }

    public ADCCatalogArgs(
        @Nullable Output<List<PrincipalsArgs>> admins,
        @Nullable Output<String> catalogName,
        @Nullable Output<Boolean> enableAutomaticUnitAdjustment,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<Either<String,SkuType>> sku,
        @Nullable Output<Boolean> successfullyProvisioned,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Integer> units,
        @Nullable Output<List<PrincipalsArgs>> users) {
        this.admins = admins;
        this.catalogName = catalogName;
        this.enableAutomaticUnitAdjustment = enableAutomaticUnitAdjustment;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.successfullyProvisioned = successfullyProvisioned;
        this.tags = tags;
        this.units = units;
        this.users = users;
    }

    private ADCCatalogArgs() {
        this.admins = Codegen.empty();
        this.catalogName = Codegen.empty();
        this.enableAutomaticUnitAdjustment = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sku = Codegen.empty();
        this.successfullyProvisioned = Codegen.empty();
        this.tags = Codegen.empty();
        this.units = Codegen.empty();
        this.users = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ADCCatalogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<PrincipalsArgs>> admins;
        private @Nullable Output<String> catalogName;
        private @Nullable Output<Boolean> enableAutomaticUnitAdjustment;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<Either<String,SkuType>> sku;
        private @Nullable Output<Boolean> successfullyProvisioned;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Integer> units;
        private @Nullable Output<List<PrincipalsArgs>> users;

        public Builder() {
    	      // Empty
        }

        public Builder(ADCCatalogArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admins = defaults.admins;
    	      this.catalogName = defaults.catalogName;
    	      this.enableAutomaticUnitAdjustment = defaults.enableAutomaticUnitAdjustment;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.successfullyProvisioned = defaults.successfullyProvisioned;
    	      this.tags = defaults.tags;
    	      this.units = defaults.units;
    	      this.users = defaults.users;
        }

        public Builder admins(@Nullable Output<List<PrincipalsArgs>> admins) {
            this.admins = admins;
            return this;
        }
        public Builder admins(@Nullable List<PrincipalsArgs> admins) {
            this.admins = Codegen.ofNullable(admins);
            return this;
        }
        public Builder admins(PrincipalsArgs... admins) {
            return admins(List.of(admins));
        }
        public Builder catalogName(@Nullable Output<String> catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public Builder catalogName(@Nullable String catalogName) {
            this.catalogName = Codegen.ofNullable(catalogName);
            return this;
        }
        public Builder enableAutomaticUnitAdjustment(@Nullable Output<Boolean> enableAutomaticUnitAdjustment) {
            this.enableAutomaticUnitAdjustment = enableAutomaticUnitAdjustment;
            return this;
        }
        public Builder enableAutomaticUnitAdjustment(@Nullable Boolean enableAutomaticUnitAdjustment) {
            this.enableAutomaticUnitAdjustment = Codegen.ofNullable(enableAutomaticUnitAdjustment);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder sku(@Nullable Output<Either<String,SkuType>> sku) {
            this.sku = sku;
            return this;
        }
        public Builder sku(@Nullable Either<String,SkuType> sku) {
            this.sku = Codegen.ofNullable(sku);
            return this;
        }
        public Builder successfullyProvisioned(@Nullable Output<Boolean> successfullyProvisioned) {
            this.successfullyProvisioned = successfullyProvisioned;
            return this;
        }
        public Builder successfullyProvisioned(@Nullable Boolean successfullyProvisioned) {
            this.successfullyProvisioned = Codegen.ofNullable(successfullyProvisioned);
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
        public Builder units(@Nullable Output<Integer> units) {
            this.units = units;
            return this;
        }
        public Builder units(@Nullable Integer units) {
            this.units = Codegen.ofNullable(units);
            return this;
        }
        public Builder users(@Nullable Output<List<PrincipalsArgs>> users) {
            this.users = users;
            return this;
        }
        public Builder users(@Nullable List<PrincipalsArgs> users) {
            this.users = Codegen.ofNullable(users);
            return this;
        }
        public Builder users(PrincipalsArgs... users) {
            return users(List.of(users));
        }        public ADCCatalogArgs build() {
            return new ADCCatalogArgs(admins, catalogName, enableAutomaticUnitAdjustment, location, resourceGroupName, sku, successfullyProvisioned, tags, units, users);
        }
    }
}
