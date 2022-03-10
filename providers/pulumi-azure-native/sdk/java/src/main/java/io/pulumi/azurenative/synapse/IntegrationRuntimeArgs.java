// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.synapse.inputs.ManagedIntegrationRuntimeArgs;
import io.pulumi.azurenative.synapse.inputs.SelfHostedIntegrationRuntimeArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationRuntimeArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationRuntimeArgs Empty = new IntegrationRuntimeArgs();

    /**
     * Integration runtime name
     * 
     */
    @InputImport(name="integrationRuntimeName")
      private final @Nullable Input<String> integrationRuntimeName;

    public Input<String> getIntegrationRuntimeName() {
        return this.integrationRuntimeName == null ? Input.empty() : this.integrationRuntimeName;
    }

    /**
     * Integration runtime properties.
     * 
     */
    @InputImport(name="properties", required=true)
      private final Input<Either<ManagedIntegrationRuntimeArgs,SelfHostedIntegrationRuntimeArgs>> properties;

    public Input<Either<ManagedIntegrationRuntimeArgs,SelfHostedIntegrationRuntimeArgs>> getProperties() {
        return this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public IntegrationRuntimeArgs(
        @Nullable Input<String> integrationRuntimeName,
        Input<Either<ManagedIntegrationRuntimeArgs,SelfHostedIntegrationRuntimeArgs>> properties,
        Input<String> resourceGroupName,
        Input<String> workspaceName) {
        this.integrationRuntimeName = integrationRuntimeName;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private IntegrationRuntimeArgs() {
        this.integrationRuntimeName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> integrationRuntimeName;
        private Input<Either<ManagedIntegrationRuntimeArgs,SelfHostedIntegrationRuntimeArgs>> properties;
        private Input<String> resourceGroupName;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.integrationRuntimeName = defaults.integrationRuntimeName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder integrationRuntimeName(@Nullable Input<String> integrationRuntimeName) {
            this.integrationRuntimeName = integrationRuntimeName;
            return this;
        }

        public Builder integrationRuntimeName(@Nullable String integrationRuntimeName) {
            this.integrationRuntimeName = Input.ofNullable(integrationRuntimeName);
            return this;
        }

        public Builder properties(Input<Either<ManagedIntegrationRuntimeArgs,SelfHostedIntegrationRuntimeArgs>> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder properties(Either<ManagedIntegrationRuntimeArgs,SelfHostedIntegrationRuntimeArgs> properties) {
            this.properties = Input.of(Objects.requireNonNull(properties));
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder workspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }
        public IntegrationRuntimeArgs build() {
            return new IntegrationRuntimeArgs(integrationRuntimeName, properties, resourceGroupName, workspaceName);
        }
    }
}
