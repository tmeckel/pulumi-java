// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Statistics for a queue.
 * 
 */
public final class QueueStatsResponse extends io.pulumi.resources.InvokeArgs {

    public static final QueueStatsResponse Empty = new QueueStatsResponse();

    /**
     * The number of requests that the queue has dispatched but has not received a reply for yet.
     * 
     */
    @InputImport(name="concurrentDispatchesCount", required=true)
    private final String concurrentDispatchesCount;

    public String getConcurrentDispatchesCount() {
        return this.concurrentDispatchesCount;
    }

    /**
     * The current maximum number of tasks per second executed by the queue. The maximum value of this variable is controlled by the RateLimits of the Queue. However, this value could be less to avoid overloading the endpoints tasks in the queue are targeting.
     * 
     */
    @InputImport(name="effectiveExecutionRate", required=true)
    private final Double effectiveExecutionRate;

    public Double getEffectiveExecutionRate() {
        return this.effectiveExecutionRate;
    }

    /**
     * The number of tasks that the queue has dispatched and received a reply for during the last minute. This variable counts both successful and non-successful executions.
     * 
     */
    @InputImport(name="executedLastMinuteCount", required=true)
    private final String executedLastMinuteCount;

    public String getExecutedLastMinuteCount() {
        return this.executedLastMinuteCount;
    }

    /**
     * An estimation of the nearest time in the future where a task in the queue is scheduled to be executed.
     * 
     */
    @InputImport(name="oldestEstimatedArrivalTime", required=true)
    private final String oldestEstimatedArrivalTime;

    public String getOldestEstimatedArrivalTime() {
        return this.oldestEstimatedArrivalTime;
    }

    /**
     * An estimation of the number of tasks in the queue, that is, the tasks in the queue that haven't been executed, the tasks in the queue which the queue has dispatched but has not yet received a reply for, and the failed tasks that the queue is retrying.
     * 
     */
    @InputImport(name="tasksCount", required=true)
    private final String tasksCount;

    public String getTasksCount() {
        return this.tasksCount;
    }

    public QueueStatsResponse(
        String concurrentDispatchesCount,
        Double effectiveExecutionRate,
        String executedLastMinuteCount,
        String oldestEstimatedArrivalTime,
        String tasksCount) {
        this.concurrentDispatchesCount = Objects.requireNonNull(concurrentDispatchesCount, "expected parameter 'concurrentDispatchesCount' to be non-null");
        this.effectiveExecutionRate = Objects.requireNonNull(effectiveExecutionRate, "expected parameter 'effectiveExecutionRate' to be non-null");
        this.executedLastMinuteCount = Objects.requireNonNull(executedLastMinuteCount, "expected parameter 'executedLastMinuteCount' to be non-null");
        this.oldestEstimatedArrivalTime = Objects.requireNonNull(oldestEstimatedArrivalTime, "expected parameter 'oldestEstimatedArrivalTime' to be non-null");
        this.tasksCount = Objects.requireNonNull(tasksCount, "expected parameter 'tasksCount' to be non-null");
    }

    private QueueStatsResponse() {
        this.concurrentDispatchesCount = null;
        this.effectiveExecutionRate = null;
        this.executedLastMinuteCount = null;
        this.oldestEstimatedArrivalTime = null;
        this.tasksCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueStatsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String concurrentDispatchesCount;
        private Double effectiveExecutionRate;
        private String executedLastMinuteCount;
        private String oldestEstimatedArrivalTime;
        private String tasksCount;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueStatsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.concurrentDispatchesCount = defaults.concurrentDispatchesCount;
    	      this.effectiveExecutionRate = defaults.effectiveExecutionRate;
    	      this.executedLastMinuteCount = defaults.executedLastMinuteCount;
    	      this.oldestEstimatedArrivalTime = defaults.oldestEstimatedArrivalTime;
    	      this.tasksCount = defaults.tasksCount;
        }

        public Builder setConcurrentDispatchesCount(String concurrentDispatchesCount) {
            this.concurrentDispatchesCount = Objects.requireNonNull(concurrentDispatchesCount);
            return this;
        }

        public Builder setEffectiveExecutionRate(Double effectiveExecutionRate) {
            this.effectiveExecutionRate = Objects.requireNonNull(effectiveExecutionRate);
            return this;
        }

        public Builder setExecutedLastMinuteCount(String executedLastMinuteCount) {
            this.executedLastMinuteCount = Objects.requireNonNull(executedLastMinuteCount);
            return this;
        }

        public Builder setOldestEstimatedArrivalTime(String oldestEstimatedArrivalTime) {
            this.oldestEstimatedArrivalTime = Objects.requireNonNull(oldestEstimatedArrivalTime);
            return this;
        }

        public Builder setTasksCount(String tasksCount) {
            this.tasksCount = Objects.requireNonNull(tasksCount);
            return this;
        }

        public QueueStatsResponse build() {
            return new QueueStatsResponse(concurrentDispatchesCount, effectiveExecutionRate, executedLastMinuteCount, oldestEstimatedArrivalTime, tasksCount);
        }
    }
}
