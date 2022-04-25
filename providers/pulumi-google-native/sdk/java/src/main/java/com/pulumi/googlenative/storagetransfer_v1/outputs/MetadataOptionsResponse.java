// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MetadataOptionsResponse {
    /**
     * @return Specifies how each object&#39;s ACLs should be preserved for transfers between Google Cloud Storage buckets. If unspecified, the default behavior is the same as ACL_DESTINATION_BUCKET_DEFAULT.
     * 
     */
    private final String acl;
    /**
     * @return Specifies how each file&#39;s GID attribute should be handled by the transfer. If unspecified, the default behavior is the same as GID_SKIP when the source is a POSIX file system.
     * 
     */
    private final String gid;
    /**
     * @return Specifies how each object&#39;s Cloud KMS customer-managed encryption key (CMEK) is preserved for transfers between Google Cloud Storage buckets. If unspecified, the default behavior is the same as KMS_KEY_DESTINATION_BUCKET_DEFAULT.
     * 
     */
    private final String kmsKey;
    /**
     * @return Specifies how each file&#39;s mode attribute should be handled by the transfer. If unspecified, the default behavior is the same as MODE_SKIP when the source is a POSIX file system.
     * 
     */
    private final String mode;
    /**
     * @return Specifies the storage class to set on objects being transferred to Google Cloud Storage buckets. If unspecified, the default behavior is the same as STORAGE_CLASS_DESTINATION_BUCKET_DEFAULT.
     * 
     */
    private final String storageClass;
    /**
     * @return Specifies how symlinks should be handled by the transfer. If unspecified, the default behavior is the same as SYMLINK_SKIP when the source is a POSIX file system.
     * 
     */
    private final String symlink;
    /**
     * @return Specifies how each object&#39;s temporary hold status should be preserved for transfers between Google Cloud Storage buckets. If unspecified, the default behavior is the same as TEMPORARY_HOLD_PRESERVE.
     * 
     */
    private final String temporaryHold;
    /**
     * @return Specifies how each file&#39;s UID attribute should be handled by the transfer. If unspecified, the default behavior is the same as UID_SKIP when the source is a POSIX file system.
     * 
     */
    private final String uid;

    @CustomType.Constructor
    private MetadataOptionsResponse(
        @CustomType.Parameter("acl") String acl,
        @CustomType.Parameter("gid") String gid,
        @CustomType.Parameter("kmsKey") String kmsKey,
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("storageClass") String storageClass,
        @CustomType.Parameter("symlink") String symlink,
        @CustomType.Parameter("temporaryHold") String temporaryHold,
        @CustomType.Parameter("uid") String uid) {
        this.acl = acl;
        this.gid = gid;
        this.kmsKey = kmsKey;
        this.mode = mode;
        this.storageClass = storageClass;
        this.symlink = symlink;
        this.temporaryHold = temporaryHold;
        this.uid = uid;
    }

    /**
     * @return Specifies how each object&#39;s ACLs should be preserved for transfers between Google Cloud Storage buckets. If unspecified, the default behavior is the same as ACL_DESTINATION_BUCKET_DEFAULT.
     * 
     */
    public String acl() {
        return this.acl;
    }
    /**
     * @return Specifies how each file&#39;s GID attribute should be handled by the transfer. If unspecified, the default behavior is the same as GID_SKIP when the source is a POSIX file system.
     * 
     */
    public String gid() {
        return this.gid;
    }
    /**
     * @return Specifies how each object&#39;s Cloud KMS customer-managed encryption key (CMEK) is preserved for transfers between Google Cloud Storage buckets. If unspecified, the default behavior is the same as KMS_KEY_DESTINATION_BUCKET_DEFAULT.
     * 
     */
    public String kmsKey() {
        return this.kmsKey;
    }
    /**
     * @return Specifies how each file&#39;s mode attribute should be handled by the transfer. If unspecified, the default behavior is the same as MODE_SKIP when the source is a POSIX file system.
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return Specifies the storage class to set on objects being transferred to Google Cloud Storage buckets. If unspecified, the default behavior is the same as STORAGE_CLASS_DESTINATION_BUCKET_DEFAULT.
     * 
     */
    public String storageClass() {
        return this.storageClass;
    }
    /**
     * @return Specifies how symlinks should be handled by the transfer. If unspecified, the default behavior is the same as SYMLINK_SKIP when the source is a POSIX file system.
     * 
     */
    public String symlink() {
        return this.symlink;
    }
    /**
     * @return Specifies how each object&#39;s temporary hold status should be preserved for transfers between Google Cloud Storage buckets. If unspecified, the default behavior is the same as TEMPORARY_HOLD_PRESERVE.
     * 
     */
    public String temporaryHold() {
        return this.temporaryHold;
    }
    /**
     * @return Specifies how each file&#39;s UID attribute should be handled by the transfer. If unspecified, the default behavior is the same as UID_SKIP when the source is a POSIX file system.
     * 
     */
    public String uid() {
        return this.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String acl;
        private String gid;
        private String kmsKey;
        private String mode;
        private String storageClass;
        private String symlink;
        private String temporaryHold;
        private String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataOptionsResponse defaults) {
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

        public Builder acl(String acl) {
            this.acl = Objects.requireNonNull(acl);
            return this;
        }
        public Builder gid(String gid) {
            this.gid = Objects.requireNonNull(gid);
            return this;
        }
        public Builder kmsKey(String kmsKey) {
            this.kmsKey = Objects.requireNonNull(kmsKey);
            return this;
        }
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder storageClass(String storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }
        public Builder symlink(String symlink) {
            this.symlink = Objects.requireNonNull(symlink);
            return this;
        }
        public Builder temporaryHold(String temporaryHold) {
            this.temporaryHold = Objects.requireNonNull(temporaryHold);
            return this;
        }
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }        public MetadataOptionsResponse build() {
            return new MetadataOptionsResponse(acl, gid, kmsKey, mode, storageClass, symlink, temporaryHold, uid);
        }
    }
}
