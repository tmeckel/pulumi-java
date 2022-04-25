// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.ec2.inputs.AmiFromInstanceEbsBlockDeviceArgs;
import com.pulumi.aws.ec2.inputs.AmiFromInstanceEphemeralBlockDeviceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AmiFromInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AmiFromInstanceArgs Empty = new AmiFromInstanceArgs();

    /**
     * A longer, human-readable description for the AMI.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A longer, human-readable description for the AMI.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Nested block describing an EBS block device that should be
     * attached to created instances. The structure of this block is described below.
     * 
     */
    @Import(name="ebsBlockDevices")
    private @Nullable Output<List<AmiFromInstanceEbsBlockDeviceArgs>> ebsBlockDevices;

    /**
     * @return Nested block describing an EBS block device that should be
     * attached to created instances. The structure of this block is described below.
     * 
     */
    public Optional<Output<List<AmiFromInstanceEbsBlockDeviceArgs>>> ebsBlockDevices() {
        return Optional.ofNullable(this.ebsBlockDevices);
    }

    /**
     * Nested block describing an ephemeral block device that
     * should be attached to created instances. The structure of this block is described below.
     * 
     */
    @Import(name="ephemeralBlockDevices")
    private @Nullable Output<List<AmiFromInstanceEphemeralBlockDeviceArgs>> ephemeralBlockDevices;

    /**
     * @return Nested block describing an ephemeral block device that
     * should be attached to created instances. The structure of this block is described below.
     * 
     */
    public Optional<Output<List<AmiFromInstanceEphemeralBlockDeviceArgs>>> ephemeralBlockDevices() {
        return Optional.ofNullable(this.ephemeralBlockDevices);
    }

    /**
     * A region-unique name for the AMI.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A region-unique name for the AMI.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Boolean that overrides the behavior of stopping
     * the instance before snapshotting. This is risky since it may cause a snapshot of an
     * inconsistent filesystem state, but can be used to avoid downtime if the user otherwise
     * guarantees that no filesystem writes will be underway at the time of snapshot.
     * 
     */
    @Import(name="snapshotWithoutReboot")
    private @Nullable Output<Boolean> snapshotWithoutReboot;

    /**
     * @return Boolean that overrides the behavior of stopping
     * the instance before snapshotting. This is risky since it may cause a snapshot of an
     * inconsistent filesystem state, but can be used to avoid downtime if the user otherwise
     * guarantees that no filesystem writes will be underway at the time of snapshot.
     * 
     */
    public Optional<Output<Boolean>> snapshotWithoutReboot() {
        return Optional.ofNullable(this.snapshotWithoutReboot);
    }

    /**
     * The id of the instance to use as the basis of the AMI.
     * 
     */
    @Import(name="sourceInstanceId", required=true)
    private Output<String> sourceInstanceId;

    /**
     * @return The id of the instance to use as the basis of the AMI.
     * 
     */
    public Output<String> sourceInstanceId() {
        return this.sourceInstanceId;
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

    private AmiFromInstanceArgs() {}

    private AmiFromInstanceArgs(AmiFromInstanceArgs $) {
        this.description = $.description;
        this.ebsBlockDevices = $.ebsBlockDevices;
        this.ephemeralBlockDevices = $.ephemeralBlockDevices;
        this.name = $.name;
        this.snapshotWithoutReboot = $.snapshotWithoutReboot;
        this.sourceInstanceId = $.sourceInstanceId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AmiFromInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AmiFromInstanceArgs $;

        public Builder() {
            $ = new AmiFromInstanceArgs();
        }

        public Builder(AmiFromInstanceArgs defaults) {
            $ = new AmiFromInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A longer, human-readable description for the AMI.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A longer, human-readable description for the AMI.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param ebsBlockDevices Nested block describing an EBS block device that should be
         * attached to created instances. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder ebsBlockDevices(@Nullable Output<List<AmiFromInstanceEbsBlockDeviceArgs>> ebsBlockDevices) {
            $.ebsBlockDevices = ebsBlockDevices;
            return this;
        }

        /**
         * @param ebsBlockDevices Nested block describing an EBS block device that should be
         * attached to created instances. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder ebsBlockDevices(List<AmiFromInstanceEbsBlockDeviceArgs> ebsBlockDevices) {
            return ebsBlockDevices(Output.of(ebsBlockDevices));
        }

        /**
         * @param ebsBlockDevices Nested block describing an EBS block device that should be
         * attached to created instances. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder ebsBlockDevices(AmiFromInstanceEbsBlockDeviceArgs... ebsBlockDevices) {
            return ebsBlockDevices(List.of(ebsBlockDevices));
        }

        /**
         * @param ephemeralBlockDevices Nested block describing an ephemeral block device that
         * should be attached to created instances. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder ephemeralBlockDevices(@Nullable Output<List<AmiFromInstanceEphemeralBlockDeviceArgs>> ephemeralBlockDevices) {
            $.ephemeralBlockDevices = ephemeralBlockDevices;
            return this;
        }

        /**
         * @param ephemeralBlockDevices Nested block describing an ephemeral block device that
         * should be attached to created instances. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder ephemeralBlockDevices(List<AmiFromInstanceEphemeralBlockDeviceArgs> ephemeralBlockDevices) {
            return ephemeralBlockDevices(Output.of(ephemeralBlockDevices));
        }

        /**
         * @param ephemeralBlockDevices Nested block describing an ephemeral block device that
         * should be attached to created instances. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder ephemeralBlockDevices(AmiFromInstanceEphemeralBlockDeviceArgs... ephemeralBlockDevices) {
            return ephemeralBlockDevices(List.of(ephemeralBlockDevices));
        }

        /**
         * @param name A region-unique name for the AMI.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A region-unique name for the AMI.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param snapshotWithoutReboot Boolean that overrides the behavior of stopping
         * the instance before snapshotting. This is risky since it may cause a snapshot of an
         * inconsistent filesystem state, but can be used to avoid downtime if the user otherwise
         * guarantees that no filesystem writes will be underway at the time of snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotWithoutReboot(@Nullable Output<Boolean> snapshotWithoutReboot) {
            $.snapshotWithoutReboot = snapshotWithoutReboot;
            return this;
        }

        /**
         * @param snapshotWithoutReboot Boolean that overrides the behavior of stopping
         * the instance before snapshotting. This is risky since it may cause a snapshot of an
         * inconsistent filesystem state, but can be used to avoid downtime if the user otherwise
         * guarantees that no filesystem writes will be underway at the time of snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotWithoutReboot(Boolean snapshotWithoutReboot) {
            return snapshotWithoutReboot(Output.of(snapshotWithoutReboot));
        }

        /**
         * @param sourceInstanceId The id of the instance to use as the basis of the AMI.
         * 
         * @return builder
         * 
         */
        public Builder sourceInstanceId(Output<String> sourceInstanceId) {
            $.sourceInstanceId = sourceInstanceId;
            return this;
        }

        /**
         * @param sourceInstanceId The id of the instance to use as the basis of the AMI.
         * 
         * @return builder
         * 
         */
        public Builder sourceInstanceId(String sourceInstanceId) {
            return sourceInstanceId(Output.of(sourceInstanceId));
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

        public AmiFromInstanceArgs build() {
            $.sourceInstanceId = Objects.requireNonNull($.sourceInstanceId, "expected parameter 'sourceInstanceId' to be non-null");
            return $;
        }
    }

}
