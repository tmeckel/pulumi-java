// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsublite_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.pubsublite_v1.inputs.PartitionConfigArgs;
import com.pulumi.googlenative.pubsublite_v1.inputs.ReservationConfigArgs;
import com.pulumi.googlenative.pubsublite_v1.inputs.RetentionConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicArgs Empty = new TopicArgs();

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the topic. Structured like: projects/{project_number}/locations/{location}/topics/{topic_id}
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the topic. Structured like: projects/{project_number}/locations/{location}/topics/{topic_id}
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The settings for this topic&#39;s partitions.
     * 
     */
    @Import(name="partitionConfig")
    private @Nullable Output<PartitionConfigArgs> partitionConfig;

    /**
     * @return The settings for this topic&#39;s partitions.
     * 
     */
    public Optional<Output<PartitionConfigArgs>> partitionConfig() {
        return Optional.ofNullable(this.partitionConfig);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The settings for this topic&#39;s Reservation usage.
     * 
     */
    @Import(name="reservationConfig")
    private @Nullable Output<ReservationConfigArgs> reservationConfig;

    /**
     * @return The settings for this topic&#39;s Reservation usage.
     * 
     */
    public Optional<Output<ReservationConfigArgs>> reservationConfig() {
        return Optional.ofNullable(this.reservationConfig);
    }

    /**
     * The settings for this topic&#39;s message retention.
     * 
     */
    @Import(name="retentionConfig")
    private @Nullable Output<RetentionConfigArgs> retentionConfig;

    /**
     * @return The settings for this topic&#39;s message retention.
     * 
     */
    public Optional<Output<RetentionConfigArgs>> retentionConfig() {
        return Optional.ofNullable(this.retentionConfig);
    }

    @Import(name="topicId", required=true)
    private Output<String> topicId;

    public Output<String> topicId() {
        return this.topicId;
    }

    private TopicArgs() {}

    private TopicArgs(TopicArgs $) {
        this.location = $.location;
        this.name = $.name;
        this.partitionConfig = $.partitionConfig;
        this.project = $.project;
        this.reservationConfig = $.reservationConfig;
        this.retentionConfig = $.retentionConfig;
        this.topicId = $.topicId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicArgs $;

        public Builder() {
            $ = new TopicArgs();
        }

        public Builder(TopicArgs defaults) {
            $ = new TopicArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the topic. Structured like: projects/{project_number}/locations/{location}/topics/{topic_id}
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the topic. Structured like: projects/{project_number}/locations/{location}/topics/{topic_id}
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param partitionConfig The settings for this topic&#39;s partitions.
         * 
         * @return builder
         * 
         */
        public Builder partitionConfig(@Nullable Output<PartitionConfigArgs> partitionConfig) {
            $.partitionConfig = partitionConfig;
            return this;
        }

        /**
         * @param partitionConfig The settings for this topic&#39;s partitions.
         * 
         * @return builder
         * 
         */
        public Builder partitionConfig(PartitionConfigArgs partitionConfig) {
            return partitionConfig(Output.of(partitionConfig));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param reservationConfig The settings for this topic&#39;s Reservation usage.
         * 
         * @return builder
         * 
         */
        public Builder reservationConfig(@Nullable Output<ReservationConfigArgs> reservationConfig) {
            $.reservationConfig = reservationConfig;
            return this;
        }

        /**
         * @param reservationConfig The settings for this topic&#39;s Reservation usage.
         * 
         * @return builder
         * 
         */
        public Builder reservationConfig(ReservationConfigArgs reservationConfig) {
            return reservationConfig(Output.of(reservationConfig));
        }

        /**
         * @param retentionConfig The settings for this topic&#39;s message retention.
         * 
         * @return builder
         * 
         */
        public Builder retentionConfig(@Nullable Output<RetentionConfigArgs> retentionConfig) {
            $.retentionConfig = retentionConfig;
            return this;
        }

        /**
         * @param retentionConfig The settings for this topic&#39;s message retention.
         * 
         * @return builder
         * 
         */
        public Builder retentionConfig(RetentionConfigArgs retentionConfig) {
            return retentionConfig(Output.of(retentionConfig));
        }

        public Builder topicId(Output<String> topicId) {
            $.topicId = topicId;
            return this;
        }

        public Builder topicId(String topicId) {
            return topicId(Output.of(topicId));
        }

        public TopicArgs build() {
            $.topicId = Objects.requireNonNull($.topicId, "expected parameter 'topicId' to be non-null");
            return $;
        }
    }

}
