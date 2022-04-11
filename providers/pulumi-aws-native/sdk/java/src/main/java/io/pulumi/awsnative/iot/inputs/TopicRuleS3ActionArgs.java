// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.enums.TopicRuleCannedAccessControlList;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleS3ActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleS3ActionArgs Empty = new TopicRuleS3ActionArgs();

    @Import(name="bucketName", required=true)
      private final Output<String> bucketName;

    public Output<String> getBucketName() {
        return this.bucketName;
    }

    @Import(name="cannedAcl")
      private final @Nullable Output<TopicRuleCannedAccessControlList> cannedAcl;

    public Output<TopicRuleCannedAccessControlList> getCannedAcl() {
        return this.cannedAcl == null ? Codegen.empty() : this.cannedAcl;
    }

    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    public TopicRuleS3ActionArgs(
        Output<String> bucketName,
        @Nullable Output<TopicRuleCannedAccessControlList> cannedAcl,
        Output<String> key,
        Output<String> roleArn) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.cannedAcl = cannedAcl;
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private TopicRuleS3ActionArgs() {
        this.bucketName = Codegen.empty();
        this.cannedAcl = Codegen.empty();
        this.key = Codegen.empty();
        this.roleArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleS3ActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucketName;
        private @Nullable Output<TopicRuleCannedAccessControlList> cannedAcl;
        private Output<String> key;
        private Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleS3ActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.cannedAcl = defaults.cannedAcl;
    	      this.key = defaults.key;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder bucketName(Output<String> bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder bucketName(String bucketName) {
            this.bucketName = Output.of(Objects.requireNonNull(bucketName));
            return this;
        }
        public Builder cannedAcl(@Nullable Output<TopicRuleCannedAccessControlList> cannedAcl) {
            this.cannedAcl = cannedAcl;
            return this;
        }
        public Builder cannedAcl(@Nullable TopicRuleCannedAccessControlList cannedAcl) {
            this.cannedAcl = Codegen.ofNullable(cannedAcl);
            return this;
        }
        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }        public TopicRuleS3ActionArgs build() {
            return new TopicRuleS3ActionArgs(bucketName, cannedAcl, key, roleArn);
        }
    }
}
