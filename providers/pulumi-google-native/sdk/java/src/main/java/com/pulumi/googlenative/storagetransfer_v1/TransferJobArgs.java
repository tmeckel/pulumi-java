// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.storagetransfer_v1.enums.TransferJobStatus;
import com.pulumi.googlenative.storagetransfer_v1.inputs.LoggingConfigArgs;
import com.pulumi.googlenative.storagetransfer_v1.inputs.NotificationConfigArgs;
import com.pulumi.googlenative.storagetransfer_v1.inputs.ScheduleArgs;
import com.pulumi.googlenative.storagetransfer_v1.inputs.TransferSpecArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransferJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransferJobArgs Empty = new TransferJobArgs();

    /**
     * A description provided by the user for the job. Its max length is 1024 bytes when Unicode-encoded.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description provided by the user for the job. Its max length is 1024 bytes when Unicode-encoded.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the most recently started TransferOperation of this JobConfig. Present if a TransferOperation has been created for this JobConfig.
     * 
     */
    @Import(name="latestOperationName")
    private @Nullable Output<String> latestOperationName;

    /**
     * @return The name of the most recently started TransferOperation of this JobConfig. Present if a TransferOperation has been created for this JobConfig.
     * 
     */
    public Optional<Output<String>> latestOperationName() {
        return Optional.ofNullable(this.latestOperationName);
    }

    /**
     * Logging configuration.
     * 
     */
    @Import(name="loggingConfig")
    private @Nullable Output<LoggingConfigArgs> loggingConfig;

    /**
     * @return Logging configuration.
     * 
     */
    public Optional<Output<LoggingConfigArgs>> loggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }

    /**
     * A unique name (within the transfer project) assigned when the job is created. If this field is empty in a CreateTransferJobRequest, Storage Transfer Service assigns a unique name. Otherwise, the specified name is used as the unique name for this job. If the specified name is in use by a job, the creation request fails with an ALREADY_EXISTS error. This name must start with `&#34;transferJobs/&#34;` prefix and end with a letter or a number, and should be no more than 128 characters. For transfers involving PosixFilesystem, this name must start with `transferJobs/OPI` specifically. For all other transfer types, this name must not start with `transferJobs/OPI`. Non-PosixFilesystem example: `&#34;transferJobs/^(?!OPI)[A-Za-z0-9-._~]*[A-Za-z0-9]$&#34;` PosixFilesystem example: `&#34;transferJobs/OPI^[A-Za-z0-9-._~]*[A-Za-z0-9]$&#34;` Applications must not rely on the enforcement of naming requirements involving OPI. Invalid job names fail with an INVALID_ARGUMENT error.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique name (within the transfer project) assigned when the job is created. If this field is empty in a CreateTransferJobRequest, Storage Transfer Service assigns a unique name. Otherwise, the specified name is used as the unique name for this job. If the specified name is in use by a job, the creation request fails with an ALREADY_EXISTS error. This name must start with `&#34;transferJobs/&#34;` prefix and end with a letter or a number, and should be no more than 128 characters. For transfers involving PosixFilesystem, this name must start with `transferJobs/OPI` specifically. For all other transfer types, this name must not start with `transferJobs/OPI`. Non-PosixFilesystem example: `&#34;transferJobs/^(?!OPI)[A-Za-z0-9-._~]*[A-Za-z0-9]$&#34;` PosixFilesystem example: `&#34;transferJobs/OPI^[A-Za-z0-9-._~]*[A-Za-z0-9]$&#34;` Applications must not rely on the enforcement of naming requirements involving OPI. Invalid job names fail with an INVALID_ARGUMENT error.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Notification configuration. This is not supported for transfers involving PosixFilesystem.
     * 
     */
    @Import(name="notificationConfig")
    private @Nullable Output<NotificationConfigArgs> notificationConfig;

    /**
     * @return Notification configuration. This is not supported for transfers involving PosixFilesystem.
     * 
     */
    public Optional<Output<NotificationConfigArgs>> notificationConfig() {
        return Optional.ofNullable(this.notificationConfig);
    }

    /**
     * The ID of the Google Cloud project that owns the job.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the Google Cloud project that owns the job.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Specifies schedule for the transfer job. This is an optional field. When the field is not set, the job never executes a transfer, unless you invoke RunTransferJob or update the job to have a non-empty schedule.
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<ScheduleArgs> schedule;

    /**
     * @return Specifies schedule for the transfer job. This is an optional field. When the field is not set, the job never executes a transfer, unless you invoke RunTransferJob or update the job to have a non-empty schedule.
     * 
     */
    public Optional<Output<ScheduleArgs>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * Status of the job. This value MUST be specified for `CreateTransferJobRequests`. **Note:** The effect of the new job status takes place during a subsequent job run. For example, if you change the job status from ENABLED to DISABLED, and an operation spawned by the transfer is running, the status change would not affect the current operation.
     * 
     */
    @Import(name="status")
    private @Nullable Output<TransferJobStatus> status;

    /**
     * @return Status of the job. This value MUST be specified for `CreateTransferJobRequests`. **Note:** The effect of the new job status takes place during a subsequent job run. For example, if you change the job status from ENABLED to DISABLED, and an operation spawned by the transfer is running, the status change would not affect the current operation.
     * 
     */
    public Optional<Output<TransferJobStatus>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Transfer specification.
     * 
     */
    @Import(name="transferSpec")
    private @Nullable Output<TransferSpecArgs> transferSpec;

    /**
     * @return Transfer specification.
     * 
     */
    public Optional<Output<TransferSpecArgs>> transferSpec() {
        return Optional.ofNullable(this.transferSpec);
    }

    private TransferJobArgs() {}

    private TransferJobArgs(TransferJobArgs $) {
        this.description = $.description;
        this.latestOperationName = $.latestOperationName;
        this.loggingConfig = $.loggingConfig;
        this.name = $.name;
        this.notificationConfig = $.notificationConfig;
        this.project = $.project;
        this.schedule = $.schedule;
        this.status = $.status;
        this.transferSpec = $.transferSpec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransferJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransferJobArgs $;

        public Builder() {
            $ = new TransferJobArgs();
        }

        public Builder(TransferJobArgs defaults) {
            $ = new TransferJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description provided by the user for the job. Its max length is 1024 bytes when Unicode-encoded.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description provided by the user for the job. Its max length is 1024 bytes when Unicode-encoded.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param latestOperationName The name of the most recently started TransferOperation of this JobConfig. Present if a TransferOperation has been created for this JobConfig.
         * 
         * @return builder
         * 
         */
        public Builder latestOperationName(@Nullable Output<String> latestOperationName) {
            $.latestOperationName = latestOperationName;
            return this;
        }

        /**
         * @param latestOperationName The name of the most recently started TransferOperation of this JobConfig. Present if a TransferOperation has been created for this JobConfig.
         * 
         * @return builder
         * 
         */
        public Builder latestOperationName(String latestOperationName) {
            return latestOperationName(Output.of(latestOperationName));
        }

        /**
         * @param loggingConfig Logging configuration.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfig(@Nullable Output<LoggingConfigArgs> loggingConfig) {
            $.loggingConfig = loggingConfig;
            return this;
        }

        /**
         * @param loggingConfig Logging configuration.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfig(LoggingConfigArgs loggingConfig) {
            return loggingConfig(Output.of(loggingConfig));
        }

        /**
         * @param name A unique name (within the transfer project) assigned when the job is created. If this field is empty in a CreateTransferJobRequest, Storage Transfer Service assigns a unique name. Otherwise, the specified name is used as the unique name for this job. If the specified name is in use by a job, the creation request fails with an ALREADY_EXISTS error. This name must start with `&#34;transferJobs/&#34;` prefix and end with a letter or a number, and should be no more than 128 characters. For transfers involving PosixFilesystem, this name must start with `transferJobs/OPI` specifically. For all other transfer types, this name must not start with `transferJobs/OPI`. Non-PosixFilesystem example: `&#34;transferJobs/^(?!OPI)[A-Za-z0-9-._~]*[A-Za-z0-9]$&#34;` PosixFilesystem example: `&#34;transferJobs/OPI^[A-Za-z0-9-._~]*[A-Za-z0-9]$&#34;` Applications must not rely on the enforcement of naming requirements involving OPI. Invalid job names fail with an INVALID_ARGUMENT error.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique name (within the transfer project) assigned when the job is created. If this field is empty in a CreateTransferJobRequest, Storage Transfer Service assigns a unique name. Otherwise, the specified name is used as the unique name for this job. If the specified name is in use by a job, the creation request fails with an ALREADY_EXISTS error. This name must start with `&#34;transferJobs/&#34;` prefix and end with a letter or a number, and should be no more than 128 characters. For transfers involving PosixFilesystem, this name must start with `transferJobs/OPI` specifically. For all other transfer types, this name must not start with `transferJobs/OPI`. Non-PosixFilesystem example: `&#34;transferJobs/^(?!OPI)[A-Za-z0-9-._~]*[A-Za-z0-9]$&#34;` PosixFilesystem example: `&#34;transferJobs/OPI^[A-Za-z0-9-._~]*[A-Za-z0-9]$&#34;` Applications must not rely on the enforcement of naming requirements involving OPI. Invalid job names fail with an INVALID_ARGUMENT error.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notificationConfig Notification configuration. This is not supported for transfers involving PosixFilesystem.
         * 
         * @return builder
         * 
         */
        public Builder notificationConfig(@Nullable Output<NotificationConfigArgs> notificationConfig) {
            $.notificationConfig = notificationConfig;
            return this;
        }

        /**
         * @param notificationConfig Notification configuration. This is not supported for transfers involving PosixFilesystem.
         * 
         * @return builder
         * 
         */
        public Builder notificationConfig(NotificationConfigArgs notificationConfig) {
            return notificationConfig(Output.of(notificationConfig));
        }

        /**
         * @param project The ID of the Google Cloud project that owns the job.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the Google Cloud project that owns the job.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param schedule Specifies schedule for the transfer job. This is an optional field. When the field is not set, the job never executes a transfer, unless you invoke RunTransferJob or update the job to have a non-empty schedule.
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable Output<ScheduleArgs> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule Specifies schedule for the transfer job. This is an optional field. When the field is not set, the job never executes a transfer, unless you invoke RunTransferJob or update the job to have a non-empty schedule.
         * 
         * @return builder
         * 
         */
        public Builder schedule(ScheduleArgs schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param status Status of the job. This value MUST be specified for `CreateTransferJobRequests`. **Note:** The effect of the new job status takes place during a subsequent job run. For example, if you change the job status from ENABLED to DISABLED, and an operation spawned by the transfer is running, the status change would not affect the current operation.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<TransferJobStatus> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of the job. This value MUST be specified for `CreateTransferJobRequests`. **Note:** The effect of the new job status takes place during a subsequent job run. For example, if you change the job status from ENABLED to DISABLED, and an operation spawned by the transfer is running, the status change would not affect the current operation.
         * 
         * @return builder
         * 
         */
        public Builder status(TransferJobStatus status) {
            return status(Output.of(status));
        }

        /**
         * @param transferSpec Transfer specification.
         * 
         * @return builder
         * 
         */
        public Builder transferSpec(@Nullable Output<TransferSpecArgs> transferSpec) {
            $.transferSpec = transferSpec;
            return this;
        }

        /**
         * @param transferSpec Transfer specification.
         * 
         * @return builder
         * 
         */
        public Builder transferSpec(TransferSpecArgs transferSpec) {
            return transferSpec(Output.of(transferSpec));
        }

        public TransferJobArgs build() {
            return $;
        }
    }

}
