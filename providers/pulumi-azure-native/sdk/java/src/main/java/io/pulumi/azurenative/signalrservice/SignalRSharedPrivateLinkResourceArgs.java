// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SignalRSharedPrivateLinkResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SignalRSharedPrivateLinkResourceArgs Empty = new SignalRSharedPrivateLinkResourceArgs();

    /**
     * The group id from the provider of resource the shared private link resource is for
     * 
     */
    @InputImport(name="groupId", required=true)
      private final Input<String> groupId;

    public Input<String> getGroupId() {
        return this.groupId;
    }

    /**
     * The resource id of the resource the shared private link resource is for
     * 
     */
    @InputImport(name="privateLinkResourceId", required=true)
      private final Input<String> privateLinkResourceId;

    public Input<String> getPrivateLinkResourceId() {
        return this.privateLinkResourceId;
    }

    /**
     * The request message for requesting approval of the shared private link resource
     * 
     */
    @InputImport(name="requestMessage")
      private final @Nullable Input<String> requestMessage;

    public Input<String> getRequestMessage() {
        return this.requestMessage == null ? Input.empty() : this.requestMessage;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource.
     * 
     */
    @InputImport(name="resourceName", required=true)
      private final Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName;
    }

    /**
     * The name of the shared private link resource
     * 
     */
    @InputImport(name="sharedPrivateLinkResourceName")
      private final @Nullable Input<String> sharedPrivateLinkResourceName;

    public Input<String> getSharedPrivateLinkResourceName() {
        return this.sharedPrivateLinkResourceName == null ? Input.empty() : this.sharedPrivateLinkResourceName;
    }

    public SignalRSharedPrivateLinkResourceArgs(
        Input<String> groupId,
        Input<String> privateLinkResourceId,
        @Nullable Input<String> requestMessage,
        Input<String> resourceGroupName,
        Input<String> resourceName,
        @Nullable Input<String> sharedPrivateLinkResourceName) {
        this.groupId = Objects.requireNonNull(groupId, "expected parameter 'groupId' to be non-null");
        this.privateLinkResourceId = Objects.requireNonNull(privateLinkResourceId, "expected parameter 'privateLinkResourceId' to be non-null");
        this.requestMessage = requestMessage;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.sharedPrivateLinkResourceName = sharedPrivateLinkResourceName;
    }

    private SignalRSharedPrivateLinkResourceArgs() {
        this.groupId = Input.empty();
        this.privateLinkResourceId = Input.empty();
        this.requestMessage = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
        this.sharedPrivateLinkResourceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SignalRSharedPrivateLinkResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> groupId;
        private Input<String> privateLinkResourceId;
        private @Nullable Input<String> requestMessage;
        private Input<String> resourceGroupName;
        private Input<String> resourceName;
        private @Nullable Input<String> sharedPrivateLinkResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(SignalRSharedPrivateLinkResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
    	      this.requestMessage = defaults.requestMessage;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.sharedPrivateLinkResourceName = defaults.sharedPrivateLinkResourceName;
        }

        public Builder groupId(Input<String> groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }

        public Builder groupId(String groupId) {
            this.groupId = Input.of(Objects.requireNonNull(groupId));
            return this;
        }

        public Builder privateLinkResourceId(Input<String> privateLinkResourceId) {
            this.privateLinkResourceId = Objects.requireNonNull(privateLinkResourceId);
            return this;
        }

        public Builder privateLinkResourceId(String privateLinkResourceId) {
            this.privateLinkResourceId = Input.of(Objects.requireNonNull(privateLinkResourceId));
            return this;
        }

        public Builder requestMessage(@Nullable Input<String> requestMessage) {
            this.requestMessage = requestMessage;
            return this;
        }

        public Builder requestMessage(@Nullable String requestMessage) {
            this.requestMessage = Input.ofNullable(requestMessage);
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

        public Builder resourceName(Input<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder resourceName(String resourceName) {
            this.resourceName = Input.of(Objects.requireNonNull(resourceName));
            return this;
        }

        public Builder sharedPrivateLinkResourceName(@Nullable Input<String> sharedPrivateLinkResourceName) {
            this.sharedPrivateLinkResourceName = sharedPrivateLinkResourceName;
            return this;
        }

        public Builder sharedPrivateLinkResourceName(@Nullable String sharedPrivateLinkResourceName) {
            this.sharedPrivateLinkResourceName = Input.ofNullable(sharedPrivateLinkResourceName);
            return this;
        }
        public SignalRSharedPrivateLinkResourceArgs build() {
            return new SignalRSharedPrivateLinkResourceArgs(groupId, privateLinkResourceId, requestMessage, resourceGroupName, resourceName, sharedPrivateLinkResourceName);
        }
    }
}
