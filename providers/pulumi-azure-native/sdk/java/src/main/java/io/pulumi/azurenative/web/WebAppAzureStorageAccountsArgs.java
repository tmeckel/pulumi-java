// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.inputs.AzureStorageInfoValueArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppAzureStorageAccountsArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppAzureStorageAccountsArgs Empty = new WebAppAzureStorageAccountsArgs();

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Azure storage accounts.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,AzureStorageInfoValueArgs>> properties;

    public Output<Map<String,AzureStorageInfoValueArgs>> getProperties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public WebAppAzureStorageAccountsArgs(
        @Nullable Output<String> kind,
        Output<String> name,
        @Nullable Output<Map<String,AzureStorageInfoValueArgs>> properties,
        Output<String> resourceGroupName) {
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private WebAppAzureStorageAccountsArgs() {
        this.kind = Codegen.empty();
        this.name = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppAzureStorageAccountsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kind;
        private Output<String> name;
        private @Nullable Output<Map<String,AzureStorageInfoValueArgs>> properties;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppAzureStorageAccountsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder properties(@Nullable Output<Map<String,AzureStorageInfoValueArgs>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Map<String,AzureStorageInfoValueArgs> properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public WebAppAzureStorageAccountsArgs build() {
            return new WebAppAzureStorageAccountsArgs(kind, name, properties, resourceGroupName);
        }
    }
}
