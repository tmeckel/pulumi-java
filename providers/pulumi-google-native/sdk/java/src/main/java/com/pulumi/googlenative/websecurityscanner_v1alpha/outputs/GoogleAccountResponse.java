// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner_v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleAccountResponse {
    /**
     * @return Input only. The password of the Google account. The credential is stored encrypted and not returned in any response nor included in audit logs.
     * 
     */
    private final String password;
    /**
     * @return The user name of the Google account.
     * 
     */
    private final String username;

    @CustomType.Constructor
    private GoogleAccountResponse(
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("username") String username) {
        this.password = password;
        this.username = username;
    }

    /**
     * @return Input only. The password of the Google account. The credential is stored encrypted and not returned in any response nor included in audit logs.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return The user name of the Google account.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleAccountResponse defaults) {
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
        }        public GoogleAccountResponse build() {
            return new GoogleAccountResponse(password, username);
        }
    }
}
