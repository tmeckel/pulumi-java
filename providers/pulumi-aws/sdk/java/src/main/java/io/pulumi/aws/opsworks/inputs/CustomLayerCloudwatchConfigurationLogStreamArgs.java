// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomLayerCloudwatchConfigurationLogStreamArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomLayerCloudwatchConfigurationLogStreamArgs Empty = new CustomLayerCloudwatchConfigurationLogStreamArgs();

    /**
     * Specifies the max number of log events in a batch, up to `10000`. The default value is `1000`.
     * 
     */
    @Import(name="batchCount")
      private final @Nullable Output<Integer> batchCount;

    public Output<Integer> getBatchCount() {
        return this.batchCount == null ? Codegen.empty() : this.batchCount;
    }

    /**
     * Specifies the maximum size of log events in a batch, in bytes, up to `1048576` bytes. The default value is `32768` bytes.
     * 
     */
    @Import(name="batchSize")
      private final @Nullable Output<Integer> batchSize;

    public Output<Integer> getBatchSize() {
        return this.batchSize == null ? Codegen.empty() : this.batchSize;
    }

    /**
     * Specifies the time duration for the batching of log events. The minimum value is `5000` and default value is `5000`.
     * 
     */
    @Import(name="bufferDuration")
      private final @Nullable Output<Integer> bufferDuration;

    public Output<Integer> getBufferDuration() {
        return this.bufferDuration == null ? Codegen.empty() : this.bufferDuration;
    }

    /**
     * Specifies how the timestamp is extracted from logs. For more information, see the CloudWatch Logs Agent Reference (https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AgentReference.html).
     * 
     */
    @Import(name="datetimeFormat")
      private final @Nullable Output<String> datetimeFormat;

    public Output<String> getDatetimeFormat() {
        return this.datetimeFormat == null ? Codegen.empty() : this.datetimeFormat;
    }

    /**
     * Specifies the encoding of the log file so that the file can be read correctly. The default is `utf_8`.
     * 
     */
    @Import(name="encoding")
      private final @Nullable Output<String> encoding;

    public Output<String> getEncoding() {
        return this.encoding == null ? Codegen.empty() : this.encoding;
    }

    /**
     * Specifies log files that you want to push to CloudWatch Logs. File can point to a specific file or multiple files (by using wild card characters such as /var/log/system.log*).
     * 
     */
    @Import(name="file", required=true)
      private final Output<String> file;

    public Output<String> getFile() {
        return this.file;
    }

    /**
     * Specifies the range of lines for identifying a file. The valid values are one number, or two dash-delimited numbers, such as `1`, `2-5`. The default value is `1`.
     * 
     */
    @Import(name="fileFingerprintLines")
      private final @Nullable Output<String> fileFingerprintLines;

    public Output<String> getFileFingerprintLines() {
        return this.fileFingerprintLines == null ? Codegen.empty() : this.fileFingerprintLines;
    }

    /**
     * Specifies where to start to read data (`start_of_file` or `end_of_file`). The default is `start_of_file`.
     * 
     */
    @Import(name="initialPosition")
      private final @Nullable Output<String> initialPosition;

    public Output<String> getInitialPosition() {
        return this.initialPosition == null ? Codegen.empty() : this.initialPosition;
    }

    /**
     * Specifies the destination log group. A log group is created automatically if it doesn't already exist.
     * 
     */
    @Import(name="logGroupName", required=true)
      private final Output<String> logGroupName;

    public Output<String> getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * Specifies the pattern for identifying the start of a log message.
     * 
     */
    @Import(name="multilineStartPattern")
      private final @Nullable Output<String> multilineStartPattern;

    public Output<String> getMultilineStartPattern() {
        return this.multilineStartPattern == null ? Codegen.empty() : this.multilineStartPattern;
    }

    /**
     * Specifies the time zone of log event time stamps.
     * 
     */
    @Import(name="timeZone")
      private final @Nullable Output<String> timeZone;

    public Output<String> getTimeZone() {
        return this.timeZone == null ? Codegen.empty() : this.timeZone;
    }

    public CustomLayerCloudwatchConfigurationLogStreamArgs(
        @Nullable Output<Integer> batchCount,
        @Nullable Output<Integer> batchSize,
        @Nullable Output<Integer> bufferDuration,
        @Nullable Output<String> datetimeFormat,
        @Nullable Output<String> encoding,
        Output<String> file,
        @Nullable Output<String> fileFingerprintLines,
        @Nullable Output<String> initialPosition,
        Output<String> logGroupName,
        @Nullable Output<String> multilineStartPattern,
        @Nullable Output<String> timeZone) {
        this.batchCount = batchCount;
        this.batchSize = batchSize;
        this.bufferDuration = bufferDuration;
        this.datetimeFormat = datetimeFormat;
        this.encoding = encoding;
        this.file = Objects.requireNonNull(file, "expected parameter 'file' to be non-null");
        this.fileFingerprintLines = fileFingerprintLines;
        this.initialPosition = initialPosition;
        this.logGroupName = Objects.requireNonNull(logGroupName, "expected parameter 'logGroupName' to be non-null");
        this.multilineStartPattern = multilineStartPattern;
        this.timeZone = timeZone;
    }

    private CustomLayerCloudwatchConfigurationLogStreamArgs() {
        this.batchCount = Codegen.empty();
        this.batchSize = Codegen.empty();
        this.bufferDuration = Codegen.empty();
        this.datetimeFormat = Codegen.empty();
        this.encoding = Codegen.empty();
        this.file = Codegen.empty();
        this.fileFingerprintLines = Codegen.empty();
        this.initialPosition = Codegen.empty();
        this.logGroupName = Codegen.empty();
        this.multilineStartPattern = Codegen.empty();
        this.timeZone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomLayerCloudwatchConfigurationLogStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> batchCount;
        private @Nullable Output<Integer> batchSize;
        private @Nullable Output<Integer> bufferDuration;
        private @Nullable Output<String> datetimeFormat;
        private @Nullable Output<String> encoding;
        private Output<String> file;
        private @Nullable Output<String> fileFingerprintLines;
        private @Nullable Output<String> initialPosition;
        private Output<String> logGroupName;
        private @Nullable Output<String> multilineStartPattern;
        private @Nullable Output<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomLayerCloudwatchConfigurationLogStreamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchCount = defaults.batchCount;
    	      this.batchSize = defaults.batchSize;
    	      this.bufferDuration = defaults.bufferDuration;
    	      this.datetimeFormat = defaults.datetimeFormat;
    	      this.encoding = defaults.encoding;
    	      this.file = defaults.file;
    	      this.fileFingerprintLines = defaults.fileFingerprintLines;
    	      this.initialPosition = defaults.initialPosition;
    	      this.logGroupName = defaults.logGroupName;
    	      this.multilineStartPattern = defaults.multilineStartPattern;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder batchCount(@Nullable Output<Integer> batchCount) {
            this.batchCount = batchCount;
            return this;
        }
        public Builder batchCount(@Nullable Integer batchCount) {
            this.batchCount = Codegen.ofNullable(batchCount);
            return this;
        }
        public Builder batchSize(@Nullable Output<Integer> batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Builder batchSize(@Nullable Integer batchSize) {
            this.batchSize = Codegen.ofNullable(batchSize);
            return this;
        }
        public Builder bufferDuration(@Nullable Output<Integer> bufferDuration) {
            this.bufferDuration = bufferDuration;
            return this;
        }
        public Builder bufferDuration(@Nullable Integer bufferDuration) {
            this.bufferDuration = Codegen.ofNullable(bufferDuration);
            return this;
        }
        public Builder datetimeFormat(@Nullable Output<String> datetimeFormat) {
            this.datetimeFormat = datetimeFormat;
            return this;
        }
        public Builder datetimeFormat(@Nullable String datetimeFormat) {
            this.datetimeFormat = Codegen.ofNullable(datetimeFormat);
            return this;
        }
        public Builder encoding(@Nullable Output<String> encoding) {
            this.encoding = encoding;
            return this;
        }
        public Builder encoding(@Nullable String encoding) {
            this.encoding = Codegen.ofNullable(encoding);
            return this;
        }
        public Builder file(Output<String> file) {
            this.file = Objects.requireNonNull(file);
            return this;
        }
        public Builder file(String file) {
            this.file = Output.of(Objects.requireNonNull(file));
            return this;
        }
        public Builder fileFingerprintLines(@Nullable Output<String> fileFingerprintLines) {
            this.fileFingerprintLines = fileFingerprintLines;
            return this;
        }
        public Builder fileFingerprintLines(@Nullable String fileFingerprintLines) {
            this.fileFingerprintLines = Codegen.ofNullable(fileFingerprintLines);
            return this;
        }
        public Builder initialPosition(@Nullable Output<String> initialPosition) {
            this.initialPosition = initialPosition;
            return this;
        }
        public Builder initialPosition(@Nullable String initialPosition) {
            this.initialPosition = Codegen.ofNullable(initialPosition);
            return this;
        }
        public Builder logGroupName(Output<String> logGroupName) {
            this.logGroupName = Objects.requireNonNull(logGroupName);
            return this;
        }
        public Builder logGroupName(String logGroupName) {
            this.logGroupName = Output.of(Objects.requireNonNull(logGroupName));
            return this;
        }
        public Builder multilineStartPattern(@Nullable Output<String> multilineStartPattern) {
            this.multilineStartPattern = multilineStartPattern;
            return this;
        }
        public Builder multilineStartPattern(@Nullable String multilineStartPattern) {
            this.multilineStartPattern = Codegen.ofNullable(multilineStartPattern);
            return this;
        }
        public Builder timeZone(@Nullable Output<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = Codegen.ofNullable(timeZone);
            return this;
        }        public CustomLayerCloudwatchConfigurationLogStreamArgs build() {
            return new CustomLayerCloudwatchConfigurationLogStreamArgs(batchCount, batchSize, bufferDuration, datetimeFormat, encoding, file, fileFingerprintLines, initialPosition, logGroupName, multilineStartPattern, timeZone);
        }
    }
}
