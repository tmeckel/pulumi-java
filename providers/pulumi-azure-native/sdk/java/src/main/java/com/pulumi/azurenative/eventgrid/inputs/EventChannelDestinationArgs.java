// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the destination of an event channel.
 * 
 */
public final class EventChannelDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventChannelDestinationArgs Empty = new EventChannelDestinationArgs();

    /**
     * Azure subscription ID of the customer creating the event channel. The partner topic
     * associated with the event channel will be created under this Azure subscription.
     * 
     */
    @Import(name="azureSubscriptionId")
    private @Nullable Output<String> azureSubscriptionId;

    /**
     * @return Azure subscription ID of the customer creating the event channel. The partner topic
     * associated with the event channel will be created under this Azure subscription.
     * 
     */
    public Optional<Output<String>> azureSubscriptionId() {
        return Optional.ofNullable(this.azureSubscriptionId);
    }

    /**
     * Name of the partner topic associated with the event channel.
     * 
     */
    @Import(name="partnerTopicName")
    private @Nullable Output<String> partnerTopicName;

    /**
     * @return Name of the partner topic associated with the event channel.
     * 
     */
    public Optional<Output<String>> partnerTopicName() {
        return Optional.ofNullable(this.partnerTopicName);
    }

    /**
     * Azure Resource Group of the customer creating the event channel. The partner topic
     * associated with the event channel will be created under this resource group.
     * 
     */
    @Import(name="resourceGroup")
    private @Nullable Output<String> resourceGroup;

    /**
     * @return Azure Resource Group of the customer creating the event channel. The partner topic
     * associated with the event channel will be created under this resource group.
     * 
     */
    public Optional<Output<String>> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }

    private EventChannelDestinationArgs() {}

    private EventChannelDestinationArgs(EventChannelDestinationArgs $) {
        this.azureSubscriptionId = $.azureSubscriptionId;
        this.partnerTopicName = $.partnerTopicName;
        this.resourceGroup = $.resourceGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventChannelDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventChannelDestinationArgs $;

        public Builder() {
            $ = new EventChannelDestinationArgs();
        }

        public Builder(EventChannelDestinationArgs defaults) {
            $ = new EventChannelDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureSubscriptionId Azure subscription ID of the customer creating the event channel. The partner topic
         * associated with the event channel will be created under this Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder azureSubscriptionId(@Nullable Output<String> azureSubscriptionId) {
            $.azureSubscriptionId = azureSubscriptionId;
            return this;
        }

        /**
         * @param azureSubscriptionId Azure subscription ID of the customer creating the event channel. The partner topic
         * associated with the event channel will be created under this Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder azureSubscriptionId(String azureSubscriptionId) {
            return azureSubscriptionId(Output.of(azureSubscriptionId));
        }

        /**
         * @param partnerTopicName Name of the partner topic associated with the event channel.
         * 
         * @return builder
         * 
         */
        public Builder partnerTopicName(@Nullable Output<String> partnerTopicName) {
            $.partnerTopicName = partnerTopicName;
            return this;
        }

        /**
         * @param partnerTopicName Name of the partner topic associated with the event channel.
         * 
         * @return builder
         * 
         */
        public Builder partnerTopicName(String partnerTopicName) {
            return partnerTopicName(Output.of(partnerTopicName));
        }

        /**
         * @param resourceGroup Azure Resource Group of the customer creating the event channel. The partner topic
         * associated with the event channel will be created under this resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(@Nullable Output<String> resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * @param resourceGroup Azure Resource Group of the customer creating the event channel. The partner topic
         * associated with the event channel will be created under this resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(String resourceGroup) {
            return resourceGroup(Output.of(resourceGroup));
        }

        public EventChannelDestinationArgs build() {
            return $;
        }
    }

}
