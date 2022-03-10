// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the Microsoft Teams channel.
 * 
 */
public final class MsTeamsChannelPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final MsTeamsChannelPropertiesArgs Empty = new MsTeamsChannelPropertiesArgs();

    /**
     * Whether this channel accepted terms
     * 
     */
    @InputImport(name="acceptedTerms")
      private final @Nullable Input<Boolean> acceptedTerms;

    public Input<Boolean> getAcceptedTerms() {
        return this.acceptedTerms == null ? Input.empty() : this.acceptedTerms;
    }

    /**
     * Webhook for Microsoft Teams channel calls
     * 
     */
    @InputImport(name="callingWebHook")
      private final @Nullable Input<String> callingWebHook;

    public Input<String> getCallingWebHook() {
        return this.callingWebHook == null ? Input.empty() : this.callingWebHook;
    }

    /**
     * Deployment environment for Microsoft Teams channel calls
     * 
     */
    @InputImport(name="deploymentEnvironment")
      private final @Nullable Input<String> deploymentEnvironment;

    public Input<String> getDeploymentEnvironment() {
        return this.deploymentEnvironment == null ? Input.empty() : this.deploymentEnvironment;
    }

    /**
     * Enable calling for Microsoft Teams channel
     * 
     */
    @InputImport(name="enableCalling")
      private final @Nullable Input<Boolean> enableCalling;

    public Input<Boolean> getEnableCalling() {
        return this.enableCalling == null ? Input.empty() : this.enableCalling;
    }

    /**
     * Webhook for Microsoft Teams channel calls
     * 
     */
    @InputImport(name="incomingCallRoute")
      private final @Nullable Input<String> incomingCallRoute;

    public Input<String> getIncomingCallRoute() {
        return this.incomingCallRoute == null ? Input.empty() : this.incomingCallRoute;
    }

    /**
     * Whether this channel is enabled for the bot
     * 
     */
    @InputImport(name="isEnabled", required=true)
      private final Input<Boolean> isEnabled;

    public Input<Boolean> getIsEnabled() {
        return this.isEnabled;
    }

    public MsTeamsChannelPropertiesArgs(
        @Nullable Input<Boolean> acceptedTerms,
        @Nullable Input<String> callingWebHook,
        @Nullable Input<String> deploymentEnvironment,
        @Nullable Input<Boolean> enableCalling,
        @Nullable Input<String> incomingCallRoute,
        Input<Boolean> isEnabled) {
        this.acceptedTerms = acceptedTerms == null ? Input.ofNullable(true) : acceptedTerms;
        this.callingWebHook = callingWebHook;
        this.deploymentEnvironment = deploymentEnvironment;
        this.enableCalling = enableCalling;
        this.incomingCallRoute = incomingCallRoute;
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
    }

    private MsTeamsChannelPropertiesArgs() {
        this.acceptedTerms = Input.empty();
        this.callingWebHook = Input.empty();
        this.deploymentEnvironment = Input.empty();
        this.enableCalling = Input.empty();
        this.incomingCallRoute = Input.empty();
        this.isEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MsTeamsChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> acceptedTerms;
        private @Nullable Input<String> callingWebHook;
        private @Nullable Input<String> deploymentEnvironment;
        private @Nullable Input<Boolean> enableCalling;
        private @Nullable Input<String> incomingCallRoute;
        private Input<Boolean> isEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(MsTeamsChannelPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptedTerms = defaults.acceptedTerms;
    	      this.callingWebHook = defaults.callingWebHook;
    	      this.deploymentEnvironment = defaults.deploymentEnvironment;
    	      this.enableCalling = defaults.enableCalling;
    	      this.incomingCallRoute = defaults.incomingCallRoute;
    	      this.isEnabled = defaults.isEnabled;
        }

        public Builder acceptedTerms(@Nullable Input<Boolean> acceptedTerms) {
            this.acceptedTerms = acceptedTerms;
            return this;
        }

        public Builder acceptedTerms(@Nullable Boolean acceptedTerms) {
            this.acceptedTerms = Input.ofNullable(acceptedTerms);
            return this;
        }

        public Builder callingWebHook(@Nullable Input<String> callingWebHook) {
            this.callingWebHook = callingWebHook;
            return this;
        }

        public Builder callingWebHook(@Nullable String callingWebHook) {
            this.callingWebHook = Input.ofNullable(callingWebHook);
            return this;
        }

        public Builder deploymentEnvironment(@Nullable Input<String> deploymentEnvironment) {
            this.deploymentEnvironment = deploymentEnvironment;
            return this;
        }

        public Builder deploymentEnvironment(@Nullable String deploymentEnvironment) {
            this.deploymentEnvironment = Input.ofNullable(deploymentEnvironment);
            return this;
        }

        public Builder enableCalling(@Nullable Input<Boolean> enableCalling) {
            this.enableCalling = enableCalling;
            return this;
        }

        public Builder enableCalling(@Nullable Boolean enableCalling) {
            this.enableCalling = Input.ofNullable(enableCalling);
            return this;
        }

        public Builder incomingCallRoute(@Nullable Input<String> incomingCallRoute) {
            this.incomingCallRoute = incomingCallRoute;
            return this;
        }

        public Builder incomingCallRoute(@Nullable String incomingCallRoute) {
            this.incomingCallRoute = Input.ofNullable(incomingCallRoute);
            return this;
        }

        public Builder isEnabled(Input<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Input.of(Objects.requireNonNull(isEnabled));
            return this;
        }
        public MsTeamsChannelPropertiesArgs build() {
            return new MsTeamsChannelPropertiesArgs(acceptedTerms, callingWebHook, deploymentEnvironment, enableCalling, incomingCallRoute, isEnabled);
        }
    }
}
