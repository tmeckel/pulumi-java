// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.codeguruprofiler;

import com.pulumi.awsnative.codeguruprofiler.enums.ProfilingGroupComputePlatform;
import com.pulumi.awsnative.codeguruprofiler.inputs.AgentPermissionsPropertiesArgs;
import com.pulumi.awsnative.codeguruprofiler.inputs.ProfilingGroupChannelArgs;
import com.pulumi.awsnative.codeguruprofiler.inputs.ProfilingGroupTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProfilingGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProfilingGroupArgs Empty = new ProfilingGroupArgs();

    /**
     * The agent permissions attached to this profiling group.
     * 
     */
    @Import(name="agentPermissions")
    private @Nullable Output<AgentPermissionsPropertiesArgs> agentPermissions;

    /**
     * @return The agent permissions attached to this profiling group.
     * 
     */
    public Optional<Output<AgentPermissionsPropertiesArgs>> agentPermissions() {
        return Optional.ofNullable(this.agentPermissions);
    }

    /**
     * Configuration for Notification Channels for Anomaly Detection feature in CodeGuru Profiler which enables customers to detect anomalies in the application profile for those methods that represent the highest proportion of CPU time or latency
     * 
     */
    @Import(name="anomalyDetectionNotificationConfiguration")
    private @Nullable Output<List<ProfilingGroupChannelArgs>> anomalyDetectionNotificationConfiguration;

    /**
     * @return Configuration for Notification Channels for Anomaly Detection feature in CodeGuru Profiler which enables customers to detect anomalies in the application profile for those methods that represent the highest proportion of CPU time or latency
     * 
     */
    public Optional<Output<List<ProfilingGroupChannelArgs>>> anomalyDetectionNotificationConfiguration() {
        return Optional.ofNullable(this.anomalyDetectionNotificationConfiguration);
    }

    /**
     * The compute platform of the profiling group.
     * 
     */
    @Import(name="computePlatform")
    private @Nullable Output<ProfilingGroupComputePlatform> computePlatform;

    /**
     * @return The compute platform of the profiling group.
     * 
     */
    public Optional<Output<ProfilingGroupComputePlatform>> computePlatform() {
        return Optional.ofNullable(this.computePlatform);
    }

    /**
     * The name of the profiling group.
     * 
     */
    @Import(name="profilingGroupName")
    private @Nullable Output<String> profilingGroupName;

    /**
     * @return The name of the profiling group.
     * 
     */
    public Optional<Output<String>> profilingGroupName() {
        return Optional.ofNullable(this.profilingGroupName);
    }

    /**
     * The tags associated with a profiling group.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ProfilingGroupTagArgs>> tags;

    /**
     * @return The tags associated with a profiling group.
     * 
     */
    public Optional<Output<List<ProfilingGroupTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ProfilingGroupArgs() {}

    private ProfilingGroupArgs(ProfilingGroupArgs $) {
        this.agentPermissions = $.agentPermissions;
        this.anomalyDetectionNotificationConfiguration = $.anomalyDetectionNotificationConfiguration;
        this.computePlatform = $.computePlatform;
        this.profilingGroupName = $.profilingGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProfilingGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProfilingGroupArgs $;

        public Builder() {
            $ = new ProfilingGroupArgs();
        }

        public Builder(ProfilingGroupArgs defaults) {
            $ = new ProfilingGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentPermissions The agent permissions attached to this profiling group.
         * 
         * @return builder
         * 
         */
        public Builder agentPermissions(@Nullable Output<AgentPermissionsPropertiesArgs> agentPermissions) {
            $.agentPermissions = agentPermissions;
            return this;
        }

        /**
         * @param agentPermissions The agent permissions attached to this profiling group.
         * 
         * @return builder
         * 
         */
        public Builder agentPermissions(AgentPermissionsPropertiesArgs agentPermissions) {
            return agentPermissions(Output.of(agentPermissions));
        }

        /**
         * @param anomalyDetectionNotificationConfiguration Configuration for Notification Channels for Anomaly Detection feature in CodeGuru Profiler which enables customers to detect anomalies in the application profile for those methods that represent the highest proportion of CPU time or latency
         * 
         * @return builder
         * 
         */
        public Builder anomalyDetectionNotificationConfiguration(@Nullable Output<List<ProfilingGroupChannelArgs>> anomalyDetectionNotificationConfiguration) {
            $.anomalyDetectionNotificationConfiguration = anomalyDetectionNotificationConfiguration;
            return this;
        }

        /**
         * @param anomalyDetectionNotificationConfiguration Configuration for Notification Channels for Anomaly Detection feature in CodeGuru Profiler which enables customers to detect anomalies in the application profile for those methods that represent the highest proportion of CPU time or latency
         * 
         * @return builder
         * 
         */
        public Builder anomalyDetectionNotificationConfiguration(List<ProfilingGroupChannelArgs> anomalyDetectionNotificationConfiguration) {
            return anomalyDetectionNotificationConfiguration(Output.of(anomalyDetectionNotificationConfiguration));
        }

        /**
         * @param anomalyDetectionNotificationConfiguration Configuration for Notification Channels for Anomaly Detection feature in CodeGuru Profiler which enables customers to detect anomalies in the application profile for those methods that represent the highest proportion of CPU time or latency
         * 
         * @return builder
         * 
         */
        public Builder anomalyDetectionNotificationConfiguration(ProfilingGroupChannelArgs... anomalyDetectionNotificationConfiguration) {
            return anomalyDetectionNotificationConfiguration(List.of(anomalyDetectionNotificationConfiguration));
        }

        /**
         * @param computePlatform The compute platform of the profiling group.
         * 
         * @return builder
         * 
         */
        public Builder computePlatform(@Nullable Output<ProfilingGroupComputePlatform> computePlatform) {
            $.computePlatform = computePlatform;
            return this;
        }

        /**
         * @param computePlatform The compute platform of the profiling group.
         * 
         * @return builder
         * 
         */
        public Builder computePlatform(ProfilingGroupComputePlatform computePlatform) {
            return computePlatform(Output.of(computePlatform));
        }

        /**
         * @param profilingGroupName The name of the profiling group.
         * 
         * @return builder
         * 
         */
        public Builder profilingGroupName(@Nullable Output<String> profilingGroupName) {
            $.profilingGroupName = profilingGroupName;
            return this;
        }

        /**
         * @param profilingGroupName The name of the profiling group.
         * 
         * @return builder
         * 
         */
        public Builder profilingGroupName(String profilingGroupName) {
            return profilingGroupName(Output.of(profilingGroupName));
        }

        /**
         * @param tags The tags associated with a profiling group.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<ProfilingGroupTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags associated with a profiling group.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<ProfilingGroupTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags associated with a profiling group.
         * 
         * @return builder
         * 
         */
        public Builder tags(ProfilingGroupTagArgs... tags) {
            return tags(List.of(tags));
        }

        public ProfilingGroupArgs build() {
            return $;
        }
    }

}
