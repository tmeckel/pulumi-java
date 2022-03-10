// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus;

import io.pulumi.azurenative.servicebus.enums.EntityStatus;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicArgs Empty = new TopicArgs();

    /**
     * ISO 8601 timespan idle interval after which the topic is automatically deleted. The minimum duration is 5 minutes.
     * 
     */
    @InputImport(name="autoDeleteOnIdle")
      private final @Nullable Input<String> autoDeleteOnIdle;

    public Input<String> getAutoDeleteOnIdle() {
        return this.autoDeleteOnIdle == null ? Input.empty() : this.autoDeleteOnIdle;
    }

    /**
     * ISO 8601 Default message timespan to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself.
     * 
     */
    @InputImport(name="defaultMessageTimeToLive")
      private final @Nullable Input<String> defaultMessageTimeToLive;

    public Input<String> getDefaultMessageTimeToLive() {
        return this.defaultMessageTimeToLive == null ? Input.empty() : this.defaultMessageTimeToLive;
    }

    /**
     * ISO8601 timespan structure that defines the duration of the duplicate detection history. The default value is 10 minutes.
     * 
     */
    @InputImport(name="duplicateDetectionHistoryTimeWindow")
      private final @Nullable Input<String> duplicateDetectionHistoryTimeWindow;

    public Input<String> getDuplicateDetectionHistoryTimeWindow() {
        return this.duplicateDetectionHistoryTimeWindow == null ? Input.empty() : this.duplicateDetectionHistoryTimeWindow;
    }

    /**
     * Value that indicates whether server-side batched operations are enabled.
     * 
     */
    @InputImport(name="enableBatchedOperations")
      private final @Nullable Input<Boolean> enableBatchedOperations;

    public Input<Boolean> getEnableBatchedOperations() {
        return this.enableBatchedOperations == null ? Input.empty() : this.enableBatchedOperations;
    }

    /**
     * Value that indicates whether Express Entities are enabled. An express topic holds a message in memory temporarily before writing it to persistent storage.
     * 
     */
    @InputImport(name="enableExpress")
      private final @Nullable Input<Boolean> enableExpress;

    public Input<Boolean> getEnableExpress() {
        return this.enableExpress == null ? Input.empty() : this.enableExpress;
    }

    /**
     * Value that indicates whether the topic to be partitioned across multiple message brokers is enabled.
     * 
     */
    @InputImport(name="enablePartitioning")
      private final @Nullable Input<Boolean> enablePartitioning;

    public Input<Boolean> getEnablePartitioning() {
        return this.enablePartitioning == null ? Input.empty() : this.enablePartitioning;
    }

    /**
     * Maximum size of the topic in megabytes, which is the size of the memory allocated for the topic. Default is 1024.
     * 
     */
    @InputImport(name="maxSizeInMegabytes")
      private final @Nullable Input<Integer> maxSizeInMegabytes;

    public Input<Integer> getMaxSizeInMegabytes() {
        return this.maxSizeInMegabytes == null ? Input.empty() : this.maxSizeInMegabytes;
    }

    /**
     * The namespace name
     * 
     */
    @InputImport(name="namespaceName", required=true)
      private final Input<String> namespaceName;

    public Input<String> getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Value indicating if this topic requires duplicate detection.
     * 
     */
    @InputImport(name="requiresDuplicateDetection")
      private final @Nullable Input<Boolean> requiresDuplicateDetection;

    public Input<Boolean> getRequiresDuplicateDetection() {
        return this.requiresDuplicateDetection == null ? Input.empty() : this.requiresDuplicateDetection;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Enumerates the possible values for the status of a messaging entity.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<EntityStatus> status;

    public Input<EntityStatus> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * Value that indicates whether the topic supports ordering.
     * 
     */
    @InputImport(name="supportOrdering")
      private final @Nullable Input<Boolean> supportOrdering;

    public Input<Boolean> getSupportOrdering() {
        return this.supportOrdering == null ? Input.empty() : this.supportOrdering;
    }

    /**
     * The topic name.
     * 
     */
    @InputImport(name="topicName")
      private final @Nullable Input<String> topicName;

    public Input<String> getTopicName() {
        return this.topicName == null ? Input.empty() : this.topicName;
    }

    public TopicArgs(
        @Nullable Input<String> autoDeleteOnIdle,
        @Nullable Input<String> defaultMessageTimeToLive,
        @Nullable Input<String> duplicateDetectionHistoryTimeWindow,
        @Nullable Input<Boolean> enableBatchedOperations,
        @Nullable Input<Boolean> enableExpress,
        @Nullable Input<Boolean> enablePartitioning,
        @Nullable Input<Integer> maxSizeInMegabytes,
        Input<String> namespaceName,
        @Nullable Input<Boolean> requiresDuplicateDetection,
        Input<String> resourceGroupName,
        @Nullable Input<EntityStatus> status,
        @Nullable Input<Boolean> supportOrdering,
        @Nullable Input<String> topicName) {
        this.autoDeleteOnIdle = autoDeleteOnIdle;
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
        this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
        this.enableBatchedOperations = enableBatchedOperations;
        this.enableExpress = enableExpress;
        this.enablePartitioning = enablePartitioning;
        this.maxSizeInMegabytes = maxSizeInMegabytes;
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.requiresDuplicateDetection = requiresDuplicateDetection;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.status = status;
        this.supportOrdering = supportOrdering;
        this.topicName = topicName;
    }

    private TopicArgs() {
        this.autoDeleteOnIdle = Input.empty();
        this.defaultMessageTimeToLive = Input.empty();
        this.duplicateDetectionHistoryTimeWindow = Input.empty();
        this.enableBatchedOperations = Input.empty();
        this.enableExpress = Input.empty();
        this.enablePartitioning = Input.empty();
        this.maxSizeInMegabytes = Input.empty();
        this.namespaceName = Input.empty();
        this.requiresDuplicateDetection = Input.empty();
        this.resourceGroupName = Input.empty();
        this.status = Input.empty();
        this.supportOrdering = Input.empty();
        this.topicName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> autoDeleteOnIdle;
        private @Nullable Input<String> defaultMessageTimeToLive;
        private @Nullable Input<String> duplicateDetectionHistoryTimeWindow;
        private @Nullable Input<Boolean> enableBatchedOperations;
        private @Nullable Input<Boolean> enableExpress;
        private @Nullable Input<Boolean> enablePartitioning;
        private @Nullable Input<Integer> maxSizeInMegabytes;
        private Input<String> namespaceName;
        private @Nullable Input<Boolean> requiresDuplicateDetection;
        private Input<String> resourceGroupName;
        private @Nullable Input<EntityStatus> status;
        private @Nullable Input<Boolean> supportOrdering;
        private @Nullable Input<String> topicName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDeleteOnIdle = defaults.autoDeleteOnIdle;
    	      this.defaultMessageTimeToLive = defaults.defaultMessageTimeToLive;
    	      this.duplicateDetectionHistoryTimeWindow = defaults.duplicateDetectionHistoryTimeWindow;
    	      this.enableBatchedOperations = defaults.enableBatchedOperations;
    	      this.enableExpress = defaults.enableExpress;
    	      this.enablePartitioning = defaults.enablePartitioning;
    	      this.maxSizeInMegabytes = defaults.maxSizeInMegabytes;
    	      this.namespaceName = defaults.namespaceName;
    	      this.requiresDuplicateDetection = defaults.requiresDuplicateDetection;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.status = defaults.status;
    	      this.supportOrdering = defaults.supportOrdering;
    	      this.topicName = defaults.topicName;
        }

        public Builder autoDeleteOnIdle(@Nullable Input<String> autoDeleteOnIdle) {
            this.autoDeleteOnIdle = autoDeleteOnIdle;
            return this;
        }

        public Builder autoDeleteOnIdle(@Nullable String autoDeleteOnIdle) {
            this.autoDeleteOnIdle = Input.ofNullable(autoDeleteOnIdle);
            return this;
        }

        public Builder defaultMessageTimeToLive(@Nullable Input<String> defaultMessageTimeToLive) {
            this.defaultMessageTimeToLive = defaultMessageTimeToLive;
            return this;
        }

        public Builder defaultMessageTimeToLive(@Nullable String defaultMessageTimeToLive) {
            this.defaultMessageTimeToLive = Input.ofNullable(defaultMessageTimeToLive);
            return this;
        }

        public Builder duplicateDetectionHistoryTimeWindow(@Nullable Input<String> duplicateDetectionHistoryTimeWindow) {
            this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
            return this;
        }

        public Builder duplicateDetectionHistoryTimeWindow(@Nullable String duplicateDetectionHistoryTimeWindow) {
            this.duplicateDetectionHistoryTimeWindow = Input.ofNullable(duplicateDetectionHistoryTimeWindow);
            return this;
        }

        public Builder enableBatchedOperations(@Nullable Input<Boolean> enableBatchedOperations) {
            this.enableBatchedOperations = enableBatchedOperations;
            return this;
        }

        public Builder enableBatchedOperations(@Nullable Boolean enableBatchedOperations) {
            this.enableBatchedOperations = Input.ofNullable(enableBatchedOperations);
            return this;
        }

        public Builder enableExpress(@Nullable Input<Boolean> enableExpress) {
            this.enableExpress = enableExpress;
            return this;
        }

        public Builder enableExpress(@Nullable Boolean enableExpress) {
            this.enableExpress = Input.ofNullable(enableExpress);
            return this;
        }

        public Builder enablePartitioning(@Nullable Input<Boolean> enablePartitioning) {
            this.enablePartitioning = enablePartitioning;
            return this;
        }

        public Builder enablePartitioning(@Nullable Boolean enablePartitioning) {
            this.enablePartitioning = Input.ofNullable(enablePartitioning);
            return this;
        }

        public Builder maxSizeInMegabytes(@Nullable Input<Integer> maxSizeInMegabytes) {
            this.maxSizeInMegabytes = maxSizeInMegabytes;
            return this;
        }

        public Builder maxSizeInMegabytes(@Nullable Integer maxSizeInMegabytes) {
            this.maxSizeInMegabytes = Input.ofNullable(maxSizeInMegabytes);
            return this;
        }

        public Builder namespaceName(Input<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Input.of(Objects.requireNonNull(namespaceName));
            return this;
        }

        public Builder requiresDuplicateDetection(@Nullable Input<Boolean> requiresDuplicateDetection) {
            this.requiresDuplicateDetection = requiresDuplicateDetection;
            return this;
        }

        public Builder requiresDuplicateDetection(@Nullable Boolean requiresDuplicateDetection) {
            this.requiresDuplicateDetection = Input.ofNullable(requiresDuplicateDetection);
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

        public Builder status(@Nullable Input<EntityStatus> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable EntityStatus status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder supportOrdering(@Nullable Input<Boolean> supportOrdering) {
            this.supportOrdering = supportOrdering;
            return this;
        }

        public Builder supportOrdering(@Nullable Boolean supportOrdering) {
            this.supportOrdering = Input.ofNullable(supportOrdering);
            return this;
        }

        public Builder topicName(@Nullable Input<String> topicName) {
            this.topicName = topicName;
            return this;
        }

        public Builder topicName(@Nullable String topicName) {
            this.topicName = Input.ofNullable(topicName);
            return this;
        }
        public TopicArgs build() {
            return new TopicArgs(autoDeleteOnIdle, defaultMessageTimeToLive, duplicateDetectionHistoryTimeWindow, enableBatchedOperations, enableExpress, enablePartitioning, maxSizeInMegabytes, namespaceName, requiresDuplicateDetection, resourceGroupName, status, supportOrdering, topicName);
        }
    }
}
