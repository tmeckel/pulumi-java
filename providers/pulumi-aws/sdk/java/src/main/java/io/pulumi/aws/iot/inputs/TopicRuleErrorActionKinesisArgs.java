// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleErrorActionKinesisArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleErrorActionKinesisArgs Empty = new TopicRuleErrorActionKinesisArgs();

    /**
     * The partition key.
     * 
     */
    @InputImport(name="partitionKey")
      private final @Nullable Input<String> partitionKey;

    public Input<String> getPartitionKey() {
        return this.partitionKey == null ? Input.empty() : this.partitionKey;
    }

    /**
     * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * The name of the Amazon Kinesis stream.
     * 
     */
    @InputImport(name="streamName", required=true)
      private final Input<String> streamName;

    public Input<String> getStreamName() {
        return this.streamName;
    }

    public TopicRuleErrorActionKinesisArgs(
        @Nullable Input<String> partitionKey,
        Input<String> roleArn,
        Input<String> streamName) {
        this.partitionKey = partitionKey;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.streamName = Objects.requireNonNull(streamName, "expected parameter 'streamName' to be non-null");
    }

    private TopicRuleErrorActionKinesisArgs() {
        this.partitionKey = Input.empty();
        this.roleArn = Input.empty();
        this.streamName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionKinesisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> partitionKey;
        private Input<String> roleArn;
        private Input<String> streamName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionKinesisArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partitionKey = defaults.partitionKey;
    	      this.roleArn = defaults.roleArn;
    	      this.streamName = defaults.streamName;
        }

        public Builder partitionKey(@Nullable Input<String> partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }

        public Builder partitionKey(@Nullable String partitionKey) {
            this.partitionKey = Input.ofNullable(partitionKey);
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

        public Builder streamName(Input<String> streamName) {
            this.streamName = Objects.requireNonNull(streamName);
            return this;
        }

        public Builder streamName(String streamName) {
            this.streamName = Input.of(Objects.requireNonNull(streamName));
            return this;
        }
        public TopicRuleErrorActionKinesisArgs build() {
            return new TopicRuleErrorActionKinesisArgs(partitionKey, roleArn, streamName);
        }
    }
}
