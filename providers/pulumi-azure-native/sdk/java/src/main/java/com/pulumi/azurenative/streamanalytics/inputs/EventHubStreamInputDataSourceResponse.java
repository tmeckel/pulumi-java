// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes an Event Hub input data source that contains stream data.
 * 
 */
public final class EventHubStreamInputDataSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final EventHubStreamInputDataSourceResponse Empty = new EventHubStreamInputDataSourceResponse();

    /**
     * The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub. If not specified, the input uses the Event Hub’s default consumer group.
     * 
     */
    @Import(name="consumerGroupName")
    private @Nullable String consumerGroupName;

    /**
     * @return The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub. If not specified, the input uses the Event Hub’s default consumer group.
     * 
     */
    public Optional<String> consumerGroupName() {
        return Optional.ofNullable(this.consumerGroupName);
    }

    /**
     * The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="eventHubName")
    private @Nullable String eventHubName;

    /**
     * @return The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<String> eventHubName() {
        return Optional.ofNullable(this.eventHubName);
    }

    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="serviceBusNamespace")
    private @Nullable String serviceBusNamespace;

    /**
     * @return The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<String> serviceBusNamespace() {
        return Optional.ofNullable(this.serviceBusNamespace);
    }

    /**
     * The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="sharedAccessPolicyKey")
    private @Nullable String sharedAccessPolicyKey;

    /**
     * @return The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<String> sharedAccessPolicyKey() {
        return Optional.ofNullable(this.sharedAccessPolicyKey);
    }

    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="sharedAccessPolicyName")
    private @Nullable String sharedAccessPolicyName;

    /**
     * @return The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<String> sharedAccessPolicyName() {
        return Optional.ofNullable(this.sharedAccessPolicyName);
    }

    /**
     * Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Microsoft.ServiceBus/EventHub&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Microsoft.ServiceBus/EventHub&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private EventHubStreamInputDataSourceResponse() {}

    private EventHubStreamInputDataSourceResponse(EventHubStreamInputDataSourceResponse $) {
        this.consumerGroupName = $.consumerGroupName;
        this.eventHubName = $.eventHubName;
        this.serviceBusNamespace = $.serviceBusNamespace;
        this.sharedAccessPolicyKey = $.sharedAccessPolicyKey;
        this.sharedAccessPolicyName = $.sharedAccessPolicyName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventHubStreamInputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventHubStreamInputDataSourceResponse $;

        public Builder() {
            $ = new EventHubStreamInputDataSourceResponse();
        }

        public Builder(EventHubStreamInputDataSourceResponse defaults) {
            $ = new EventHubStreamInputDataSourceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param consumerGroupName The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub. If not specified, the input uses the Event Hub’s default consumer group.
         * 
         * @return builder
         * 
         */
        public Builder consumerGroupName(@Nullable String consumerGroupName) {
            $.consumerGroupName = consumerGroupName;
            return this;
        }

        /**
         * @param eventHubName The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder eventHubName(@Nullable String eventHubName) {
            $.eventHubName = eventHubName;
            return this;
        }

        /**
         * @param serviceBusNamespace The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusNamespace(@Nullable String serviceBusNamespace) {
            $.serviceBusNamespace = serviceBusNamespace;
            return this;
        }

        /**
         * @param sharedAccessPolicyKey The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessPolicyKey(@Nullable String sharedAccessPolicyKey) {
            $.sharedAccessPolicyKey = sharedAccessPolicyKey;
            return this;
        }

        /**
         * @param sharedAccessPolicyName The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessPolicyName(@Nullable String sharedAccessPolicyName) {
            $.sharedAccessPolicyName = sharedAccessPolicyName;
            return this;
        }

        /**
         * @param type Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
         * Expected value is &#39;Microsoft.ServiceBus/EventHub&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public EventHubStreamInputDataSourceResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
