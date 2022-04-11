// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountPublicAccessBlockState extends io.pulumi.resources.ResourceArgs {

    public static final AccountPublicAccessBlockState Empty = new AccountPublicAccessBlockState();

    /**
     * AWS account ID to configure. Defaults to automatically determined account ID of the this provider AWS provider.
     * 
     */
    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId == null ? Codegen.empty() : this.accountId;
    }

    /**
     * Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
     * * PUT Bucket acl and PUT Object acl calls will fail if the specified ACL allows public access.
     * * PUT Object calls fail if the request includes a public ACL.
     * 
     */
    @Import(name="blockPublicAcls")
      private final @Nullable Output<Boolean> blockPublicAcls;

    public Output<Boolean> getBlockPublicAcls() {
        return this.blockPublicAcls == null ? Codegen.empty() : this.blockPublicAcls;
    }

    /**
     * Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
     * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
     * 
     */
    @Import(name="blockPublicPolicy")
      private final @Nullable Output<Boolean> blockPublicPolicy;

    public Output<Boolean> getBlockPublicPolicy() {
        return this.blockPublicPolicy == null ? Codegen.empty() : this.blockPublicPolicy;
    }

    /**
     * Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
     * * Ignore all public ACLs on buckets in this account and any objects that they contain.
     * 
     */
    @Import(name="ignorePublicAcls")
      private final @Nullable Output<Boolean> ignorePublicAcls;

    public Output<Boolean> getIgnorePublicAcls() {
        return this.ignorePublicAcls == null ? Codegen.empty() : this.ignorePublicAcls;
    }

    /**
     * Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
     * * Only the bucket owner and AWS Services can access buckets with public policies.
     * 
     */
    @Import(name="restrictPublicBuckets")
      private final @Nullable Output<Boolean> restrictPublicBuckets;

    public Output<Boolean> getRestrictPublicBuckets() {
        return this.restrictPublicBuckets == null ? Codegen.empty() : this.restrictPublicBuckets;
    }

    public AccountPublicAccessBlockState(
        @Nullable Output<String> accountId,
        @Nullable Output<Boolean> blockPublicAcls,
        @Nullable Output<Boolean> blockPublicPolicy,
        @Nullable Output<Boolean> ignorePublicAcls,
        @Nullable Output<Boolean> restrictPublicBuckets) {
        this.accountId = accountId;
        this.blockPublicAcls = blockPublicAcls;
        this.blockPublicPolicy = blockPublicPolicy;
        this.ignorePublicAcls = ignorePublicAcls;
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    private AccountPublicAccessBlockState() {
        this.accountId = Codegen.empty();
        this.blockPublicAcls = Codegen.empty();
        this.blockPublicPolicy = Codegen.empty();
        this.ignorePublicAcls = Codegen.empty();
        this.restrictPublicBuckets = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountPublicAccessBlockState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private @Nullable Output<Boolean> blockPublicAcls;
        private @Nullable Output<Boolean> blockPublicPolicy;
        private @Nullable Output<Boolean> ignorePublicAcls;
        private @Nullable Output<Boolean> restrictPublicBuckets;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountPublicAccessBlockState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.blockPublicAcls = defaults.blockPublicAcls;
    	      this.blockPublicPolicy = defaults.blockPublicPolicy;
    	      this.ignorePublicAcls = defaults.ignorePublicAcls;
    	      this.restrictPublicBuckets = defaults.restrictPublicBuckets;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Codegen.ofNullable(accountId);
            return this;
        }
        public Builder blockPublicAcls(@Nullable Output<Boolean> blockPublicAcls) {
            this.blockPublicAcls = blockPublicAcls;
            return this;
        }
        public Builder blockPublicAcls(@Nullable Boolean blockPublicAcls) {
            this.blockPublicAcls = Codegen.ofNullable(blockPublicAcls);
            return this;
        }
        public Builder blockPublicPolicy(@Nullable Output<Boolean> blockPublicPolicy) {
            this.blockPublicPolicy = blockPublicPolicy;
            return this;
        }
        public Builder blockPublicPolicy(@Nullable Boolean blockPublicPolicy) {
            this.blockPublicPolicy = Codegen.ofNullable(blockPublicPolicy);
            return this;
        }
        public Builder ignorePublicAcls(@Nullable Output<Boolean> ignorePublicAcls) {
            this.ignorePublicAcls = ignorePublicAcls;
            return this;
        }
        public Builder ignorePublicAcls(@Nullable Boolean ignorePublicAcls) {
            this.ignorePublicAcls = Codegen.ofNullable(ignorePublicAcls);
            return this;
        }
        public Builder restrictPublicBuckets(@Nullable Output<Boolean> restrictPublicBuckets) {
            this.restrictPublicBuckets = restrictPublicBuckets;
            return this;
        }
        public Builder restrictPublicBuckets(@Nullable Boolean restrictPublicBuckets) {
            this.restrictPublicBuckets = Codegen.ofNullable(restrictPublicBuckets);
            return this;
        }        public AccountPublicAccessBlockState build() {
            return new AccountPublicAccessBlockState(accountId, blockPublicAcls, blockPublicPolicy, ignorePublicAcls, restrictPublicBuckets);
        }
    }
}
