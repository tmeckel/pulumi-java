// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetScheduledTriggerResult {
    /**
     * Time at which the trigger was created.
     * 
     */
    private final String createdAt;
    /**
     * The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * Kind of synchronization on trigger.
     * Expected value is 'ScheduleBased'.
     * 
     */
    private final String kind;
    /**
     * Name of the azure resource
     * 
     */
    private final String name;
    /**
     * Gets the provisioning state
     * 
     */
    private final String provisioningState;
    /**
     * Recurrence Interval
     * 
     */
    private final String recurrenceInterval;
    /**
     * Synchronization mode
     * 
     */
    private final @Nullable String synchronizationMode;
    /**
     * Synchronization time
     * 
     */
    private final String synchronizationTime;
    /**
     * System Data of the Azure resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Gets the trigger state
     * 
     */
    private final String triggerStatus;
    /**
     * Type of the azure resource
     * 
     */
    private final String type;
    /**
     * Name of the user who created the trigger.
     * 
     */
    private final String userName;

    @OutputCustomType.Constructor
    private GetScheduledTriggerResult(
        @OutputCustomType.Parameter("createdAt") String createdAt,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("recurrenceInterval") String recurrenceInterval,
        @OutputCustomType.Parameter("synchronizationMode") @Nullable String synchronizationMode,
        @OutputCustomType.Parameter("synchronizationTime") String synchronizationTime,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("triggerStatus") String triggerStatus,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("userName") String userName) {
        this.createdAt = createdAt;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.provisioningState = provisioningState;
        this.recurrenceInterval = recurrenceInterval;
        this.synchronizationMode = synchronizationMode;
        this.synchronizationTime = synchronizationTime;
        this.systemData = systemData;
        this.triggerStatus = triggerStatus;
        this.type = type;
        this.userName = userName;
    }

    /**
     * Time at which the trigger was created.
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The resource id of the azure resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of synchronization on trigger.
     * Expected value is 'ScheduleBased'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the azure resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Gets the provisioning state
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Recurrence Interval
     * 
    */
    public String getRecurrenceInterval() {
        return this.recurrenceInterval;
    }
    /**
     * Synchronization mode
     * 
    */
    public Optional<String> getSynchronizationMode() {
        return Optional.ofNullable(this.synchronizationMode);
    }
    /**
     * Synchronization time
     * 
    */
    public String getSynchronizationTime() {
        return this.synchronizationTime;
    }
    /**
     * System Data of the Azure resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Gets the trigger state
     * 
    */
    public String getTriggerStatus() {
        return this.triggerStatus;
    }
    /**
     * Type of the azure resource
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Name of the user who created the trigger.
     * 
    */
    public String getUserName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduledTriggerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String id;
        private String kind;
        private String name;
        private String provisioningState;
        private String recurrenceInterval;
        private @Nullable String synchronizationMode;
        private String synchronizationTime;
        private SystemDataResponse systemData;
        private String triggerStatus;
        private String type;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduledTriggerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.recurrenceInterval = defaults.recurrenceInterval;
    	      this.synchronizationMode = defaults.synchronizationMode;
    	      this.synchronizationTime = defaults.synchronizationTime;
    	      this.systemData = defaults.systemData;
    	      this.triggerStatus = defaults.triggerStatus;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder recurrenceInterval(String recurrenceInterval) {
            this.recurrenceInterval = Objects.requireNonNull(recurrenceInterval);
            return this;
        }

        public Builder synchronizationMode(@Nullable String synchronizationMode) {
            this.synchronizationMode = synchronizationMode;
            return this;
        }

        public Builder synchronizationTime(String synchronizationTime) {
            this.synchronizationTime = Objects.requireNonNull(synchronizationTime);
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder triggerStatus(String triggerStatus) {
            this.triggerStatus = Objects.requireNonNull(triggerStatus);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public GetScheduledTriggerResult build() {
            return new GetScheduledTriggerResult(createdAt, id, kind, name, provisioningState, recurrenceInterval, synchronizationMode, synchronizationTime, systemData, triggerStatus, type, userName);
        }
    }
}
