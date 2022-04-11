// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.monitoring_v3.enums.HttpCheckContentType;
import io.pulumi.googlenative.monitoring_v3.enums.HttpCheckRequestMethod;
import io.pulumi.googlenative.monitoring_v3.inputs.BasicAuthenticationArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information involved in an HTTP/HTTPS Uptime check request.
 * 
 */
public final class HttpCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpCheckArgs Empty = new HttpCheckArgs();

    /**
     * The authentication information. Optional when creating an HTTP check; defaults to empty.
     * 
     */
    @Import(name="authInfo")
      private final @Nullable Output<BasicAuthenticationArgs> authInfo;

    public Output<BasicAuthenticationArgs> getAuthInfo() {
        return this.authInfo == null ? Codegen.empty() : this.authInfo;
    }

    /**
     * The request body associated with the HTTP POST request. If content_type is URL_ENCODED, the body passed in must be URL-encoded. Users can provide a Content-Length header via the headers field or the API will do so. If the request_method is GET and body is not empty, the API will return an error. The maximum byte size is 1 megabyte.Note: If client libraries aren't used (which performs the conversion automatically) base64 encode your body data since the field is of bytes type.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<String> body;

    public Output<String> getBody() {
        return this.body == null ? Codegen.empty() : this.body;
    }

    /**
     * The content type header to use for the check. The following configurations result in errors: 1. Content type is specified in both the headers field and the content_type field. 2. Request method is GET and content_type is not TYPE_UNSPECIFIED 3. Request method is POST and content_type is TYPE_UNSPECIFIED. 4. Request method is POST and a "Content-Type" header is provided via headers field. The content_type field should be used instead.
     * 
     */
    @Import(name="contentType")
      private final @Nullable Output<HttpCheckContentType> contentType;

    public Output<HttpCheckContentType> getContentType() {
        return this.contentType == null ? Codegen.empty() : this.contentType;
    }

    /**
     * The list of headers to send as part of the Uptime check request. If two headers have the same key and different values, they should be entered as a single header, with the value being a comma-separated list of all the desired values as described at https://www.w3.org/Protocols/rfc2616/rfc2616.txt (page 31). Entering two separate headers with the same key in a Create call will cause the first to be overwritten by the second. The maximum number of headers allowed is 100.
     * 
     */
    @Import(name="headers")
      private final @Nullable Output<Map<String,String>> headers;

    public Output<Map<String,String>> getHeaders() {
        return this.headers == null ? Codegen.empty() : this.headers;
    }

    /**
     * Boolean specifying whether to encrypt the header information. Encryption should be specified for any headers related to authentication that you do not wish to be seen when retrieving the configuration. The server will be responsible for encrypting the headers. On Get/List calls, if mask_headers is set to true then the headers will be obscured with ******.
     * 
     */
    @Import(name="maskHeaders")
      private final @Nullable Output<Boolean> maskHeaders;

    public Output<Boolean> getMaskHeaders() {
        return this.maskHeaders == null ? Codegen.empty() : this.maskHeaders;
    }

    /**
     * Optional (defaults to "/"). The path to the page against which to run the check. Will be combined with the host (specified within the monitored_resource) and port to construct the full URL. If the provided path does not begin with "/", a "/" will be prepended automatically.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * Optional (defaults to 80 when use_ssl is false, and 443 when use_ssl is true). The TCP port on the HTTP server against which to run the check. Will be combined with host (specified within the monitored_resource) and path to construct the full URL.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * The HTTP request method to use for the check. If set to METHOD_UNSPECIFIED then request_method defaults to GET.
     * 
     */
    @Import(name="requestMethod")
      private final @Nullable Output<HttpCheckRequestMethod> requestMethod;

    public Output<HttpCheckRequestMethod> getRequestMethod() {
        return this.requestMethod == null ? Codegen.empty() : this.requestMethod;
    }

    /**
     * If true, use HTTPS instead of HTTP to run the check.
     * 
     */
    @Import(name="useSsl")
      private final @Nullable Output<Boolean> useSsl;

    public Output<Boolean> getUseSsl() {
        return this.useSsl == null ? Codegen.empty() : this.useSsl;
    }

    /**
     * Boolean specifying whether to include SSL certificate validation as a part of the Uptime check. Only applies to checks where monitored_resource is set to uptime_url. If use_ssl is false, setting validate_ssl to true has no effect.
     * 
     */
    @Import(name="validateSsl")
      private final @Nullable Output<Boolean> validateSsl;

    public Output<Boolean> getValidateSsl() {
        return this.validateSsl == null ? Codegen.empty() : this.validateSsl;
    }

    public HttpCheckArgs(
        @Nullable Output<BasicAuthenticationArgs> authInfo,
        @Nullable Output<String> body,
        @Nullable Output<HttpCheckContentType> contentType,
        @Nullable Output<Map<String,String>> headers,
        @Nullable Output<Boolean> maskHeaders,
        @Nullable Output<String> path,
        @Nullable Output<Integer> port,
        @Nullable Output<HttpCheckRequestMethod> requestMethod,
        @Nullable Output<Boolean> useSsl,
        @Nullable Output<Boolean> validateSsl) {
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

    private HttpCheckArgs() {
        this.authInfo = Codegen.empty();
        this.body = Codegen.empty();
        this.contentType = Codegen.empty();
        this.headers = Codegen.empty();
        this.maskHeaders = Codegen.empty();
        this.path = Codegen.empty();
        this.port = Codegen.empty();
        this.requestMethod = Codegen.empty();
        this.useSsl = Codegen.empty();
        this.validateSsl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BasicAuthenticationArgs> authInfo;
        private @Nullable Output<String> body;
        private @Nullable Output<HttpCheckContentType> contentType;
        private @Nullable Output<Map<String,String>> headers;
        private @Nullable Output<Boolean> maskHeaders;
        private @Nullable Output<String> path;
        private @Nullable Output<Integer> port;
        private @Nullable Output<HttpCheckRequestMethod> requestMethod;
        private @Nullable Output<Boolean> useSsl;
        private @Nullable Output<Boolean> validateSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpCheckArgs defaults) {
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

        public Builder authInfo(@Nullable Output<BasicAuthenticationArgs> authInfo) {
            this.authInfo = authInfo;
            return this;
        }
        public Builder authInfo(@Nullable BasicAuthenticationArgs authInfo) {
            this.authInfo = Codegen.ofNullable(authInfo);
            return this;
        }
        public Builder body(@Nullable Output<String> body) {
            this.body = body;
            return this;
        }
        public Builder body(@Nullable String body) {
            this.body = Codegen.ofNullable(body);
            return this;
        }
        public Builder contentType(@Nullable Output<HttpCheckContentType> contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder contentType(@Nullable HttpCheckContentType contentType) {
            this.contentType = Codegen.ofNullable(contentType);
            return this;
        }
        public Builder headers(@Nullable Output<Map<String,String>> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(@Nullable Map<String,String> headers) {
            this.headers = Codegen.ofNullable(headers);
            return this;
        }
        public Builder maskHeaders(@Nullable Output<Boolean> maskHeaders) {
            this.maskHeaders = maskHeaders;
            return this;
        }
        public Builder maskHeaders(@Nullable Boolean maskHeaders) {
            this.maskHeaders = Codegen.ofNullable(maskHeaders);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }
        public Builder requestMethod(@Nullable Output<HttpCheckRequestMethod> requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public Builder requestMethod(@Nullable HttpCheckRequestMethod requestMethod) {
            this.requestMethod = Codegen.ofNullable(requestMethod);
            return this;
        }
        public Builder useSsl(@Nullable Output<Boolean> useSsl) {
            this.useSsl = useSsl;
            return this;
        }
        public Builder useSsl(@Nullable Boolean useSsl) {
            this.useSsl = Codegen.ofNullable(useSsl);
            return this;
        }
        public Builder validateSsl(@Nullable Output<Boolean> validateSsl) {
            this.validateSsl = validateSsl;
            return this;
        }
        public Builder validateSsl(@Nullable Boolean validateSsl) {
            this.validateSsl = Codegen.ofNullable(validateSsl);
            return this;
        }        public HttpCheckArgs build() {
            return new HttpCheckArgs(authInfo, body, contentType, headers, maskHeaders, path, port, requestMethod, useSsl, validateSsl);
        }
    }
}
