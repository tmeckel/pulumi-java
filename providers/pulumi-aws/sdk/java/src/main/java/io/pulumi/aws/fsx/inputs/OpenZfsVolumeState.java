// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.aws.fsx.inputs.OpenZfsVolumeNfsExportsGetArgs;
import io.pulumi.aws.fsx.inputs.OpenZfsVolumeOriginSnapshotGetArgs;
import io.pulumi.aws.fsx.inputs.OpenZfsVolumeUserAndGroupQuotaGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OpenZfsVolumeState extends io.pulumi.resources.ResourceArgs {

    public static final OpenZfsVolumeState Empty = new OpenZfsVolumeState();

    /**
     * Amazon Resource Name of the file system.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * A boolean flag indicating whether tags for the file system should be copied to snapshots. The default value is false.
     * 
     */
    @InputImport(name="copyTagsToSnapshots")
      private final @Nullable Input<Boolean> copyTagsToSnapshots;

    public Input<Boolean> getCopyTagsToSnapshots() {
        return this.copyTagsToSnapshots == null ? Input.empty() : this.copyTagsToSnapshots;
    }

    /**
     * Method used to compress the data on the volume. Valid values are `NONE` or `ZSTD`. Child volumes that don't specify compression option will inherit from parent volume. This option on file system applies to the root volume.
     * 
     */
    @InputImport(name="dataCompressionType")
      private final @Nullable Input<String> dataCompressionType;

    public Input<String> getDataCompressionType() {
        return this.dataCompressionType == null ? Input.empty() : this.dataCompressionType;
    }

    /**
     * The name of the Volume. You can use a maximum of 203 alphanumeric characters, plus the underscore (_) special character.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * NFS export configuration for the root volume. Exactly 1 item. See NFS Exports Below.
     * 
     */
    @InputImport(name="nfsExports")
      private final @Nullable Input<OpenZfsVolumeNfsExportsGetArgs> nfsExports;

    public Input<OpenZfsVolumeNfsExportsGetArgs> getNfsExports() {
        return this.nfsExports == null ? Input.empty() : this.nfsExports;
    }

    /**
     * The ARN of the source snapshot to create the volume from.
     * 
     */
    @InputImport(name="originSnapshot")
      private final @Nullable Input<OpenZfsVolumeOriginSnapshotGetArgs> originSnapshot;

    public Input<OpenZfsVolumeOriginSnapshotGetArgs> getOriginSnapshot() {
        return this.originSnapshot == null ? Input.empty() : this.originSnapshot;
    }

    /**
     * The volume id of volume that will be the parent volume for the volume being created, this could be the root volume created from the `aws.fsx.OpenZfsFileSystem` resource with the `root_volume_id` or the `id` property of another `aws.fsx.OpenZfsVolume`.
     * 
     */
    @InputImport(name="parentVolumeId")
      private final @Nullable Input<String> parentVolumeId;

    public Input<String> getParentVolumeId() {
        return this.parentVolumeId == null ? Input.empty() : this.parentVolumeId;
    }

    /**
     * specifies whether the volume is read-only. Default is false.
     * 
     */
    @InputImport(name="readOnly")
      private final @Nullable Input<Boolean> readOnly;

    public Input<Boolean> getReadOnly() {
        return this.readOnly == null ? Input.empty() : this.readOnly;
    }

    /**
     * - The amount of storage that the user or group can use in gibibytes (GiB). Valid values between `0` and `2147483647`
     * 
     */
    @InputImport(name="storageCapacityQuotaGib")
      private final @Nullable Input<Integer> storageCapacityQuotaGib;

    public Input<Integer> getStorageCapacityQuotaGib() {
        return this.storageCapacityQuotaGib == null ? Input.empty() : this.storageCapacityQuotaGib;
    }

    /**
     * The amount of storage in gibibytes (GiB) to reserve from the parent volume.
     * 
     */
    @InputImport(name="storageCapacityReservationGib")
      private final @Nullable Input<Integer> storageCapacityReservationGib;

    public Input<Integer> getStorageCapacityReservationGib() {
        return this.storageCapacityReservationGib == null ? Input.empty() : this.storageCapacityReservationGib;
    }

    /**
     * A map of tags to assign to the file system. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * - Specify how much storage users or groups can use on the volume. Maximum of 100 items. See User and Group Quotas Below.
     * 
     */
    @InputImport(name="userAndGroupQuotas")
      private final @Nullable Input<List<OpenZfsVolumeUserAndGroupQuotaGetArgs>> userAndGroupQuotas;

    public Input<List<OpenZfsVolumeUserAndGroupQuotaGetArgs>> getUserAndGroupQuotas() {
        return this.userAndGroupQuotas == null ? Input.empty() : this.userAndGroupQuotas;
    }

    @InputImport(name="volumeType")
      private final @Nullable Input<String> volumeType;

    public Input<String> getVolumeType() {
        return this.volumeType == null ? Input.empty() : this.volumeType;
    }

    public OpenZfsVolumeState(
        @Nullable Input<String> arn,
        @Nullable Input<Boolean> copyTagsToSnapshots,
        @Nullable Input<String> dataCompressionType,
        @Nullable Input<String> name,
        @Nullable Input<OpenZfsVolumeNfsExportsGetArgs> nfsExports,
        @Nullable Input<OpenZfsVolumeOriginSnapshotGetArgs> originSnapshot,
        @Nullable Input<String> parentVolumeId,
        @Nullable Input<Boolean> readOnly,
        @Nullable Input<Integer> storageCapacityQuotaGib,
        @Nullable Input<Integer> storageCapacityReservationGib,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<List<OpenZfsVolumeUserAndGroupQuotaGetArgs>> userAndGroupQuotas,
        @Nullable Input<String> volumeType) {
        this.arn = arn;
        this.copyTagsToSnapshots = copyTagsToSnapshots;
        this.dataCompressionType = dataCompressionType;
        this.name = name;
        this.nfsExports = nfsExports;
        this.originSnapshot = originSnapshot;
        this.parentVolumeId = parentVolumeId;
        this.readOnly = readOnly;
        this.storageCapacityQuotaGib = storageCapacityQuotaGib;
        this.storageCapacityReservationGib = storageCapacityReservationGib;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.userAndGroupQuotas = userAndGroupQuotas;
        this.volumeType = volumeType;
    }

    private OpenZfsVolumeState() {
        this.arn = Input.empty();
        this.copyTagsToSnapshots = Input.empty();
        this.dataCompressionType = Input.empty();
        this.name = Input.empty();
        this.nfsExports = Input.empty();
        this.originSnapshot = Input.empty();
        this.parentVolumeId = Input.empty();
        this.readOnly = Input.empty();
        this.storageCapacityQuotaGib = Input.empty();
        this.storageCapacityReservationGib = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.userAndGroupQuotas = Input.empty();
        this.volumeType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenZfsVolumeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<Boolean> copyTagsToSnapshots;
        private @Nullable Input<String> dataCompressionType;
        private @Nullable Input<String> name;
        private @Nullable Input<OpenZfsVolumeNfsExportsGetArgs> nfsExports;
        private @Nullable Input<OpenZfsVolumeOriginSnapshotGetArgs> originSnapshot;
        private @Nullable Input<String> parentVolumeId;
        private @Nullable Input<Boolean> readOnly;
        private @Nullable Input<Integer> storageCapacityQuotaGib;
        private @Nullable Input<Integer> storageCapacityReservationGib;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<List<OpenZfsVolumeUserAndGroupQuotaGetArgs>> userAndGroupQuotas;
        private @Nullable Input<String> volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenZfsVolumeState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.copyTagsToSnapshots = defaults.copyTagsToSnapshots;
    	      this.dataCompressionType = defaults.dataCompressionType;
    	      this.name = defaults.name;
    	      this.nfsExports = defaults.nfsExports;
    	      this.originSnapshot = defaults.originSnapshot;
    	      this.parentVolumeId = defaults.parentVolumeId;
    	      this.readOnly = defaults.readOnly;
    	      this.storageCapacityQuotaGib = defaults.storageCapacityQuotaGib;
    	      this.storageCapacityReservationGib = defaults.storageCapacityReservationGib;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.userAndGroupQuotas = defaults.userAndGroupQuotas;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder copyTagsToSnapshots(@Nullable Input<Boolean> copyTagsToSnapshots) {
            this.copyTagsToSnapshots = copyTagsToSnapshots;
            return this;
        }

        public Builder copyTagsToSnapshots(@Nullable Boolean copyTagsToSnapshots) {
            this.copyTagsToSnapshots = Input.ofNullable(copyTagsToSnapshots);
            return this;
        }

        public Builder dataCompressionType(@Nullable Input<String> dataCompressionType) {
            this.dataCompressionType = dataCompressionType;
            return this;
        }

        public Builder dataCompressionType(@Nullable String dataCompressionType) {
            this.dataCompressionType = Input.ofNullable(dataCompressionType);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder nfsExports(@Nullable Input<OpenZfsVolumeNfsExportsGetArgs> nfsExports) {
            this.nfsExports = nfsExports;
            return this;
        }

        public Builder nfsExports(@Nullable OpenZfsVolumeNfsExportsGetArgs nfsExports) {
            this.nfsExports = Input.ofNullable(nfsExports);
            return this;
        }

        public Builder originSnapshot(@Nullable Input<OpenZfsVolumeOriginSnapshotGetArgs> originSnapshot) {
            this.originSnapshot = originSnapshot;
            return this;
        }

        public Builder originSnapshot(@Nullable OpenZfsVolumeOriginSnapshotGetArgs originSnapshot) {
            this.originSnapshot = Input.ofNullable(originSnapshot);
            return this;
        }

        public Builder parentVolumeId(@Nullable Input<String> parentVolumeId) {
            this.parentVolumeId = parentVolumeId;
            return this;
        }

        public Builder parentVolumeId(@Nullable String parentVolumeId) {
            this.parentVolumeId = Input.ofNullable(parentVolumeId);
            return this;
        }

        public Builder readOnly(@Nullable Input<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = Input.ofNullable(readOnly);
            return this;
        }

        public Builder storageCapacityQuotaGib(@Nullable Input<Integer> storageCapacityQuotaGib) {
            this.storageCapacityQuotaGib = storageCapacityQuotaGib;
            return this;
        }

        public Builder storageCapacityQuotaGib(@Nullable Integer storageCapacityQuotaGib) {
            this.storageCapacityQuotaGib = Input.ofNullable(storageCapacityQuotaGib);
            return this;
        }

        public Builder storageCapacityReservationGib(@Nullable Input<Integer> storageCapacityReservationGib) {
            this.storageCapacityReservationGib = storageCapacityReservationGib;
            return this;
        }

        public Builder storageCapacityReservationGib(@Nullable Integer storageCapacityReservationGib) {
            this.storageCapacityReservationGib = Input.ofNullable(storageCapacityReservationGib);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder userAndGroupQuotas(@Nullable Input<List<OpenZfsVolumeUserAndGroupQuotaGetArgs>> userAndGroupQuotas) {
            this.userAndGroupQuotas = userAndGroupQuotas;
            return this;
        }

        public Builder userAndGroupQuotas(@Nullable List<OpenZfsVolumeUserAndGroupQuotaGetArgs> userAndGroupQuotas) {
            this.userAndGroupQuotas = Input.ofNullable(userAndGroupQuotas);
            return this;
        }

        public Builder volumeType(@Nullable Input<String> volumeType) {
            this.volumeType = volumeType;
            return this;
        }

        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = Input.ofNullable(volumeType);
            return this;
        }
        public OpenZfsVolumeState build() {
            return new OpenZfsVolumeState(arn, copyTagsToSnapshots, dataCompressionType, name, nfsExports, originSnapshot, parentVolumeId, readOnly, storageCapacityQuotaGib, storageCapacityReservationGib, tags, tagsAll, userAndGroupQuotas, volumeType);
        }
    }
}
