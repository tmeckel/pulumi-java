// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources;

import com.pulumi.azurenative.resources.enums.ScriptType;
import com.pulumi.azurenative.resources.inputs.ManagedServiceIdentityArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentScriptArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentScriptArgs Empty = new DeploymentScriptArgs();

    /**
     * Optional property. Managed identity to be used for this deployment script. Currently, only user-assigned MSI is supported.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ManagedServiceIdentityArgs> identity;

    /**
     * @return Optional property. Managed identity to be used for this deployment script. Currently, only user-assigned MSI is supported.
     * 
     */
    public Optional<Output<ManagedServiceIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Type of the script.
     * 
     */
    @Import(name="kind", required=true)
    private Output<Either<String,ScriptType>> kind;

    /**
     * @return Type of the script.
     * 
     */
    public Output<Either<String,ScriptType>> kind() {
        return this.kind;
    }

    /**
     * The location of the ACI and the storage account for the deployment script.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the ACI and the storage account for the deployment script.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the deployment script.
     * 
     */
    @Import(name="scriptName")
    private @Nullable Output<String> scriptName;

    /**
     * @return Name of the deployment script.
     * 
     */
    public Optional<Output<String>> scriptName() {
        return Optional.ofNullable(this.scriptName);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DeploymentScriptArgs() {}

    private DeploymentScriptArgs(DeploymentScriptArgs $) {
        this.identity = $.identity;
        this.kind = $.kind;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.scriptName = $.scriptName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentScriptArgs $;

        public Builder() {
            $ = new DeploymentScriptArgs();
        }

        public Builder(DeploymentScriptArgs defaults) {
            $ = new DeploymentScriptArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identity Optional property. Managed identity to be used for this deployment script. Currently, only user-assigned MSI is supported.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<ManagedServiceIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity Optional property. Managed identity to be used for this deployment script. Currently, only user-assigned MSI is supported.
         * 
         * @return builder
         * 
         */
        public Builder identity(ManagedServiceIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param kind Type of the script.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<Either<String,ScriptType>> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Type of the script.
         * 
         * @return builder
         * 
         */
        public Builder kind(Either<String,ScriptType> kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param kind Type of the script.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Either.ofLeft(kind));
        }

        /**
         * @param kind Type of the script.
         * 
         * @return builder
         * 
         */
        public Builder kind(ScriptType kind) {
            return kind(Either.ofRight(kind));
        }

        /**
         * @param location The location of the ACI and the storage account for the deployment script.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the ACI and the storage account for the deployment script.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param scriptName Name of the deployment script.
         * 
         * @return builder
         * 
         */
        public Builder scriptName(@Nullable Output<String> scriptName) {
            $.scriptName = scriptName;
            return this;
        }

        /**
         * @param scriptName Name of the deployment script.
         * 
         * @return builder
         * 
         */
        public Builder scriptName(String scriptName) {
            return scriptName(Output.of(scriptName));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public DeploymentScriptArgs build() {
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
