// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse;
import com.pulumi.googlenative.compute_alpha.inputs.ResourcePolicySnapshotSchedulePolicyScheduleResponse;
import com.pulumi.googlenative.compute_alpha.inputs.ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse;
import java.util.Objects;


/**
 * A snapshot schedule policy specifies when and how frequently snapshots are to be created for the target disk. Also specifies how many and how long these scheduled snapshots should be retained.
 * 
 */
public final class ResourcePolicySnapshotSchedulePolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourcePolicySnapshotSchedulePolicyResponse Empty = new ResourcePolicySnapshotSchedulePolicyResponse();

    /**
     * Retention policy applied to snapshots created by this resource policy.
     * 
     */
    @Import(name="retentionPolicy", required=true)
    private ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse retentionPolicy;

    /**
     * @return Retention policy applied to snapshots created by this resource policy.
     * 
     */
    public ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * A Vm Maintenance Policy specifies what kind of infrastructure maintenance we are allowed to perform on this VM and when. Schedule that is applied to disks covered by this policy.
     * 
     */
    @Import(name="schedule", required=true)
    private ResourcePolicySnapshotSchedulePolicyScheduleResponse schedule;

    /**
     * @return A Vm Maintenance Policy specifies what kind of infrastructure maintenance we are allowed to perform on this VM and when. Schedule that is applied to disks covered by this policy.
     * 
     */
    public ResourcePolicySnapshotSchedulePolicyScheduleResponse schedule() {
        return this.schedule;
    }

    /**
     * Properties with which snapshots are created such as labels, encryption keys.
     * 
     */
    @Import(name="snapshotProperties", required=true)
    private ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse snapshotProperties;

    /**
     * @return Properties with which snapshots are created such as labels, encryption keys.
     * 
     */
    public ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse snapshotProperties() {
        return this.snapshotProperties;
    }

    private ResourcePolicySnapshotSchedulePolicyResponse() {}

    private ResourcePolicySnapshotSchedulePolicyResponse(ResourcePolicySnapshotSchedulePolicyResponse $) {
        this.retentionPolicy = $.retentionPolicy;
        this.schedule = $.schedule;
        this.snapshotProperties = $.snapshotProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicySnapshotSchedulePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicySnapshotSchedulePolicyResponse $;

        public Builder() {
            $ = new ResourcePolicySnapshotSchedulePolicyResponse();
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyResponse defaults) {
            $ = new ResourcePolicySnapshotSchedulePolicyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param retentionPolicy Retention policy applied to snapshots created by this resource policy.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse retentionPolicy) {
            $.retentionPolicy = retentionPolicy;
            return this;
        }

        /**
         * @param schedule A Vm Maintenance Policy specifies what kind of infrastructure maintenance we are allowed to perform on this VM and when. Schedule that is applied to disks covered by this policy.
         * 
         * @return builder
         * 
         */
        public Builder schedule(ResourcePolicySnapshotSchedulePolicyScheduleResponse schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param snapshotProperties Properties with which snapshots are created such as labels, encryption keys.
         * 
         * @return builder
         * 
         */
        public Builder snapshotProperties(ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse snapshotProperties) {
            $.snapshotProperties = snapshotProperties;
            return this;
        }

        public ResourcePolicySnapshotSchedulePolicyResponse build() {
            $.retentionPolicy = Objects.requireNonNull($.retentionPolicy, "expected parameter 'retentionPolicy' to be non-null");
            $.schedule = Objects.requireNonNull($.schedule, "expected parameter 'schedule' to be non-null");
            $.snapshotProperties = Objects.requireNonNull($.snapshotProperties, "expected parameter 'snapshotProperties' to be non-null");
            return $;
        }
    }

}
