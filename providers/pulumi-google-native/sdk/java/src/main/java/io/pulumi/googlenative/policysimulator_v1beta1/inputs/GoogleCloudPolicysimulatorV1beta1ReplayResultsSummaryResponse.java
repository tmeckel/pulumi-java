// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.policysimulator_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.policysimulator_v1beta1.inputs.GoogleTypeDateResponse;
import java.lang.Integer;
import java.util.Objects;


/**
 * Summary statistics about the replayed log entries.
 * 
 */
public final class GoogleCloudPolicysimulatorV1beta1ReplayResultsSummaryResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudPolicysimulatorV1beta1ReplayResultsSummaryResponse Empty = new GoogleCloudPolicysimulatorV1beta1ReplayResultsSummaryResponse();

    /**
     * The number of replayed log entries with a difference between baseline and simulated policies.
     * 
     */
    @InputImport(name="differenceCount", required=true)
    private final Integer differenceCount;

    public Integer getDifferenceCount() {
        return this.differenceCount;
    }

    /**
     * The number of log entries that could not be replayed.
     * 
     */
    @InputImport(name="errorCount", required=true)
    private final Integer errorCount;

    public Integer getErrorCount() {
        return this.errorCount;
    }

    /**
     * The total number of log entries replayed.
     * 
     */
    @InputImport(name="logCount", required=true)
    private final Integer logCount;

    public Integer getLogCount() {
        return this.logCount;
    }

    /**
     * The date of the newest log entry replayed.
     * 
     */
    @InputImport(name="newestDate", required=true)
    private final GoogleTypeDateResponse newestDate;

    public GoogleTypeDateResponse getNewestDate() {
        return this.newestDate;
    }

    /**
     * The date of the oldest log entry replayed.
     * 
     */
    @InputImport(name="oldestDate", required=true)
    private final GoogleTypeDateResponse oldestDate;

    public GoogleTypeDateResponse getOldestDate() {
        return this.oldestDate;
    }

    /**
     * The number of replayed log entries with no difference between baseline and simulated policies.
     * 
     */
    @InputImport(name="unchangedCount", required=true)
    private final Integer unchangedCount;

    public Integer getUnchangedCount() {
        return this.unchangedCount;
    }

    public GoogleCloudPolicysimulatorV1beta1ReplayResultsSummaryResponse(
        Integer differenceCount,
        Integer errorCount,
        Integer logCount,
        GoogleTypeDateResponse newestDate,
        GoogleTypeDateResponse oldestDate,
        Integer unchangedCount) {
        this.differenceCount = Objects.requireNonNull(differenceCount, "expected parameter 'differenceCount' to be non-null");
        this.errorCount = Objects.requireNonNull(errorCount, "expected parameter 'errorCount' to be non-null");
        this.logCount = Objects.requireNonNull(logCount, "expected parameter 'logCount' to be non-null");
        this.newestDate = Objects.requireNonNull(newestDate, "expected parameter 'newestDate' to be non-null");
        this.oldestDate = Objects.requireNonNull(oldestDate, "expected parameter 'oldestDate' to be non-null");
        this.unchangedCount = Objects.requireNonNull(unchangedCount, "expected parameter 'unchangedCount' to be non-null");
    }

    private GoogleCloudPolicysimulatorV1beta1ReplayResultsSummaryResponse() {
        this.differenceCount = null;
        this.errorCount = null;
        this.logCount = null;
        this.newestDate = null;
        this.oldestDate = null;
        this.unchangedCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudPolicysimulatorV1beta1ReplayResultsSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer differenceCount;
        private Integer errorCount;
        private Integer logCount;
        private GoogleTypeDateResponse newestDate;
        private GoogleTypeDateResponse oldestDate;
        private Integer unchangedCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudPolicysimulatorV1beta1ReplayResultsSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.differenceCount = defaults.differenceCount;
    	      this.errorCount = defaults.errorCount;
    	      this.logCount = defaults.logCount;
    	      this.newestDate = defaults.newestDate;
    	      this.oldestDate = defaults.oldestDate;
    	      this.unchangedCount = defaults.unchangedCount;
        }

        public Builder setDifferenceCount(Integer differenceCount) {
            this.differenceCount = Objects.requireNonNull(differenceCount);
            return this;
        }

        public Builder setErrorCount(Integer errorCount) {
            this.errorCount = Objects.requireNonNull(errorCount);
            return this;
        }

        public Builder setLogCount(Integer logCount) {
            this.logCount = Objects.requireNonNull(logCount);
            return this;
        }

        public Builder setNewestDate(GoogleTypeDateResponse newestDate) {
            this.newestDate = Objects.requireNonNull(newestDate);
            return this;
        }

        public Builder setOldestDate(GoogleTypeDateResponse oldestDate) {
            this.oldestDate = Objects.requireNonNull(oldestDate);
            return this;
        }

        public Builder setUnchangedCount(Integer unchangedCount) {
            this.unchangedCount = Objects.requireNonNull(unchangedCount);
            return this;
        }

        public GoogleCloudPolicysimulatorV1beta1ReplayResultsSummaryResponse build() {
            return new GoogleCloudPolicysimulatorV1beta1ReplayResultsSummaryResponse(differenceCount, errorCount, logCount, newestDate, oldestDate, unchangedCount);
        }
    }
}
