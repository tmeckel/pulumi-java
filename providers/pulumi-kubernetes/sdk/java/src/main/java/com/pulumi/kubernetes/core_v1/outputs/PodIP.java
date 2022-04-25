// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PodIP {
    /**
     * @return ip is an IP address (IPv4 or IPv6) assigned to the pod
     * 
     */
    private final @Nullable String ip;

    @CustomType.Constructor
    private PodIP(@CustomType.Parameter("ip") @Nullable String ip) {
        this.ip = ip;
    }

    /**
     * @return ip is an IP address (IPv4 or IPv6) assigned to the pod
     * 
     */
    public Optional<String> ip() {
        return Optional.ofNullable(this.ip);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodIP defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ip;

        public Builder() {
    	      // Empty
        }

        public Builder(PodIP defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
        }

        public Builder ip(@Nullable String ip) {
            this.ip = ip;
            return this;
        }        public PodIP build() {
            return new PodIP(ip);
        }
    }
}
