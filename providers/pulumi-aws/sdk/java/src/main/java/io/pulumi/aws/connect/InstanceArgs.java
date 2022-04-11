// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * Specifies whether auto resolve best voices is enabled. Defaults to `true`.
     * 
     */
    @Import(name="autoResolveBestVoicesEnabled")
      private final @Nullable Output<Boolean> autoResolveBestVoicesEnabled;

    public Output<Boolean> getAutoResolveBestVoicesEnabled() {
        return this.autoResolveBestVoicesEnabled == null ? Codegen.empty() : this.autoResolveBestVoicesEnabled;
    }

    /**
     * Specifies whether contact flow logs are enabled. Defaults to `false`.
     * 
     */
    @Import(name="contactFlowLogsEnabled")
      private final @Nullable Output<Boolean> contactFlowLogsEnabled;

    public Output<Boolean> getContactFlowLogsEnabled() {
        return this.contactFlowLogsEnabled == null ? Codegen.empty() : this.contactFlowLogsEnabled;
    }

    /**
     * Specifies whether contact lens is enabled. Defaults to `true`.
     * 
     */
    @Import(name="contactLensEnabled")
      private final @Nullable Output<Boolean> contactLensEnabled;

    public Output<Boolean> getContactLensEnabled() {
        return this.contactLensEnabled == null ? Codegen.empty() : this.contactLensEnabled;
    }

    /**
     * The identifier for the directory if identity_management_type is `EXISTING_DIRECTORY`.
     * 
     */
    @Import(name="directoryId")
      private final @Nullable Output<String> directoryId;

    public Output<String> getDirectoryId() {
        return this.directoryId == null ? Codegen.empty() : this.directoryId;
    }

    /**
     * Specifies whether early media for outbound calls is enabled . Defaults to `true` if outbound calls is enabled.
     * 
     */
    @Import(name="earlyMediaEnabled")
      private final @Nullable Output<Boolean> earlyMediaEnabled;

    public Output<Boolean> getEarlyMediaEnabled() {
        return this.earlyMediaEnabled == null ? Codegen.empty() : this.earlyMediaEnabled;
    }

    /**
     * Specifies the identity management type attached to the instance. Allowed Values are: `SAML`, `CONNECT_MANAGED`, `EXISTING_DIRECTORY`.
     * 
     */
    @Import(name="identityManagementType", required=true)
      private final Output<String> identityManagementType;

    public Output<String> getIdentityManagementType() {
        return this.identityManagementType;
    }

    /**
     * Specifies whether inbound calls are enabled.
     * 
     */
    @Import(name="inboundCallsEnabled", required=true)
      private final Output<Boolean> inboundCallsEnabled;

    public Output<Boolean> getInboundCallsEnabled() {
        return this.inboundCallsEnabled;
    }

    /**
     * Specifies the name of the instance. Required if `directory_id` not specified.
     * 
     */
    @Import(name="instanceAlias")
      private final @Nullable Output<String> instanceAlias;

    public Output<String> getInstanceAlias() {
        return this.instanceAlias == null ? Codegen.empty() : this.instanceAlias;
    }

    /**
     * Specifies whether outbound calls are enabled.
     * <!-- * `use_custom_tts_voices` - (Optional) Specifies Whether use custom tts voices is enabled. Defaults to `false` -->
     * 
     */
    @Import(name="outboundCallsEnabled", required=true)
      private final Output<Boolean> outboundCallsEnabled;

    public Output<Boolean> getOutboundCallsEnabled() {
        return this.outboundCallsEnabled;
    }

    public InstanceArgs(
        @Nullable Output<Boolean> autoResolveBestVoicesEnabled,
        @Nullable Output<Boolean> contactFlowLogsEnabled,
        @Nullable Output<Boolean> contactLensEnabled,
        @Nullable Output<String> directoryId,
        @Nullable Output<Boolean> earlyMediaEnabled,
        Output<String> identityManagementType,
        Output<Boolean> inboundCallsEnabled,
        @Nullable Output<String> instanceAlias,
        Output<Boolean> outboundCallsEnabled) {
        this.autoResolveBestVoicesEnabled = autoResolveBestVoicesEnabled;
        this.contactFlowLogsEnabled = contactFlowLogsEnabled;
        this.contactLensEnabled = contactLensEnabled;
        this.directoryId = directoryId;
        this.earlyMediaEnabled = earlyMediaEnabled;
        this.identityManagementType = Objects.requireNonNull(identityManagementType, "expected parameter 'identityManagementType' to be non-null");
        this.inboundCallsEnabled = Objects.requireNonNull(inboundCallsEnabled, "expected parameter 'inboundCallsEnabled' to be non-null");
        this.instanceAlias = instanceAlias;
        this.outboundCallsEnabled = Objects.requireNonNull(outboundCallsEnabled, "expected parameter 'outboundCallsEnabled' to be non-null");
    }

    private InstanceArgs() {
        this.autoResolveBestVoicesEnabled = Codegen.empty();
        this.contactFlowLogsEnabled = Codegen.empty();
        this.contactLensEnabled = Codegen.empty();
        this.directoryId = Codegen.empty();
        this.earlyMediaEnabled = Codegen.empty();
        this.identityManagementType = Codegen.empty();
        this.inboundCallsEnabled = Codegen.empty();
        this.instanceAlias = Codegen.empty();
        this.outboundCallsEnabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoResolveBestVoicesEnabled;
        private @Nullable Output<Boolean> contactFlowLogsEnabled;
        private @Nullable Output<Boolean> contactLensEnabled;
        private @Nullable Output<String> directoryId;
        private @Nullable Output<Boolean> earlyMediaEnabled;
        private Output<String> identityManagementType;
        private Output<Boolean> inboundCallsEnabled;
        private @Nullable Output<String> instanceAlias;
        private Output<Boolean> outboundCallsEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoResolveBestVoicesEnabled = defaults.autoResolveBestVoicesEnabled;
    	      this.contactFlowLogsEnabled = defaults.contactFlowLogsEnabled;
    	      this.contactLensEnabled = defaults.contactLensEnabled;
    	      this.directoryId = defaults.directoryId;
    	      this.earlyMediaEnabled = defaults.earlyMediaEnabled;
    	      this.identityManagementType = defaults.identityManagementType;
    	      this.inboundCallsEnabled = defaults.inboundCallsEnabled;
    	      this.instanceAlias = defaults.instanceAlias;
    	      this.outboundCallsEnabled = defaults.outboundCallsEnabled;
        }

        public Builder autoResolveBestVoicesEnabled(@Nullable Output<Boolean> autoResolveBestVoicesEnabled) {
            this.autoResolveBestVoicesEnabled = autoResolveBestVoicesEnabled;
            return this;
        }
        public Builder autoResolveBestVoicesEnabled(@Nullable Boolean autoResolveBestVoicesEnabled) {
            this.autoResolveBestVoicesEnabled = Codegen.ofNullable(autoResolveBestVoicesEnabled);
            return this;
        }
        public Builder contactFlowLogsEnabled(@Nullable Output<Boolean> contactFlowLogsEnabled) {
            this.contactFlowLogsEnabled = contactFlowLogsEnabled;
            return this;
        }
        public Builder contactFlowLogsEnabled(@Nullable Boolean contactFlowLogsEnabled) {
            this.contactFlowLogsEnabled = Codegen.ofNullable(contactFlowLogsEnabled);
            return this;
        }
        public Builder contactLensEnabled(@Nullable Output<Boolean> contactLensEnabled) {
            this.contactLensEnabled = contactLensEnabled;
            return this;
        }
        public Builder contactLensEnabled(@Nullable Boolean contactLensEnabled) {
            this.contactLensEnabled = Codegen.ofNullable(contactLensEnabled);
            return this;
        }
        public Builder directoryId(@Nullable Output<String> directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public Builder directoryId(@Nullable String directoryId) {
            this.directoryId = Codegen.ofNullable(directoryId);
            return this;
        }
        public Builder earlyMediaEnabled(@Nullable Output<Boolean> earlyMediaEnabled) {
            this.earlyMediaEnabled = earlyMediaEnabled;
            return this;
        }
        public Builder earlyMediaEnabled(@Nullable Boolean earlyMediaEnabled) {
            this.earlyMediaEnabled = Codegen.ofNullable(earlyMediaEnabled);
            return this;
        }
        public Builder identityManagementType(Output<String> identityManagementType) {
            this.identityManagementType = Objects.requireNonNull(identityManagementType);
            return this;
        }
        public Builder identityManagementType(String identityManagementType) {
            this.identityManagementType = Output.of(Objects.requireNonNull(identityManagementType));
            return this;
        }
        public Builder inboundCallsEnabled(Output<Boolean> inboundCallsEnabled) {
            this.inboundCallsEnabled = Objects.requireNonNull(inboundCallsEnabled);
            return this;
        }
        public Builder inboundCallsEnabled(Boolean inboundCallsEnabled) {
            this.inboundCallsEnabled = Output.of(Objects.requireNonNull(inboundCallsEnabled));
            return this;
        }
        public Builder instanceAlias(@Nullable Output<String> instanceAlias) {
            this.instanceAlias = instanceAlias;
            return this;
        }
        public Builder instanceAlias(@Nullable String instanceAlias) {
            this.instanceAlias = Codegen.ofNullable(instanceAlias);
            return this;
        }
        public Builder outboundCallsEnabled(Output<Boolean> outboundCallsEnabled) {
            this.outboundCallsEnabled = Objects.requireNonNull(outboundCallsEnabled);
            return this;
        }
        public Builder outboundCallsEnabled(Boolean outboundCallsEnabled) {
            this.outboundCallsEnabled = Output.of(Objects.requireNonNull(outboundCallsEnabled));
            return this;
        }        public InstanceArgs build() {
            return new InstanceArgs(autoResolveBestVoicesEnabled, contactFlowLogsEnabled, contactLensEnabled, directoryId, earlyMediaEnabled, identityManagementType, inboundCallsEnabled, instanceAlias, outboundCallsEnabled);
        }
    }
}
