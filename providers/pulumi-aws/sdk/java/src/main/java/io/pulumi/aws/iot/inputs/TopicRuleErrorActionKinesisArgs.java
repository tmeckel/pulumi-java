// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleErrorActionKinesisArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleErrorActionKinesisArgs Empty = new TopicRuleErrorActionKinesisArgs();

    /**
     * The partition key.
     * 
     */
    @Import(name="partitionKey")
      private final @Nullable Output<String> partitionKey;

    public Output<String> getPartitionKey() {
        return this.partitionKey == null ? Codegen.empty() : this.partitionKey;
    }

    /**
     * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * The name of the Amazon Kinesis stream.
     * 
     */
    @Import(name="streamName", required=true)
      private final Output<String> streamName;

    public Output<String> getStreamName() {
        return this.streamName;
    }

    public TopicRuleErrorActionKinesisArgs(
        @Nullable Output<String> partitionKey,
        Output<String> roleArn,
        Output<String> streamName) {
        this.partitionKey = partitionKey;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.streamName = Objects.requireNonNull(streamName, "expected parameter 'streamName' to be non-null");
    }

    private TopicRuleErrorActionKinesisArgs() {
        this.partitionKey = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.streamName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionKinesisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> partitionKey;
        private Output<String> roleArn;
        private Output<String> streamName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionKinesisArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partitionKey = defaults.partitionKey;
    	      this.roleArn = defaults.roleArn;
    	      this.streamName = defaults.streamName;
        }

        public Builder partitionKey(@Nullable Output<String> partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }
        public Builder partitionKey(@Nullable String partitionKey) {
            this.partitionKey = Codegen.ofNullable(partitionKey);
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder streamName(Output<String> streamName) {
            this.streamName = Objects.requireNonNull(streamName);
            return this;
        }
        public Builder streamName(String streamName) {
            this.streamName = Output.of(Objects.requireNonNull(streamName));
            return this;
        }        public TopicRuleErrorActionKinesisArgs build() {
            return new TopicRuleErrorActionKinesisArgs(partitionKey, roleArn, streamName);
        }
    }
}
