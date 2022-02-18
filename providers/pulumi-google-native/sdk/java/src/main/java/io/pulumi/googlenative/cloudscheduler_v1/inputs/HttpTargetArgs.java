// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudscheduler_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudscheduler_v1.enums.HttpTargetHttpMethod;
import io.pulumi.googlenative.cloudscheduler_v1.inputs.OAuthTokenArgs;
import io.pulumi.googlenative.cloudscheduler_v1.inputs.OidcTokenArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Http target. The job will be pushed to the job handler by means of an HTTP request via an http_method such as HTTP POST, HTTP GET, etc. The job is acknowledged by means of an HTTP response code in the range [200 - 299]. A failure to receive a response constitutes a failed execution. For a redirected request, the response returned by the redirected request is considered.
 * 
 */
public final class HttpTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpTargetArgs Empty = new HttpTargetArgs();

    /**
     * HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It is an error to set body on a job with an incompatible HttpMethod.
     * 
     */
    @InputImport(name="body")
    private final @Nullable Input<String> body;

    public Input<String> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * The user can specify HTTP request headers to send with the job's HTTP request. This map contains the header field names and values. Repeated headers are not supported, but a header value can contain commas. These headers represent a subset of the headers that will accompany the job's HTTP request. Some HTTP request headers will be ignored or replaced. A partial list of headers that will be ignored or replaced is below: - Host: This will be computed by Cloud Scheduler and derived from uri. * `Content-Length`: This will be computed by Cloud Scheduler. * `User-Agent`: This will be set to `"Google-Cloud-Scheduler"`. * `X-Google-*`: Google internal use only. * `X-AppEngine-*`: Google internal use only. * `X-CloudScheduler`: This header will be set to true. * `X-CloudScheduler-JobName`: This header will contain the job name. * `X-CloudScheduler-ScheduleTime`: For Cloud Scheduler jobs specified in the unix-cron format, this header will contain the job schedule time in RFC3339 UTC "Zulu" format. The total size of headers must be less than 80KB.
     * 
     */
    @InputImport(name="headers")
    private final @Nullable Input<Map<String,String>> headers;

    public Input<Map<String,String>> getHeaders() {
        return this.headers == null ? Input.empty() : this.headers;
    }

    /**
     * Which HTTP method to use for the request.
     * 
     */
    @InputImport(name="httpMethod")
    private final @Nullable Input<HttpTargetHttpMethod> httpMethod;

    public Input<HttpTargetHttpMethod> getHttpMethod() {
        return this.httpMethod == null ? Input.empty() : this.httpMethod;
    }

    /**
     * If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization should generally only be used when calling Google APIs hosted on *.googleapis.com.
     * 
     */
    @InputImport(name="oauthToken")
    private final @Nullable Input<OAuthTokenArgs> oauthToken;

    public Input<OAuthTokenArgs> getOauthToken() {
        return this.oauthToken == null ? Input.empty() : this.oauthToken;
    }

    /**
     * If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
     * 
     */
    @InputImport(name="oidcToken")
    private final @Nullable Input<OidcTokenArgs> oidcToken;

    public Input<OidcTokenArgs> getOidcToken() {
        return this.oidcToken == null ? Input.empty() : this.oidcToken;
    }

    /**
     * The full URI path that the request will be sent to. This string must begin with either "http://" or "https://". Some examples of valid values for uri are: `http://acme.com` and `https://acme.com/sales:8080`. Cloud Scheduler will encode some characters for safety and compatibility. The maximum allowed URL length is 2083 characters after encoding.
     * 
     */
    @InputImport(name="uri", required=true)
    private final Input<String> uri;

    public Input<String> getUri() {
        return this.uri;
    }

    public HttpTargetArgs(
        @Nullable Input<String> body,
        @Nullable Input<Map<String,String>> headers,
        @Nullable Input<HttpTargetHttpMethod> httpMethod,
        @Nullable Input<OAuthTokenArgs> oauthToken,
        @Nullable Input<OidcTokenArgs> oidcToken,
        Input<String> uri) {
        this.body = body;
        this.headers = headers;
        this.httpMethod = httpMethod;
        this.oauthToken = oauthToken;
        this.oidcToken = oidcToken;
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private HttpTargetArgs() {
        this.body = Input.empty();
        this.headers = Input.empty();
        this.httpMethod = Input.empty();
        this.oauthToken = Input.empty();
        this.oidcToken = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> body;
        private @Nullable Input<Map<String,String>> headers;
        private @Nullable Input<HttpTargetHttpMethod> httpMethod;
        private @Nullable Input<OAuthTokenArgs> oauthToken;
        private @Nullable Input<OidcTokenArgs> oidcToken;
        private Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.headers = defaults.headers;
    	      this.httpMethod = defaults.httpMethod;
    	      this.oauthToken = defaults.oauthToken;
    	      this.oidcToken = defaults.oidcToken;
    	      this.uri = defaults.uri;
        }

        public Builder setBody(@Nullable Input<String> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable String body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder setHeaders(@Nullable Input<Map<String,String>> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setHeaders(@Nullable Map<String,String> headers) {
            this.headers = Input.ofNullable(headers);
            return this;
        }

        public Builder setHttpMethod(@Nullable Input<HttpTargetHttpMethod> httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        public Builder setHttpMethod(@Nullable HttpTargetHttpMethod httpMethod) {
            this.httpMethod = Input.ofNullable(httpMethod);
            return this;
        }

        public Builder setOauthToken(@Nullable Input<OAuthTokenArgs> oauthToken) {
            this.oauthToken = oauthToken;
            return this;
        }

        public Builder setOauthToken(@Nullable OAuthTokenArgs oauthToken) {
            this.oauthToken = Input.ofNullable(oauthToken);
            return this;
        }

        public Builder setOidcToken(@Nullable Input<OidcTokenArgs> oidcToken) {
            this.oidcToken = oidcToken;
            return this;
        }

        public Builder setOidcToken(@Nullable OidcTokenArgs oidcToken) {
            this.oidcToken = Input.ofNullable(oidcToken);
            return this;
        }

        public Builder setUri(Input<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Input.of(Objects.requireNonNull(uri));
            return this;
        }

        public HttpTargetArgs build() {
            return new HttpTargetArgs(body, headers, httpMethod, oauthToken, oidcToken, uri);
        }
    }
}
