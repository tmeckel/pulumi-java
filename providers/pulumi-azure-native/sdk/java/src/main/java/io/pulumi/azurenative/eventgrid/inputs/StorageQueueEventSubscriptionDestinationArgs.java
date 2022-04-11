// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about the storage queue destination for an event subscription.
 * 
 */
public final class StorageQueueEventSubscriptionDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageQueueEventSubscriptionDestinationArgs Empty = new StorageQueueEventSubscriptionDestinationArgs();

    /**
     * Type of the endpoint for the event subscription destination.
     * Expected value is 'StorageQueue'.
     * 
     */
    @Import(name="endpointType", required=true)
      private final Output<String> endpointType;

    public Output<String> getEndpointType() {
        return this.endpointType;
    }

    /**
     * The name of the Storage queue under a storage account that is the destination of an event subscription.
     * 
     */
    @Import(name="queueName")
      private final @Nullable Output<String> queueName;

    public Output<String> getQueueName() {
        return this.queueName == null ? Codegen.empty() : this.queueName;
    }

    /**
     * The Azure Resource ID of the storage account that contains the queue that is the destination of an event subscription.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId == null ? Codegen.empty() : this.resourceId;
    }

    public StorageQueueEventSubscriptionDestinationArgs(
        Output<String> endpointType,
        @Nullable Output<String> queueName,
        @Nullable Output<String> resourceId) {
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.queueName = queueName;
        this.resourceId = resourceId;
    }

    private StorageQueueEventSubscriptionDestinationArgs() {
        this.endpointType = Codegen.empty();
        this.queueName = Codegen.empty();
        this.resourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageQueueEventSubscriptionDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> endpointType;
        private @Nullable Output<String> queueName;
        private @Nullable Output<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageQueueEventSubscriptionDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.queueName = defaults.queueName;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder endpointType(Output<String> endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }
        public Builder endpointType(String endpointType) {
            this.endpointType = Output.of(Objects.requireNonNull(endpointType));
            return this;
        }
        public Builder queueName(@Nullable Output<String> queueName) {
            this.queueName = queueName;
            return this;
        }
        public Builder queueName(@Nullable String queueName) {
            this.queueName = Codegen.ofNullable(queueName);
            return this;
        }
        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Codegen.ofNullable(resourceId);
            return this;
        }        public StorageQueueEventSubscriptionDestinationArgs build() {
            return new StorageQueueEventSubscriptionDestinationArgs(endpointType, queueName, resourceId);
        }
    }
}
