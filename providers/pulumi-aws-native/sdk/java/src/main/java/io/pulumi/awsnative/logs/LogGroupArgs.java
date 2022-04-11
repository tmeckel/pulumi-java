// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.logs;

import io.pulumi.awsnative.logs.inputs.LogGroupTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LogGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogGroupArgs Empty = new LogGroupArgs();

    /**
     * The Amazon Resource Name (ARN) of the CMK to use when encrypting log data.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Codegen.empty() : this.kmsKeyId;
    }

    /**
     * The name of the log group. If you don't specify a name, AWS CloudFormation generates a unique ID for the log group.
     * 
     */
    @Import(name="logGroupName")
      private final @Nullable Output<String> logGroupName;

    public Output<String> getLogGroupName() {
        return this.logGroupName == null ? Codegen.empty() : this.logGroupName;
    }

    /**
     * The number of days to retain the log events in the specified log group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731, 1827, and 3653.
     * 
     */
    @Import(name="retentionInDays")
      private final @Nullable Output<Integer> retentionInDays;

    public Output<Integer> getRetentionInDays() {
        return this.retentionInDays == null ? Codegen.empty() : this.retentionInDays;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<LogGroupTagArgs>> tags;

    public Output<List<LogGroupTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public LogGroupArgs(
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<String> logGroupName,
        @Nullable Output<Integer> retentionInDays,
        @Nullable Output<List<LogGroupTagArgs>> tags) {
        this.kmsKeyId = kmsKeyId;
        this.logGroupName = logGroupName;
        this.retentionInDays = retentionInDays;
        this.tags = tags;
    }

    private LogGroupArgs() {
        this.kmsKeyId = Codegen.empty();
        this.logGroupName = Codegen.empty();
        this.retentionInDays = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<String> logGroupName;
        private @Nullable Output<Integer> retentionInDays;
        private @Nullable Output<List<LogGroupTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LogGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.logGroupName = defaults.logGroupName;
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.tags = defaults.tags;
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Codegen.ofNullable(kmsKeyId);
            return this;
        }
        public Builder logGroupName(@Nullable Output<String> logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }
        public Builder logGroupName(@Nullable String logGroupName) {
            this.logGroupName = Codegen.ofNullable(logGroupName);
            return this;
        }
        public Builder retentionInDays(@Nullable Output<Integer> retentionInDays) {
            this.retentionInDays = retentionInDays;
            return this;
        }
        public Builder retentionInDays(@Nullable Integer retentionInDays) {
            this.retentionInDays = Codegen.ofNullable(retentionInDays);
            return this;
        }
        public Builder tags(@Nullable Output<List<LogGroupTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<LogGroupTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(LogGroupTagArgs... tags) {
            return tags(List.of(tags));
        }        public LogGroupArgs build() {
            return new LogGroupArgs(kmsKeyId, logGroupName, retentionInDays, tags);
        }
    }
}
