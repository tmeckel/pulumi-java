// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyRetentionPolicyGetArgs;
import io.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleGetArgs;
import io.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicySnapshotPropertiesGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourcePolicySnapshotSchedulePolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicySnapshotSchedulePolicyGetArgs Empty = new ResourcePolicySnapshotSchedulePolicyGetArgs();

    /**
     * Retention policy applied to snapshots created by this resource policy.
     * Structure is documented below.
     * 
     */
    @Import(name="retentionPolicy")
      private final @Nullable Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyGetArgs> retentionPolicy;

    public Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyGetArgs> getRetentionPolicy() {
        return this.retentionPolicy == null ? Codegen.empty() : this.retentionPolicy;
    }

    /**
     * Specifies the frequency for the operation, using the unix-cron format.
     * 
     */
    @Import(name="schedule", required=true)
      private final Output<ResourcePolicySnapshotSchedulePolicyScheduleGetArgs> schedule;

    public Output<ResourcePolicySnapshotSchedulePolicyScheduleGetArgs> getSchedule() {
        return this.schedule;
    }

    /**
     * Properties with which the snapshots are created, such as labels.
     * Structure is documented below.
     * 
     */
    @Import(name="snapshotProperties")
      private final @Nullable Output<ResourcePolicySnapshotSchedulePolicySnapshotPropertiesGetArgs> snapshotProperties;

    public Output<ResourcePolicySnapshotSchedulePolicySnapshotPropertiesGetArgs> getSnapshotProperties() {
        return this.snapshotProperties == null ? Codegen.empty() : this.snapshotProperties;
    }

    public ResourcePolicySnapshotSchedulePolicyGetArgs(
        @Nullable Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyGetArgs> retentionPolicy,
        Output<ResourcePolicySnapshotSchedulePolicyScheduleGetArgs> schedule,
        @Nullable Output<ResourcePolicySnapshotSchedulePolicySnapshotPropertiesGetArgs> snapshotProperties) {
        this.retentionPolicy = retentionPolicy;
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
        this.snapshotProperties = snapshotProperties;
    }

    private ResourcePolicySnapshotSchedulePolicyGetArgs() {
        this.retentionPolicy = Codegen.empty();
        this.schedule = Codegen.empty();
        this.snapshotProperties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyGetArgs> retentionPolicy;
        private Output<ResourcePolicySnapshotSchedulePolicyScheduleGetArgs> schedule;
        private @Nullable Output<ResourcePolicySnapshotSchedulePolicySnapshotPropertiesGetArgs> snapshotProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.schedule = defaults.schedule;
    	      this.snapshotProperties = defaults.snapshotProperties;
        }

        public Builder retentionPolicy(@Nullable Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyGetArgs> retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }
        public Builder retentionPolicy(@Nullable ResourcePolicySnapshotSchedulePolicyRetentionPolicyGetArgs retentionPolicy) {
            this.retentionPolicy = Codegen.ofNullable(retentionPolicy);
            return this;
        }
        public Builder schedule(Output<ResourcePolicySnapshotSchedulePolicyScheduleGetArgs> schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public Builder schedule(ResourcePolicySnapshotSchedulePolicyScheduleGetArgs schedule) {
            this.schedule = Output.of(Objects.requireNonNull(schedule));
            return this;
        }
        public Builder snapshotProperties(@Nullable Output<ResourcePolicySnapshotSchedulePolicySnapshotPropertiesGetArgs> snapshotProperties) {
            this.snapshotProperties = snapshotProperties;
            return this;
        }
        public Builder snapshotProperties(@Nullable ResourcePolicySnapshotSchedulePolicySnapshotPropertiesGetArgs snapshotProperties) {
            this.snapshotProperties = Codegen.ofNullable(snapshotProperties);
            return this;
        }        public ResourcePolicySnapshotSchedulePolicyGetArgs build() {
            return new ResourcePolicySnapshotSchedulePolicyGetArgs(retentionPolicy, schedule, snapshotProperties);
        }
    }
}
