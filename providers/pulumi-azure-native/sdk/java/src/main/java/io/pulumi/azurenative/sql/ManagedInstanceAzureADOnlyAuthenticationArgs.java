// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedInstanceAzureADOnlyAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedInstanceAzureADOnlyAuthenticationArgs Empty = new ManagedInstanceAzureADOnlyAuthenticationArgs();

    /**
     * The name of server azure active directory only authentication.
     * 
     */
    @Import(name="authenticationName")
      private final @Nullable Output<String> authenticationName;

    public Output<String> getAuthenticationName() {
        return this.authenticationName == null ? Codegen.empty() : this.authenticationName;
    }

    /**
     * Azure Active Directory only Authentication enabled.
     * 
     */
    @Import(name="azureADOnlyAuthentication", required=true)
      private final Output<Boolean> azureADOnlyAuthentication;

    public Output<Boolean> getAzureADOnlyAuthentication() {
        return this.azureADOnlyAuthentication;
    }

    /**
     * The name of the managed instance.
     * 
     */
    @Import(name="managedInstanceName", required=true)
      private final Output<String> managedInstanceName;

    public Output<String> getManagedInstanceName() {
        return this.managedInstanceName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ManagedInstanceAzureADOnlyAuthenticationArgs(
        @Nullable Output<String> authenticationName,
        Output<Boolean> azureADOnlyAuthentication,
        Output<String> managedInstanceName,
        Output<String> resourceGroupName) {
        this.authenticationName = authenticationName;
        this.azureADOnlyAuthentication = Objects.requireNonNull(azureADOnlyAuthentication, "expected parameter 'azureADOnlyAuthentication' to be non-null");
        this.managedInstanceName = Objects.requireNonNull(managedInstanceName, "expected parameter 'managedInstanceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ManagedInstanceAzureADOnlyAuthenticationArgs() {
        this.authenticationName = Codegen.empty();
        this.azureADOnlyAuthentication = Codegen.empty();
        this.managedInstanceName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstanceAzureADOnlyAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authenticationName;
        private Output<Boolean> azureADOnlyAuthentication;
        private Output<String> managedInstanceName;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedInstanceAzureADOnlyAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationName = defaults.authenticationName;
    	      this.azureADOnlyAuthentication = defaults.azureADOnlyAuthentication;
    	      this.managedInstanceName = defaults.managedInstanceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder authenticationName(@Nullable Output<String> authenticationName) {
            this.authenticationName = authenticationName;
            return this;
        }
        public Builder authenticationName(@Nullable String authenticationName) {
            this.authenticationName = Codegen.ofNullable(authenticationName);
            return this;
        }
        public Builder azureADOnlyAuthentication(Output<Boolean> azureADOnlyAuthentication) {
            this.azureADOnlyAuthentication = Objects.requireNonNull(azureADOnlyAuthentication);
            return this;
        }
        public Builder azureADOnlyAuthentication(Boolean azureADOnlyAuthentication) {
            this.azureADOnlyAuthentication = Output.of(Objects.requireNonNull(azureADOnlyAuthentication));
            return this;
        }
        public Builder managedInstanceName(Output<String> managedInstanceName) {
            this.managedInstanceName = Objects.requireNonNull(managedInstanceName);
            return this;
        }
        public Builder managedInstanceName(String managedInstanceName) {
            this.managedInstanceName = Output.of(Objects.requireNonNull(managedInstanceName));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public ManagedInstanceAzureADOnlyAuthenticationArgs build() {
            return new ManagedInstanceAzureADOnlyAuthenticationArgs(authenticationName, azureADOnlyAuthentication, managedInstanceName, resourceGroupName);
        }
    }
}
