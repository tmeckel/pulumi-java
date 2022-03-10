// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.ConnectionGatewayReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionGatewayDefinitionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionGatewayDefinitionPropertiesArgs Empty = new ConnectionGatewayDefinitionPropertiesArgs();

    /**
     * The URI of the backend
     * 
     */
    @InputImport(name="backendUri")
      private final @Nullable Input<String> backendUri;

    public Input<String> getBackendUri() {
        return this.backendUri == null ? Input.empty() : this.backendUri;
    }

    /**
     * The gateway installation reference
     * 
     */
    @InputImport(name="connectionGatewayInstallation")
      private final @Nullable Input<ConnectionGatewayReferenceArgs> connectionGatewayInstallation;

    public Input<ConnectionGatewayReferenceArgs> getConnectionGatewayInstallation() {
        return this.connectionGatewayInstallation == null ? Input.empty() : this.connectionGatewayInstallation;
    }

    /**
     * The gateway admin
     * 
     */
    @InputImport(name="contactInformation")
      private final @Nullable Input<List<String>> contactInformation;

    public Input<List<String>> getContactInformation() {
        return this.contactInformation == null ? Input.empty() : this.contactInformation;
    }

    /**
     * The gateway description
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The gateway display name
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The machine name of the gateway
     * 
     */
    @InputImport(name="machineName")
      private final @Nullable Input<String> machineName;

    public Input<String> getMachineName() {
        return this.machineName == null ? Input.empty() : this.machineName;
    }

    /**
     * The gateway status
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<Object> status;

    public Input<Object> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public ConnectionGatewayDefinitionPropertiesArgs(
        @Nullable Input<String> backendUri,
        @Nullable Input<ConnectionGatewayReferenceArgs> connectionGatewayInstallation,
        @Nullable Input<List<String>> contactInformation,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<String> machineName,
        @Nullable Input<Object> status) {
        this.backendUri = backendUri;
        this.connectionGatewayInstallation = connectionGatewayInstallation;
        this.contactInformation = contactInformation;
        this.description = description;
        this.displayName = displayName;
        this.machineName = machineName;
        this.status = status;
    }

    private ConnectionGatewayDefinitionPropertiesArgs() {
        this.backendUri = Input.empty();
        this.connectionGatewayInstallation = Input.empty();
        this.contactInformation = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.machineName = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionGatewayDefinitionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> backendUri;
        private @Nullable Input<ConnectionGatewayReferenceArgs> connectionGatewayInstallation;
        private @Nullable Input<List<String>> contactInformation;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> machineName;
        private @Nullable Input<Object> status;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionGatewayDefinitionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendUri = defaults.backendUri;
    	      this.connectionGatewayInstallation = defaults.connectionGatewayInstallation;
    	      this.contactInformation = defaults.contactInformation;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.machineName = defaults.machineName;
    	      this.status = defaults.status;
        }

        public Builder backendUri(@Nullable Input<String> backendUri) {
            this.backendUri = backendUri;
            return this;
        }

        public Builder backendUri(@Nullable String backendUri) {
            this.backendUri = Input.ofNullable(backendUri);
            return this;
        }

        public Builder connectionGatewayInstallation(@Nullable Input<ConnectionGatewayReferenceArgs> connectionGatewayInstallation) {
            this.connectionGatewayInstallation = connectionGatewayInstallation;
            return this;
        }

        public Builder connectionGatewayInstallation(@Nullable ConnectionGatewayReferenceArgs connectionGatewayInstallation) {
            this.connectionGatewayInstallation = Input.ofNullable(connectionGatewayInstallation);
            return this;
        }

        public Builder contactInformation(@Nullable Input<List<String>> contactInformation) {
            this.contactInformation = contactInformation;
            return this;
        }

        public Builder contactInformation(@Nullable List<String> contactInformation) {
            this.contactInformation = Input.ofNullable(contactInformation);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder displayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder machineName(@Nullable Input<String> machineName) {
            this.machineName = machineName;
            return this;
        }

        public Builder machineName(@Nullable String machineName) {
            this.machineName = Input.ofNullable(machineName);
            return this;
        }

        public Builder status(@Nullable Input<Object> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable Object status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public ConnectionGatewayDefinitionPropertiesArgs build() {
            return new ConnectionGatewayDefinitionPropertiesArgs(backendUri, connectionGatewayInstallation, contactInformation, description, displayName, machineName, status);
        }
    }
}
