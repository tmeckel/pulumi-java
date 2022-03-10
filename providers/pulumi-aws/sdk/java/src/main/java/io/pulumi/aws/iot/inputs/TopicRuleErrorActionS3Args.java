// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TopicRuleErrorActionS3Args extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleErrorActionS3Args Empty = new TopicRuleErrorActionS3Args();

    /**
     * The Amazon S3 bucket name.
     * 
     */
    @InputImport(name="bucketName", required=true)
      private final Input<String> bucketName;

    public Input<String> getBucketName() {
        return this.bucketName;
    }

    /**
     * The object key.
     * 
     */
    @InputImport(name="key", required=true)
      private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    /**
     * The IAM role ARN that allows access to the CloudWatch alarm.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    public TopicRuleErrorActionS3Args(
        Input<String> bucketName,
        Input<String> key,
        Input<String> roleArn) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private TopicRuleErrorActionS3Args() {
        this.bucketName = Input.empty();
        this.key = Input.empty();
        this.roleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucketName;
        private Input<String> key;
        private Input<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionS3Args defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.key = defaults.key;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder bucketName(Input<String> bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder bucketName(String bucketName) {
            this.bucketName = Input.of(Objects.requireNonNull(bucketName));
            return this;
        }

        public Builder key(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder roleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public TopicRuleErrorActionS3Args build() {
            return new TopicRuleErrorActionS3Args(bucketName, key, roleArn);
        }
    }
}
