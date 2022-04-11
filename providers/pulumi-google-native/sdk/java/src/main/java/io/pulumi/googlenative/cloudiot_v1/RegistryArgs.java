// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.cloudiot_v1.enums.RegistryLogLevel;
import io.pulumi.googlenative.cloudiot_v1.inputs.EventNotificationConfigArgs;
import io.pulumi.googlenative.cloudiot_v1.inputs.HttpConfigArgs;
import io.pulumi.googlenative.cloudiot_v1.inputs.MqttConfigArgs;
import io.pulumi.googlenative.cloudiot_v1.inputs.RegistryCredentialArgs;
import io.pulumi.googlenative.cloudiot_v1.inputs.StateNotificationConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistryArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistryArgs Empty = new RegistryArgs();

    /**
     * The credentials used to verify the device credentials. No more than 10 credentials can be bound to a single registry at a time. The verification process occurs at the time of device creation or update. If this field is empty, no verification is performed. Otherwise, the credentials of a newly created device or added credentials of an updated device should be signed with one of these registry credentials. Note, however, that existing devices will never be affected by modifications to this list of credentials: after a device has been successfully created in a registry, it should be able to connect even if its registry credentials are revoked, deleted, or modified.
     * 
     */
    @Import(name="credentials")
      private final @Nullable Output<List<RegistryCredentialArgs>> credentials;

    public Output<List<RegistryCredentialArgs>> getCredentials() {
        return this.credentials == null ? Codegen.empty() : this.credentials;
    }

    /**
     * The configuration for notification of telemetry events received from the device. All telemetry events that were successfully published by the device and acknowledged by Cloud IoT Core are guaranteed to be delivered to Cloud Pub/Sub. If multiple configurations match a message, only the first matching configuration is used. If you try to publish a device telemetry event using MQTT without specifying a Cloud Pub/Sub topic for the device's registry, the connection closes automatically. If you try to do so using an HTTP connection, an error is returned. Up to 10 configurations may be provided.
     * 
     */
    @Import(name="eventNotificationConfigs")
      private final @Nullable Output<List<EventNotificationConfigArgs>> eventNotificationConfigs;

    public Output<List<EventNotificationConfigArgs>> getEventNotificationConfigs() {
        return this.eventNotificationConfigs == null ? Codegen.empty() : this.eventNotificationConfigs;
    }

    /**
     * The DeviceService (HTTP) configuration for this device registry.
     * 
     */
    @Import(name="httpConfig")
      private final @Nullable Output<HttpConfigArgs> httpConfig;

    public Output<HttpConfigArgs> getHttpConfig() {
        return this.httpConfig == null ? Codegen.empty() : this.httpConfig;
    }

    /**
     * The identifier of this device registry. For example, `myRegistry`.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * **Beta Feature** The default logging verbosity for activity from devices in this registry. The verbosity level can be overridden by Device.log_level.
     * 
     */
    @Import(name="logLevel")
      private final @Nullable Output<RegistryLogLevel> logLevel;

    public Output<RegistryLogLevel> getLogLevel() {
        return this.logLevel == null ? Codegen.empty() : this.logLevel;
    }

    /**
     * The MQTT configuration for this device registry.
     * 
     */
    @Import(name="mqttConfig")
      private final @Nullable Output<MqttConfigArgs> mqttConfig;

    public Output<MqttConfigArgs> getMqttConfig() {
        return this.mqttConfig == null ? Codegen.empty() : this.mqttConfig;
    }

    /**
     * The resource path name. For example, `projects/example-project/locations/us-central1/registries/my-registry`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The configuration for notification of new states received from the device. State updates are guaranteed to be stored in the state history, but notifications to Cloud Pub/Sub are not guaranteed. For example, if permissions are misconfigured or the specified topic doesn't exist, no notification will be published but the state will still be stored in Cloud IoT Core.
     * 
     */
    @Import(name="stateNotificationConfig")
      private final @Nullable Output<StateNotificationConfigArgs> stateNotificationConfig;

    public Output<StateNotificationConfigArgs> getStateNotificationConfig() {
        return this.stateNotificationConfig == null ? Codegen.empty() : this.stateNotificationConfig;
    }

    public RegistryArgs(
        @Nullable Output<List<RegistryCredentialArgs>> credentials,
        @Nullable Output<List<EventNotificationConfigArgs>> eventNotificationConfigs,
        @Nullable Output<HttpConfigArgs> httpConfig,
        @Nullable Output<String> id,
        @Nullable Output<String> location,
        @Nullable Output<RegistryLogLevel> logLevel,
        @Nullable Output<MqttConfigArgs> mqttConfig,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<StateNotificationConfigArgs> stateNotificationConfig) {
        this.credentials = credentials;
        this.eventNotificationConfigs = eventNotificationConfigs;
        this.httpConfig = httpConfig;
        this.id = id;
        this.location = location;
        this.logLevel = logLevel;
        this.mqttConfig = mqttConfig;
        this.name = name;
        this.project = project;
        this.stateNotificationConfig = stateNotificationConfig;
    }

    private RegistryArgs() {
        this.credentials = Codegen.empty();
        this.eventNotificationConfigs = Codegen.empty();
        this.httpConfig = Codegen.empty();
        this.id = Codegen.empty();
        this.location = Codegen.empty();
        this.logLevel = Codegen.empty();
        this.mqttConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.stateNotificationConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<RegistryCredentialArgs>> credentials;
        private @Nullable Output<List<EventNotificationConfigArgs>> eventNotificationConfigs;
        private @Nullable Output<HttpConfigArgs> httpConfig;
        private @Nullable Output<String> id;
        private @Nullable Output<String> location;
        private @Nullable Output<RegistryLogLevel> logLevel;
        private @Nullable Output<MqttConfigArgs> mqttConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<StateNotificationConfigArgs> stateNotificationConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.eventNotificationConfigs = defaults.eventNotificationConfigs;
    	      this.httpConfig = defaults.httpConfig;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.logLevel = defaults.logLevel;
    	      this.mqttConfig = defaults.mqttConfig;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.stateNotificationConfig = defaults.stateNotificationConfig;
        }

        public Builder credentials(@Nullable Output<List<RegistryCredentialArgs>> credentials) {
            this.credentials = credentials;
            return this;
        }
        public Builder credentials(@Nullable List<RegistryCredentialArgs> credentials) {
            this.credentials = Codegen.ofNullable(credentials);
            return this;
        }
        public Builder credentials(RegistryCredentialArgs... credentials) {
            return credentials(List.of(credentials));
        }
        public Builder eventNotificationConfigs(@Nullable Output<List<EventNotificationConfigArgs>> eventNotificationConfigs) {
            this.eventNotificationConfigs = eventNotificationConfigs;
            return this;
        }
        public Builder eventNotificationConfigs(@Nullable List<EventNotificationConfigArgs> eventNotificationConfigs) {
            this.eventNotificationConfigs = Codegen.ofNullable(eventNotificationConfigs);
            return this;
        }
        public Builder eventNotificationConfigs(EventNotificationConfigArgs... eventNotificationConfigs) {
            return eventNotificationConfigs(List.of(eventNotificationConfigs));
        }
        public Builder httpConfig(@Nullable Output<HttpConfigArgs> httpConfig) {
            this.httpConfig = httpConfig;
            return this;
        }
        public Builder httpConfig(@Nullable HttpConfigArgs httpConfig) {
            this.httpConfig = Codegen.ofNullable(httpConfig);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder logLevel(@Nullable Output<RegistryLogLevel> logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public Builder logLevel(@Nullable RegistryLogLevel logLevel) {
            this.logLevel = Codegen.ofNullable(logLevel);
            return this;
        }
        public Builder mqttConfig(@Nullable Output<MqttConfigArgs> mqttConfig) {
            this.mqttConfig = mqttConfig;
            return this;
        }
        public Builder mqttConfig(@Nullable MqttConfigArgs mqttConfig) {
            this.mqttConfig = Codegen.ofNullable(mqttConfig);
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
        public Builder stateNotificationConfig(@Nullable Output<StateNotificationConfigArgs> stateNotificationConfig) {
            this.stateNotificationConfig = stateNotificationConfig;
            return this;
        }
        public Builder stateNotificationConfig(@Nullable StateNotificationConfigArgs stateNotificationConfig) {
            this.stateNotificationConfig = Codegen.ofNullable(stateNotificationConfig);
            return this;
        }        public RegistryArgs build() {
            return new RegistryArgs(credentials, eventNotificationConfigs, httpConfig, id, location, logLevel, mqttConfig, name, project, stateNotificationConfig);
        }
    }
}
