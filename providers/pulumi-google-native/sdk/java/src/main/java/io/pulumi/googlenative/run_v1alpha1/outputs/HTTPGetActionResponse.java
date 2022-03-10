// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.run_v1alpha1.outputs.HTTPHeaderResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class HTTPGetActionResponse {
    /**
     * (Optional) Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
     * 
     */
    private final String host;
    /**
     * (Optional) Custom headers to set in the request. HTTP allows repeated headers.
     * 
     */
    private final List<HTTPHeaderResponse> httpHeaders;
    /**
     * (Optional) Path to access on the HTTP server.
     * 
     */
    private final String path;
    /**
     * (Optional) Scheme to use for connecting to the host. Defaults to HTTP.
     * 
     */
    private final String scheme;

    @OutputCustomType.Constructor
    private HTTPGetActionResponse(
        @OutputCustomType.Parameter("host") String host,
        @OutputCustomType.Parameter("httpHeaders") List<HTTPHeaderResponse> httpHeaders,
        @OutputCustomType.Parameter("path") String path,
        @OutputCustomType.Parameter("scheme") String scheme) {
        this.host = host;
        this.httpHeaders = httpHeaders;
        this.path = path;
        this.scheme = scheme;
    }

    /**
     * (Optional) Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
     * 
    */
    public String getHost() {
        return this.host;
    }
    /**
     * (Optional) Custom headers to set in the request. HTTP allows repeated headers.
     * 
    */
    public List<HTTPHeaderResponse> getHttpHeaders() {
        return this.httpHeaders;
    }
    /**
     * (Optional) Path to access on the HTTP server.
     * 
    */
    public String getPath() {
        return this.path;
    }
    /**
     * (Optional) Scheme to use for connecting to the host. Defaults to HTTP.
     * 
    */
    public String getScheme() {
        return this.scheme;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HTTPGetActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private List<HTTPHeaderResponse> httpHeaders;
        private String path;
        private String scheme;

        public Builder() {
    	      // Empty
        }

        public Builder(HTTPGetActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.httpHeaders = defaults.httpHeaders;
    	      this.path = defaults.path;
    	      this.scheme = defaults.scheme;
        }

        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder httpHeaders(List<HTTPHeaderResponse> httpHeaders) {
            this.httpHeaders = Objects.requireNonNull(httpHeaders);
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder scheme(String scheme) {
            this.scheme = Objects.requireNonNull(scheme);
            return this;
        }
        public HTTPGetActionResponse build() {
            return new HTTPGetActionResponse(host, httpHeaders, path, scheme);
        }
    }
}
