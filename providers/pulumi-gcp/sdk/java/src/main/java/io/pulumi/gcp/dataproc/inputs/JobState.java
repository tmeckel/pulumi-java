// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataproc.inputs.JobHadoopConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.JobHiveConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.JobPigConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.JobPlacementGetArgs;
import io.pulumi.gcp.dataproc.inputs.JobPysparkConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.JobReferenceGetArgs;
import io.pulumi.gcp.dataproc.inputs.JobSchedulingGetArgs;
import io.pulumi.gcp.dataproc.inputs.JobSparkConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.JobSparksqlConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.JobStatusGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobState extends io.pulumi.resources.ResourceArgs {

    public static final JobState Empty = new JobState();

    /**
     * If present, the location of miscellaneous control files which may be used as part of job setup and handling. If not present, control files may be placed in the same location as driver_output_uri.
     * 
     */
    @Import(name="driverControlsFilesUri")
      private final @Nullable Output<String> driverControlsFilesUri;

    public Output<String> getDriverControlsFilesUri() {
        return this.driverControlsFilesUri == null ? Codegen.empty() : this.driverControlsFilesUri;
    }

    /**
     * A URI pointing to the location of the stdout of the job's driver program.
     * 
     */
    @Import(name="driverOutputResourceUri")
      private final @Nullable Output<String> driverOutputResourceUri;

    public Output<String> getDriverOutputResourceUri() {
        return this.driverOutputResourceUri == null ? Codegen.empty() : this.driverOutputResourceUri;
    }

    /**
     * By default, you can only delete inactive jobs within
     * Dataproc. Setting this to true, and calling destroy, will ensure that the
     * job is first cancelled before issuing the delete.
     * 
     */
    @Import(name="forceDelete")
      private final @Nullable Output<Boolean> forceDelete;

    public Output<Boolean> getForceDelete() {
        return this.forceDelete == null ? Codegen.empty() : this.forceDelete;
    }

    /**
     * The config of Hadoop job
     * 
     */
    @Import(name="hadoopConfig")
      private final @Nullable Output<JobHadoopConfigGetArgs> hadoopConfig;

    public Output<JobHadoopConfigGetArgs> getHadoopConfig() {
        return this.hadoopConfig == null ? Codegen.empty() : this.hadoopConfig;
    }

    /**
     * The config of hive job
     * 
     */
    @Import(name="hiveConfig")
      private final @Nullable Output<JobHiveConfigGetArgs> hiveConfig;

    public Output<JobHiveConfigGetArgs> getHiveConfig() {
        return this.hiveConfig == null ? Codegen.empty() : this.hiveConfig;
    }

    /**
     * The list of labels (key/value pairs) to add to the job.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The config of pag job.
     * 
     */
    @Import(name="pigConfig")
      private final @Nullable Output<JobPigConfigGetArgs> pigConfig;

    public Output<JobPigConfigGetArgs> getPigConfig() {
        return this.pigConfig == null ? Codegen.empty() : this.pigConfig;
    }

    /**
     * The config of job placement.
     * 
     */
    @Import(name="placement")
      private final @Nullable Output<JobPlacementGetArgs> placement;

    public Output<JobPlacementGetArgs> getPlacement() {
        return this.placement == null ? Codegen.empty() : this.placement;
    }

    /**
     * The project in which the `cluster` can be found and jobs
     * subsequently run against. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The config of pySpark job.
     * 
     */
    @Import(name="pysparkConfig")
      private final @Nullable Output<JobPysparkConfigGetArgs> pysparkConfig;

    public Output<JobPysparkConfigGetArgs> getPysparkConfig() {
        return this.pysparkConfig == null ? Codegen.empty() : this.pysparkConfig;
    }

    /**
     * The reference of the job
     * 
     */
    @Import(name="reference")
      private final @Nullable Output<JobReferenceGetArgs> reference;

    public Output<JobReferenceGetArgs> getReference() {
        return this.reference == null ? Codegen.empty() : this.reference;
    }

    /**
     * The Cloud Dataproc region. This essentially determines which clusters are available
     * for this job to be submitted to. If not specified, defaults to `global`.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * Optional. Job scheduling configuration.
     * 
     */
    @Import(name="scheduling")
      private final @Nullable Output<JobSchedulingGetArgs> scheduling;

    public Output<JobSchedulingGetArgs> getScheduling() {
        return this.scheduling == null ? Codegen.empty() : this.scheduling;
    }

    /**
     * The config of the Spark job.
     * 
     */
    @Import(name="sparkConfig")
      private final @Nullable Output<JobSparkConfigGetArgs> sparkConfig;

    public Output<JobSparkConfigGetArgs> getSparkConfig() {
        return this.sparkConfig == null ? Codegen.empty() : this.sparkConfig;
    }

    /**
     * The config of SparkSql job
     * 
     */
    @Import(name="sparksqlConfig")
      private final @Nullable Output<JobSparksqlConfigGetArgs> sparksqlConfig;

    public Output<JobSparksqlConfigGetArgs> getSparksqlConfig() {
        return this.sparksqlConfig == null ? Codegen.empty() : this.sparksqlConfig;
    }

    /**
     * The status of the job.
     * 
     */
    @Import(name="statuses")
      private final @Nullable Output<List<JobStatusGetArgs>> statuses;

    public Output<List<JobStatusGetArgs>> getStatuses() {
        return this.statuses == null ? Codegen.empty() : this.statuses;
    }

    public JobState(
        @Nullable Output<String> driverControlsFilesUri,
        @Nullable Output<String> driverOutputResourceUri,
        @Nullable Output<Boolean> forceDelete,
        @Nullable Output<JobHadoopConfigGetArgs> hadoopConfig,
        @Nullable Output<JobHiveConfigGetArgs> hiveConfig,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<JobPigConfigGetArgs> pigConfig,
        @Nullable Output<JobPlacementGetArgs> placement,
        @Nullable Output<String> project,
        @Nullable Output<JobPysparkConfigGetArgs> pysparkConfig,
        @Nullable Output<JobReferenceGetArgs> reference,
        @Nullable Output<String> region,
        @Nullable Output<JobSchedulingGetArgs> scheduling,
        @Nullable Output<JobSparkConfigGetArgs> sparkConfig,
        @Nullable Output<JobSparksqlConfigGetArgs> sparksqlConfig,
        @Nullable Output<List<JobStatusGetArgs>> statuses) {
        this.driverControlsFilesUri = driverControlsFilesUri;
        this.driverOutputResourceUri = driverOutputResourceUri;
        this.forceDelete = forceDelete;
        this.hadoopConfig = hadoopConfig;
        this.hiveConfig = hiveConfig;
        this.labels = labels;
        this.pigConfig = pigConfig;
        this.placement = placement;
        this.project = project;
        this.pysparkConfig = pysparkConfig;
        this.reference = reference;
        this.region = region;
        this.scheduling = scheduling;
        this.sparkConfig = sparkConfig;
        this.sparksqlConfig = sparksqlConfig;
        this.statuses = statuses;
    }

    private JobState() {
        this.driverControlsFilesUri = Codegen.empty();
        this.driverOutputResourceUri = Codegen.empty();
        this.forceDelete = Codegen.empty();
        this.hadoopConfig = Codegen.empty();
        this.hiveConfig = Codegen.empty();
        this.labels = Codegen.empty();
        this.pigConfig = Codegen.empty();
        this.placement = Codegen.empty();
        this.project = Codegen.empty();
        this.pysparkConfig = Codegen.empty();
        this.reference = Codegen.empty();
        this.region = Codegen.empty();
        this.scheduling = Codegen.empty();
        this.sparkConfig = Codegen.empty();
        this.sparksqlConfig = Codegen.empty();
        this.statuses = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> driverControlsFilesUri;
        private @Nullable Output<String> driverOutputResourceUri;
        private @Nullable Output<Boolean> forceDelete;
        private @Nullable Output<JobHadoopConfigGetArgs> hadoopConfig;
        private @Nullable Output<JobHiveConfigGetArgs> hiveConfig;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<JobPigConfigGetArgs> pigConfig;
        private @Nullable Output<JobPlacementGetArgs> placement;
        private @Nullable Output<String> project;
        private @Nullable Output<JobPysparkConfigGetArgs> pysparkConfig;
        private @Nullable Output<JobReferenceGetArgs> reference;
        private @Nullable Output<String> region;
        private @Nullable Output<JobSchedulingGetArgs> scheduling;
        private @Nullable Output<JobSparkConfigGetArgs> sparkConfig;
        private @Nullable Output<JobSparksqlConfigGetArgs> sparksqlConfig;
        private @Nullable Output<List<JobStatusGetArgs>> statuses;

        public Builder() {
    	      // Empty
        }

        public Builder(JobState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driverControlsFilesUri = defaults.driverControlsFilesUri;
    	      this.driverOutputResourceUri = defaults.driverOutputResourceUri;
    	      this.forceDelete = defaults.forceDelete;
    	      this.hadoopConfig = defaults.hadoopConfig;
    	      this.hiveConfig = defaults.hiveConfig;
    	      this.labels = defaults.labels;
    	      this.pigConfig = defaults.pigConfig;
    	      this.placement = defaults.placement;
    	      this.project = defaults.project;
    	      this.pysparkConfig = defaults.pysparkConfig;
    	      this.reference = defaults.reference;
    	      this.region = defaults.region;
    	      this.scheduling = defaults.scheduling;
    	      this.sparkConfig = defaults.sparkConfig;
    	      this.sparksqlConfig = defaults.sparksqlConfig;
    	      this.statuses = defaults.statuses;
        }

        public Builder driverControlsFilesUri(@Nullable Output<String> driverControlsFilesUri) {
            this.driverControlsFilesUri = driverControlsFilesUri;
            return this;
        }
        public Builder driverControlsFilesUri(@Nullable String driverControlsFilesUri) {
            this.driverControlsFilesUri = Codegen.ofNullable(driverControlsFilesUri);
            return this;
        }
        public Builder driverOutputResourceUri(@Nullable Output<String> driverOutputResourceUri) {
            this.driverOutputResourceUri = driverOutputResourceUri;
            return this;
        }
        public Builder driverOutputResourceUri(@Nullable String driverOutputResourceUri) {
            this.driverOutputResourceUri = Codegen.ofNullable(driverOutputResourceUri);
            return this;
        }
        public Builder forceDelete(@Nullable Output<Boolean> forceDelete) {
            this.forceDelete = forceDelete;
            return this;
        }
        public Builder forceDelete(@Nullable Boolean forceDelete) {
            this.forceDelete = Codegen.ofNullable(forceDelete);
            return this;
        }
        public Builder hadoopConfig(@Nullable Output<JobHadoopConfigGetArgs> hadoopConfig) {
            this.hadoopConfig = hadoopConfig;
            return this;
        }
        public Builder hadoopConfig(@Nullable JobHadoopConfigGetArgs hadoopConfig) {
            this.hadoopConfig = Codegen.ofNullable(hadoopConfig);
            return this;
        }
        public Builder hiveConfig(@Nullable Output<JobHiveConfigGetArgs> hiveConfig) {
            this.hiveConfig = hiveConfig;
            return this;
        }
        public Builder hiveConfig(@Nullable JobHiveConfigGetArgs hiveConfig) {
            this.hiveConfig = Codegen.ofNullable(hiveConfig);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder pigConfig(@Nullable Output<JobPigConfigGetArgs> pigConfig) {
            this.pigConfig = pigConfig;
            return this;
        }
        public Builder pigConfig(@Nullable JobPigConfigGetArgs pigConfig) {
            this.pigConfig = Codegen.ofNullable(pigConfig);
            return this;
        }
        public Builder placement(@Nullable Output<JobPlacementGetArgs> placement) {
            this.placement = placement;
            return this;
        }
        public Builder placement(@Nullable JobPlacementGetArgs placement) {
            this.placement = Codegen.ofNullable(placement);
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
        public Builder pysparkConfig(@Nullable Output<JobPysparkConfigGetArgs> pysparkConfig) {
            this.pysparkConfig = pysparkConfig;
            return this;
        }
        public Builder pysparkConfig(@Nullable JobPysparkConfigGetArgs pysparkConfig) {
            this.pysparkConfig = Codegen.ofNullable(pysparkConfig);
            return this;
        }
        public Builder reference(@Nullable Output<JobReferenceGetArgs> reference) {
            this.reference = reference;
            return this;
        }
        public Builder reference(@Nullable JobReferenceGetArgs reference) {
            this.reference = Codegen.ofNullable(reference);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder scheduling(@Nullable Output<JobSchedulingGetArgs> scheduling) {
            this.scheduling = scheduling;
            return this;
        }
        public Builder scheduling(@Nullable JobSchedulingGetArgs scheduling) {
            this.scheduling = Codegen.ofNullable(scheduling);
            return this;
        }
        public Builder sparkConfig(@Nullable Output<JobSparkConfigGetArgs> sparkConfig) {
            this.sparkConfig = sparkConfig;
            return this;
        }
        public Builder sparkConfig(@Nullable JobSparkConfigGetArgs sparkConfig) {
            this.sparkConfig = Codegen.ofNullable(sparkConfig);
            return this;
        }
        public Builder sparksqlConfig(@Nullable Output<JobSparksqlConfigGetArgs> sparksqlConfig) {
            this.sparksqlConfig = sparksqlConfig;
            return this;
        }
        public Builder sparksqlConfig(@Nullable JobSparksqlConfigGetArgs sparksqlConfig) {
            this.sparksqlConfig = Codegen.ofNullable(sparksqlConfig);
            return this;
        }
        public Builder statuses(@Nullable Output<List<JobStatusGetArgs>> statuses) {
            this.statuses = statuses;
            return this;
        }
        public Builder statuses(@Nullable List<JobStatusGetArgs> statuses) {
            this.statuses = Codegen.ofNullable(statuses);
            return this;
        }
        public Builder statuses(JobStatusGetArgs... statuses) {
            return statuses(List.of(statuses));
        }        public JobState build() {
            return new JobState(driverControlsFilesUri, driverOutputResourceUri, forceDelete, hadoopConfig, hiveConfig, labels, pigConfig, placement, project, pysparkConfig, reference, region, scheduling, sparkConfig, sparksqlConfig, statuses);
        }
    }
}
