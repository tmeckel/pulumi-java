// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.inputs;

import io.pulumi.aws.lakeformation.inputs.DataLakeSettingsCreateDatabaseDefaultPermissionGetArgs;
import io.pulumi.aws.lakeformation.inputs.DataLakeSettingsCreateTableDefaultPermissionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataLakeSettingsState extends io.pulumi.resources.ResourceArgs {

    public static final DataLakeSettingsState Empty = new DataLakeSettingsState();

    /**
     * Set of ARNs of AWS Lake Formation principals (IAM users or roles).
     * 
     */
    @Import(name="admins")
      private final @Nullable Output<List<String>> admins;

    public Output<List<String>> getAdmins() {
        return this.admins == null ? Codegen.empty() : this.admins;
    }

    /**
     * Identifier for the Data Catalog. By default, the account ID.
     * 
     */
    @Import(name="catalogId")
      private final @Nullable Output<String> catalogId;

    public Output<String> getCatalogId() {
        return this.catalogId == null ? Codegen.empty() : this.catalogId;
    }

    /**
     * Up to three configuration blocks of principal permissions for default create database permissions. Detailed below.
     * 
     */
    @Import(name="createDatabaseDefaultPermissions")
      private final @Nullable Output<List<DataLakeSettingsCreateDatabaseDefaultPermissionGetArgs>> createDatabaseDefaultPermissions;

    public Output<List<DataLakeSettingsCreateDatabaseDefaultPermissionGetArgs>> getCreateDatabaseDefaultPermissions() {
        return this.createDatabaseDefaultPermissions == null ? Codegen.empty() : this.createDatabaseDefaultPermissions;
    }

    /**
     * Up to three configuration blocks of principal permissions for default create table permissions. Detailed below.
     * 
     */
    @Import(name="createTableDefaultPermissions")
      private final @Nullable Output<List<DataLakeSettingsCreateTableDefaultPermissionGetArgs>> createTableDefaultPermissions;

    public Output<List<DataLakeSettingsCreateTableDefaultPermissionGetArgs>> getCreateTableDefaultPermissions() {
        return this.createTableDefaultPermissions == null ? Codegen.empty() : this.createTableDefaultPermissions;
    }

    /**
     * List of the resource-owning account IDs that the caller's account can use to share their user access details (user ARNs).
     * 
     */
    @Import(name="trustedResourceOwners")
      private final @Nullable Output<List<String>> trustedResourceOwners;

    public Output<List<String>> getTrustedResourceOwners() {
        return this.trustedResourceOwners == null ? Codegen.empty() : this.trustedResourceOwners;
    }

    public DataLakeSettingsState(
        @Nullable Output<List<String>> admins,
        @Nullable Output<String> catalogId,
        @Nullable Output<List<DataLakeSettingsCreateDatabaseDefaultPermissionGetArgs>> createDatabaseDefaultPermissions,
        @Nullable Output<List<DataLakeSettingsCreateTableDefaultPermissionGetArgs>> createTableDefaultPermissions,
        @Nullable Output<List<String>> trustedResourceOwners) {
        this.admins = admins;
        this.catalogId = catalogId;
        this.createDatabaseDefaultPermissions = createDatabaseDefaultPermissions;
        this.createTableDefaultPermissions = createTableDefaultPermissions;
        this.trustedResourceOwners = trustedResourceOwners;
    }

    private DataLakeSettingsState() {
        this.admins = Codegen.empty();
        this.catalogId = Codegen.empty();
        this.createDatabaseDefaultPermissions = Codegen.empty();
        this.createTableDefaultPermissions = Codegen.empty();
        this.trustedResourceOwners = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataLakeSettingsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> admins;
        private @Nullable Output<String> catalogId;
        private @Nullable Output<List<DataLakeSettingsCreateDatabaseDefaultPermissionGetArgs>> createDatabaseDefaultPermissions;
        private @Nullable Output<List<DataLakeSettingsCreateTableDefaultPermissionGetArgs>> createTableDefaultPermissions;
        private @Nullable Output<List<String>> trustedResourceOwners;

        public Builder() {
    	      // Empty
        }

        public Builder(DataLakeSettingsState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admins = defaults.admins;
    	      this.catalogId = defaults.catalogId;
    	      this.createDatabaseDefaultPermissions = defaults.createDatabaseDefaultPermissions;
    	      this.createTableDefaultPermissions = defaults.createTableDefaultPermissions;
    	      this.trustedResourceOwners = defaults.trustedResourceOwners;
        }

        public Builder admins(@Nullable Output<List<String>> admins) {
            this.admins = admins;
            return this;
        }
        public Builder admins(@Nullable List<String> admins) {
            this.admins = Codegen.ofNullable(admins);
            return this;
        }
        public Builder admins(String... admins) {
            return admins(List.of(admins));
        }
        public Builder catalogId(@Nullable Output<String> catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Builder catalogId(@Nullable String catalogId) {
            this.catalogId = Codegen.ofNullable(catalogId);
            return this;
        }
        public Builder createDatabaseDefaultPermissions(@Nullable Output<List<DataLakeSettingsCreateDatabaseDefaultPermissionGetArgs>> createDatabaseDefaultPermissions) {
            this.createDatabaseDefaultPermissions = createDatabaseDefaultPermissions;
            return this;
        }
        public Builder createDatabaseDefaultPermissions(@Nullable List<DataLakeSettingsCreateDatabaseDefaultPermissionGetArgs> createDatabaseDefaultPermissions) {
            this.createDatabaseDefaultPermissions = Codegen.ofNullable(createDatabaseDefaultPermissions);
            return this;
        }
        public Builder createDatabaseDefaultPermissions(DataLakeSettingsCreateDatabaseDefaultPermissionGetArgs... createDatabaseDefaultPermissions) {
            return createDatabaseDefaultPermissions(List.of(createDatabaseDefaultPermissions));
        }
        public Builder createTableDefaultPermissions(@Nullable Output<List<DataLakeSettingsCreateTableDefaultPermissionGetArgs>> createTableDefaultPermissions) {
            this.createTableDefaultPermissions = createTableDefaultPermissions;
            return this;
        }
        public Builder createTableDefaultPermissions(@Nullable List<DataLakeSettingsCreateTableDefaultPermissionGetArgs> createTableDefaultPermissions) {
            this.createTableDefaultPermissions = Codegen.ofNullable(createTableDefaultPermissions);
            return this;
        }
        public Builder createTableDefaultPermissions(DataLakeSettingsCreateTableDefaultPermissionGetArgs... createTableDefaultPermissions) {
            return createTableDefaultPermissions(List.of(createTableDefaultPermissions));
        }
        public Builder trustedResourceOwners(@Nullable Output<List<String>> trustedResourceOwners) {
            this.trustedResourceOwners = trustedResourceOwners;
            return this;
        }
        public Builder trustedResourceOwners(@Nullable List<String> trustedResourceOwners) {
            this.trustedResourceOwners = Codegen.ofNullable(trustedResourceOwners);
            return this;
        }
        public Builder trustedResourceOwners(String... trustedResourceOwners) {
            return trustedResourceOwners(List.of(trustedResourceOwners));
        }        public DataLakeSettingsState build() {
            return new DataLakeSettingsState(admins, catalogId, createDatabaseDefaultPermissions, createTableDefaultPermissions, trustedResourceOwners);
        }
    }
}
