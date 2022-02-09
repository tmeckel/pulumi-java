// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.inputs.ManagedInstancePrivateEndpointPropertyArgs;
import io.pulumi.azurenative.sql.inputs.ManagedInstancePrivateLinkServiceConnectionStatePropertyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedInstancePrivateEndpointConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedInstancePrivateEndpointConnectionArgs Empty = new ManagedInstancePrivateEndpointConnectionArgs();

    @InputImport(name="managedInstanceName", required=true)
    private final Input<String> managedInstanceName;

    public Input<String> getManagedInstanceName() {
        return this.managedInstanceName;
    }

    @InputImport(name="privateEndpoint")
    private final @Nullable Input<ManagedInstancePrivateEndpointPropertyArgs> privateEndpoint;

    public Input<ManagedInstancePrivateEndpointPropertyArgs> getPrivateEndpoint() {
        return this.privateEndpoint == null ? Input.empty() : this.privateEndpoint;
    }

    @InputImport(name="privateEndpointConnectionName")
    private final @Nullable Input<String> privateEndpointConnectionName;

    public Input<String> getPrivateEndpointConnectionName() {
        return this.privateEndpointConnectionName == null ? Input.empty() : this.privateEndpointConnectionName;
    }

    @InputImport(name="privateLinkServiceConnectionState")
    private final @Nullable Input<ManagedInstancePrivateLinkServiceConnectionStatePropertyArgs> privateLinkServiceConnectionState;

    public Input<ManagedInstancePrivateLinkServiceConnectionStatePropertyArgs> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Input.empty() : this.privateLinkServiceConnectionState;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ManagedInstancePrivateEndpointConnectionArgs(
        Input<String> managedInstanceName,
        @Nullable Input<ManagedInstancePrivateEndpointPropertyArgs> privateEndpoint,
        @Nullable Input<String> privateEndpointConnectionName,
        @Nullable Input<ManagedInstancePrivateLinkServiceConnectionStatePropertyArgs> privateLinkServiceConnectionState,
        Input<String> resourceGroupName) {
        this.managedInstanceName = Objects.requireNonNull(managedInstanceName, "expected parameter 'managedInstanceName' to be non-null");
        this.privateEndpoint = privateEndpoint;
        this.privateEndpointConnectionName = privateEndpointConnectionName;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ManagedInstancePrivateEndpointConnectionArgs() {
        this.managedInstanceName = Input.empty();
        this.privateEndpoint = Input.empty();
        this.privateEndpointConnectionName = Input.empty();
        this.privateLinkServiceConnectionState = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstancePrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> managedInstanceName;
        private @Nullable Input<ManagedInstancePrivateEndpointPropertyArgs> privateEndpoint;
        private @Nullable Input<String> privateEndpointConnectionName;
        private @Nullable Input<ManagedInstancePrivateLinkServiceConnectionStatePropertyArgs> privateLinkServiceConnectionState;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedInstancePrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedInstanceName = defaults.managedInstanceName;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setManagedInstanceName(Input<String> managedInstanceName) {
            this.managedInstanceName = Objects.requireNonNull(managedInstanceName);
            return this;
        }

        public Builder setManagedInstanceName(String managedInstanceName) {
            this.managedInstanceName = Input.of(Objects.requireNonNull(managedInstanceName));
            return this;
        }

        public Builder setPrivateEndpoint(@Nullable Input<ManagedInstancePrivateEndpointPropertyArgs> privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateEndpoint(@Nullable ManagedInstancePrivateEndpointPropertyArgs privateEndpoint) {
            this.privateEndpoint = Input.ofNullable(privateEndpoint);
            return this;
        }

        public Builder setPrivateEndpointConnectionName(@Nullable Input<String> privateEndpointConnectionName) {
            this.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        public Builder setPrivateEndpointConnectionName(@Nullable String privateEndpointConnectionName) {
            this.privateEndpointConnectionName = Input.ofNullable(privateEndpointConnectionName);
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable Input<ManagedInstancePrivateLinkServiceConnectionStatePropertyArgs> privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable ManagedInstancePrivateLinkServiceConnectionStatePropertyArgs privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Input.ofNullable(privateLinkServiceConnectionState);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public ManagedInstancePrivateEndpointConnectionArgs build() {
            return new ManagedInstancePrivateEndpointConnectionArgs(managedInstanceName, privateEndpoint, privateEndpointConnectionName, privateLinkServiceConnectionState, resourceGroupName);
        }
    }
}
