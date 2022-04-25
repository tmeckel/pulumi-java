// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudtrail.inputs;

import com.pulumi.awsnative.cloudtrail.enums.TrailEventSelectorReadWriteType;
import com.pulumi.awsnative.cloudtrail.inputs.TrailDataResource;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The type of email sending events to publish to the event destination.
 * 
 */
public final class TrailEventSelector extends com.pulumi.resources.InvokeArgs {

    public static final TrailEventSelector Empty = new TrailEventSelector();

    @Import(name="dataResources")
    private @Nullable List<TrailDataResource> dataResources;

    public Optional<List<TrailDataResource>> dataResources() {
        return Optional.ofNullable(this.dataResources);
    }

    /**
     * An optional list of service event sources from which you do not want management events to be logged on your trail. In this release, the list can be empty (disables the filter), or it can filter out AWS Key Management Service events by containing &#34;kms.amazonaws.com&#34;. By default, ExcludeManagementEventSources is empty, and AWS KMS events are included in events that are logged to your trail.
     * 
     */
    @Import(name="excludeManagementEventSources")
    private @Nullable List<String> excludeManagementEventSources;

    /**
     * @return An optional list of service event sources from which you do not want management events to be logged on your trail. In this release, the list can be empty (disables the filter), or it can filter out AWS Key Management Service events by containing &#34;kms.amazonaws.com&#34;. By default, ExcludeManagementEventSources is empty, and AWS KMS events are included in events that are logged to your trail.
     * 
     */
    public Optional<List<String>> excludeManagementEventSources() {
        return Optional.ofNullable(this.excludeManagementEventSources);
    }

    /**
     * Specify if you want your event selector to include management events for your trail.
     * 
     */
    @Import(name="includeManagementEvents")
    private @Nullable Boolean includeManagementEvents;

    /**
     * @return Specify if you want your event selector to include management events for your trail.
     * 
     */
    public Optional<Boolean> includeManagementEvents() {
        return Optional.ofNullable(this.includeManagementEvents);
    }

    /**
     * Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2 GetConsoleOutput is a read-only API operation and RunInstances is a write-only API operation.
     * 
     */
    @Import(name="readWriteType")
    private @Nullable TrailEventSelectorReadWriteType readWriteType;

    /**
     * @return Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2 GetConsoleOutput is a read-only API operation and RunInstances is a write-only API operation.
     * 
     */
    public Optional<TrailEventSelectorReadWriteType> readWriteType() {
        return Optional.ofNullable(this.readWriteType);
    }

    private TrailEventSelector() {}

    private TrailEventSelector(TrailEventSelector $) {
        this.dataResources = $.dataResources;
        this.excludeManagementEventSources = $.excludeManagementEventSources;
        this.includeManagementEvents = $.includeManagementEvents;
        this.readWriteType = $.readWriteType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrailEventSelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrailEventSelector $;

        public Builder() {
            $ = new TrailEventSelector();
        }

        public Builder(TrailEventSelector defaults) {
            $ = new TrailEventSelector(Objects.requireNonNull(defaults));
        }

        public Builder dataResources(@Nullable List<TrailDataResource> dataResources) {
            $.dataResources = dataResources;
            return this;
        }

        public Builder dataResources(TrailDataResource... dataResources) {
            return dataResources(List.of(dataResources));
        }

        /**
         * @param excludeManagementEventSources An optional list of service event sources from which you do not want management events to be logged on your trail. In this release, the list can be empty (disables the filter), or it can filter out AWS Key Management Service events by containing &#34;kms.amazonaws.com&#34;. By default, ExcludeManagementEventSources is empty, and AWS KMS events are included in events that are logged to your trail.
         * 
         * @return builder
         * 
         */
        public Builder excludeManagementEventSources(@Nullable List<String> excludeManagementEventSources) {
            $.excludeManagementEventSources = excludeManagementEventSources;
            return this;
        }

        /**
         * @param excludeManagementEventSources An optional list of service event sources from which you do not want management events to be logged on your trail. In this release, the list can be empty (disables the filter), or it can filter out AWS Key Management Service events by containing &#34;kms.amazonaws.com&#34;. By default, ExcludeManagementEventSources is empty, and AWS KMS events are included in events that are logged to your trail.
         * 
         * @return builder
         * 
         */
        public Builder excludeManagementEventSources(String... excludeManagementEventSources) {
            return excludeManagementEventSources(List.of(excludeManagementEventSources));
        }

        /**
         * @param includeManagementEvents Specify if you want your event selector to include management events for your trail.
         * 
         * @return builder
         * 
         */
        public Builder includeManagementEvents(@Nullable Boolean includeManagementEvents) {
            $.includeManagementEvents = includeManagementEvents;
            return this;
        }

        /**
         * @param readWriteType Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2 GetConsoleOutput is a read-only API operation and RunInstances is a write-only API operation.
         * 
         * @return builder
         * 
         */
        public Builder readWriteType(@Nullable TrailEventSelectorReadWriteType readWriteType) {
            $.readWriteType = readWriteType;
            return this;
        }

        public TrailEventSelector build() {
            return $;
        }
    }

}
