// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResolverRuleTargetAddress extends io.pulumi.resources.InvokeArgs {

    public static final ResolverRuleTargetAddress Empty = new ResolverRuleTargetAddress();

    /**
     * One IP address that you want to forward DNS queries to. You can specify only IPv4 addresses.
     * 
     */
    @InputImport(name="ip", required=true)
      private final String ip;

    public String getIp() {
        return this.ip;
    }

    /**
     * The port at Ip that you want to forward DNS queries to.
     * 
     */
    @InputImport(name="port")
      private final @Nullable String port;

    public Optional<String> getPort() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    public ResolverRuleTargetAddress(
        String ip,
        @Nullable String port) {
        this.ip = Objects.requireNonNull(ip, "expected parameter 'ip' to be non-null");
        this.port = port;
    }

    private ResolverRuleTargetAddress() {
        this.ip = null;
        this.port = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverRuleTargetAddress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ip;
        private @Nullable String port;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverRuleTargetAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.port = defaults.port;
        }

        public Builder ip(String ip) {
            this.ip = Objects.requireNonNull(ip);
            return this;
        }

        public Builder port(@Nullable String port) {
            this.port = port;
            return this;
        }
        public ResolverRuleTargetAddress build() {
            return new ResolverRuleTargetAddress(ip, port);
        }
    }
}
