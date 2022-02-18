// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.HadoopJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.HiveJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.JobSchedulingResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.PigJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.PrestoJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.PySparkJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.SparkJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.SparkRJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.SparkSqlJobResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class OrderedJobResponse {
    /**
     * Optional. Job is a Hadoop job.
     * 
     */
    private final HadoopJobResponse hadoopJob;
    /**
     * Optional. Job is a Hive job.
     * 
     */
    private final HiveJobResponse hiveJob;
    /**
     * Optional. The labels to associate with this job.Label keys must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll}\p{Lo}{0,62}Label values must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be associated with a given job.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Optional. Job is a Pig job.
     * 
     */
    private final PigJobResponse pigJob;
    /**
     * Optional. The optional list of prerequisite job step_ids. If not specified, the job will start at the beginning of workflow.
     * 
     */
    private final List<String> prerequisiteStepIds;
    /**
     * Optional. Job is a Presto job.
     * 
     */
    private final PrestoJobResponse prestoJob;
    /**
     * Optional. Job is a PySpark job.
     * 
     */
    private final PySparkJobResponse pysparkJob;
    /**
     * Optional. Job scheduling configuration.
     * 
     */
    private final JobSchedulingResponse scheduling;
    /**
     * Optional. Job is a Spark job.
     * 
     */
    private final SparkJobResponse sparkJob;
    /**
     * Optional. Job is a SparkR job.
     * 
     */
    private final SparkRJobResponse sparkRJob;
    /**
     * Optional. Job is a SparkSql job.
     * 
     */
    private final SparkSqlJobResponse sparkSqlJob;
    /**
     * The step id. The id must be unique among all jobs within the template.The step id is used as prefix for job id, as job goog-dataproc-workflow-step-id label, and in prerequisiteStepIds field from other steps.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters.
     * 
     */
    private final String stepId;

    @OutputCustomType.Constructor({"hadoopJob","hiveJob","labels","pigJob","prerequisiteStepIds","prestoJob","pysparkJob","scheduling","sparkJob","sparkRJob","sparkSqlJob","stepId"})
    private OrderedJobResponse(
        HadoopJobResponse hadoopJob,
        HiveJobResponse hiveJob,
        Map<String,String> labels,
        PigJobResponse pigJob,
        List<String> prerequisiteStepIds,
        PrestoJobResponse prestoJob,
        PySparkJobResponse pysparkJob,
        JobSchedulingResponse scheduling,
        SparkJobResponse sparkJob,
        SparkRJobResponse sparkRJob,
        SparkSqlJobResponse sparkSqlJob,
        String stepId) {
        this.hadoopJob = Objects.requireNonNull(hadoopJob);
        this.hiveJob = Objects.requireNonNull(hiveJob);
        this.labels = Objects.requireNonNull(labels);
        this.pigJob = Objects.requireNonNull(pigJob);
        this.prerequisiteStepIds = Objects.requireNonNull(prerequisiteStepIds);
        this.prestoJob = Objects.requireNonNull(prestoJob);
        this.pysparkJob = Objects.requireNonNull(pysparkJob);
        this.scheduling = Objects.requireNonNull(scheduling);
        this.sparkJob = Objects.requireNonNull(sparkJob);
        this.sparkRJob = Objects.requireNonNull(sparkRJob);
        this.sparkSqlJob = Objects.requireNonNull(sparkSqlJob);
        this.stepId = Objects.requireNonNull(stepId);
    }

    /**
     * Optional. Job is a Hadoop job.
     * 
     */
    public HadoopJobResponse getHadoopJob() {
        return this.hadoopJob;
    }
    /**
     * Optional. Job is a Hive job.
     * 
     */
    public HiveJobResponse getHiveJob() {
        return this.hiveJob;
    }
    /**
     * Optional. The labels to associate with this job.Label keys must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll}\p{Lo}{0,62}Label values must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be associated with a given job.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Optional. Job is a Pig job.
     * 
     */
    public PigJobResponse getPigJob() {
        return this.pigJob;
    }
    /**
     * Optional. The optional list of prerequisite job step_ids. If not specified, the job will start at the beginning of workflow.
     * 
     */
    public List<String> getPrerequisiteStepIds() {
        return this.prerequisiteStepIds;
    }
    /**
     * Optional. Job is a Presto job.
     * 
     */
    public PrestoJobResponse getPrestoJob() {
        return this.prestoJob;
    }
    /**
     * Optional. Job is a PySpark job.
     * 
     */
    public PySparkJobResponse getPysparkJob() {
        return this.pysparkJob;
    }
    /**
     * Optional. Job scheduling configuration.
     * 
     */
    public JobSchedulingResponse getScheduling() {
        return this.scheduling;
    }
    /**
     * Optional. Job is a Spark job.
     * 
     */
    public SparkJobResponse getSparkJob() {
        return this.sparkJob;
    }
    /**
     * Optional. Job is a SparkR job.
     * 
     */
    public SparkRJobResponse getSparkRJob() {
        return this.sparkRJob;
    }
    /**
     * Optional. Job is a SparkSql job.
     * 
     */
    public SparkSqlJobResponse getSparkSqlJob() {
        return this.sparkSqlJob;
    }
    /**
     * The step id. The id must be unique among all jobs within the template.The step id is used as prefix for job id, as job goog-dataproc-workflow-step-id label, and in prerequisiteStepIds field from other steps.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters.
     * 
     */
    public String getStepId() {
        return this.stepId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrderedJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HadoopJobResponse hadoopJob;
        private HiveJobResponse hiveJob;
        private Map<String,String> labels;
        private PigJobResponse pigJob;
        private List<String> prerequisiteStepIds;
        private PrestoJobResponse prestoJob;
        private PySparkJobResponse pysparkJob;
        private JobSchedulingResponse scheduling;
        private SparkJobResponse sparkJob;
        private SparkRJobResponse sparkRJob;
        private SparkSqlJobResponse sparkSqlJob;
        private String stepId;

        public Builder() {
    	      // Empty
        }

        public Builder(OrderedJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hadoopJob = defaults.hadoopJob;
    	      this.hiveJob = defaults.hiveJob;
    	      this.labels = defaults.labels;
    	      this.pigJob = defaults.pigJob;
    	      this.prerequisiteStepIds = defaults.prerequisiteStepIds;
    	      this.prestoJob = defaults.prestoJob;
    	      this.pysparkJob = defaults.pysparkJob;
    	      this.scheduling = defaults.scheduling;
    	      this.sparkJob = defaults.sparkJob;
    	      this.sparkRJob = defaults.sparkRJob;
    	      this.sparkSqlJob = defaults.sparkSqlJob;
    	      this.stepId = defaults.stepId;
        }

        public Builder setHadoopJob(HadoopJobResponse hadoopJob) {
            this.hadoopJob = Objects.requireNonNull(hadoopJob);
            return this;
        }

        public Builder setHiveJob(HiveJobResponse hiveJob) {
            this.hiveJob = Objects.requireNonNull(hiveJob);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setPigJob(PigJobResponse pigJob) {
            this.pigJob = Objects.requireNonNull(pigJob);
            return this;
        }

        public Builder setPrerequisiteStepIds(List<String> prerequisiteStepIds) {
            this.prerequisiteStepIds = Objects.requireNonNull(prerequisiteStepIds);
            return this;
        }

        public Builder setPrestoJob(PrestoJobResponse prestoJob) {
            this.prestoJob = Objects.requireNonNull(prestoJob);
            return this;
        }

        public Builder setPysparkJob(PySparkJobResponse pysparkJob) {
            this.pysparkJob = Objects.requireNonNull(pysparkJob);
            return this;
        }

        public Builder setScheduling(JobSchedulingResponse scheduling) {
            this.scheduling = Objects.requireNonNull(scheduling);
            return this;
        }

        public Builder setSparkJob(SparkJobResponse sparkJob) {
            this.sparkJob = Objects.requireNonNull(sparkJob);
            return this;
        }

        public Builder setSparkRJob(SparkRJobResponse sparkRJob) {
            this.sparkRJob = Objects.requireNonNull(sparkRJob);
            return this;
        }

        public Builder setSparkSqlJob(SparkSqlJobResponse sparkSqlJob) {
            this.sparkSqlJob = Objects.requireNonNull(sparkSqlJob);
            return this;
        }

        public Builder setStepId(String stepId) {
            this.stepId = Objects.requireNonNull(stepId);
            return this;
        }

        public OrderedJobResponse build() {
            return new OrderedJobResponse(hadoopJob, hiveJob, labels, pigJob, prerequisiteStepIds, prestoJob, pysparkJob, scheduling, sparkJob, sparkRJob, sparkSqlJob, stepId);
        }
    }
}
