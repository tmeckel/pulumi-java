// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfgurationSetDeliveryOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfgurationSetDeliveryOptionsArgs Empty = new ConfgurationSetDeliveryOptionsArgs();

    /**
     * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is `Require`, messages are only delivered if a TLS connection can be established. If the value is `Optional`, messages can be delivered in plain text if a TLS connection can&#39;t be established. Valid values: `Require` or `Optional`. Defaults to `Optional`.
     * 
     */
    @Import(name="tlsPolicy")
    private @Nullable Output<String> tlsPolicy;

    /**
     * @return Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is `Require`, messages are only delivered if a TLS connection can be established. If the value is `Optional`, messages can be delivered in plain text if a TLS connection can&#39;t be established. Valid values: `Require` or `Optional`. Defaults to `Optional`.
     * 
     */
    public Optional<Output<String>> tlsPolicy() {
        return Optional.ofNullable(this.tlsPolicy);
    }

    private ConfgurationSetDeliveryOptionsArgs() {}

    private ConfgurationSetDeliveryOptionsArgs(ConfgurationSetDeliveryOptionsArgs $) {
        this.tlsPolicy = $.tlsPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfgurationSetDeliveryOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfgurationSetDeliveryOptionsArgs $;

        public Builder() {
            $ = new ConfgurationSetDeliveryOptionsArgs();
        }

        public Builder(ConfgurationSetDeliveryOptionsArgs defaults) {
            $ = new ConfgurationSetDeliveryOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tlsPolicy Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is `Require`, messages are only delivered if a TLS connection can be established. If the value is `Optional`, messages can be delivered in plain text if a TLS connection can&#39;t be established. Valid values: `Require` or `Optional`. Defaults to `Optional`.
         * 
         * @return builder
         * 
         */
        public Builder tlsPolicy(@Nullable Output<String> tlsPolicy) {
            $.tlsPolicy = tlsPolicy;
            return this;
        }

        /**
         * @param tlsPolicy Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is `Require`, messages are only delivered if a TLS connection can be established. If the value is `Optional`, messages can be delivered in plain text if a TLS connection can&#39;t be established. Valid values: `Require` or `Optional`. Defaults to `Optional`.
         * 
         * @return builder
         * 
         */
        public Builder tlsPolicy(String tlsPolicy) {
            return tlsPolicy(Output.of(tlsPolicy));
        }

        public ConfgurationSetDeliveryOptionsArgs build() {
            return $;
        }
    }

}
