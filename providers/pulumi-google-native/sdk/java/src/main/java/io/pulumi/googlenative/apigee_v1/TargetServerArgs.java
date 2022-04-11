// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.apigee_v1.enums.TargetServerProtocol;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1TlsInfoArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetServerArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetServerArgs Empty = new TargetServerArgs();

    /**
     * Optional. A human-readable description of this TargetServer.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="environmentId", required=true)
      private final Output<String> environmentId;

    public Output<String> getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * The host name this target connects to. Value must be a valid hostname as described by RFC-1123.
     * 
     */
    @Import(name="host", required=true)
      private final Output<String> host;

    public Output<String> getHost() {
        return this.host;
    }

    /**
     * Optional. Enabling/disabling a TargetServer is useful when TargetServers are used in load balancing configurations, and one or more TargetServers need to taken out of rotation periodically. Defaults to true.
     * 
     */
    @Import(name="isEnabled")
      private final @Nullable Output<Boolean> isEnabled;

    public Output<Boolean> getIsEnabled() {
        return this.isEnabled == null ? Codegen.empty() : this.isEnabled;
    }

    /**
     * The resource id of this target server. Values must match the regular expression
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="organizationId", required=true)
      private final Output<String> organizationId;

    public Output<String> getOrganizationId() {
        return this.organizationId;
    }

    /**
     * The port number this target connects to on the given host. Value must be between 1 and 65535, inclusive.
     * 
     */
    @Import(name="port", required=true)
      private final Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port;
    }

    /**
     * Immutable. The protocol used by this TargetServer.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<TargetServerProtocol> protocol;

    public Output<TargetServerProtocol> getProtocol() {
        return this.protocol == null ? Codegen.empty() : this.protocol;
    }

    /**
     * Optional. Specifies TLS configuration info for this TargetServer. The JSON name is `sSLInfo` for legacy/backwards compatibility reasons -- Edge originally supported SSL, and the name is still used for TLS configuration.
     * 
     */
    @Import(name="sSLInfo")
      private final @Nullable Output<GoogleCloudApigeeV1TlsInfoArgs> sSLInfo;

    public Output<GoogleCloudApigeeV1TlsInfoArgs> getSSLInfo() {
        return this.sSLInfo == null ? Codegen.empty() : this.sSLInfo;
    }

    public TargetServerArgs(
        @Nullable Output<String> description,
        Output<String> environmentId,
        Output<String> host,
        @Nullable Output<Boolean> isEnabled,
        @Nullable Output<String> name,
        Output<String> organizationId,
        Output<Integer> port,
        @Nullable Output<TargetServerProtocol> protocol,
        @Nullable Output<GoogleCloudApigeeV1TlsInfoArgs> sSLInfo) {
        this.description = description;
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.isEnabled = isEnabled;
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.protocol = protocol;
        this.sSLInfo = sSLInfo;
    }

    private TargetServerArgs() {
        this.description = Codegen.empty();
        this.environmentId = Codegen.empty();
        this.host = Codegen.empty();
        this.isEnabled = Codegen.empty();
        this.name = Codegen.empty();
        this.organizationId = Codegen.empty();
        this.port = Codegen.empty();
        this.protocol = Codegen.empty();
        this.sSLInfo = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> environmentId;
        private Output<String> host;
        private @Nullable Output<Boolean> isEnabled;
        private @Nullable Output<String> name;
        private Output<String> organizationId;
        private Output<Integer> port;
        private @Nullable Output<TargetServerProtocol> protocol;
        private @Nullable Output<GoogleCloudApigeeV1TlsInfoArgs> sSLInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetServerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.environmentId = defaults.environmentId;
    	      this.host = defaults.host;
    	      this.isEnabled = defaults.isEnabled;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.sSLInfo = defaults.sSLInfo;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder environmentId(Output<String> environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }
        public Builder environmentId(String environmentId) {
            this.environmentId = Output.of(Objects.requireNonNull(environmentId));
            return this;
        }
        public Builder host(Output<String> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder host(String host) {
            this.host = Output.of(Objects.requireNonNull(host));
            return this;
        }
        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Builder isEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = Codegen.ofNullable(isEnabled);
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
        public Builder organizationId(Output<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Output.of(Objects.requireNonNull(organizationId));
            return this;
        }
        public Builder port(Output<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Output.of(Objects.requireNonNull(port));
            return this;
        }
        public Builder protocol(@Nullable Output<TargetServerProtocol> protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder protocol(@Nullable TargetServerProtocol protocol) {
            this.protocol = Codegen.ofNullable(protocol);
            return this;
        }
        public Builder sSLInfo(@Nullable Output<GoogleCloudApigeeV1TlsInfoArgs> sSLInfo) {
            this.sSLInfo = sSLInfo;
            return this;
        }
        public Builder sSLInfo(@Nullable GoogleCloudApigeeV1TlsInfoArgs sSLInfo) {
            this.sSLInfo = Codegen.ofNullable(sSLInfo);
            return this;
        }        public TargetServerArgs build() {
            return new TargetServerArgs(description, environmentId, host, isEnabled, name, organizationId, port, protocol, sSLInfo);
        }
    }
}
