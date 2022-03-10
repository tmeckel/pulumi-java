// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsublite_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.pubsublite_v1.outputs.PartitionConfigResponse;
import io.pulumi.googlenative.pubsublite_v1.outputs.ReservationConfigResponse;
import io.pulumi.googlenative.pubsublite_v1.outputs.RetentionConfigResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetTopicResult {
    /**
     * The name of the topic. Structured like: projects/{project_number}/locations/{location}/topics/{topic_id}
     * 
     */
    private final String name;
    /**
     * The settings for this topic's partitions.
     * 
     */
    private final PartitionConfigResponse partitionConfig;
    /**
     * The settings for this topic's Reservation usage.
     * 
     */
    private final ReservationConfigResponse reservationConfig;
    /**
     * The settings for this topic's message retention.
     * 
     */
    private final RetentionConfigResponse retentionConfig;

    @OutputCustomType.Constructor
    private GetTopicResult(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("partitionConfig") PartitionConfigResponse partitionConfig,
        @OutputCustomType.Parameter("reservationConfig") ReservationConfigResponse reservationConfig,
        @OutputCustomType.Parameter("retentionConfig") RetentionConfigResponse retentionConfig) {
        this.name = name;
        this.partitionConfig = partitionConfig;
        this.reservationConfig = reservationConfig;
        this.retentionConfig = retentionConfig;
    }

    /**
     * The name of the topic. Structured like: projects/{project_number}/locations/{location}/topics/{topic_id}
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The settings for this topic's partitions.
     * 
    */
    public PartitionConfigResponse getPartitionConfig() {
        return this.partitionConfig;
    }
    /**
     * The settings for this topic's Reservation usage.
     * 
    */
    public ReservationConfigResponse getReservationConfig() {
        return this.reservationConfig;
    }
    /**
     * The settings for this topic's message retention.
     * 
    */
    public RetentionConfigResponse getRetentionConfig() {
        return this.retentionConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopicResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private PartitionConfigResponse partitionConfig;
        private ReservationConfigResponse reservationConfig;
        private RetentionConfigResponse retentionConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTopicResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.partitionConfig = defaults.partitionConfig;
    	      this.reservationConfig = defaults.reservationConfig;
    	      this.retentionConfig = defaults.retentionConfig;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder partitionConfig(PartitionConfigResponse partitionConfig) {
            this.partitionConfig = Objects.requireNonNull(partitionConfig);
            return this;
        }

        public Builder reservationConfig(ReservationConfigResponse reservationConfig) {
            this.reservationConfig = Objects.requireNonNull(reservationConfig);
            return this;
        }

        public Builder retentionConfig(RetentionConfigResponse retentionConfig) {
            this.retentionConfig = Objects.requireNonNull(retentionConfig);
            return this;
        }
        public GetTopicResult build() {
            return new GetTopicResult(name, partitionConfig, reservationConfig, retentionConfig);
        }
    }
}
