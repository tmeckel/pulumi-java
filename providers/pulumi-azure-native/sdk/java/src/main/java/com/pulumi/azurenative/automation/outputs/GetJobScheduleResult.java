// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.outputs;

import com.pulumi.azurenative.automation.outputs.RunbookAssociationPropertyResponse;
import com.pulumi.azurenative.automation.outputs.ScheduleAssociationPropertyResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobScheduleResult {
    /**
     * @return Gets the id of the resource.
     * 
     */
    private final String id;
    /**
     * @return Gets or sets the id of job schedule.
     * 
     */
    private final @Nullable String jobScheduleId;
    /**
     * @return Gets the name of the variable.
     * 
     */
    private final String name;
    /**
     * @return Gets or sets the parameters of the job schedule.
     * 
     */
    private final @Nullable Map<String,String> parameters;
    /**
     * @return Gets or sets the hybrid worker group that the scheduled job should run on.
     * 
     */
    private final @Nullable String runOn;
    /**
     * @return Gets or sets the runbook.
     * 
     */
    private final @Nullable RunbookAssociationPropertyResponse runbook;
    /**
     * @return Gets or sets the schedule.
     * 
     */
    private final @Nullable ScheduleAssociationPropertyResponse schedule;
    /**
     * @return Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetJobScheduleResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("jobScheduleId") @Nullable String jobScheduleId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") @Nullable Map<String,String> parameters,
        @CustomType.Parameter("runOn") @Nullable String runOn,
        @CustomType.Parameter("runbook") @Nullable RunbookAssociationPropertyResponse runbook,
        @CustomType.Parameter("schedule") @Nullable ScheduleAssociationPropertyResponse schedule,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.jobScheduleId = jobScheduleId;
        this.name = name;
        this.parameters = parameters;
        this.runOn = runOn;
        this.runbook = runbook;
        this.schedule = schedule;
        this.type = type;
    }

    /**
     * @return Gets the id of the resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Gets or sets the id of job schedule.
     * 
     */
    public Optional<String> jobScheduleId() {
        return Optional.ofNullable(this.jobScheduleId);
    }
    /**
     * @return Gets the name of the variable.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Gets or sets the parameters of the job schedule.
     * 
     */
    public Map<String,String> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * @return Gets or sets the hybrid worker group that the scheduled job should run on.
     * 
     */
    public Optional<String> runOn() {
        return Optional.ofNullable(this.runOn);
    }
    /**
     * @return Gets or sets the runbook.
     * 
     */
    public Optional<RunbookAssociationPropertyResponse> runbook() {
        return Optional.ofNullable(this.runbook);
    }
    /**
     * @return Gets or sets the schedule.
     * 
     */
    public Optional<ScheduleAssociationPropertyResponse> schedule() {
        return Optional.ofNullable(this.schedule);
    }
    /**
     * @return Resource type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobScheduleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String jobScheduleId;
        private String name;
        private @Nullable Map<String,String> parameters;
        private @Nullable String runOn;
        private @Nullable RunbookAssociationPropertyResponse runbook;
        private @Nullable ScheduleAssociationPropertyResponse schedule;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobScheduleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.jobScheduleId = defaults.jobScheduleId;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.runOn = defaults.runOn;
    	      this.runbook = defaults.runbook;
    	      this.schedule = defaults.schedule;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder jobScheduleId(@Nullable String jobScheduleId) {
            this.jobScheduleId = jobScheduleId;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder runOn(@Nullable String runOn) {
            this.runOn = runOn;
            return this;
        }
        public Builder runbook(@Nullable RunbookAssociationPropertyResponse runbook) {
            this.runbook = runbook;
            return this;
        }
        public Builder schedule(@Nullable ScheduleAssociationPropertyResponse schedule) {
            this.schedule = schedule;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetJobScheduleResult build() {
            return new GetJobScheduleResult(id, jobScheduleId, name, parameters, runOn, runbook, schedule, type);
        }
    }
}
