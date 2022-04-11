// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FavoriteProcessArgs extends io.pulumi.resources.ResourceArgs {

    public static final FavoriteProcessArgs Empty = new FavoriteProcessArgs();

    /**
     * The actual name of the favorite process. It will be equal to resource name except for the scenario that the process name contains characters that are not allowed in the resource name.
     * 
     */
    @Import(name="actualProcessName", required=true)
      private final Output<String> actualProcessName;

    public Output<String> getActualProcessName() {
        return this.actualProcessName;
    }

    /**
     * The resource name of a favorite process in a package. If the process name contains characters that are not allowed in Azure Resource Name, we use 'actualProcessName' in request body to submit the name.
     * 
     */
    @Import(name="favoriteProcessResourceName")
      private final @Nullable Output<String> favoriteProcessResourceName;

    public Output<String> getFavoriteProcessResourceName() {
        return this.favoriteProcessResourceName == null ? Codegen.empty() : this.favoriteProcessResourceName;
    }

    /**
     * The resource name of the Test Base Package.
     * 
     */
    @Import(name="packageName", required=true)
      private final Output<String> packageName;

    public Output<String> getPackageName() {
        return this.packageName;
    }

    /**
     * The name of the resource group that contains the resource.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource name of the Test Base Account.
     * 
     */
    @Import(name="testBaseAccountName", required=true)
      private final Output<String> testBaseAccountName;

    public Output<String> getTestBaseAccountName() {
        return this.testBaseAccountName;
    }

    public FavoriteProcessArgs(
        Output<String> actualProcessName,
        @Nullable Output<String> favoriteProcessResourceName,
        Output<String> packageName,
        Output<String> resourceGroupName,
        Output<String> testBaseAccountName) {
        this.actualProcessName = Objects.requireNonNull(actualProcessName, "expected parameter 'actualProcessName' to be non-null");
        this.favoriteProcessResourceName = favoriteProcessResourceName;
        this.packageName = Objects.requireNonNull(packageName, "expected parameter 'packageName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.testBaseAccountName = Objects.requireNonNull(testBaseAccountName, "expected parameter 'testBaseAccountName' to be non-null");
    }

    private FavoriteProcessArgs() {
        this.actualProcessName = Codegen.empty();
        this.favoriteProcessResourceName = Codegen.empty();
        this.packageName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.testBaseAccountName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FavoriteProcessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> actualProcessName;
        private @Nullable Output<String> favoriteProcessResourceName;
        private Output<String> packageName;
        private Output<String> resourceGroupName;
        private Output<String> testBaseAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(FavoriteProcessArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actualProcessName = defaults.actualProcessName;
    	      this.favoriteProcessResourceName = defaults.favoriteProcessResourceName;
    	      this.packageName = defaults.packageName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.testBaseAccountName = defaults.testBaseAccountName;
        }

        public Builder actualProcessName(Output<String> actualProcessName) {
            this.actualProcessName = Objects.requireNonNull(actualProcessName);
            return this;
        }
        public Builder actualProcessName(String actualProcessName) {
            this.actualProcessName = Output.of(Objects.requireNonNull(actualProcessName));
            return this;
        }
        public Builder favoriteProcessResourceName(@Nullable Output<String> favoriteProcessResourceName) {
            this.favoriteProcessResourceName = favoriteProcessResourceName;
            return this;
        }
        public Builder favoriteProcessResourceName(@Nullable String favoriteProcessResourceName) {
            this.favoriteProcessResourceName = Codegen.ofNullable(favoriteProcessResourceName);
            return this;
        }
        public Builder packageName(Output<String> packageName) {
            this.packageName = Objects.requireNonNull(packageName);
            return this;
        }
        public Builder packageName(String packageName) {
            this.packageName = Output.of(Objects.requireNonNull(packageName));
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
        public Builder testBaseAccountName(Output<String> testBaseAccountName) {
            this.testBaseAccountName = Objects.requireNonNull(testBaseAccountName);
            return this;
        }
        public Builder testBaseAccountName(String testBaseAccountName) {
            this.testBaseAccountName = Output.of(Objects.requireNonNull(testBaseAccountName));
            return this;
        }        public FavoriteProcessArgs build() {
            return new FavoriteProcessArgs(actualProcessName, favoriteProcessResourceName, packageName, resourceGroupName, testBaseAccountName);
        }
    }
}
