// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.memcache_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceMessageResponse {
    /**
     * @return A code that correspond to one type of user-facing message.
     * 
     */
    private final String code;
    /**
     * @return Message on memcached instance which will be exposed to users.
     * 
     */
    private final String message;

    @CustomType.Constructor
    private InstanceMessageResponse(
        @CustomType.Parameter("code") String code,
        @CustomType.Parameter("message") String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * @return A code that correspond to one type of user-facing message.
     * 
     */
    public String code() {
        return this.code;
    }
    /**
     * @return Message on memcached instance which will be exposed to users.
     * 
     */
    public String message() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }        public InstanceMessageResponse build() {
            return new InstanceMessageResponse(code, message);
        }
    }
}
