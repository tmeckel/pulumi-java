// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Trusted client certificates of an application gateway.
 * 
 */
public final class ApplicationGatewayTrustedClientCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayTrustedClientCertificateArgs Empty = new ApplicationGatewayTrustedClientCertificateArgs();

    /**
     * Certificate public data.
     * 
     */
    @Import(name="data")
    private @Nullable Output<String> data;

    /**
     * @return Certificate public data.
     * 
     */
    public Optional<Output<String>> data() {
        return Optional.ofNullable(this.data);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Name of the trusted client certificate that is unique within an Application Gateway.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the trusted client certificate that is unique within an Application Gateway.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ApplicationGatewayTrustedClientCertificateArgs() {}

    private ApplicationGatewayTrustedClientCertificateArgs(ApplicationGatewayTrustedClientCertificateArgs $) {
        this.data = $.data;
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGatewayTrustedClientCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGatewayTrustedClientCertificateArgs $;

        public Builder() {
            $ = new ApplicationGatewayTrustedClientCertificateArgs();
        }

        public Builder(ApplicationGatewayTrustedClientCertificateArgs defaults) {
            $ = new ApplicationGatewayTrustedClientCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param data Certificate public data.
         * 
         * @return builder
         * 
         */
        public Builder data(@Nullable Output<String> data) {
            $.data = data;
            return this;
        }

        /**
         * @param data Certificate public data.
         * 
         * @return builder
         * 
         */
        public Builder data(String data) {
            return data(Output.of(data));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name Name of the trusted client certificate that is unique within an Application Gateway.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the trusted client certificate that is unique within an Application Gateway.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ApplicationGatewayTrustedClientCertificateArgs build() {
            return $;
        }
    }

}
