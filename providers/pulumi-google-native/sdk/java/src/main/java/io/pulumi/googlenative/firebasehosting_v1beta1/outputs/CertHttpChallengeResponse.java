// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CertHttpChallengeResponse {
    /**
     * The URL path on which to serve the specified token to satisfy the certificate challenge.
     * 
     */
    private final String path;
    /**
     * The token to serve at the specified URL path to satisfy the certificate challenge.
     * 
     */
    private final String token;

    @OutputCustomType.Constructor
    private CertHttpChallengeResponse(
        @OutputCustomType.Parameter("path") String path,
        @OutputCustomType.Parameter("token") String token) {
        this.path = path;
        this.token = token;
    }

    /**
     * The URL path on which to serve the specified token to satisfy the certificate challenge.
     * 
    */
    public String getPath() {
        return this.path;
    }
    /**
     * The token to serve at the specified URL path to satisfy the certificate challenge.
     * 
    */
    public String getToken() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertHttpChallengeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String path;
        private String token;

        public Builder() {
    	      // Empty
        }

        public Builder(CertHttpChallengeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.token = defaults.token;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder token(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }
        public CertHttpChallengeResponse build() {
            return new CertHttpChallengeResponse(path, token);
        }
    }
}
