// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProxyServerPropertiesResponse {
    /**
     * Proxy server IP
     * 
     */
    private final @Nullable String ip;
    /**
     * Proxy server port
     * 
     */
    private final @Nullable String port;

    @OutputCustomType.Constructor
    private ProxyServerPropertiesResponse(
        @OutputCustomType.Parameter("ip") @Nullable String ip,
        @OutputCustomType.Parameter("port") @Nullable String port) {
        this.ip = ip;
        this.port = port;
    }

    /**
     * Proxy server IP
     * 
    */
    public Optional<String> getIp() {
        return Optional.ofNullable(this.ip);
    }
    /**
     * Proxy server port
     * 
    */
    public Optional<String> getPort() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProxyServerPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ip;
        private @Nullable String port;

        public Builder() {
    	      // Empty
        }

        public Builder(ProxyServerPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.port = defaults.port;
        }

        public Builder ip(@Nullable String ip) {
            this.ip = ip;
            return this;
        }

        public Builder port(@Nullable String port) {
            this.port = port;
            return this;
        }
        public ProxyServerPropertiesResponse build() {
            return new ProxyServerPropertiesResponse(ip, port);
        }
    }
}
