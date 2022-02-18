// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.JobStatistics2Response;
import io.pulumi.googlenative.bigquery_v2.outputs.JobStatistics3Response;
import io.pulumi.googlenative.bigquery_v2.outputs.JobStatistics4Response;
import io.pulumi.googlenative.bigquery_v2.outputs.JobStatisticsReservationUsageItemResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.RowLevelSecurityStatisticsResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.ScriptStatisticsResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.SessionInfoResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.TransactionInfoResponse;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class JobStatisticsResponse {
    /**
     * [TrustedTester] [Output-only] Job progress (0.0 -> 1.0) for LOAD and EXTRACT jobs.
     * 
     */
    private final Double completionRatio;
    /**
     * Creation time of this job, in milliseconds since the epoch. This field will be present on all jobs.
     * 
     */
    private final String creationTime;
    /**
     * End time of this job, in milliseconds since the epoch. This field will be present whenever a job is in the DONE state.
     * 
     */
    private final String endTime;
    /**
     * Statistics for an extract job.
     * 
     */
    private final JobStatistics4Response extract;
    /**
     * Statistics for a load job.
     * 
     */
    private final JobStatistics3Response load;
    /**
     * Number of child jobs executed.
     * 
     */
    private final String numChildJobs;
    /**
     * If this is a child job, the id of the parent.
     * 
     */
    private final String parentJobId;
    /**
     * Statistics for a query job.
     * 
     */
    private final JobStatistics2Response query;
    /**
     * Quotas which delayed this job's start time.
     * 
     */
    private final List<String> quotaDeferments;
    /**
     * Name of the primary reservation assigned to this job. Note that this could be different than reservations reported in the reservation usage field if parent reservations were used to execute this job.
     * 
     */
    private final String reservationId;
    /**
     * Job resource usage breakdown by reservation.
     * 
     */
    private final List<JobStatisticsReservationUsageItemResponse> reservationUsage;
    /**
     * [Preview] Statistics for row-level security. Present only for query and extract jobs.
     * 
     */
    private final RowLevelSecurityStatisticsResponse rowLevelSecurityStatistics;
    /**
     * Statistics for a child job of a script.
     * 
     */
    private final ScriptStatisticsResponse scriptStatistics;
    /**
     * [Preview] Information of the session if this job is part of one.
     * 
     */
    private final SessionInfoResponse sessionInfo;
    /**
     * Start time of this job, in milliseconds since the epoch. This field will be present when the job transitions from the PENDING state to either RUNNING or DONE.
     * 
     */
    private final String startTime;
    /**
     * Slot-milliseconds for the job.
     * 
     */
    private final String totalSlotMs;
    /**
     * [Alpha] Information of the multi-statement transaction if this job is part of one.
     * 
     */
    private final TransactionInfoResponse transactionInfo;

    @OutputCustomType.Constructor({"completionRatio","creationTime","endTime","extract","load","numChildJobs","parentJobId","query","quotaDeferments","reservationId","reservationUsage","rowLevelSecurityStatistics","scriptStatistics","sessionInfo","startTime","totalSlotMs","transactionInfo"})
    private JobStatisticsResponse(
        Double completionRatio,
        String creationTime,
        String endTime,
        JobStatistics4Response extract,
        JobStatistics3Response load,
        String numChildJobs,
        String parentJobId,
        JobStatistics2Response query,
        List<String> quotaDeferments,
        String reservationId,
        List<JobStatisticsReservationUsageItemResponse> reservationUsage,
        RowLevelSecurityStatisticsResponse rowLevelSecurityStatistics,
        ScriptStatisticsResponse scriptStatistics,
        SessionInfoResponse sessionInfo,
        String startTime,
        String totalSlotMs,
        TransactionInfoResponse transactionInfo) {
        this.completionRatio = Objects.requireNonNull(completionRatio);
        this.creationTime = Objects.requireNonNull(creationTime);
        this.endTime = Objects.requireNonNull(endTime);
        this.extract = Objects.requireNonNull(extract);
        this.load = Objects.requireNonNull(load);
        this.numChildJobs = Objects.requireNonNull(numChildJobs);
        this.parentJobId = Objects.requireNonNull(parentJobId);
        this.query = Objects.requireNonNull(query);
        this.quotaDeferments = Objects.requireNonNull(quotaDeferments);
        this.reservationId = Objects.requireNonNull(reservationId);
        this.reservationUsage = Objects.requireNonNull(reservationUsage);
        this.rowLevelSecurityStatistics = Objects.requireNonNull(rowLevelSecurityStatistics);
        this.scriptStatistics = Objects.requireNonNull(scriptStatistics);
        this.sessionInfo = Objects.requireNonNull(sessionInfo);
        this.startTime = Objects.requireNonNull(startTime);
        this.totalSlotMs = Objects.requireNonNull(totalSlotMs);
        this.transactionInfo = Objects.requireNonNull(transactionInfo);
    }

    /**
     * [TrustedTester] [Output-only] Job progress (0.0 -> 1.0) for LOAD and EXTRACT jobs.
     * 
     */
    public Double getCompletionRatio() {
        return this.completionRatio;
    }
    /**
     * Creation time of this job, in milliseconds since the epoch. This field will be present on all jobs.
     * 
     */
    public String getCreationTime() {
        return this.creationTime;
    }
    /**
     * End time of this job, in milliseconds since the epoch. This field will be present whenever a job is in the DONE state.
     * 
     */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * Statistics for an extract job.
     * 
     */
    public JobStatistics4Response getExtract() {
        return this.extract;
    }
    /**
     * Statistics for a load job.
     * 
     */
    public JobStatistics3Response getLoad() {
        return this.load;
    }
    /**
     * Number of child jobs executed.
     * 
     */
    public String getNumChildJobs() {
        return this.numChildJobs;
    }
    /**
     * If this is a child job, the id of the parent.
     * 
     */
    public String getParentJobId() {
        return this.parentJobId;
    }
    /**
     * Statistics for a query job.
     * 
     */
    public JobStatistics2Response getQuery() {
        return this.query;
    }
    /**
     * Quotas which delayed this job's start time.
     * 
     */
    public List<String> getQuotaDeferments() {
        return this.quotaDeferments;
    }
    /**
     * Name of the primary reservation assigned to this job. Note that this could be different than reservations reported in the reservation usage field if parent reservations were used to execute this job.
     * 
     */
    public String getReservationId() {
        return this.reservationId;
    }
    /**
     * Job resource usage breakdown by reservation.
     * 
     */
    public List<JobStatisticsReservationUsageItemResponse> getReservationUsage() {
        return this.reservationUsage;
    }
    /**
     * [Preview] Statistics for row-level security. Present only for query and extract jobs.
     * 
     */
    public RowLevelSecurityStatisticsResponse getRowLevelSecurityStatistics() {
        return this.rowLevelSecurityStatistics;
    }
    /**
     * Statistics for a child job of a script.
     * 
     */
    public ScriptStatisticsResponse getScriptStatistics() {
        return this.scriptStatistics;
    }
    /**
     * [Preview] Information of the session if this job is part of one.
     * 
     */
    public SessionInfoResponse getSessionInfo() {
        return this.sessionInfo;
    }
    /**
     * Start time of this job, in milliseconds since the epoch. This field will be present when the job transitions from the PENDING state to either RUNNING or DONE.
     * 
     */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * Slot-milliseconds for the job.
     * 
     */
    public String getTotalSlotMs() {
        return this.totalSlotMs;
    }
    /**
     * [Alpha] Information of the multi-statement transaction if this job is part of one.
     * 
     */
    public TransactionInfoResponse getTransactionInfo() {
        return this.transactionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatisticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double completionRatio;
        private String creationTime;
        private String endTime;
        private JobStatistics4Response extract;
        private JobStatistics3Response load;
        private String numChildJobs;
        private String parentJobId;
        private JobStatistics2Response query;
        private List<String> quotaDeferments;
        private String reservationId;
        private List<JobStatisticsReservationUsageItemResponse> reservationUsage;
        private RowLevelSecurityStatisticsResponse rowLevelSecurityStatistics;
        private ScriptStatisticsResponse scriptStatistics;
        private SessionInfoResponse sessionInfo;
        private String startTime;
        private String totalSlotMs;
        private TransactionInfoResponse transactionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatisticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completionRatio = defaults.completionRatio;
    	      this.creationTime = defaults.creationTime;
    	      this.endTime = defaults.endTime;
    	      this.extract = defaults.extract;
    	      this.load = defaults.load;
    	      this.numChildJobs = defaults.numChildJobs;
    	      this.parentJobId = defaults.parentJobId;
    	      this.query = defaults.query;
    	      this.quotaDeferments = defaults.quotaDeferments;
    	      this.reservationId = defaults.reservationId;
    	      this.reservationUsage = defaults.reservationUsage;
    	      this.rowLevelSecurityStatistics = defaults.rowLevelSecurityStatistics;
    	      this.scriptStatistics = defaults.scriptStatistics;
    	      this.sessionInfo = defaults.sessionInfo;
    	      this.startTime = defaults.startTime;
    	      this.totalSlotMs = defaults.totalSlotMs;
    	      this.transactionInfo = defaults.transactionInfo;
        }

        public Builder setCompletionRatio(Double completionRatio) {
            this.completionRatio = Objects.requireNonNull(completionRatio);
            return this;
        }

        public Builder setCreationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setExtract(JobStatistics4Response extract) {
            this.extract = Objects.requireNonNull(extract);
            return this;
        }

        public Builder setLoad(JobStatistics3Response load) {
            this.load = Objects.requireNonNull(load);
            return this;
        }

        public Builder setNumChildJobs(String numChildJobs) {
            this.numChildJobs = Objects.requireNonNull(numChildJobs);
            return this;
        }

        public Builder setParentJobId(String parentJobId) {
            this.parentJobId = Objects.requireNonNull(parentJobId);
            return this;
        }

        public Builder setQuery(JobStatistics2Response query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder setQuotaDeferments(List<String> quotaDeferments) {
            this.quotaDeferments = Objects.requireNonNull(quotaDeferments);
            return this;
        }

        public Builder setReservationId(String reservationId) {
            this.reservationId = Objects.requireNonNull(reservationId);
            return this;
        }

        public Builder setReservationUsage(List<JobStatisticsReservationUsageItemResponse> reservationUsage) {
            this.reservationUsage = Objects.requireNonNull(reservationUsage);
            return this;
        }

        public Builder setRowLevelSecurityStatistics(RowLevelSecurityStatisticsResponse rowLevelSecurityStatistics) {
            this.rowLevelSecurityStatistics = Objects.requireNonNull(rowLevelSecurityStatistics);
            return this;
        }

        public Builder setScriptStatistics(ScriptStatisticsResponse scriptStatistics) {
            this.scriptStatistics = Objects.requireNonNull(scriptStatistics);
            return this;
        }

        public Builder setSessionInfo(SessionInfoResponse sessionInfo) {
            this.sessionInfo = Objects.requireNonNull(sessionInfo);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setTotalSlotMs(String totalSlotMs) {
            this.totalSlotMs = Objects.requireNonNull(totalSlotMs);
            return this;
        }

        public Builder setTransactionInfo(TransactionInfoResponse transactionInfo) {
            this.transactionInfo = Objects.requireNonNull(transactionInfo);
            return this;
        }

        public JobStatisticsResponse build() {
            return new JobStatisticsResponse(completionRatio, creationTime, endTime, extract, load, numChildJobs, parentJobId, query, quotaDeferments, reservationId, reservationUsage, rowLevelSecurityStatistics, scriptStatistics, sessionInfo, startTime, totalSlotMs, transactionInfo);
        }
    }
}
