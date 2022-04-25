// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudiot_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudiot_v1.outputs.EventNotificationConfigResponse;
import com.pulumi.googlenative.cloudiot_v1.outputs.HttpConfigResponse;
import com.pulumi.googlenative.cloudiot_v1.outputs.MqttConfigResponse;
import com.pulumi.googlenative.cloudiot_v1.outputs.RegistryCredentialResponse;
import com.pulumi.googlenative.cloudiot_v1.outputs.StateNotificationConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRegistryResult {
    /**
     * @return The credentials used to verify the device credentials. No more than 10 credentials can be bound to a single registry at a time. The verification process occurs at the time of device creation or update. If this field is empty, no verification is performed. Otherwise, the credentials of a newly created device or added credentials of an updated device should be signed with one of these registry credentials. Note, however, that existing devices will never be affected by modifications to this list of credentials: after a device has been successfully created in a registry, it should be able to connect even if its registry credentials are revoked, deleted, or modified.
     * 
     */
    private final List<RegistryCredentialResponse> credentials;
    /**
     * @return The configuration for notification of telemetry events received from the device. All telemetry events that were successfully published by the device and acknowledged by Cloud IoT Core are guaranteed to be delivered to Cloud Pub/Sub. If multiple configurations match a message, only the first matching configuration is used. If you try to publish a device telemetry event using MQTT without specifying a Cloud Pub/Sub topic for the device&#39;s registry, the connection closes automatically. If you try to do so using an HTTP connection, an error is returned. Up to 10 configurations may be provided.
     * 
     */
    private final List<EventNotificationConfigResponse> eventNotificationConfigs;
    /**
     * @return The DeviceService (HTTP) configuration for this device registry.
     * 
     */
    private final HttpConfigResponse httpConfig;
    /**
     * @return **Beta Feature** The default logging verbosity for activity from devices in this registry. The verbosity level can be overridden by Device.log_level.
     * 
     */
    private final String logLevel;
    /**
     * @return The MQTT configuration for this device registry.
     * 
     */
    private final MqttConfigResponse mqttConfig;
    /**
     * @return The resource path name. For example, `projects/example-project/locations/us-central1/registries/my-registry`.
     * 
     */
    private final String name;
    /**
     * @return The configuration for notification of new states received from the device. State updates are guaranteed to be stored in the state history, but notifications to Cloud Pub/Sub are not guaranteed. For example, if permissions are misconfigured or the specified topic doesn&#39;t exist, no notification will be published but the state will still be stored in Cloud IoT Core.
     * 
     */
    private final StateNotificationConfigResponse stateNotificationConfig;

    @CustomType.Constructor
    private GetRegistryResult(
        @CustomType.Parameter("credentials") List<RegistryCredentialResponse> credentials,
        @CustomType.Parameter("eventNotificationConfigs") List<EventNotificationConfigResponse> eventNotificationConfigs,
        @CustomType.Parameter("httpConfig") HttpConfigResponse httpConfig,
        @CustomType.Parameter("logLevel") String logLevel,
        @CustomType.Parameter("mqttConfig") MqttConfigResponse mqttConfig,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("stateNotificationConfig") StateNotificationConfigResponse stateNotificationConfig) {
        this.credentials = credentials;
        this.eventNotificationConfigs = eventNotificationConfigs;
        this.httpConfig = httpConfig;
        this.logLevel = logLevel;
        this.mqttConfig = mqttConfig;
        this.name = name;
        this.stateNotificationConfig = stateNotificationConfig;
    }

    /**
     * @return The credentials used to verify the device credentials. No more than 10 credentials can be bound to a single registry at a time. The verification process occurs at the time of device creation or update. If this field is empty, no verification is performed. Otherwise, the credentials of a newly created device or added credentials of an updated device should be signed with one of these registry credentials. Note, however, that existing devices will never be affected by modifications to this list of credentials: after a device has been successfully created in a registry, it should be able to connect even if its registry credentials are revoked, deleted, or modified.
     * 
     */
    public List<RegistryCredentialResponse> credentials() {
        return this.credentials;
    }
    /**
     * @return The configuration for notification of telemetry events received from the device. All telemetry events that were successfully published by the device and acknowledged by Cloud IoT Core are guaranteed to be delivered to Cloud Pub/Sub. If multiple configurations match a message, only the first matching configuration is used. If you try to publish a device telemetry event using MQTT without specifying a Cloud Pub/Sub topic for the device&#39;s registry, the connection closes automatically. If you try to do so using an HTTP connection, an error is returned. Up to 10 configurations may be provided.
     * 
     */
    public List<EventNotificationConfigResponse> eventNotificationConfigs() {
        return this.eventNotificationConfigs;
    }
    /**
     * @return The DeviceService (HTTP) configuration for this device registry.
     * 
     */
    public HttpConfigResponse httpConfig() {
        return this.httpConfig;
    }
    /**
     * @return **Beta Feature** The default logging verbosity for activity from devices in this registry. The verbosity level can be overridden by Device.log_level.
     * 
     */
    public String logLevel() {
        return this.logLevel;
    }
    /**
     * @return The MQTT configuration for this device registry.
     * 
     */
    public MqttConfigResponse mqttConfig() {
        return this.mqttConfig;
    }
    /**
     * @return The resource path name. For example, `projects/example-project/locations/us-central1/registries/my-registry`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The configuration for notification of new states received from the device. State updates are guaranteed to be stored in the state history, but notifications to Cloud Pub/Sub are not guaranteed. For example, if permissions are misconfigured or the specified topic doesn&#39;t exist, no notification will be published but the state will still be stored in Cloud IoT Core.
     * 
     */
    public StateNotificationConfigResponse stateNotificationConfig() {
        return this.stateNotificationConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RegistryCredentialResponse> credentials;
        private List<EventNotificationConfigResponse> eventNotificationConfigs;
        private HttpConfigResponse httpConfig;
        private String logLevel;
        private MqttConfigResponse mqttConfig;
        private String name;
        private StateNotificationConfigResponse stateNotificationConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.eventNotificationConfigs = defaults.eventNotificationConfigs;
    	      this.httpConfig = defaults.httpConfig;
    	      this.logLevel = defaults.logLevel;
    	      this.mqttConfig = defaults.mqttConfig;
    	      this.name = defaults.name;
    	      this.stateNotificationConfig = defaults.stateNotificationConfig;
        }

        public Builder credentials(List<RegistryCredentialResponse> credentials) {
            this.credentials = Objects.requireNonNull(credentials);
            return this;
        }
        public Builder credentials(RegistryCredentialResponse... credentials) {
            return credentials(List.of(credentials));
        }
        public Builder eventNotificationConfigs(List<EventNotificationConfigResponse> eventNotificationConfigs) {
            this.eventNotificationConfigs = Objects.requireNonNull(eventNotificationConfigs);
            return this;
        }
        public Builder eventNotificationConfigs(EventNotificationConfigResponse... eventNotificationConfigs) {
            return eventNotificationConfigs(List.of(eventNotificationConfigs));
        }
        public Builder httpConfig(HttpConfigResponse httpConfig) {
            this.httpConfig = Objects.requireNonNull(httpConfig);
            return this;
        }
        public Builder logLevel(String logLevel) {
            this.logLevel = Objects.requireNonNull(logLevel);
            return this;
        }
        public Builder mqttConfig(MqttConfigResponse mqttConfig) {
            this.mqttConfig = Objects.requireNonNull(mqttConfig);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder stateNotificationConfig(StateNotificationConfigResponse stateNotificationConfig) {
            this.stateNotificationConfig = Objects.requireNonNull(stateNotificationConfig);
            return this;
        }        public GetRegistryResult build() {
            return new GetRegistryResult(credentials, eventNotificationConfigs, httpConfig, logLevel, mqttConfig, name, stateNotificationConfig);
        }
    }
}
