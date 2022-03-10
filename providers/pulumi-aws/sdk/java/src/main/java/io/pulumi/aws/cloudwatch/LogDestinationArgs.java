// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LogDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogDestinationArgs Empty = new LogDestinationArgs();

    /**
     * A name for the log destination
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to put data into the target
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * The ARN of the target Amazon Kinesis stream resource for the destination
     * 
     */
    @InputImport(name="targetArn", required=true)
      private final Input<String> targetArn;

    public Input<String> getTargetArn() {
        return this.targetArn;
    }

    public LogDestinationArgs(
        @Nullable Input<String> name,
        Input<String> roleArn,
        Input<String> targetArn) {
        this.name = name;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.targetArn = Objects.requireNonNull(targetArn, "expected parameter 'targetArn' to be non-null");
    }

    private LogDestinationArgs() {
        this.name = Input.empty();
        this.roleArn = Input.empty();
        this.targetArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private Input<String> roleArn;
        private Input<String> targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(LogDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder targetArn(Input<String> targetArn) {
            this.targetArn = Objects.requireNonNull(targetArn);
            return this;
        }

        public Builder targetArn(String targetArn) {
            this.targetArn = Input.of(Objects.requireNonNull(targetArn));
            return this;
        }
        public LogDestinationArgs build() {
            return new LogDestinationArgs(name, roleArn, targetArn);
        }
    }
}
