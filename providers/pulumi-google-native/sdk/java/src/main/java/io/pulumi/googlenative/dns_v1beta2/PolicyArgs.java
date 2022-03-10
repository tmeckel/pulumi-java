// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dns_v1beta2.inputs.PolicyAlternativeNameServerConfigArgs;
import io.pulumi.googlenative.dns_v1beta2.inputs.PolicyNetworkArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * Sets an alternative name server for the associated networks. When specified, all DNS queries are forwarded to a name server that you choose. Names such as .internal are not available when an alternative name server is specified.
     * 
     */
    @InputImport(name="alternativeNameServerConfig")
      private final @Nullable Input<PolicyAlternativeNameServerConfigArgs> alternativeNameServerConfig;

    public Input<PolicyAlternativeNameServerConfigArgs> getAlternativeNameServerConfig() {
        return this.alternativeNameServerConfig == null ? Input.empty() : this.alternativeNameServerConfig;
    }

    @InputImport(name="clientOperationId")
      private final @Nullable Input<String> clientOperationId;

    public Input<String> getClientOperationId() {
        return this.clientOperationId == null ? Input.empty() : this.clientOperationId;
    }

    /**
     * A mutable string of at most 1024 characters associated with this resource for the user's convenience. Has no effect on the policy's function.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Allows networks bound to this policy to receive DNS queries sent by VMs or applications over VPN connections. When enabled, a virtual IP address is allocated from each of the subnetworks that are bound to this policy.
     * 
     */
    @InputImport(name="enableInboundForwarding")
      private final @Nullable Input<Boolean> enableInboundForwarding;

    public Input<Boolean> getEnableInboundForwarding() {
        return this.enableInboundForwarding == null ? Input.empty() : this.enableInboundForwarding;
    }

    /**
     * Controls whether logging is enabled for the networks bound to this policy. Defaults to no logging if not set.
     * 
     */
    @InputImport(name="enableLogging")
      private final @Nullable Input<Boolean> enableLogging;

    public Input<Boolean> getEnableLogging() {
        return this.enableLogging == null ? Input.empty() : this.enableLogging;
    }

    /**
     * Unique identifier for the resource; defined by the server (output only).
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * User-assigned name for this policy.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * List of network names specifying networks to which this policy is applied.
     * 
     */
    @InputImport(name="networks")
      private final @Nullable Input<List<PolicyNetworkArgs>> networks;

    public Input<List<PolicyNetworkArgs>> getNetworks() {
        return this.networks == null ? Input.empty() : this.networks;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public PolicyArgs(
        @Nullable Input<PolicyAlternativeNameServerConfigArgs> alternativeNameServerConfig,
        @Nullable Input<String> clientOperationId,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> enableInboundForwarding,
        @Nullable Input<Boolean> enableLogging,
        @Nullable Input<String> id,
        @Nullable Input<String> kind,
        @Nullable Input<String> name,
        @Nullable Input<List<PolicyNetworkArgs>> networks,
        @Nullable Input<String> project) {
        this.alternativeNameServerConfig = alternativeNameServerConfig;
        this.clientOperationId = clientOperationId;
        this.description = description;
        this.enableInboundForwarding = enableInboundForwarding;
        this.enableLogging = enableLogging;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.networks = networks;
        this.project = project;
    }

    private PolicyArgs() {
        this.alternativeNameServerConfig = Input.empty();
        this.clientOperationId = Input.empty();
        this.description = Input.empty();
        this.enableInboundForwarding = Input.empty();
        this.enableLogging = Input.empty();
        this.id = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.networks = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PolicyAlternativeNameServerConfigArgs> alternativeNameServerConfig;
        private @Nullable Input<String> clientOperationId;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> enableInboundForwarding;
        private @Nullable Input<Boolean> enableLogging;
        private @Nullable Input<String> id;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> name;
        private @Nullable Input<List<PolicyNetworkArgs>> networks;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternativeNameServerConfig = defaults.alternativeNameServerConfig;
    	      this.clientOperationId = defaults.clientOperationId;
    	      this.description = defaults.description;
    	      this.enableInboundForwarding = defaults.enableInboundForwarding;
    	      this.enableLogging = defaults.enableLogging;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.networks = defaults.networks;
    	      this.project = defaults.project;
        }

        public Builder alternativeNameServerConfig(@Nullable Input<PolicyAlternativeNameServerConfigArgs> alternativeNameServerConfig) {
            this.alternativeNameServerConfig = alternativeNameServerConfig;
            return this;
        }

        public Builder alternativeNameServerConfig(@Nullable PolicyAlternativeNameServerConfigArgs alternativeNameServerConfig) {
            this.alternativeNameServerConfig = Input.ofNullable(alternativeNameServerConfig);
            return this;
        }

        public Builder clientOperationId(@Nullable Input<String> clientOperationId) {
            this.clientOperationId = clientOperationId;
            return this;
        }

        public Builder clientOperationId(@Nullable String clientOperationId) {
            this.clientOperationId = Input.ofNullable(clientOperationId);
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

        public Builder enableInboundForwarding(@Nullable Input<Boolean> enableInboundForwarding) {
            this.enableInboundForwarding = enableInboundForwarding;
            return this;
        }

        public Builder enableInboundForwarding(@Nullable Boolean enableInboundForwarding) {
            this.enableInboundForwarding = Input.ofNullable(enableInboundForwarding);
            return this;
        }

        public Builder enableLogging(@Nullable Input<Boolean> enableLogging) {
            this.enableLogging = enableLogging;
            return this;
        }

        public Builder enableLogging(@Nullable Boolean enableLogging) {
            this.enableLogging = Input.ofNullable(enableLogging);
            return this;
        }

        public Builder id(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder kind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder networks(@Nullable Input<List<PolicyNetworkArgs>> networks) {
            this.networks = networks;
            return this;
        }

        public Builder networks(@Nullable List<PolicyNetworkArgs> networks) {
            this.networks = Input.ofNullable(networks);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public PolicyArgs build() {
            return new PolicyArgs(alternativeNameServerConfig, clientOperationId, description, enableInboundForwarding, enableLogging, id, kind, name, networks, project);
        }
    }
}
