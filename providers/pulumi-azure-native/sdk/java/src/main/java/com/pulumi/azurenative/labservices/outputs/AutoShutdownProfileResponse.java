// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoShutdownProfileResponse {
    /**
     * @return The amount of time a VM will stay running after a user disconnects if this behavior is enabled.
     * 
     */
    private final @Nullable String disconnectDelay;
    /**
     * @return The amount of time a VM will idle before it is shutdown if this behavior is enabled.
     * 
     */
    private final @Nullable String idleDelay;
    /**
     * @return The amount of time a VM will stay running before it is shutdown if no connection is made and this behavior is enabled.
     * 
     */
    private final @Nullable String noConnectDelay;
    /**
     * @return Whether shutdown on disconnect is enabled
     * 
     */
    private final @Nullable String shutdownOnDisconnect;
    /**
     * @return Whether a VM will get shutdown when it has idled for a period of time.
     * 
     */
    private final @Nullable String shutdownOnIdle;
    /**
     * @return Whether a VM will get shutdown when it hasn&#39;t been connected to after a period of time.
     * 
     */
    private final @Nullable String shutdownWhenNotConnected;

    @CustomType.Constructor
    private AutoShutdownProfileResponse(
        @CustomType.Parameter("disconnectDelay") @Nullable String disconnectDelay,
        @CustomType.Parameter("idleDelay") @Nullable String idleDelay,
        @CustomType.Parameter("noConnectDelay") @Nullable String noConnectDelay,
        @CustomType.Parameter("shutdownOnDisconnect") @Nullable String shutdownOnDisconnect,
        @CustomType.Parameter("shutdownOnIdle") @Nullable String shutdownOnIdle,
        @CustomType.Parameter("shutdownWhenNotConnected") @Nullable String shutdownWhenNotConnected) {
        this.disconnectDelay = disconnectDelay;
        this.idleDelay = idleDelay;
        this.noConnectDelay = noConnectDelay;
        this.shutdownOnDisconnect = shutdownOnDisconnect;
        this.shutdownOnIdle = shutdownOnIdle;
        this.shutdownWhenNotConnected = shutdownWhenNotConnected;
    }

    /**
     * @return The amount of time a VM will stay running after a user disconnects if this behavior is enabled.
     * 
     */
    public Optional<String> disconnectDelay() {
        return Optional.ofNullable(this.disconnectDelay);
    }
    /**
     * @return The amount of time a VM will idle before it is shutdown if this behavior is enabled.
     * 
     */
    public Optional<String> idleDelay() {
        return Optional.ofNullable(this.idleDelay);
    }
    /**
     * @return The amount of time a VM will stay running before it is shutdown if no connection is made and this behavior is enabled.
     * 
     */
    public Optional<String> noConnectDelay() {
        return Optional.ofNullable(this.noConnectDelay);
    }
    /**
     * @return Whether shutdown on disconnect is enabled
     * 
     */
    public Optional<String> shutdownOnDisconnect() {
        return Optional.ofNullable(this.shutdownOnDisconnect);
    }
    /**
     * @return Whether a VM will get shutdown when it has idled for a period of time.
     * 
     */
    public Optional<String> shutdownOnIdle() {
        return Optional.ofNullable(this.shutdownOnIdle);
    }
    /**
     * @return Whether a VM will get shutdown when it hasn&#39;t been connected to after a period of time.
     * 
     */
    public Optional<String> shutdownWhenNotConnected() {
        return Optional.ofNullable(this.shutdownWhenNotConnected);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoShutdownProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String disconnectDelay;
        private @Nullable String idleDelay;
        private @Nullable String noConnectDelay;
        private @Nullable String shutdownOnDisconnect;
        private @Nullable String shutdownOnIdle;
        private @Nullable String shutdownWhenNotConnected;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoShutdownProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disconnectDelay = defaults.disconnectDelay;
    	      this.idleDelay = defaults.idleDelay;
    	      this.noConnectDelay = defaults.noConnectDelay;
    	      this.shutdownOnDisconnect = defaults.shutdownOnDisconnect;
    	      this.shutdownOnIdle = defaults.shutdownOnIdle;
    	      this.shutdownWhenNotConnected = defaults.shutdownWhenNotConnected;
        }

        public Builder disconnectDelay(@Nullable String disconnectDelay) {
            this.disconnectDelay = disconnectDelay;
            return this;
        }
        public Builder idleDelay(@Nullable String idleDelay) {
            this.idleDelay = idleDelay;
            return this;
        }
        public Builder noConnectDelay(@Nullable String noConnectDelay) {
            this.noConnectDelay = noConnectDelay;
            return this;
        }
        public Builder shutdownOnDisconnect(@Nullable String shutdownOnDisconnect) {
            this.shutdownOnDisconnect = shutdownOnDisconnect;
            return this;
        }
        public Builder shutdownOnIdle(@Nullable String shutdownOnIdle) {
            this.shutdownOnIdle = shutdownOnIdle;
            return this;
        }
        public Builder shutdownWhenNotConnected(@Nullable String shutdownWhenNotConnected) {
            this.shutdownWhenNotConnected = shutdownWhenNotConnected;
            return this;
        }        public AutoShutdownProfileResponse build() {
            return new AutoShutdownProfileResponse(disconnectDelay, idleDelay, noConnectDelay, shutdownOnDisconnect, shutdownOnIdle, shutdownWhenNotConnected);
        }
    }
}
