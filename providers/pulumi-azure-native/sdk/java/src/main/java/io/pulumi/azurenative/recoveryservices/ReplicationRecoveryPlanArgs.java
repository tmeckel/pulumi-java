// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.recoveryservices.inputs.CreateRecoveryPlanInputPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReplicationRecoveryPlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationRecoveryPlanArgs Empty = new ReplicationRecoveryPlanArgs();

    /**
     * Recovery plan creation properties.
     * 
     */
    @Import(name="properties", required=true)
      private final Output<CreateRecoveryPlanInputPropertiesArgs> properties;

    public Output<CreateRecoveryPlanInputPropertiesArgs> getProperties() {
        return this.properties;
    }

    /**
     * Recovery plan name.
     * 
     */
    @Import(name="recoveryPlanName")
      private final @Nullable Output<String> recoveryPlanName;

    public Output<String> getRecoveryPlanName() {
        return this.recoveryPlanName == null ? Codegen.empty() : this.recoveryPlanName;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="resourceName", required=true)
      private final Output<String> resourceName;

    public Output<String> getPropResourceName() {
        return this.resourceName;
    }

    public ReplicationRecoveryPlanArgs(
        Output<CreateRecoveryPlanInputPropertiesArgs> properties,
        @Nullable Output<String> recoveryPlanName,
        Output<String> resourceGroupName,
        Output<String> resourceName) {
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.recoveryPlanName = recoveryPlanName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private ReplicationRecoveryPlanArgs() {
        this.properties = Codegen.empty();
        this.recoveryPlanName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.resourceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationRecoveryPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<CreateRecoveryPlanInputPropertiesArgs> properties;
        private @Nullable Output<String> recoveryPlanName;
        private Output<String> resourceGroupName;
        private Output<String> resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationRecoveryPlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.recoveryPlanName = defaults.recoveryPlanName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder properties(Output<CreateRecoveryPlanInputPropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder properties(CreateRecoveryPlanInputPropertiesArgs properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
            return this;
        }
        public Builder recoveryPlanName(@Nullable Output<String> recoveryPlanName) {
            this.recoveryPlanName = recoveryPlanName;
            return this;
        }
        public Builder recoveryPlanName(@Nullable String recoveryPlanName) {
            this.recoveryPlanName = Codegen.ofNullable(recoveryPlanName);
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
        public Builder resourceName(Output<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Output.of(Objects.requireNonNull(resourceName));
            return this;
        }        public ReplicationRecoveryPlanArgs build() {
            return new ReplicationRecoveryPlanArgs(properties, recoveryPlanName, resourceGroupName, resourceName);
        }
    }
}
