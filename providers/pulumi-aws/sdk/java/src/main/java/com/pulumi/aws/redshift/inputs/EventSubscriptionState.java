// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventSubscriptionState extends com.pulumi.resources.ResourceArgs {

    public static final EventSubscriptionState Empty = new EventSubscriptionState();

    /**
     * Amazon Resource Name (ARN) of the Redshift event notification subscription
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Redshift event notification subscription
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The AWS customer account associated with the Redshift event notification subscription
     * 
     */
    @Import(name="customerAwsId")
    private @Nullable Output<String> customerAwsId;

    /**
     * @return The AWS customer account associated with the Redshift event notification subscription
     * 
     */
    public Optional<Output<String>> customerAwsId() {
        return Optional.ofNullable(this.customerAwsId);
    }

    /**
     * A boolean flag to enable/disable the subscription. Defaults to true.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return A boolean flag to enable/disable the subscription. Defaults to true.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * A list of event categories for a SourceType that you want to subscribe to. See https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html or run `aws redshift describe-event-categories`.
     * 
     */
    @Import(name="eventCategories")
    private @Nullable Output<List<String>> eventCategories;

    /**
     * @return A list of event categories for a SourceType that you want to subscribe to. See https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html or run `aws redshift describe-event-categories`.
     * 
     */
    public Optional<Output<List<String>>> eventCategories() {
        return Optional.ofNullable(this.eventCategories);
    }

    /**
     * The name of the Redshift event subscription.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Redshift event subscription.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The event severity to be published by the notification subscription. Valid options are `INFO` or `ERROR`.
     * 
     */
    @Import(name="severity")
    private @Nullable Output<String> severity;

    /**
     * @return The event severity to be published by the notification subscription. Valid options are `INFO` or `ERROR`.
     * 
     */
    public Optional<Output<String>> severity() {
        return Optional.ofNullable(this.severity);
    }

    /**
     * The ARN of the SNS topic to send events to.
     * 
     */
    @Import(name="snsTopicArn")
    private @Nullable Output<String> snsTopicArn;

    /**
     * @return The ARN of the SNS topic to send events to.
     * 
     */
    public Optional<Output<String>> snsTopicArn() {
        return Optional.ofNullable(this.snsTopicArn);
    }

    /**
     * A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a source_type must also be specified.
     * 
     */
    @Import(name="sourceIds")
    private @Nullable Output<List<String>> sourceIds;

    /**
     * @return A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a source_type must also be specified.
     * 
     */
    public Optional<Output<List<String>>> sourceIds() {
        return Optional.ofNullable(this.sourceIds);
    }

    /**
     * The type of source that will be generating the events. Valid options are `cluster`, `cluster-parameter-group`, `cluster-security-group`, or `cluster-snapshot`. If not set, all sources will be subscribed to.
     * 
     */
    @Import(name="sourceType")
    private @Nullable Output<String> sourceType;

    /**
     * @return The type of source that will be generating the events. Valid options are `cluster`, `cluster-parameter-group`, `cluster-security-group`, or `cluster-snapshot`. If not set, all sources will be subscribed to.
     * 
     */
    public Optional<Output<String>> sourceType() {
        return Optional.ofNullable(this.sourceType);
    }

    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private EventSubscriptionState() {}

    private EventSubscriptionState(EventSubscriptionState $) {
        this.arn = $.arn;
        this.customerAwsId = $.customerAwsId;
        this.enabled = $.enabled;
        this.eventCategories = $.eventCategories;
        this.name = $.name;
        this.severity = $.severity;
        this.snsTopicArn = $.snsTopicArn;
        this.sourceIds = $.sourceIds;
        this.sourceType = $.sourceType;
        this.status = $.status;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventSubscriptionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventSubscriptionState $;

        public Builder() {
            $ = new EventSubscriptionState();
        }

        public Builder(EventSubscriptionState defaults) {
            $ = new EventSubscriptionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the Redshift event notification subscription
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the Redshift event notification subscription
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param customerAwsId The AWS customer account associated with the Redshift event notification subscription
         * 
         * @return builder
         * 
         */
        public Builder customerAwsId(@Nullable Output<String> customerAwsId) {
            $.customerAwsId = customerAwsId;
            return this;
        }

        /**
         * @param customerAwsId The AWS customer account associated with the Redshift event notification subscription
         * 
         * @return builder
         * 
         */
        public Builder customerAwsId(String customerAwsId) {
            return customerAwsId(Output.of(customerAwsId));
        }

        /**
         * @param enabled A boolean flag to enable/disable the subscription. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled A boolean flag to enable/disable the subscription. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param eventCategories A list of event categories for a SourceType that you want to subscribe to. See https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html or run `aws redshift describe-event-categories`.
         * 
         * @return builder
         * 
         */
        public Builder eventCategories(@Nullable Output<List<String>> eventCategories) {
            $.eventCategories = eventCategories;
            return this;
        }

        /**
         * @param eventCategories A list of event categories for a SourceType that you want to subscribe to. See https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html or run `aws redshift describe-event-categories`.
         * 
         * @return builder
         * 
         */
        public Builder eventCategories(List<String> eventCategories) {
            return eventCategories(Output.of(eventCategories));
        }

        /**
         * @param eventCategories A list of event categories for a SourceType that you want to subscribe to. See https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html or run `aws redshift describe-event-categories`.
         * 
         * @return builder
         * 
         */
        public Builder eventCategories(String... eventCategories) {
            return eventCategories(List.of(eventCategories));
        }

        /**
         * @param name The name of the Redshift event subscription.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Redshift event subscription.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param severity The event severity to be published by the notification subscription. Valid options are `INFO` or `ERROR`.
         * 
         * @return builder
         * 
         */
        public Builder severity(@Nullable Output<String> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity The event severity to be published by the notification subscription. Valid options are `INFO` or `ERROR`.
         * 
         * @return builder
         * 
         */
        public Builder severity(String severity) {
            return severity(Output.of(severity));
        }

        /**
         * @param snsTopicArn The ARN of the SNS topic to send events to.
         * 
         * @return builder
         * 
         */
        public Builder snsTopicArn(@Nullable Output<String> snsTopicArn) {
            $.snsTopicArn = snsTopicArn;
            return this;
        }

        /**
         * @param snsTopicArn The ARN of the SNS topic to send events to.
         * 
         * @return builder
         * 
         */
        public Builder snsTopicArn(String snsTopicArn) {
            return snsTopicArn(Output.of(snsTopicArn));
        }

        /**
         * @param sourceIds A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a source_type must also be specified.
         * 
         * @return builder
         * 
         */
        public Builder sourceIds(@Nullable Output<List<String>> sourceIds) {
            $.sourceIds = sourceIds;
            return this;
        }

        /**
         * @param sourceIds A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a source_type must also be specified.
         * 
         * @return builder
         * 
         */
        public Builder sourceIds(List<String> sourceIds) {
            return sourceIds(Output.of(sourceIds));
        }

        /**
         * @param sourceIds A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a source_type must also be specified.
         * 
         * @return builder
         * 
         */
        public Builder sourceIds(String... sourceIds) {
            return sourceIds(List.of(sourceIds));
        }

        /**
         * @param sourceType The type of source that will be generating the events. Valid options are `cluster`, `cluster-parameter-group`, `cluster-security-group`, or `cluster-snapshot`. If not set, all sources will be subscribed to.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(@Nullable Output<String> sourceType) {
            $.sourceType = sourceType;
            return this;
        }

        /**
         * @param sourceType The type of source that will be generating the events. Valid options are `cluster`, `cluster-parameter-group`, `cluster-security-group`, or `cluster-snapshot`. If not set, all sources will be subscribed to.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(String sourceType) {
            return sourceType(Output.of(sourceType));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public EventSubscriptionState build() {
            return $;
        }
    }

}
