// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.inputs;

import com.pulumi.aws.codebuild.inputs.ProjectLogsConfigCloudwatchLogsGetArgs;
import com.pulumi.aws.codebuild.inputs.ProjectLogsConfigS3LogsGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectLogsConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectLogsConfigGetArgs Empty = new ProjectLogsConfigGetArgs();

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="cloudwatchLogs")
    private @Nullable Output<ProjectLogsConfigCloudwatchLogsGetArgs> cloudwatchLogs;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Optional<Output<ProjectLogsConfigCloudwatchLogsGetArgs>> cloudwatchLogs() {
        return Optional.ofNullable(this.cloudwatchLogs);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="s3Logs")
    private @Nullable Output<ProjectLogsConfigS3LogsGetArgs> s3Logs;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Optional<Output<ProjectLogsConfigS3LogsGetArgs>> s3Logs() {
        return Optional.ofNullable(this.s3Logs);
    }

    private ProjectLogsConfigGetArgs() {}

    private ProjectLogsConfigGetArgs(ProjectLogsConfigGetArgs $) {
        this.cloudwatchLogs = $.cloudwatchLogs;
        this.s3Logs = $.s3Logs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectLogsConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectLogsConfigGetArgs $;

        public Builder() {
            $ = new ProjectLogsConfigGetArgs();
        }

        public Builder(ProjectLogsConfigGetArgs defaults) {
            $ = new ProjectLogsConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudwatchLogs Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder cloudwatchLogs(@Nullable Output<ProjectLogsConfigCloudwatchLogsGetArgs> cloudwatchLogs) {
            $.cloudwatchLogs = cloudwatchLogs;
            return this;
        }

        /**
         * @param cloudwatchLogs Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder cloudwatchLogs(ProjectLogsConfigCloudwatchLogsGetArgs cloudwatchLogs) {
            return cloudwatchLogs(Output.of(cloudwatchLogs));
        }

        /**
         * @param s3Logs Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder s3Logs(@Nullable Output<ProjectLogsConfigS3LogsGetArgs> s3Logs) {
            $.s3Logs = s3Logs;
            return this;
        }

        /**
         * @param s3Logs Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder s3Logs(ProjectLogsConfigS3LogsGetArgs s3Logs) {
            return s3Logs(Output.of(s3Logs));
        }

        public ProjectLogsConfigGetArgs build() {
            return $;
        }
    }

}
