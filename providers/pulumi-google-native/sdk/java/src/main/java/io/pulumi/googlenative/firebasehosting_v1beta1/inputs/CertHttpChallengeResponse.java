// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Represents an HTTP certificate challenge.
 * 
 */
public final class CertHttpChallengeResponse extends io.pulumi.resources.InvokeArgs {

    public static final CertHttpChallengeResponse Empty = new CertHttpChallengeResponse();

    /**
     * The URL path on which to serve the specified token to satisfy the certificate challenge.
     * 
     */
    @InputImport(name="path", required=true)
    private final String path;

    public String getPath() {
        return this.path;
    }

    /**
     * The token to serve at the specified URL path to satisfy the certificate challenge.
     * 
     */
    @InputImport(name="token", required=true)
    private final String token;

    public String getToken() {
        return this.token;
    }

    public CertHttpChallengeResponse(
        String path,
        String token) {
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.token = Objects.requireNonNull(token, "expected parameter 'token' to be non-null");
    }

    private CertHttpChallengeResponse() {
        this.path = null;
        this.token = null;
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

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setToken(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }

        public CertHttpChallengeResponse build() {
            return new CertHttpChallengeResponse(path, token);
        }
    }
}
