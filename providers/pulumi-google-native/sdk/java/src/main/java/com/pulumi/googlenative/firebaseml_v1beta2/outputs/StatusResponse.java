// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebaseml_v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class StatusResponse {
    /**
     * @return The status code, which should be an enum value of google.rpc.Code.
     * 
     */
    private final Integer code;
    /**
     * @return A list of messages that carry the error details. There is a common set of message types for APIs to use.
     * 
     */
    private final List<Map<String,String>> details;
    /**
     * @return A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
     * 
     */
    private final String message;

    @CustomType.Constructor
    private StatusResponse(
        @CustomType.Parameter("code") Integer code,
        @CustomType.Parameter("details") List<Map<String,String>> details,
        @CustomType.Parameter("message") String message) {
        this.code = code;
        this.details = details;
        this.message = message;
    }

    /**
     * @return The status code, which should be an enum value of google.rpc.Code.
     * 
     */
    public Integer code() {
        return this.code;
    }
    /**
     * @return A list of messages that carry the error details. There is a common set of message types for APIs to use.
     * 
     */
    public List<Map<String,String>> details() {
        return this.details;
    }
    /**
     * @return A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
     * 
     */
    public String message() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer code;
        private List<Map<String,String>> details;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
        }

        public Builder code(Integer code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder details(List<Map<String,String>> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }        public StatusResponse build() {
            return new StatusResponse(code, details, message);
        }
    }
}
