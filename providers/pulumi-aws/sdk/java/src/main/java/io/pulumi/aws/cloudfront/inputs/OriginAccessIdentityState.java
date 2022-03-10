// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OriginAccessIdentityState extends io.pulumi.resources.ResourceArgs {

    public static final OriginAccessIdentityState Empty = new OriginAccessIdentityState();

    /**
     * Internal value used by CloudFront to allow future
     * updates to the origin access identity.
     * 
     */
    @InputImport(name="callerReference")
      private final @Nullable Input<String> callerReference;

    public Input<String> getCallerReference() {
        return this.callerReference == null ? Input.empty() : this.callerReference;
    }

    /**
     * A shortcut to the full path for the
     * origin access identity to use in CloudFront, see below.
     * 
     */
    @InputImport(name="cloudfrontAccessIdentityPath")
      private final @Nullable Input<String> cloudfrontAccessIdentityPath;

    public Input<String> getCloudfrontAccessIdentityPath() {
        return this.cloudfrontAccessIdentityPath == null ? Input.empty() : this.cloudfrontAccessIdentityPath;
    }

    /**
     * An optional comment for the origin access identity.
     * 
     */
    @InputImport(name="comment")
      private final @Nullable Input<String> comment;

    public Input<String> getComment() {
        return this.comment == null ? Input.empty() : this.comment;
    }

    /**
     * The current version of the origin access identity's information.
     * For example: `E2QWRUHAPOMQZL`.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * A pre-generated ARN for use in S3 bucket policies (see below).
     * Example: `arn:aws:iam::cloudfront:user/CloudFront Origin Access Identity
     * E2QWRUHAPOMQZL`.
     * 
     */
    @InputImport(name="iamArn")
      private final @Nullable Input<String> iamArn;

    public Input<String> getIamArn() {
        return this.iamArn == null ? Input.empty() : this.iamArn;
    }

    /**
     * The Amazon S3 canonical user ID for the origin
     * access identity, which you use when giving the origin access identity read
     * permission to an object in Amazon S3.
     * 
     */
    @InputImport(name="s3CanonicalUserId")
      private final @Nullable Input<String> s3CanonicalUserId;

    public Input<String> getS3CanonicalUserId() {
        return this.s3CanonicalUserId == null ? Input.empty() : this.s3CanonicalUserId;
    }

    public OriginAccessIdentityState(
        @Nullable Input<String> callerReference,
        @Nullable Input<String> cloudfrontAccessIdentityPath,
        @Nullable Input<String> comment,
        @Nullable Input<String> etag,
        @Nullable Input<String> iamArn,
        @Nullable Input<String> s3CanonicalUserId) {
        this.callerReference = callerReference;
        this.cloudfrontAccessIdentityPath = cloudfrontAccessIdentityPath;
        this.comment = comment;
        this.etag = etag;
        this.iamArn = iamArn;
        this.s3CanonicalUserId = s3CanonicalUserId;
    }

    private OriginAccessIdentityState() {
        this.callerReference = Input.empty();
        this.cloudfrontAccessIdentityPath = Input.empty();
        this.comment = Input.empty();
        this.etag = Input.empty();
        this.iamArn = Input.empty();
        this.s3CanonicalUserId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginAccessIdentityState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> callerReference;
        private @Nullable Input<String> cloudfrontAccessIdentityPath;
        private @Nullable Input<String> comment;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> iamArn;
        private @Nullable Input<String> s3CanonicalUserId;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginAccessIdentityState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callerReference = defaults.callerReference;
    	      this.cloudfrontAccessIdentityPath = defaults.cloudfrontAccessIdentityPath;
    	      this.comment = defaults.comment;
    	      this.etag = defaults.etag;
    	      this.iamArn = defaults.iamArn;
    	      this.s3CanonicalUserId = defaults.s3CanonicalUserId;
        }

        public Builder callerReference(@Nullable Input<String> callerReference) {
            this.callerReference = callerReference;
            return this;
        }

        public Builder callerReference(@Nullable String callerReference) {
            this.callerReference = Input.ofNullable(callerReference);
            return this;
        }

        public Builder cloudfrontAccessIdentityPath(@Nullable Input<String> cloudfrontAccessIdentityPath) {
            this.cloudfrontAccessIdentityPath = cloudfrontAccessIdentityPath;
            return this;
        }

        public Builder cloudfrontAccessIdentityPath(@Nullable String cloudfrontAccessIdentityPath) {
            this.cloudfrontAccessIdentityPath = Input.ofNullable(cloudfrontAccessIdentityPath);
            return this;
        }

        public Builder comment(@Nullable Input<String> comment) {
            this.comment = comment;
            return this;
        }

        public Builder comment(@Nullable String comment) {
            this.comment = Input.ofNullable(comment);
            return this;
        }

        public Builder etag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder iamArn(@Nullable Input<String> iamArn) {
            this.iamArn = iamArn;
            return this;
        }

        public Builder iamArn(@Nullable String iamArn) {
            this.iamArn = Input.ofNullable(iamArn);
            return this;
        }

        public Builder s3CanonicalUserId(@Nullable Input<String> s3CanonicalUserId) {
            this.s3CanonicalUserId = s3CanonicalUserId;
            return this;
        }

        public Builder s3CanonicalUserId(@Nullable String s3CanonicalUserId) {
            this.s3CanonicalUserId = Input.ofNullable(s3CanonicalUserId);
            return this;
        }
        public OriginAccessIdentityState build() {
            return new OriginAccessIdentityState(callerReference, cloudfrontAccessIdentityPath, comment, etag, iamArn, s3CanonicalUserId);
        }
    }
}
