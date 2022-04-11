// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataLakeSettingsCreateTableDefaultPermissionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataLakeSettingsCreateTableDefaultPermissionArgs Empty = new DataLakeSettingsCreateTableDefaultPermissionArgs();

    /**
     * List of permissions that are granted to the principal. Valid values may include `ALL`, `SELECT`, `ALTER`, `DROP`, `DELETE`, `INSERT`, and `DESCRIBE`. For more details, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
     */
    @Import(name="permissions")
      private final @Nullable Output<List<String>> permissions;

    public Output<List<String>> getPermissions() {
        return this.permissions == null ? Codegen.empty() : this.permissions;
    }

    /**
     * Principal who is granted permissions. To enforce metadata and underlying data access control only by IAM on new databases and tables set `principal` to `IAM_ALLOWED_PRINCIPALS` and `permissions` to `["ALL"]`.
     * 
     */
    @Import(name="principal")
      private final @Nullable Output<String> principal;

    public Output<String> getPrincipal() {
        return this.principal == null ? Codegen.empty() : this.principal;
    }

    public DataLakeSettingsCreateTableDefaultPermissionArgs(
        @Nullable Output<List<String>> permissions,
        @Nullable Output<String> principal) {
        this.permissions = permissions;
        this.principal = principal;
    }

    private DataLakeSettingsCreateTableDefaultPermissionArgs() {
        this.permissions = Codegen.empty();
        this.principal = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataLakeSettingsCreateTableDefaultPermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> permissions;
        private @Nullable Output<String> principal;

        public Builder() {
    	      // Empty
        }

        public Builder(DataLakeSettingsCreateTableDefaultPermissionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissions = defaults.permissions;
    	      this.principal = defaults.principal;
        }

        public Builder permissions(@Nullable Output<List<String>> permissions) {
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(@Nullable List<String> permissions) {
            this.permissions = Codegen.ofNullable(permissions);
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }
        public Builder principal(@Nullable Output<String> principal) {
            this.principal = principal;
            return this;
        }
        public Builder principal(@Nullable String principal) {
            this.principal = Codegen.ofNullable(principal);
            return this;
        }        public DataLakeSettingsCreateTableDefaultPermissionArgs build() {
            return new DataLakeSettingsCreateTableDefaultPermissionArgs(permissions, principal);
        }
    }
}
