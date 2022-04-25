// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListTopicSharedAccessKeysArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListTopicSharedAccessKeysArgs Empty = new ListTopicSharedAccessKeysArgs();

    /**
     * The name of the resource group within the user&#39;s subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the topic.
     * 
     */
    @Import(name="topicName", required=true)
    private String topicName;

    /**
     * @return Name of the topic.
     * 
     */
    public String topicName() {
        return this.topicName;
    }

    private ListTopicSharedAccessKeysArgs() {}

    private ListTopicSharedAccessKeysArgs(ListTopicSharedAccessKeysArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.topicName = $.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListTopicSharedAccessKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListTopicSharedAccessKeysArgs $;

        public Builder() {
            $ = new ListTopicSharedAccessKeysArgs();
        }

        public Builder(ListTopicSharedAccessKeysArgs defaults) {
            $ = new ListTopicSharedAccessKeysArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param topicName Name of the topic.
         * 
         * @return builder
         * 
         */
        public Builder topicName(String topicName) {
            $.topicName = topicName;
            return this;
        }

        public ListTopicSharedAccessKeysArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.topicName = Objects.requireNonNull($.topicName, "expected parameter 'topicName' to be non-null");
            return $;
        }
    }

}
