// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class AuthorizationLoggingOptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final AuthorizationLoggingOptionsResponse Empty = new AuthorizationLoggingOptionsResponse();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="permissionType", required=true)
    private String permissionType;

    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    public String permissionType() {
        return this.permissionType;
    }

    private AuthorizationLoggingOptionsResponse() {}

    private AuthorizationLoggingOptionsResponse(AuthorizationLoggingOptionsResponse $) {
        this.permissionType = $.permissionType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthorizationLoggingOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorizationLoggingOptionsResponse $;

        public Builder() {
            $ = new AuthorizationLoggingOptionsResponse();
        }

        public Builder(AuthorizationLoggingOptionsResponse defaults) {
            $ = new AuthorizationLoggingOptionsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param permissionType This is deprecated and has no effect. Do not use.
         * 
         * @return builder
         * 
         */
        public Builder permissionType(String permissionType) {
            $.permissionType = permissionType;
            return this;
        }

        public AuthorizationLoggingOptionsResponse build() {
            $.permissionType = Objects.requireNonNull($.permissionType, "expected parameter 'permissionType' to be non-null");
            return $;
        }
    }

}
