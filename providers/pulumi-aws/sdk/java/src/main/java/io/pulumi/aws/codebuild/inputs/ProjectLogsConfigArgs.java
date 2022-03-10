// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.aws.codebuild.inputs.ProjectLogsConfigCloudwatchLogsArgs;
import io.pulumi.aws.codebuild.inputs.ProjectLogsConfigS3LogsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectLogsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectLogsConfigArgs Empty = new ProjectLogsConfigArgs();

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="cloudwatchLogs")
      private final @Nullable Input<ProjectLogsConfigCloudwatchLogsArgs> cloudwatchLogs;

    public Input<ProjectLogsConfigCloudwatchLogsArgs> getCloudwatchLogs() {
        return this.cloudwatchLogs == null ? Input.empty() : this.cloudwatchLogs;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="s3Logs")
      private final @Nullable Input<ProjectLogsConfigS3LogsArgs> s3Logs;

    public Input<ProjectLogsConfigS3LogsArgs> getS3Logs() {
        return this.s3Logs == null ? Input.empty() : this.s3Logs;
    }

    public ProjectLogsConfigArgs(
        @Nullable Input<ProjectLogsConfigCloudwatchLogsArgs> cloudwatchLogs,
        @Nullable Input<ProjectLogsConfigS3LogsArgs> s3Logs) {
        this.cloudwatchLogs = cloudwatchLogs;
        this.s3Logs = s3Logs;
    }

    private ProjectLogsConfigArgs() {
        this.cloudwatchLogs = Input.empty();
        this.s3Logs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectLogsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ProjectLogsConfigCloudwatchLogsArgs> cloudwatchLogs;
        private @Nullable Input<ProjectLogsConfigS3LogsArgs> s3Logs;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectLogsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLogs = defaults.cloudwatchLogs;
    	      this.s3Logs = defaults.s3Logs;
        }

        public Builder cloudwatchLogs(@Nullable Input<ProjectLogsConfigCloudwatchLogsArgs> cloudwatchLogs) {
            this.cloudwatchLogs = cloudwatchLogs;
            return this;
        }

        public Builder cloudwatchLogs(@Nullable ProjectLogsConfigCloudwatchLogsArgs cloudwatchLogs) {
            this.cloudwatchLogs = Input.ofNullable(cloudwatchLogs);
            return this;
        }

        public Builder s3Logs(@Nullable Input<ProjectLogsConfigS3LogsArgs> s3Logs) {
            this.s3Logs = s3Logs;
            return this;
        }

        public Builder s3Logs(@Nullable ProjectLogsConfigS3LogsArgs s3Logs) {
            this.s3Logs = Input.ofNullable(s3Logs);
            return this;
        }
        public ProjectLogsConfigArgs build() {
            return new ProjectLogsConfigArgs(cloudwatchLogs, s3Logs);
        }
    }
}
