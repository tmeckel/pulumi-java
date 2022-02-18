// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta3.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudtasks_v2beta3.inputs.OAuthTokenResponse;
import io.pulumi.googlenative.cloudtasks_v2beta3.inputs.OidcTokenResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * HTTP request. The task will be pushed to the worker as an HTTP request. If the worker or the redirected worker acknowledges the task by returning a successful HTTP response code ([`200` - `299`]), the task will be removed from the queue. If any other HTTP response code is returned or no response is received, the task will be retried according to the following: * User-specified throttling: retry configuration, rate limits, and the queue's state. * System throttling: To prevent the worker from overloading, Cloud Tasks may temporarily reduce the queue's effective rate. User-specified settings will not be changed. System throttling happens because: * Cloud Tasks backs off on all errors. Normally the backoff specified in rate limits will be used. But if the worker returns `429` (Too Many Requests), `503` (Service Unavailable), or the rate of errors is high, Cloud Tasks will use a higher backoff rate. The retry specified in the `Retry-After` HTTP response header is considered. * To prevent traffic spikes and to smooth sudden increases in traffic, dispatches ramp up slowly when the queue is newly created or idle and if large numbers of tasks suddenly become available to dispatch (due to spikes in create task rates, the queue being unpaused, or many tasks that are scheduled at the same time).
 * 
 */
public final class HttpRequestResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpRequestResponse Empty = new HttpRequestResponse();

    /**
     * HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It is an error to set body on a task with an incompatible HttpMethod.
     * 
     */
    @InputImport(name="body", required=true)
    private final String body;

    public String getBody() {
        return this.body;
    }

    /**
     * HTTP request headers. This map contains the header field names and values. Headers can be set when the task is created. These headers represent a subset of the headers that will accompany the task's HTTP request. Some HTTP request headers will be ignored or replaced. A partial list of headers that will be ignored or replaced is: * Host: This will be computed by Cloud Tasks and derived from HttpRequest.url. * Content-Length: This will be computed by Cloud Tasks. * User-Agent: This will be set to `"Google-Cloud-Tasks"`. * `X-Google-*`: Google use only. * `X-AppEngine-*`: Google use only. `Content-Type` won't be set by Cloud Tasks. You can explicitly set `Content-Type` to a media type when the task is created. For example, `Content-Type` can be set to `"application/octet-stream"` or `"application/json"`. Headers which can have multiple values (according to RFC2616) can be specified using comma-separated values. The size of the headers must be less than 80KB.
     * 
     */
    @InputImport(name="headers", required=true)
    private final Map<String,String> headers;

    public Map<String,String> getHeaders() {
        return this.headers;
    }

    /**
     * The HTTP method to use for the request. The default is POST.
     * 
     */
    @InputImport(name="httpMethod", required=true)
    private final String httpMethod;

    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization should generally only be used when calling Google APIs hosted on *.googleapis.com.
     * 
     */
    @InputImport(name="oauthToken", required=true)
    private final OAuthTokenResponse oauthToken;

    public OAuthTokenResponse getOauthToken() {
        return this.oauthToken;
    }

    /**
     * If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
     * 
     */
    @InputImport(name="oidcToken", required=true)
    private final OidcTokenResponse oidcToken;

    public OidcTokenResponse getOidcToken() {
        return this.oidcToken;
    }

    /**
     * The full url path that the request will be sent to. This string must begin with either "http://" or "https://". Some examples are: `http://acme.com` and `https://acme.com/sales:8080`. Cloud Tasks will encode some characters for safety and compatibility. The maximum allowed URL length is 2083 characters after encoding. The `Location` header response from a redirect response [`300` - `399`] may be followed. The redirect is not counted as a separate attempt.
     * 
     */
    @InputImport(name="url", required=true)
    private final String url;

    public String getUrl() {
        return this.url;
    }

    public HttpRequestResponse(
        String body,
        Map<String,String> headers,
        String httpMethod,
        OAuthTokenResponse oauthToken,
        OidcTokenResponse oidcToken,
        String url) {
        this.body = Objects.requireNonNull(body, "expected parameter 'body' to be non-null");
        this.headers = Objects.requireNonNull(headers, "expected parameter 'headers' to be non-null");
        this.httpMethod = Objects.requireNonNull(httpMethod, "expected parameter 'httpMethod' to be non-null");
        this.oauthToken = Objects.requireNonNull(oauthToken, "expected parameter 'oauthToken' to be non-null");
        this.oidcToken = Objects.requireNonNull(oidcToken, "expected parameter 'oidcToken' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private HttpRequestResponse() {
        this.body = null;
        this.headers = Map.of();
        this.httpMethod = null;
        this.oauthToken = null;
        this.oidcToken = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String body;
        private Map<String,String> headers;
        private String httpMethod;
        private OAuthTokenResponse oauthToken;
        private OidcTokenResponse oidcToken;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.headers = defaults.headers;
    	      this.httpMethod = defaults.httpMethod;
    	      this.oauthToken = defaults.oauthToken;
    	      this.oidcToken = defaults.oidcToken;
    	      this.url = defaults.url;
        }

        public Builder setBody(String body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }

        public Builder setHeaders(Map<String,String> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }

        public Builder setHttpMethod(String httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }

        public Builder setOauthToken(OAuthTokenResponse oauthToken) {
            this.oauthToken = Objects.requireNonNull(oauthToken);
            return this;
        }

        public Builder setOidcToken(OidcTokenResponse oidcToken) {
            this.oidcToken = Objects.requireNonNull(oidcToken);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public HttpRequestResponse build() {
            return new HttpRequestResponse(body, headers, httpMethod, oauthToken, oidcToken, url);
        }
    }
}
