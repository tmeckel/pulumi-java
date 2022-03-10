// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.AgentPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.CredentialsResponse;
import io.pulumi.azurenative.containerregistry.outputs.DockerBuildStepResponse;
import io.pulumi.azurenative.containerregistry.outputs.EncodedTaskStepResponse;
import io.pulumi.azurenative.containerregistry.outputs.FileTaskStepResponse;
import io.pulumi.azurenative.containerregistry.outputs.IdentityPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.PlatformPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import io.pulumi.azurenative.containerregistry.outputs.TriggerPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTaskResult {
    /**
     * The machine configuration of the run agent.
     * 
     */
    private final @Nullable AgentPropertiesResponse agentConfiguration;
    /**
     * The dedicated agent pool for the task.
     * 
     */
    private final @Nullable String agentPoolName;
    /**
     * The creation date of task.
     * 
     */
    private final String creationDate;
    /**
     * The properties that describes a set of credentials that will be used when this run is invoked.
     * 
     */
    private final @Nullable CredentialsResponse credentials;
    /**
     * The resource ID.
     * 
     */
    private final String id;
    /**
     * Identity for the resource.
     * 
     */
    private final @Nullable IdentityPropertiesResponse identity;
    /**
     * The value of this property indicates whether the task resource is system task or not.
     * 
     */
    private final @Nullable Boolean isSystemTask;
    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    private final String location;
    /**
     * The template that describes the repository and tag information for run log artifact.
     * 
     */
    private final @Nullable String logTemplate;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The platform properties against which the run has to happen.
     * 
     */
    private final @Nullable PlatformPropertiesResponse platform;
    /**
     * The provisioning state of the task.
     * 
     */
    private final String provisioningState;
    /**
     * The current status of task.
     * 
     */
    private final @Nullable String status;
    /**
     * The properties of a task step.
     * 
     */
    private final @Nullable Object step;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Run timeout in seconds.
     * 
     */
    private final @Nullable Integer timeout;
    /**
     * The properties that describe all triggers for the task.
     * 
     */
    private final @Nullable TriggerPropertiesResponse trigger;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetTaskResult(
        @OutputCustomType.Parameter("agentConfiguration") @Nullable AgentPropertiesResponse agentConfiguration,
        @OutputCustomType.Parameter("agentPoolName") @Nullable String agentPoolName,
        @OutputCustomType.Parameter("creationDate") String creationDate,
        @OutputCustomType.Parameter("credentials") @Nullable CredentialsResponse credentials,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("identity") @Nullable IdentityPropertiesResponse identity,
        @OutputCustomType.Parameter("isSystemTask") @Nullable Boolean isSystemTask,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("logTemplate") @Nullable String logTemplate,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("platform") @Nullable PlatformPropertiesResponse platform,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("status") @Nullable String status,
        @OutputCustomType.Parameter("step") @Nullable Object step,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("timeout") @Nullable Integer timeout,
        @OutputCustomType.Parameter("trigger") @Nullable TriggerPropertiesResponse trigger,
        @OutputCustomType.Parameter("type") String type) {
        this.agentConfiguration = agentConfiguration;
        this.agentPoolName = agentPoolName;
        this.creationDate = creationDate;
        this.credentials = credentials;
        this.id = id;
        this.identity = identity;
        this.isSystemTask = isSystemTask;
        this.location = location;
        this.logTemplate = logTemplate;
        this.name = name;
        this.platform = platform;
        this.provisioningState = provisioningState;
        this.status = status;
        this.step = step;
        this.systemData = systemData;
        this.tags = tags;
        this.timeout = timeout;
        this.trigger = trigger;
        this.type = type;
    }

    /**
     * The machine configuration of the run agent.
     * 
    */
    public Optional<AgentPropertiesResponse> getAgentConfiguration() {
        return Optional.ofNullable(this.agentConfiguration);
    }
    /**
     * The dedicated agent pool for the task.
     * 
    */
    public Optional<String> getAgentPoolName() {
        return Optional.ofNullable(this.agentPoolName);
    }
    /**
     * The creation date of task.
     * 
    */
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * The properties that describes a set of credentials that will be used when this run is invoked.
     * 
    */
    public Optional<CredentialsResponse> getCredentials() {
        return Optional.ofNullable(this.credentials);
    }
    /**
     * The resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Identity for the resource.
     * 
    */
    public Optional<IdentityPropertiesResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The value of this property indicates whether the task resource is system task or not.
     * 
    */
    public Optional<Boolean> getIsSystemTask() {
        return Optional.ofNullable(this.isSystemTask);
    }
    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The template that describes the repository and tag information for run log artifact.
     * 
    */
    public Optional<String> getLogTemplate() {
        return Optional.ofNullable(this.logTemplate);
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The platform properties against which the run has to happen.
     * 
    */
    public Optional<PlatformPropertiesResponse> getPlatform() {
        return Optional.ofNullable(this.platform);
    }
    /**
     * The provisioning state of the task.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The current status of task.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * The properties of a task step.
     * 
    */
    public Optional<Object> getStep() {
        return Optional.ofNullable(this.step);
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The tags of the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Run timeout in seconds.
     * 
    */
    public Optional<Integer> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * The properties that describe all triggers for the task.
     * 
    */
    public Optional<TriggerPropertiesResponse> getTrigger() {
        return Optional.ofNullable(this.trigger);
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaskResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AgentPropertiesResponse agentConfiguration;
        private @Nullable String agentPoolName;
        private String creationDate;
        private @Nullable CredentialsResponse credentials;
        private String id;
        private @Nullable IdentityPropertiesResponse identity;
        private @Nullable Boolean isSystemTask;
        private String location;
        private @Nullable String logTemplate;
        private String name;
        private @Nullable PlatformPropertiesResponse platform;
        private String provisioningState;
        private @Nullable String status;
        private @Nullable Object step;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private @Nullable Integer timeout;
        private @Nullable TriggerPropertiesResponse trigger;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTaskResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentConfiguration = defaults.agentConfiguration;
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.creationDate = defaults.creationDate;
    	      this.credentials = defaults.credentials;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.isSystemTask = defaults.isSystemTask;
    	      this.location = defaults.location;
    	      this.logTemplate = defaults.logTemplate;
    	      this.name = defaults.name;
    	      this.platform = defaults.platform;
    	      this.provisioningState = defaults.provisioningState;
    	      this.status = defaults.status;
    	      this.step = defaults.step;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.trigger = defaults.trigger;
    	      this.type = defaults.type;
        }

        public Builder agentConfiguration(@Nullable AgentPropertiesResponse agentConfiguration) {
            this.agentConfiguration = agentConfiguration;
            return this;
        }

        public Builder agentPoolName(@Nullable String agentPoolName) {
            this.agentPoolName = agentPoolName;
            return this;
        }

        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }

        public Builder credentials(@Nullable CredentialsResponse credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder identity(@Nullable IdentityPropertiesResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder isSystemTask(@Nullable Boolean isSystemTask) {
            this.isSystemTask = isSystemTask;
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder logTemplate(@Nullable String logTemplate) {
            this.logTemplate = logTemplate;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder platform(@Nullable PlatformPropertiesResponse platform) {
            this.platform = platform;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder step(@Nullable Object step) {
            this.step = step;
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder trigger(@Nullable TriggerPropertiesResponse trigger) {
            this.trigger = trigger;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetTaskResult build() {
            return new GetTaskResult(agentConfiguration, agentPoolName, creationDate, credentials, id, identity, isSystemTask, location, logTemplate, name, platform, provisioningState, status, step, systemData, tags, timeout, trigger, type);
        }
    }
}
