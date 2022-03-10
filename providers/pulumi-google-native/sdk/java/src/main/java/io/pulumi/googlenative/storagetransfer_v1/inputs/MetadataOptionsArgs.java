// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.storagetransfer_v1.enums.MetadataOptionsAcl;
import io.pulumi.googlenative.storagetransfer_v1.enums.MetadataOptionsGid;
import io.pulumi.googlenative.storagetransfer_v1.enums.MetadataOptionsKmsKey;
import io.pulumi.googlenative.storagetransfer_v1.enums.MetadataOptionsMode;
import io.pulumi.googlenative.storagetransfer_v1.enums.MetadataOptionsStorageClass;
import io.pulumi.googlenative.storagetransfer_v1.enums.MetadataOptionsSymlink;
import io.pulumi.googlenative.storagetransfer_v1.enums.MetadataOptionsTemporaryHold;
import io.pulumi.googlenative.storagetransfer_v1.enums.MetadataOptionsUid;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the metadata options for running a transfer.
 * 
 */
public final class MetadataOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetadataOptionsArgs Empty = new MetadataOptionsArgs();

    /**
     * Specifies how each object's ACLs should be preserved for transfers between Google Cloud Storage buckets. If unspecified, the default behavior is the same as ACL_DESTINATION_BUCKET_DEFAULT.
     * 
     */
    @InputImport(name="acl")
      private final @Nullable Input<MetadataOptionsAcl> acl;

    public Input<MetadataOptionsAcl> getAcl() {
        return this.acl == null ? Input.empty() : this.acl;
    }

    /**
     * Specifies how each file's GID attribute should be handled by the transfer. If unspecified, the default behavior is the same as GID_SKIP when the source is a POSIX file system.
     * 
     */
    @InputImport(name="gid")
      private final @Nullable Input<MetadataOptionsGid> gid;

    public Input<MetadataOptionsGid> getGid() {
        return this.gid == null ? Input.empty() : this.gid;
    }

    /**
     * Specifies how each object's Cloud KMS customer-managed encryption key (CMEK) is preserved for transfers between Google Cloud Storage buckets. If unspecified, the default behavior is the same as KMS_KEY_DESTINATION_BUCKET_DEFAULT.
     * 
     */
    @InputImport(name="kmsKey")
      private final @Nullable Input<MetadataOptionsKmsKey> kmsKey;

    public Input<MetadataOptionsKmsKey> getKmsKey() {
        return this.kmsKey == null ? Input.empty() : this.kmsKey;
    }

    /**
     * Specifies how each file's mode attribute should be handled by the transfer. If unspecified, the default behavior is the same as MODE_SKIP when the source is a POSIX file system.
     * 
     */
    @InputImport(name="mode")
      private final @Nullable Input<MetadataOptionsMode> mode;

    public Input<MetadataOptionsMode> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * Specifies the storage class to set on objects being transferred to Google Cloud Storage buckets. If unspecified, the default behavior is the same as STORAGE_CLASS_DESTINATION_BUCKET_DEFAULT.
     * 
     */
    @InputImport(name="storageClass")
      private final @Nullable Input<MetadataOptionsStorageClass> storageClass;

    public Input<MetadataOptionsStorageClass> getStorageClass() {
        return this.storageClass == null ? Input.empty() : this.storageClass;
    }

    /**
     * Specifies how symlinks should be handled by the transfer. If unspecified, the default behavior is the same as SYMLINK_SKIP when the source is a POSIX file system.
     * 
     */
    @InputImport(name="symlink")
      private final @Nullable Input<MetadataOptionsSymlink> symlink;

    public Input<MetadataOptionsSymlink> getSymlink() {
        return this.symlink == null ? Input.empty() : this.symlink;
    }

    /**
     * Specifies how each object's temporary hold status should be preserved for transfers between Google Cloud Storage buckets. If unspecified, the default behavior is the same as TEMPORARY_HOLD_PRESERVE.
     * 
     */
    @InputImport(name="temporaryHold")
      private final @Nullable Input<MetadataOptionsTemporaryHold> temporaryHold;

    public Input<MetadataOptionsTemporaryHold> getTemporaryHold() {
        return this.temporaryHold == null ? Input.empty() : this.temporaryHold;
    }

    /**
     * Specifies how each file's UID attribute should be handled by the transfer. If unspecified, the default behavior is the same as UID_SKIP when the source is a POSIX file system.
     * 
     */
    @InputImport(name="uid")
      private final @Nullable Input<MetadataOptionsUid> uid;

    public Input<MetadataOptionsUid> getUid() {
        return this.uid == null ? Input.empty() : this.uid;
    }

    public MetadataOptionsArgs(
        @Nullable Input<MetadataOptionsAcl> acl,
        @Nullable Input<MetadataOptionsGid> gid,
        @Nullable Input<MetadataOptionsKmsKey> kmsKey,
        @Nullable Input<MetadataOptionsMode> mode,
        @Nullable Input<MetadataOptionsStorageClass> storageClass,
        @Nullable Input<MetadataOptionsSymlink> symlink,
        @Nullable Input<MetadataOptionsTemporaryHold> temporaryHold,
        @Nullable Input<MetadataOptionsUid> uid) {
        this.acl = acl;
        this.gid = gid;
        this.kmsKey = kmsKey;
        this.mode = mode;
        this.storageClass = storageClass;
        this.symlink = symlink;
        this.temporaryHold = temporaryHold;
        this.uid = uid;
    }

    private MetadataOptionsArgs() {
        this.acl = Input.empty();
        this.gid = Input.empty();
        this.kmsKey = Input.empty();
        this.mode = Input.empty();
        this.storageClass = Input.empty();
        this.symlink = Input.empty();
        this.temporaryHold = Input.empty();
        this.uid = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MetadataOptionsAcl> acl;
        private @Nullable Input<MetadataOptionsGid> gid;
        private @Nullable Input<MetadataOptionsKmsKey> kmsKey;
        private @Nullable Input<MetadataOptionsMode> mode;
        private @Nullable Input<MetadataOptionsStorageClass> storageClass;
        private @Nullable Input<MetadataOptionsSymlink> symlink;
        private @Nullable Input<MetadataOptionsTemporaryHold> temporaryHold;
        private @Nullable Input<MetadataOptionsUid> uid;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acl = defaults.acl;
    	      this.gid = defaults.gid;
    	      this.kmsKey = defaults.kmsKey;
    	      this.mode = defaults.mode;
    	      this.storageClass = defaults.storageClass;
    	      this.symlink = defaults.symlink;
    	      this.temporaryHold = defaults.temporaryHold;
    	      this.uid = defaults.uid;
        }

        public Builder acl(@Nullable Input<MetadataOptionsAcl> acl) {
            this.acl = acl;
            return this;
        }

        public Builder acl(@Nullable MetadataOptionsAcl acl) {
            this.acl = Input.ofNullable(acl);
            return this;
        }

        public Builder gid(@Nullable Input<MetadataOptionsGid> gid) {
            this.gid = gid;
            return this;
        }

        public Builder gid(@Nullable MetadataOptionsGid gid) {
            this.gid = Input.ofNullable(gid);
            return this;
        }

        public Builder kmsKey(@Nullable Input<MetadataOptionsKmsKey> kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }

        public Builder kmsKey(@Nullable MetadataOptionsKmsKey kmsKey) {
            this.kmsKey = Input.ofNullable(kmsKey);
            return this;
        }

        public Builder mode(@Nullable Input<MetadataOptionsMode> mode) {
            this.mode = mode;
            return this;
        }

        public Builder mode(@Nullable MetadataOptionsMode mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder storageClass(@Nullable Input<MetadataOptionsStorageClass> storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        public Builder storageClass(@Nullable MetadataOptionsStorageClass storageClass) {
            this.storageClass = Input.ofNullable(storageClass);
            return this;
        }

        public Builder symlink(@Nullable Input<MetadataOptionsSymlink> symlink) {
            this.symlink = symlink;
            return this;
        }

        public Builder symlink(@Nullable MetadataOptionsSymlink symlink) {
            this.symlink = Input.ofNullable(symlink);
            return this;
        }

        public Builder temporaryHold(@Nullable Input<MetadataOptionsTemporaryHold> temporaryHold) {
            this.temporaryHold = temporaryHold;
            return this;
        }

        public Builder temporaryHold(@Nullable MetadataOptionsTemporaryHold temporaryHold) {
            this.temporaryHold = Input.ofNullable(temporaryHold);
            return this;
        }

        public Builder uid(@Nullable Input<MetadataOptionsUid> uid) {
            this.uid = uid;
            return this;
        }

        public Builder uid(@Nullable MetadataOptionsUid uid) {
            this.uid = Input.ofNullable(uid);
            return this;
        }
        public MetadataOptionsArgs build() {
            return new MetadataOptionsArgs(acl, gid, kmsKey, mode, storageClass, symlink, temporaryHold, uid);
        }
    }
}
