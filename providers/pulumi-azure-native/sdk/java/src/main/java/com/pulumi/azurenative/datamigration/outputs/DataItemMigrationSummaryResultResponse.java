// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataItemMigrationSummaryResultResponse {
    /**
     * @return Migration end time
     * 
     */
    private final String endedOn;
    /**
     * @return Wildcard string prefix to use for querying all errors of the item
     * 
     */
    private final String errorPrefix;
    /**
     * @return Number of successfully completed items
     * 
     */
    private final Double itemsCompletedCount;
    /**
     * @return Number of items
     * 
     */
    private final Double itemsCount;
    /**
     * @return Name of the item
     * 
     */
    private final String name;
    /**
     * @return Wildcard string prefix to use for querying all sub-tem results of the item
     * 
     */
    private final String resultPrefix;
    /**
     * @return Migration start time
     * 
     */
    private final String startedOn;
    /**
     * @return Current state of migration
     * 
     */
    private final String state;
    /**
     * @return Status message
     * 
     */
    private final String statusMessage;

    @CustomType.Constructor
    private DataItemMigrationSummaryResultResponse(
        @CustomType.Parameter("endedOn") String endedOn,
        @CustomType.Parameter("errorPrefix") String errorPrefix,
        @CustomType.Parameter("itemsCompletedCount") Double itemsCompletedCount,
        @CustomType.Parameter("itemsCount") Double itemsCount,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resultPrefix") String resultPrefix,
        @CustomType.Parameter("startedOn") String startedOn,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("statusMessage") String statusMessage) {
        this.endedOn = endedOn;
        this.errorPrefix = errorPrefix;
        this.itemsCompletedCount = itemsCompletedCount;
        this.itemsCount = itemsCount;
        this.name = name;
        this.resultPrefix = resultPrefix;
        this.startedOn = startedOn;
        this.state = state;
        this.statusMessage = statusMessage;
    }

    /**
     * @return Migration end time
     * 
     */
    public String endedOn() {
        return this.endedOn;
    }
    /**
     * @return Wildcard string prefix to use for querying all errors of the item
     * 
     */
    public String errorPrefix() {
        return this.errorPrefix;
    }
    /**
     * @return Number of successfully completed items
     * 
     */
    public Double itemsCompletedCount() {
        return this.itemsCompletedCount;
    }
    /**
     * @return Number of items
     * 
     */
    public Double itemsCount() {
        return this.itemsCount;
    }
    /**
     * @return Name of the item
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Wildcard string prefix to use for querying all sub-tem results of the item
     * 
     */
    public String resultPrefix() {
        return this.resultPrefix;
    }
    /**
     * @return Migration start time
     * 
     */
    public String startedOn() {
        return this.startedOn;
    }
    /**
     * @return Current state of migration
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Status message
     * 
     */
    public String statusMessage() {
        return this.statusMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataItemMigrationSummaryResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endedOn;
        private String errorPrefix;
        private Double itemsCompletedCount;
        private Double itemsCount;
        private String name;
        private String resultPrefix;
        private String startedOn;
        private String state;
        private String statusMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(DataItemMigrationSummaryResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endedOn = defaults.endedOn;
    	      this.errorPrefix = defaults.errorPrefix;
    	      this.itemsCompletedCount = defaults.itemsCompletedCount;
    	      this.itemsCount = defaults.itemsCount;
    	      this.name = defaults.name;
    	      this.resultPrefix = defaults.resultPrefix;
    	      this.startedOn = defaults.startedOn;
    	      this.state = defaults.state;
    	      this.statusMessage = defaults.statusMessage;
        }

        public Builder endedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }
        public Builder errorPrefix(String errorPrefix) {
            this.errorPrefix = Objects.requireNonNull(errorPrefix);
            return this;
        }
        public Builder itemsCompletedCount(Double itemsCompletedCount) {
            this.itemsCompletedCount = Objects.requireNonNull(itemsCompletedCount);
            return this;
        }
        public Builder itemsCount(Double itemsCount) {
            this.itemsCount = Objects.requireNonNull(itemsCount);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resultPrefix(String resultPrefix) {
            this.resultPrefix = Objects.requireNonNull(resultPrefix);
            return this;
        }
        public Builder startedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }        public DataItemMigrationSummaryResultResponse build() {
            return new DataItemMigrationSummaryResultResponse(endedOn, errorPrefix, itemsCompletedCount, itemsCount, name, resultPrefix, startedOn, state, statusMessage);
        }
    }
}
