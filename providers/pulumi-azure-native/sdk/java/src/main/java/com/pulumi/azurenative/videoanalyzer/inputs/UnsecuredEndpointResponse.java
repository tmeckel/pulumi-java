// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.azurenative.videoanalyzer.inputs.SecureIotDeviceRemoteTunnelResponse;
import com.pulumi.azurenative.videoanalyzer.inputs.UsernamePasswordCredentialsResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Unsecured endpoint describes an endpoint that the pipeline can connect to over clear transport (no encryption in transit).
 * 
 */
public final class UnsecuredEndpointResponse extends com.pulumi.resources.InvokeArgs {

    public static final UnsecuredEndpointResponse Empty = new UnsecuredEndpointResponse();

    /**
     * Credentials to be presented to the endpoint.
     * 
     */
    @Import(name="credentials", required=true)
    private UsernamePasswordCredentialsResponse credentials;

    /**
     * @return Credentials to be presented to the endpoint.
     * 
     */
    public UsernamePasswordCredentialsResponse credentials() {
        return this.credentials;
    }

    /**
     * Describes the tunnel through which Video Analyzer can connect to the endpoint URL. This is an optional property, typically used when the endpoint is behind a firewall.
     * 
     */
    @Import(name="tunnel")
    private @Nullable SecureIotDeviceRemoteTunnelResponse tunnel;

    /**
     * @return Describes the tunnel through which Video Analyzer can connect to the endpoint URL. This is an optional property, typically used when the endpoint is behind a firewall.
     * 
     */
    public Optional<SecureIotDeviceRemoteTunnelResponse> tunnel() {
        return Optional.ofNullable(this.tunnel);
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.UnsecuredEndpoint&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.UnsecuredEndpoint&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * The endpoint URL for Video Analyzer to connect to.
     * 
     */
    @Import(name="url", required=true)
    private String url;

    /**
     * @return The endpoint URL for Video Analyzer to connect to.
     * 
     */
    public String url() {
        return this.url;
    }

    private UnsecuredEndpointResponse() {}

    private UnsecuredEndpointResponse(UnsecuredEndpointResponse $) {
        this.credentials = $.credentials;
        this.tunnel = $.tunnel;
        this.type = $.type;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UnsecuredEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UnsecuredEndpointResponse $;

        public Builder() {
            $ = new UnsecuredEndpointResponse();
        }

        public Builder(UnsecuredEndpointResponse defaults) {
            $ = new UnsecuredEndpointResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param credentials Credentials to be presented to the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder credentials(UsernamePasswordCredentialsResponse credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param tunnel Describes the tunnel through which Video Analyzer can connect to the endpoint URL. This is an optional property, typically used when the endpoint is behind a firewall.
         * 
         * @return builder
         * 
         */
        public Builder tunnel(@Nullable SecureIotDeviceRemoteTunnelResponse tunnel) {
            $.tunnel = tunnel;
            return this;
        }

        /**
         * @param type The discriminator for derived types.
         * Expected value is &#39;#Microsoft.VideoAnalyzer.UnsecuredEndpoint&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param url The endpoint URL for Video Analyzer to connect to.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            $.url = url;
            return this;
        }

        public UnsecuredEndpointResponse build() {
            $.credentials = Objects.requireNonNull($.credentials, "expected parameter 'credentials' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
