// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3;

import io.pulumi.asset.AssetOrArchive;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketObjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketObjectArgs Empty = new BucketObjectArgs();

    /**
     * [Canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, and `bucket-owner-full-control`. Defaults to `private`.
     * 
     */
    @Import(name="acl")
      private final @Nullable Output<String> acl;

    public Output<String> getAcl() {
        return this.acl == null ? Codegen.empty() : this.acl;
    }

    /**
     * Name of the bucket to put the file in. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified.
     * 
     */
    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    /**
     * Whether or not to use [Amazon S3 Bucket Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) for SSE-KMS.
     * 
     */
    @Import(name="bucketKeyEnabled")
      private final @Nullable Output<Boolean> bucketKeyEnabled;

    public Output<Boolean> getBucketKeyEnabled() {
        return this.bucketKeyEnabled == null ? Codegen.empty() : this.bucketKeyEnabled;
    }

    /**
     * Caching behavior along the request/reply chain Read [w3c cache_control](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
     * 
     */
    @Import(name="cacheControl")
      private final @Nullable Output<String> cacheControl;

    public Output<String> getCacheControl() {
        return this.cacheControl == null ? Codegen.empty() : this.cacheControl;
    }

    /**
     * Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
     * 
     */
    @Import(name="content")
      private final @Nullable Output<String> content;

    public Output<String> getContent() {
        return this.content == null ? Codegen.empty() : this.content;
    }

    /**
     * Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
     * 
     */
    @Import(name="contentBase64")
      private final @Nullable Output<String> contentBase64;

    public Output<String> getContentBase64() {
        return this.contentBase64 == null ? Codegen.empty() : this.contentBase64;
    }

    /**
     * Presentational information for the object. Read [w3c content_disposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
     * 
     */
    @Import(name="contentDisposition")
      private final @Nullable Output<String> contentDisposition;

    public Output<String> getContentDisposition() {
        return this.contentDisposition == null ? Codegen.empty() : this.contentDisposition;
    }

    /**
     * Content encodings that have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
     * 
     */
    @Import(name="contentEncoding")
      private final @Nullable Output<String> contentEncoding;

    public Output<String> getContentEncoding() {
        return this.contentEncoding == null ? Codegen.empty() : this.contentEncoding;
    }

    /**
     * Language the content is in e.g., en-US or en-GB.
     * 
     */
    @Import(name="contentLanguage")
      private final @Nullable Output<String> contentLanguage;

    public Output<String> getContentLanguage() {
        return this.contentLanguage == null ? Codegen.empty() : this.contentLanguage;
    }

    /**
     * Standard MIME type describing the format of the object data, e.g., application/octet-stream. All Valid MIME Types are valid for this input.
     * 
     */
    @Import(name="contentType")
      private final @Nullable Output<String> contentType;

    public Output<String> getContentType() {
        return this.contentType == null ? Codegen.empty() : this.contentType;
    }

    /**
     * Triggers updates when the value changes. The only meaningful value is `filemd5("path/to/file")`. This attribute is not compatible with KMS encryption, `kms_key_id` or `server_side_encryption = "aws:kms"` (see `source_hash` instead).
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * Whether to allow the object to be deleted by removing any legal hold on any object version. Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
     * 
     */
    @Import(name="forceDestroy")
      private final @Nullable Output<Boolean> forceDestroy;

    public Output<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Codegen.empty() : this.forceDestroy;
    }

    /**
     * Name of the object once it is in the bucket.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Codegen.empty() : this.key;
    }

    /**
     * ARN of the KMS Key to use for object encryption. If the S3 Bucket has server-side encryption enabled, that value will automatically be used. If referencing the `aws.kms.Key` resource, use the `arn` attribute. If referencing the `aws.kms.Alias` data source or resource, use the `target_key_arn` attribute. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Codegen.empty() : this.kmsKeyId;
    }

    /**
     * Map of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> getMetadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * [Legal hold](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-legal-holds) status that you want to apply to the specified object. Valid values are `ON` and `OFF`.
     * 
     */
    @Import(name="objectLockLegalHoldStatus")
      private final @Nullable Output<String> objectLockLegalHoldStatus;

    public Output<String> getObjectLockLegalHoldStatus() {
        return this.objectLockLegalHoldStatus == null ? Codegen.empty() : this.objectLockLegalHoldStatus;
    }

    /**
     * Object lock [retention mode](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes) that you want to apply to this object. Valid values are `GOVERNANCE` and `COMPLIANCE`.
     * 
     */
    @Import(name="objectLockMode")
      private final @Nullable Output<String> objectLockMode;

    public Output<String> getObjectLockMode() {
        return this.objectLockMode == null ? Codegen.empty() : this.objectLockMode;
    }

    /**
     * Date and time, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8), when this object's object lock will [expire](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-periods).
     * 
     */
    @Import(name="objectLockRetainUntilDate")
      private final @Nullable Output<String> objectLockRetainUntilDate;

    public Output<String> getObjectLockRetainUntilDate() {
        return this.objectLockRetainUntilDate == null ? Codegen.empty() : this.objectLockRetainUntilDate;
    }

    /**
     * Server-side encryption of the object in S3. Valid values are "`AES256`" and "`aws:kms`".
     * 
     */
    @Import(name="serverSideEncryption")
      private final @Nullable Output<String> serverSideEncryption;

    public Output<String> getServerSideEncryption() {
        return this.serverSideEncryption == null ? Codegen.empty() : this.serverSideEncryption;
    }

    /**
     * Path to a file that will be read and uploaded as raw bytes for the object content.
     * 
     */
    @Import(name="source")
      private final @Nullable Output<AssetOrArchive> source;

    public Output<AssetOrArchive> getSource() {
        return this.source == null ? Codegen.empty() : this.source;
    }

    /**
     * Triggers updates like `etag` but useful to address `etag` encryption limitations. Set using `filemd5("path/to/source")`. (The value is only stored in state and not saved by AWS.)
     * 
     */
    @Import(name="sourceHash")
      private final @Nullable Output<String> sourceHash;

    public Output<String> getSourceHash() {
        return this.sourceHash == null ? Codegen.empty() : this.sourceHash;
    }

    /**
     * [Storage Class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html#AmazonS3-PutObject-request-header-StorageClass) for the object. Defaults to "`STANDARD`".
     * 
     */
    @Import(name="storageClass")
      private final @Nullable Output<String> storageClass;

    public Output<String> getStorageClass() {
        return this.storageClass == null ? Codegen.empty() : this.storageClass;
    }

    /**
     * Map of tags to assign to the object. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
     * 
     */
    @Import(name="websiteRedirect")
      private final @Nullable Output<String> websiteRedirect;

    public Output<String> getWebsiteRedirect() {
        return this.websiteRedirect == null ? Codegen.empty() : this.websiteRedirect;
    }

    public BucketObjectArgs(
        @Nullable Output<String> acl,
        Output<String> bucket,
        @Nullable Output<Boolean> bucketKeyEnabled,
        @Nullable Output<String> cacheControl,
        @Nullable Output<String> content,
        @Nullable Output<String> contentBase64,
        @Nullable Output<String> contentDisposition,
        @Nullable Output<String> contentEncoding,
        @Nullable Output<String> contentLanguage,
        @Nullable Output<String> contentType,
        @Nullable Output<String> etag,
        @Nullable Output<Boolean> forceDestroy,
        @Nullable Output<String> key,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<Map<String,String>> metadata,
        @Nullable Output<String> objectLockLegalHoldStatus,
        @Nullable Output<String> objectLockMode,
        @Nullable Output<String> objectLockRetainUntilDate,
        @Nullable Output<String> serverSideEncryption,
        @Nullable Output<AssetOrArchive> source,
        @Nullable Output<String> sourceHash,
        @Nullable Output<String> storageClass,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> websiteRedirect) {
        this.acl = acl;
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.bucketKeyEnabled = bucketKeyEnabled;
        this.cacheControl = cacheControl;
        this.content = content;
        this.contentBase64 = contentBase64;
        this.contentDisposition = contentDisposition;
        this.contentEncoding = contentEncoding;
        this.contentLanguage = contentLanguage;
        this.contentType = contentType;
        this.etag = etag;
        this.forceDestroy = forceDestroy;
        this.key = key;
        this.kmsKeyId = kmsKeyId;
        this.metadata = metadata;
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
        this.objectLockMode = objectLockMode;
        this.objectLockRetainUntilDate = objectLockRetainUntilDate;
        this.serverSideEncryption = serverSideEncryption;
        this.source = source;
        this.sourceHash = sourceHash;
        this.storageClass = storageClass;
        this.tags = tags;
        this.websiteRedirect = websiteRedirect;
    }

    private BucketObjectArgs() {
        this.acl = Codegen.empty();
        this.bucket = Codegen.empty();
        this.bucketKeyEnabled = Codegen.empty();
        this.cacheControl = Codegen.empty();
        this.content = Codegen.empty();
        this.contentBase64 = Codegen.empty();
        this.contentDisposition = Codegen.empty();
        this.contentEncoding = Codegen.empty();
        this.contentLanguage = Codegen.empty();
        this.contentType = Codegen.empty();
        this.etag = Codegen.empty();
        this.forceDestroy = Codegen.empty();
        this.key = Codegen.empty();
        this.kmsKeyId = Codegen.empty();
        this.metadata = Codegen.empty();
        this.objectLockLegalHoldStatus = Codegen.empty();
        this.objectLockMode = Codegen.empty();
        this.objectLockRetainUntilDate = Codegen.empty();
        this.serverSideEncryption = Codegen.empty();
        this.source = Codegen.empty();
        this.sourceHash = Codegen.empty();
        this.storageClass = Codegen.empty();
        this.tags = Codegen.empty();
        this.websiteRedirect = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> acl;
        private Output<String> bucket;
        private @Nullable Output<Boolean> bucketKeyEnabled;
        private @Nullable Output<String> cacheControl;
        private @Nullable Output<String> content;
        private @Nullable Output<String> contentBase64;
        private @Nullable Output<String> contentDisposition;
        private @Nullable Output<String> contentEncoding;
        private @Nullable Output<String> contentLanguage;
        private @Nullable Output<String> contentType;
        private @Nullable Output<String> etag;
        private @Nullable Output<Boolean> forceDestroy;
        private @Nullable Output<String> key;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<Map<String,String>> metadata;
        private @Nullable Output<String> objectLockLegalHoldStatus;
        private @Nullable Output<String> objectLockMode;
        private @Nullable Output<String> objectLockRetainUntilDate;
        private @Nullable Output<String> serverSideEncryption;
        private @Nullable Output<AssetOrArchive> source;
        private @Nullable Output<String> sourceHash;
        private @Nullable Output<String> storageClass;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> websiteRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketObjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acl = defaults.acl;
    	      this.bucket = defaults.bucket;
    	      this.bucketKeyEnabled = defaults.bucketKeyEnabled;
    	      this.cacheControl = defaults.cacheControl;
    	      this.content = defaults.content;
    	      this.contentBase64 = defaults.contentBase64;
    	      this.contentDisposition = defaults.contentDisposition;
    	      this.contentEncoding = defaults.contentEncoding;
    	      this.contentLanguage = defaults.contentLanguage;
    	      this.contentType = defaults.contentType;
    	      this.etag = defaults.etag;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.key = defaults.key;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.metadata = defaults.metadata;
    	      this.objectLockLegalHoldStatus = defaults.objectLockLegalHoldStatus;
    	      this.objectLockMode = defaults.objectLockMode;
    	      this.objectLockRetainUntilDate = defaults.objectLockRetainUntilDate;
    	      this.serverSideEncryption = defaults.serverSideEncryption;
    	      this.source = defaults.source;
    	      this.sourceHash = defaults.sourceHash;
    	      this.storageClass = defaults.storageClass;
    	      this.tags = defaults.tags;
    	      this.websiteRedirect = defaults.websiteRedirect;
        }

        public Builder acl(@Nullable Output<String> acl) {
            this.acl = acl;
            return this;
        }
        public Builder acl(@Nullable String acl) {
            this.acl = Codegen.ofNullable(acl);
            return this;
        }
        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder bucketKeyEnabled(@Nullable Output<Boolean> bucketKeyEnabled) {
            this.bucketKeyEnabled = bucketKeyEnabled;
            return this;
        }
        public Builder bucketKeyEnabled(@Nullable Boolean bucketKeyEnabled) {
            this.bucketKeyEnabled = Codegen.ofNullable(bucketKeyEnabled);
            return this;
        }
        public Builder cacheControl(@Nullable Output<String> cacheControl) {
            this.cacheControl = cacheControl;
            return this;
        }
        public Builder cacheControl(@Nullable String cacheControl) {
            this.cacheControl = Codegen.ofNullable(cacheControl);
            return this;
        }
        public Builder content(@Nullable Output<String> content) {
            this.content = content;
            return this;
        }
        public Builder content(@Nullable String content) {
            this.content = Codegen.ofNullable(content);
            return this;
        }
        public Builder contentBase64(@Nullable Output<String> contentBase64) {
            this.contentBase64 = contentBase64;
            return this;
        }
        public Builder contentBase64(@Nullable String contentBase64) {
            this.contentBase64 = Codegen.ofNullable(contentBase64);
            return this;
        }
        public Builder contentDisposition(@Nullable Output<String> contentDisposition) {
            this.contentDisposition = contentDisposition;
            return this;
        }
        public Builder contentDisposition(@Nullable String contentDisposition) {
            this.contentDisposition = Codegen.ofNullable(contentDisposition);
            return this;
        }
        public Builder contentEncoding(@Nullable Output<String> contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }
        public Builder contentEncoding(@Nullable String contentEncoding) {
            this.contentEncoding = Codegen.ofNullable(contentEncoding);
            return this;
        }
        public Builder contentLanguage(@Nullable Output<String> contentLanguage) {
            this.contentLanguage = contentLanguage;
            return this;
        }
        public Builder contentLanguage(@Nullable String contentLanguage) {
            this.contentLanguage = Codegen.ofNullable(contentLanguage);
            return this;
        }
        public Builder contentType(@Nullable Output<String> contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder contentType(@Nullable String contentType) {
            this.contentType = Codegen.ofNullable(contentType);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }
        public Builder forceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Codegen.ofNullable(forceDestroy);
            return this;
        }
        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Codegen.ofNullable(key);
            return this;
        }
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Codegen.ofNullable(kmsKeyId);
            return this;
        }
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder objectLockLegalHoldStatus(@Nullable Output<String> objectLockLegalHoldStatus) {
            this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
            return this;
        }
        public Builder objectLockLegalHoldStatus(@Nullable String objectLockLegalHoldStatus) {
            this.objectLockLegalHoldStatus = Codegen.ofNullable(objectLockLegalHoldStatus);
            return this;
        }
        public Builder objectLockMode(@Nullable Output<String> objectLockMode) {
            this.objectLockMode = objectLockMode;
            return this;
        }
        public Builder objectLockMode(@Nullable String objectLockMode) {
            this.objectLockMode = Codegen.ofNullable(objectLockMode);
            return this;
        }
        public Builder objectLockRetainUntilDate(@Nullable Output<String> objectLockRetainUntilDate) {
            this.objectLockRetainUntilDate = objectLockRetainUntilDate;
            return this;
        }
        public Builder objectLockRetainUntilDate(@Nullable String objectLockRetainUntilDate) {
            this.objectLockRetainUntilDate = Codegen.ofNullable(objectLockRetainUntilDate);
            return this;
        }
        public Builder serverSideEncryption(@Nullable Output<String> serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }
        public Builder serverSideEncryption(@Nullable String serverSideEncryption) {
            this.serverSideEncryption = Codegen.ofNullable(serverSideEncryption);
            return this;
        }
        public Builder source(@Nullable Output<AssetOrArchive> source) {
            this.source = source;
            return this;
        }
        public Builder source(@Nullable AssetOrArchive source) {
            this.source = Codegen.ofNullable(source);
            return this;
        }
        public Builder sourceHash(@Nullable Output<String> sourceHash) {
            this.sourceHash = sourceHash;
            return this;
        }
        public Builder sourceHash(@Nullable String sourceHash) {
            this.sourceHash = Codegen.ofNullable(sourceHash);
            return this;
        }
        public Builder storageClass(@Nullable Output<String> storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public Builder storageClass(@Nullable String storageClass) {
            this.storageClass = Codegen.ofNullable(storageClass);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder websiteRedirect(@Nullable Output<String> websiteRedirect) {
            this.websiteRedirect = websiteRedirect;
            return this;
        }
        public Builder websiteRedirect(@Nullable String websiteRedirect) {
            this.websiteRedirect = Codegen.ofNullable(websiteRedirect);
            return this;
        }        public BucketObjectArgs build() {
            return new BucketObjectArgs(acl, bucket, bucketKeyEnabled, cacheControl, content, contentBase64, contentDisposition, contentEncoding, contentLanguage, contentType, etag, forceDestroy, key, kmsKeyId, metadata, objectLockLegalHoldStatus, objectLockMode, objectLockRetainUntilDate, serverSideEncryption, source, sourceHash, storageClass, tags, websiteRedirect);
        }
    }
}
