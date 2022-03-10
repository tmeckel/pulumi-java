// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckAuthInfoArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UptimeCheckConfigHttpCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final UptimeCheckConfigHttpCheckArgs Empty = new UptimeCheckConfigHttpCheckArgs();

    /**
     * The authentication information. Optional when creating an HTTP check; defaults to empty.
     * Structure is documented below.
     * 
     */
    @InputImport(name="authInfo")
      private final @Nullable Input<UptimeCheckConfigHttpCheckAuthInfoArgs> authInfo;

    public Input<UptimeCheckConfigHttpCheckAuthInfoArgs> getAuthInfo() {
        return this.authInfo == null ? Input.empty() : this.authInfo;
    }

    /**
     * The request body associated with the HTTP POST request. If contentType is URL_ENCODED, the body passed in must be URL-encoded. Users can provide a Content-Length header via the headers field or the API will do so. If the requestMethod is GET and body is not empty, the API will return an error. The maximum byte size is 1 megabyte. Note - As with all bytes fields JSON representations are base64 encoded. e.g. "foo=bar" in URL-encoded form is "foo%3Dbar" and in base64 encoding is "Zm9vJTI1M0RiYXI=".
     * 
     */
    @InputImport(name="body")
      private final @Nullable Input<String> body;

    public Input<String> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * The content type to use for the check.
     * Possible values are `TYPE_UNSPECIFIED` and `URL_ENCODED`.
     * 
     */
    @InputImport(name="contentType")
      private final @Nullable Input<String> contentType;

    public Input<String> getContentType() {
        return this.contentType == null ? Input.empty() : this.contentType;
    }

    /**
     * The list of headers to send as part of the uptime check request. If two headers have the same key and different values, they should be entered as a single header, with the value being a comma-separated list of all the desired values as described at https://www.w3.org/Protocols/rfc2616/rfc2616.txt (page 31). Entering two separate headers with the same key in a Create call will cause the first to be overwritten by the second. The maximum number of headers allowed is 100.
     * 
     */
    @InputImport(name="headers")
      private final @Nullable Input<Map<String,String>> headers;

    public Input<Map<String,String>> getHeaders() {
        return this.headers == null ? Input.empty() : this.headers;
    }

    /**
     * Boolean specifying whether to encrypt the header information. Encryption should be specified for any headers related to authentication that you do not wish to be seen when retrieving the configuration. The server will be responsible for encrypting the headers. On Get/List calls, if mask_headers is set to True then the headers will be obscured with ******.
     * 
     */
    @InputImport(name="maskHeaders")
      private final @Nullable Input<Boolean> maskHeaders;

    public Input<Boolean> getMaskHeaders() {
        return this.maskHeaders == null ? Input.empty() : this.maskHeaders;
    }

    /**
     * The path to the page to run the check against. Will be combined with the host (specified within the MonitoredResource) and port to construct the full URL. Optional (defaults to "/").
     * 
     */
    @InputImport(name="path")
      private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * The port to the page to run the check against. Will be combined with host (specified within the MonitoredResource) to construct the full URL.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * The HTTP request method to use for the check. If set to METHOD_UNSPECIFIED then requestMethod defaults to GET.
     * Default value is `GET`.
     * Possible values are `METHOD_UNSPECIFIED`, `GET`, and `POST`.
     * 
     */
    @InputImport(name="requestMethod")
      private final @Nullable Input<String> requestMethod;

    public Input<String> getRequestMethod() {
        return this.requestMethod == null ? Input.empty() : this.requestMethod;
    }

    /**
     * If true, use HTTPS instead of HTTP to run the check.
     * 
     */
    @InputImport(name="useSsl")
      private final @Nullable Input<Boolean> useSsl;

    public Input<Boolean> getUseSsl() {
        return this.useSsl == null ? Input.empty() : this.useSsl;
    }

    /**
     * Boolean specifying whether to include SSL certificate validation as a part of the Uptime check. Only applies to checks where monitoredResource is set to uptime_url. If useSsl is false, setting validateSsl to true has no effect.
     * 
     */
    @InputImport(name="validateSsl")
      private final @Nullable Input<Boolean> validateSsl;

    public Input<Boolean> getValidateSsl() {
        return this.validateSsl == null ? Input.empty() : this.validateSsl;
    }

    public UptimeCheckConfigHttpCheckArgs(
        @Nullable Input<UptimeCheckConfigHttpCheckAuthInfoArgs> authInfo,
        @Nullable Input<String> body,
        @Nullable Input<String> contentType,
        @Nullable Input<Map<String,String>> headers,
        @Nullable Input<Boolean> maskHeaders,
        @Nullable Input<String> path,
        @Nullable Input<Integer> port,
        @Nullable Input<String> requestMethod,
        @Nullable Input<Boolean> useSsl,
        @Nullable Input<Boolean> validateSsl) {
        this.authInfo = authInfo;
        this.body = body;
        this.contentType = contentType;
        this.headers = headers;
        this.maskHeaders = maskHeaders;
        this.path = path;
        this.port = port;
        this.requestMethod = requestMethod;
        this.useSsl = useSsl;
        this.validateSsl = validateSsl;
    }

    private UptimeCheckConfigHttpCheckArgs() {
        this.authInfo = Input.empty();
        this.body = Input.empty();
        this.contentType = Input.empty();
        this.headers = Input.empty();
        this.maskHeaders = Input.empty();
        this.path = Input.empty();
        this.port = Input.empty();
        this.requestMethod = Input.empty();
        this.useSsl = Input.empty();
        this.validateSsl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UptimeCheckConfigHttpCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<UptimeCheckConfigHttpCheckAuthInfoArgs> authInfo;
        private @Nullable Input<String> body;
        private @Nullable Input<String> contentType;
        private @Nullable Input<Map<String,String>> headers;
        private @Nullable Input<Boolean> maskHeaders;
        private @Nullable Input<String> path;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> requestMethod;
        private @Nullable Input<Boolean> useSsl;
        private @Nullable Input<Boolean> validateSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(UptimeCheckConfigHttpCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authInfo = defaults.authInfo;
    	      this.body = defaults.body;
    	      this.contentType = defaults.contentType;
    	      this.headers = defaults.headers;
    	      this.maskHeaders = defaults.maskHeaders;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.requestMethod = defaults.requestMethod;
    	      this.useSsl = defaults.useSsl;
    	      this.validateSsl = defaults.validateSsl;
        }

        public Builder authInfo(@Nullable Input<UptimeCheckConfigHttpCheckAuthInfoArgs> authInfo) {
            this.authInfo = authInfo;
            return this;
        }

        public Builder authInfo(@Nullable UptimeCheckConfigHttpCheckAuthInfoArgs authInfo) {
            this.authInfo = Input.ofNullable(authInfo);
            return this;
        }

        public Builder body(@Nullable Input<String> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable String body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder contentType(@Nullable Input<String> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder contentType(@Nullable String contentType) {
            this.contentType = Input.ofNullable(contentType);
            return this;
        }

        public Builder headers(@Nullable Input<Map<String,String>> headers) {
            this.headers = headers;
            return this;
        }

        public Builder headers(@Nullable Map<String,String> headers) {
            this.headers = Input.ofNullable(headers);
            return this;
        }

        public Builder maskHeaders(@Nullable Input<Boolean> maskHeaders) {
            this.maskHeaders = maskHeaders;
            return this;
        }

        public Builder maskHeaders(@Nullable Boolean maskHeaders) {
            this.maskHeaders = Input.ofNullable(maskHeaders);
            return this;
        }

        public Builder path(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder port(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder requestMethod(@Nullable Input<String> requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }

        public Builder requestMethod(@Nullable String requestMethod) {
            this.requestMethod = Input.ofNullable(requestMethod);
            return this;
        }

        public Builder useSsl(@Nullable Input<Boolean> useSsl) {
            this.useSsl = useSsl;
            return this;
        }

        public Builder useSsl(@Nullable Boolean useSsl) {
            this.useSsl = Input.ofNullable(useSsl);
            return this;
        }

        public Builder validateSsl(@Nullable Input<Boolean> validateSsl) {
            this.validateSsl = validateSsl;
            return this;
        }

        public Builder validateSsl(@Nullable Boolean validateSsl) {
            this.validateSsl = Input.ofNullable(validateSsl);
            return this;
        }
        public UptimeCheckConfigHttpCheckArgs build() {
            return new UptimeCheckConfigHttpCheckArgs(authInfo, body, contentType, headers, maskHeaders, path, port, requestMethod, useSsl, validateSsl);
        }
    }
}
