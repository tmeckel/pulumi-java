// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.storage.inputs.TransferJobScheduleGetArgs;
import io.pulumi.gcp.storage.inputs.TransferJobTransferSpecGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransferJobState extends io.pulumi.resources.ResourceArgs {

    public static final TransferJobState Empty = new TransferJobState();

    /**
     * When the Transfer Job was created.
     * 
     */
    @Import(name="creationTime")
      private final @Nullable Output<String> creationTime;

    public Output<String> getCreationTime() {
        return this.creationTime == null ? Codegen.empty() : this.creationTime;
    }

    /**
     * When the Transfer Job was deleted.
     * 
     */
    @Import(name="deletionTime")
      private final @Nullable Output<String> deletionTime;

    public Output<String> getDeletionTime() {
        return this.deletionTime == null ? Codegen.empty() : this.deletionTime;
    }

    /**
     * Unique description to identify the Transfer Job.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * When the Transfer Job was last modified.
     * 
     */
    @Import(name="lastModificationTime")
      private final @Nullable Output<String> lastModificationTime;

    public Output<String> getLastModificationTime() {
        return this.lastModificationTime == null ? Codegen.empty() : this.lastModificationTime;
    }

    /**
     * The name of the Transfer Job.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Schedule specification defining when the Transfer Job should be scheduled to start, end and what time to run. Structure documented below.
     * 
     */
    @Import(name="schedule")
      private final @Nullable Output<TransferJobScheduleGetArgs> schedule;

    public Output<TransferJobScheduleGetArgs> getSchedule() {
        return this.schedule == null ? Codegen.empty() : this.schedule;
    }

    /**
     * Status of the job. Default: `ENABLED`. **NOTE: The effect of the new job status takes place during a subsequent job run. For example, if you change the job status from ENABLED to DISABLED, and an operation spawned by the transfer is running, the status change would not affect the current operation.**
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * Transfer specification. Structure documented below.
     * 
     */
    @Import(name="transferSpec")
      private final @Nullable Output<TransferJobTransferSpecGetArgs> transferSpec;

    public Output<TransferJobTransferSpecGetArgs> getTransferSpec() {
        return this.transferSpec == null ? Codegen.empty() : this.transferSpec;
    }

    public TransferJobState(
        @Nullable Output<String> creationTime,
        @Nullable Output<String> deletionTime,
        @Nullable Output<String> description,
        @Nullable Output<String> lastModificationTime,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<TransferJobScheduleGetArgs> schedule,
        @Nullable Output<String> status,
        @Nullable Output<TransferJobTransferSpecGetArgs> transferSpec) {
        this.creationTime = creationTime;
        this.deletionTime = deletionTime;
        this.description = description;
        this.lastModificationTime = lastModificationTime;
        this.name = name;
        this.project = project;
        this.schedule = schedule;
        this.status = status;
        this.transferSpec = transferSpec;
    }

    private TransferJobState() {
        this.creationTime = Codegen.empty();
        this.deletionTime = Codegen.empty();
        this.description = Codegen.empty();
        this.lastModificationTime = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.schedule = Codegen.empty();
        this.status = Codegen.empty();
        this.transferSpec = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> creationTime;
        private @Nullable Output<String> deletionTime;
        private @Nullable Output<String> description;
        private @Nullable Output<String> lastModificationTime;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<TransferJobScheduleGetArgs> schedule;
        private @Nullable Output<String> status;
        private @Nullable Output<TransferJobTransferSpecGetArgs> transferSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.deletionTime = defaults.deletionTime;
    	      this.description = defaults.description;
    	      this.lastModificationTime = defaults.lastModificationTime;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.schedule = defaults.schedule;
    	      this.status = defaults.status;
    	      this.transferSpec = defaults.transferSpec;
        }

        public Builder creationTime(@Nullable Output<String> creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Builder creationTime(@Nullable String creationTime) {
            this.creationTime = Codegen.ofNullable(creationTime);
            return this;
        }
        public Builder deletionTime(@Nullable Output<String> deletionTime) {
            this.deletionTime = deletionTime;
            return this;
        }
        public Builder deletionTime(@Nullable String deletionTime) {
            this.deletionTime = Codegen.ofNullable(deletionTime);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder lastModificationTime(@Nullable Output<String> lastModificationTime) {
            this.lastModificationTime = lastModificationTime;
            return this;
        }
        public Builder lastModificationTime(@Nullable String lastModificationTime) {
            this.lastModificationTime = Codegen.ofNullable(lastModificationTime);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder schedule(@Nullable Output<TransferJobScheduleGetArgs> schedule) {
            this.schedule = schedule;
            return this;
        }
        public Builder schedule(@Nullable TransferJobScheduleGetArgs schedule) {
            this.schedule = Codegen.ofNullable(schedule);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder transferSpec(@Nullable Output<TransferJobTransferSpecGetArgs> transferSpec) {
            this.transferSpec = transferSpec;
            return this;
        }
        public Builder transferSpec(@Nullable TransferJobTransferSpecGetArgs transferSpec) {
            this.transferSpec = Codegen.ofNullable(transferSpec);
            return this;
        }        public TransferJobState build() {
            return new TransferJobState(creationTime, deletionTime, description, lastModificationTime, name, project, schedule, status, transferSpec);
        }
    }
}
