// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BasicAuthenticationResponse {
    /**
     * The password to use when authenticating with the HTTP server.
     * 
     */
    private final String password;
    /**
     * The username to use when authenticating with the HTTP server.
     * 
     */
    private final String username;

    @OutputCustomType.Constructor
    private BasicAuthenticationResponse(
        @OutputCustomType.Parameter("password") String password,
        @OutputCustomType.Parameter("username") String username) {
        this.password = password;
        this.username = username;
    }

    /**
     * The password to use when authenticating with the HTTP server.
     * 
    */
    public String getPassword() {
        return this.password;
    }
    /**
     * The username to use when authenticating with the HTTP server.
     * 
    */
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public BasicAuthenticationResponse build() {
            return new BasicAuthenticationResponse(password, username);
        }
    }
}
