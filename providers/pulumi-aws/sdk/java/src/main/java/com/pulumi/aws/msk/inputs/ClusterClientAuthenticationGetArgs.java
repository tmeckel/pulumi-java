// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.inputs;

import com.pulumi.aws.msk.inputs.ClusterClientAuthenticationSaslGetArgs;
import com.pulumi.aws.msk.inputs.ClusterClientAuthenticationTlsGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterClientAuthenticationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClientAuthenticationGetArgs Empty = new ClusterClientAuthenticationGetArgs();

    /**
     * Configuration block for specifying SASL client authentication. See below.
     * 
     */
    @Import(name="sasl")
    private @Nullable Output<ClusterClientAuthenticationSaslGetArgs> sasl;

    /**
     * @return Configuration block for specifying SASL client authentication. See below.
     * 
     */
    public Optional<Output<ClusterClientAuthenticationSaslGetArgs>> sasl() {
        return Optional.ofNullable(this.sasl);
    }

    /**
     * Configuration block for specifying TLS client authentication. See below.
     * 
     */
    @Import(name="tls")
    private @Nullable Output<ClusterClientAuthenticationTlsGetArgs> tls;

    /**
     * @return Configuration block for specifying TLS client authentication. See below.
     * 
     */
    public Optional<Output<ClusterClientAuthenticationTlsGetArgs>> tls() {
        return Optional.ofNullable(this.tls);
    }

    private ClusterClientAuthenticationGetArgs() {}

    private ClusterClientAuthenticationGetArgs(ClusterClientAuthenticationGetArgs $) {
        this.sasl = $.sasl;
        this.tls = $.tls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClientAuthenticationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClientAuthenticationGetArgs $;

        public Builder() {
            $ = new ClusterClientAuthenticationGetArgs();
        }

        public Builder(ClusterClientAuthenticationGetArgs defaults) {
            $ = new ClusterClientAuthenticationGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sasl Configuration block for specifying SASL client authentication. See below.
         * 
         * @return builder
         * 
         */
        public Builder sasl(@Nullable Output<ClusterClientAuthenticationSaslGetArgs> sasl) {
            $.sasl = sasl;
            return this;
        }

        /**
         * @param sasl Configuration block for specifying SASL client authentication. See below.
         * 
         * @return builder
         * 
         */
        public Builder sasl(ClusterClientAuthenticationSaslGetArgs sasl) {
            return sasl(Output.of(sasl));
        }

        /**
         * @param tls Configuration block for specifying TLS client authentication. See below.
         * 
         * @return builder
         * 
         */
        public Builder tls(@Nullable Output<ClusterClientAuthenticationTlsGetArgs> tls) {
            $.tls = tls;
            return this;
        }

        /**
         * @param tls Configuration block for specifying TLS client authentication. See below.
         * 
         * @return builder
         * 
         */
        public Builder tls(ClusterClientAuthenticationTlsGetArgs tls) {
            return tls(Output.of(tls));
        }

        public ClusterClientAuthenticationGetArgs build() {
            return $;
        }
    }

}
