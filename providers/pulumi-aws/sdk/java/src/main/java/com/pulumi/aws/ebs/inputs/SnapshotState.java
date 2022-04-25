// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ebs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotState extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotState Empty = new SnapshotState();

    /**
     * Amazon Resource Name (ARN) of the EBS Snapshot.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the EBS Snapshot.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The data encryption key identifier for the snapshot.
     * 
     */
    @Import(name="dataEncryptionKeyId")
    private @Nullable Output<String> dataEncryptionKeyId;

    /**
     * @return The data encryption key identifier for the snapshot.
     * 
     */
    public Optional<Output<String>> dataEncryptionKeyId() {
        return Optional.ofNullable(this.dataEncryptionKeyId);
    }

    /**
     * A description of what the snapshot is.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of what the snapshot is.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether the snapshot is encrypted.
     * 
     */
    @Import(name="encrypted")
    private @Nullable Output<Boolean> encrypted;

    /**
     * @return Whether the snapshot is encrypted.
     * 
     */
    public Optional<Output<Boolean>> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }

    /**
     * The ARN for the KMS encryption key.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return The ARN for the KMS encryption key.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * The Amazon Resource Name (ARN) of the Outpost on which to create a local snapshot.
     * 
     */
    @Import(name="outpostArn")
    private @Nullable Output<String> outpostArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Outpost on which to create a local snapshot.
     * 
     */
    public Optional<Output<String>> outpostArn() {
        return Optional.ofNullable(this.outpostArn);
    }

    /**
     * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
     * 
     */
    @Import(name="ownerAlias")
    private @Nullable Output<String> ownerAlias;

    /**
     * @return Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
     * 
     */
    public Optional<Output<String>> ownerAlias() {
        return Optional.ofNullable(this.ownerAlias);
    }

    /**
     * The AWS account ID of the EBS snapshot owner.
     * 
     */
    @Import(name="ownerId")
    private @Nullable Output<String> ownerId;

    /**
     * @return The AWS account ID of the EBS snapshot owner.
     * 
     */
    public Optional<Output<String>> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }

    /**
     * Indicates whether to permanently restore an archived snapshot.
     * 
     */
    @Import(name="permanentRestore")
    private @Nullable Output<Boolean> permanentRestore;

    /**
     * @return Indicates whether to permanently restore an archived snapshot.
     * 
     */
    public Optional<Output<Boolean>> permanentRestore() {
        return Optional.ofNullable(this.permanentRestore);
    }

    /**
     * The name of the storage tier. Valid values are `archive` and `standard`. Default value is `standard`.
     * 
     */
    @Import(name="storageTier")
    private @Nullable Output<String> storageTier;

    /**
     * @return The name of the storage tier. Valid values are `archive` and `standard`. Default value is `standard`.
     * 
     */
    public Optional<Output<String>> storageTier() {
        return Optional.ofNullable(this.storageTier);
    }

    /**
     * A map of tags to assign to the snapshot. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the snapshot. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary restores only. The snapshot will be automatically re-archived after this period.
     * 
     */
    @Import(name="temporaryRestoreDays")
    private @Nullable Output<Integer> temporaryRestoreDays;

    /**
     * @return Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary restores only. The snapshot will be automatically re-archived after this period.
     * 
     */
    public Optional<Output<Integer>> temporaryRestoreDays() {
        return Optional.ofNullable(this.temporaryRestoreDays);
    }

    /**
     * The Volume ID of which to make a snapshot.
     * 
     */
    @Import(name="volumeId")
    private @Nullable Output<String> volumeId;

    /**
     * @return The Volume ID of which to make a snapshot.
     * 
     */
    public Optional<Output<String>> volumeId() {
        return Optional.ofNullable(this.volumeId);
    }

    /**
     * The size of the drive in GiBs.
     * 
     */
    @Import(name="volumeSize")
    private @Nullable Output<Integer> volumeSize;

    /**
     * @return The size of the drive in GiBs.
     * 
     */
    public Optional<Output<Integer>> volumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }

    private SnapshotState() {}

    private SnapshotState(SnapshotState $) {
        this.arn = $.arn;
        this.dataEncryptionKeyId = $.dataEncryptionKeyId;
        this.description = $.description;
        this.encrypted = $.encrypted;
        this.kmsKeyId = $.kmsKeyId;
        this.outpostArn = $.outpostArn;
        this.ownerAlias = $.ownerAlias;
        this.ownerId = $.ownerId;
        this.permanentRestore = $.permanentRestore;
        this.storageTier = $.storageTier;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.temporaryRestoreDays = $.temporaryRestoreDays;
        this.volumeId = $.volumeId;
        this.volumeSize = $.volumeSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotState $;

        public Builder() {
            $ = new SnapshotState();
        }

        public Builder(SnapshotState defaults) {
            $ = new SnapshotState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the EBS Snapshot.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the EBS Snapshot.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param dataEncryptionKeyId The data encryption key identifier for the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder dataEncryptionKeyId(@Nullable Output<String> dataEncryptionKeyId) {
            $.dataEncryptionKeyId = dataEncryptionKeyId;
            return this;
        }

        /**
         * @param dataEncryptionKeyId The data encryption key identifier for the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder dataEncryptionKeyId(String dataEncryptionKeyId) {
            return dataEncryptionKeyId(Output.of(dataEncryptionKeyId));
        }

        /**
         * @param description A description of what the snapshot is.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of what the snapshot is.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param encrypted Whether the snapshot is encrypted.
         * 
         * @return builder
         * 
         */
        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            $.encrypted = encrypted;
            return this;
        }

        /**
         * @param encrypted Whether the snapshot is encrypted.
         * 
         * @return builder
         * 
         */
        public Builder encrypted(Boolean encrypted) {
            return encrypted(Output.of(encrypted));
        }

        /**
         * @param kmsKeyId The ARN for the KMS encryption key.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId The ARN for the KMS encryption key.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param outpostArn The Amazon Resource Name (ARN) of the Outpost on which to create a local snapshot.
         * 
         * @return builder
         * 
         */
        public Builder outpostArn(@Nullable Output<String> outpostArn) {
            $.outpostArn = outpostArn;
            return this;
        }

        /**
         * @param outpostArn The Amazon Resource Name (ARN) of the Outpost on which to create a local snapshot.
         * 
         * @return builder
         * 
         */
        public Builder outpostArn(String outpostArn) {
            return outpostArn(Output.of(outpostArn));
        }

        /**
         * @param ownerAlias Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
         * 
         * @return builder
         * 
         */
        public Builder ownerAlias(@Nullable Output<String> ownerAlias) {
            $.ownerAlias = ownerAlias;
            return this;
        }

        /**
         * @param ownerAlias Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
         * 
         * @return builder
         * 
         */
        public Builder ownerAlias(String ownerAlias) {
            return ownerAlias(Output.of(ownerAlias));
        }

        /**
         * @param ownerId The AWS account ID of the EBS snapshot owner.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(@Nullable Output<String> ownerId) {
            $.ownerId = ownerId;
            return this;
        }

        /**
         * @param ownerId The AWS account ID of the EBS snapshot owner.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(String ownerId) {
            return ownerId(Output.of(ownerId));
        }

        /**
         * @param permanentRestore Indicates whether to permanently restore an archived snapshot.
         * 
         * @return builder
         * 
         */
        public Builder permanentRestore(@Nullable Output<Boolean> permanentRestore) {
            $.permanentRestore = permanentRestore;
            return this;
        }

        /**
         * @param permanentRestore Indicates whether to permanently restore an archived snapshot.
         * 
         * @return builder
         * 
         */
        public Builder permanentRestore(Boolean permanentRestore) {
            return permanentRestore(Output.of(permanentRestore));
        }

        /**
         * @param storageTier The name of the storage tier. Valid values are `archive` and `standard`. Default value is `standard`.
         * 
         * @return builder
         * 
         */
        public Builder storageTier(@Nullable Output<String> storageTier) {
            $.storageTier = storageTier;
            return this;
        }

        /**
         * @param storageTier The name of the storage tier. Valid values are `archive` and `standard`. Default value is `standard`.
         * 
         * @return builder
         * 
         */
        public Builder storageTier(String storageTier) {
            return storageTier(Output.of(storageTier));
        }

        /**
         * @param tags A map of tags to assign to the snapshot. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the snapshot. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param temporaryRestoreDays Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary restores only. The snapshot will be automatically re-archived after this period.
         * 
         * @return builder
         * 
         */
        public Builder temporaryRestoreDays(@Nullable Output<Integer> temporaryRestoreDays) {
            $.temporaryRestoreDays = temporaryRestoreDays;
            return this;
        }

        /**
         * @param temporaryRestoreDays Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary restores only. The snapshot will be automatically re-archived after this period.
         * 
         * @return builder
         * 
         */
        public Builder temporaryRestoreDays(Integer temporaryRestoreDays) {
            return temporaryRestoreDays(Output.of(temporaryRestoreDays));
        }

        /**
         * @param volumeId The Volume ID of which to make a snapshot.
         * 
         * @return builder
         * 
         */
        public Builder volumeId(@Nullable Output<String> volumeId) {
            $.volumeId = volumeId;
            return this;
        }

        /**
         * @param volumeId The Volume ID of which to make a snapshot.
         * 
         * @return builder
         * 
         */
        public Builder volumeId(String volumeId) {
            return volumeId(Output.of(volumeId));
        }

        /**
         * @param volumeSize The size of the drive in GiBs.
         * 
         * @return builder
         * 
         */
        public Builder volumeSize(@Nullable Output<Integer> volumeSize) {
            $.volumeSize = volumeSize;
            return this;
        }

        /**
         * @param volumeSize The size of the drive in GiBs.
         * 
         * @return builder
         * 
         */
        public Builder volumeSize(Integer volumeSize) {
            return volumeSize(Output.of(volumeSize));
        }

        public SnapshotState build() {
            return $;
        }
    }

}
