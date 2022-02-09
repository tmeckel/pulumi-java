// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPartnerTopicEventSubscriptionFullUrlArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPartnerTopicEventSubscriptionFullUrlArgs Empty = new GetPartnerTopicEventSubscriptionFullUrlArgs();

    @InputImport(name="eventSubscriptionName", required=true)
    private final String eventSubscriptionName;

    public String getEventSubscriptionName() {
        return this.eventSubscriptionName;
    }

    @InputImport(name="partnerTopicName", required=true)
    private final String partnerTopicName;

    public String getPartnerTopicName() {
        return this.partnerTopicName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetPartnerTopicEventSubscriptionFullUrlArgs(
        String eventSubscriptionName,
        String partnerTopicName,
        String resourceGroupName) {
        this.eventSubscriptionName = Objects.requireNonNull(eventSubscriptionName, "expected parameter 'eventSubscriptionName' to be non-null");
        this.partnerTopicName = Objects.requireNonNull(partnerTopicName, "expected parameter 'partnerTopicName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetPartnerTopicEventSubscriptionFullUrlArgs() {
        this.eventSubscriptionName = null;
        this.partnerTopicName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPartnerTopicEventSubscriptionFullUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eventSubscriptionName;
        private String partnerTopicName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPartnerTopicEventSubscriptionFullUrlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventSubscriptionName = defaults.eventSubscriptionName;
    	      this.partnerTopicName = defaults.partnerTopicName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setEventSubscriptionName(String eventSubscriptionName) {
            this.eventSubscriptionName = Objects.requireNonNull(eventSubscriptionName);
            return this;
        }

        public Builder setPartnerTopicName(String partnerTopicName) {
            this.partnerTopicName = Objects.requireNonNull(partnerTopicName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetPartnerTopicEventSubscriptionFullUrlArgs build() {
            return new GetPartnerTopicEventSubscriptionFullUrlArgs(eventSubscriptionName, partnerTopicName, resourceGroupName);
        }
    }
}
