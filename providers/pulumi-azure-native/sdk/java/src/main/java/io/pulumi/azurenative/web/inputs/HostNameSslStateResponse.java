// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SSL-enabled hostname.
 * 
 */
public final class HostNameSslStateResponse extends io.pulumi.resources.InvokeArgs {

    public static final HostNameSslStateResponse Empty = new HostNameSslStateResponse();

    /**
     * Indicates whether the hostname is a standard or repository hostname.
     * 
     */
    @InputImport(name="hostType")
      private final @Nullable String hostType;

    public Optional<String> getHostType() {
        return this.hostType == null ? Optional.empty() : Optional.ofNullable(this.hostType);
    }

    /**
     * Hostname.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * SSL type.
     * 
     */
    @InputImport(name="sslState")
      private final @Nullable String sslState;

    public Optional<String> getSslState() {
        return this.sslState == null ? Optional.empty() : Optional.ofNullable(this.sslState);
    }

    /**
     * SSL certificate thumbprint.
     * 
     */
    @InputImport(name="thumbprint")
      private final @Nullable String thumbprint;

    public Optional<String> getThumbprint() {
        return this.thumbprint == null ? Optional.empty() : Optional.ofNullable(this.thumbprint);
    }

    /**
     * Set to <code>true</code> to update existing hostname.
     * 
     */
    @InputImport(name="toUpdate")
      private final @Nullable Boolean toUpdate;

    public Optional<Boolean> getToUpdate() {
        return this.toUpdate == null ? Optional.empty() : Optional.ofNullable(this.toUpdate);
    }

    /**
     * Virtual IP address assigned to the hostname if IP based SSL is enabled.
     * 
     */
    @InputImport(name="virtualIP")
      private final @Nullable String virtualIP;

    public Optional<String> getVirtualIP() {
        return this.virtualIP == null ? Optional.empty() : Optional.ofNullable(this.virtualIP);
    }

    public HostNameSslStateResponse(
        @Nullable String hostType,
        @Nullable String name,
        @Nullable String sslState,
        @Nullable String thumbprint,
        @Nullable Boolean toUpdate,
        @Nullable String virtualIP) {
        this.hostType = hostType;
        this.name = name;
        this.sslState = sslState;
        this.thumbprint = thumbprint;
        this.toUpdate = toUpdate;
        this.virtualIP = virtualIP;
    }

    private HostNameSslStateResponse() {
        this.hostType = null;
        this.name = null;
        this.sslState = null;
        this.thumbprint = null;
        this.toUpdate = null;
        this.virtualIP = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostNameSslStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostType;
        private @Nullable String name;
        private @Nullable String sslState;
        private @Nullable String thumbprint;
        private @Nullable Boolean toUpdate;
        private @Nullable String virtualIP;

        public Builder() {
    	      // Empty
        }

        public Builder(HostNameSslStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostType = defaults.hostType;
    	      this.name = defaults.name;
    	      this.sslState = defaults.sslState;
    	      this.thumbprint = defaults.thumbprint;
    	      this.toUpdate = defaults.toUpdate;
    	      this.virtualIP = defaults.virtualIP;
        }

        public Builder hostType(@Nullable String hostType) {
            this.hostType = hostType;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder sslState(@Nullable String sslState) {
            this.sslState = sslState;
            return this;
        }

        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }

        public Builder toUpdate(@Nullable Boolean toUpdate) {
            this.toUpdate = toUpdate;
            return this;
        }

        public Builder virtualIP(@Nullable String virtualIP) {
            this.virtualIP = virtualIP;
            return this;
        }
        public HostNameSslStateResponse build() {
            return new HostNameSslStateResponse(hostType, name, sslState, thumbprint, toUpdate, virtualIP);
        }
    }
}
