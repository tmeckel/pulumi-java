// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.enums.DefaultAction;
import io.pulumi.azurenative.devices.inputs.NetworkRuleSetIpRuleArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network Rule Set Properties of IotHub
 * 
 */
public final class NetworkRuleSetPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkRuleSetPropertiesArgs Empty = new NetworkRuleSetPropertiesArgs();

    /**
     * If True, then Network Rule Set is also applied to BuiltIn EventHub EndPoint of IotHub
     * 
     */
    @Import(name="applyToBuiltInEventHubEndpoint", required=true)
      private final Output<Boolean> applyToBuiltInEventHubEndpoint;

    public Output<Boolean> getApplyToBuiltInEventHubEndpoint() {
        return this.applyToBuiltInEventHubEndpoint;
    }

    /**
     * Default Action for Network Rule Set
     * 
     */
    @Import(name="defaultAction")
      private final @Nullable Output<Either<String,DefaultAction>> defaultAction;

    public Output<Either<String,DefaultAction>> getDefaultAction() {
        return this.defaultAction == null ? Codegen.empty() : this.defaultAction;
    }

    /**
     * List of IP Rules
     * 
     */
    @Import(name="ipRules", required=true)
      private final Output<List<NetworkRuleSetIpRuleArgs>> ipRules;

    public Output<List<NetworkRuleSetIpRuleArgs>> getIpRules() {
        return this.ipRules;
    }

    public NetworkRuleSetPropertiesArgs(
        Output<Boolean> applyToBuiltInEventHubEndpoint,
        @Nullable Output<Either<String,DefaultAction>> defaultAction,
        Output<List<NetworkRuleSetIpRuleArgs>> ipRules) {
        this.applyToBuiltInEventHubEndpoint = Objects.requireNonNull(applyToBuiltInEventHubEndpoint, "expected parameter 'applyToBuiltInEventHubEndpoint' to be non-null");
        this.defaultAction = defaultAction == null ? Output.ofLeft("Deny") : defaultAction;
        this.ipRules = Objects.requireNonNull(ipRules, "expected parameter 'ipRules' to be non-null");
    }

    private NetworkRuleSetPropertiesArgs() {
        this.applyToBuiltInEventHubEndpoint = Codegen.empty();
        this.defaultAction = Codegen.empty();
        this.ipRules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleSetPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> applyToBuiltInEventHubEndpoint;
        private @Nullable Output<Either<String,DefaultAction>> defaultAction;
        private Output<List<NetworkRuleSetIpRuleArgs>> ipRules;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleSetPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyToBuiltInEventHubEndpoint = defaults.applyToBuiltInEventHubEndpoint;
    	      this.defaultAction = defaults.defaultAction;
    	      this.ipRules = defaults.ipRules;
        }

        public Builder applyToBuiltInEventHubEndpoint(Output<Boolean> applyToBuiltInEventHubEndpoint) {
            this.applyToBuiltInEventHubEndpoint = Objects.requireNonNull(applyToBuiltInEventHubEndpoint);
            return this;
        }
        public Builder applyToBuiltInEventHubEndpoint(Boolean applyToBuiltInEventHubEndpoint) {
            this.applyToBuiltInEventHubEndpoint = Output.of(Objects.requireNonNull(applyToBuiltInEventHubEndpoint));
            return this;
        }
        public Builder defaultAction(@Nullable Output<Either<String,DefaultAction>> defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }
        public Builder defaultAction(@Nullable Either<String,DefaultAction> defaultAction) {
            this.defaultAction = Codegen.ofNullable(defaultAction);
            return this;
        }
        public Builder ipRules(Output<List<NetworkRuleSetIpRuleArgs>> ipRules) {
            this.ipRules = Objects.requireNonNull(ipRules);
            return this;
        }
        public Builder ipRules(List<NetworkRuleSetIpRuleArgs> ipRules) {
            this.ipRules = Output.of(Objects.requireNonNull(ipRules));
            return this;
        }
        public Builder ipRules(NetworkRuleSetIpRuleArgs... ipRules) {
            return ipRules(List.of(ipRules));
        }        public NetworkRuleSetPropertiesArgs build() {
            return new NetworkRuleSetPropertiesArgs(applyToBuiltInEventHubEndpoint, defaultAction, ipRules);
        }
    }
}
