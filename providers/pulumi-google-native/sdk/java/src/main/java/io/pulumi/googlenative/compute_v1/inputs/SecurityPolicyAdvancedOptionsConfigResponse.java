// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SecurityPolicyAdvancedOptionsConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyAdvancedOptionsConfigResponse Empty = new SecurityPolicyAdvancedOptionsConfigResponse();

    @InputImport(name="jsonParsing", required=true)
      private final String jsonParsing;

    public String getJsonParsing() {
        return this.jsonParsing;
    }

    @InputImport(name="logLevel", required=true)
      private final String logLevel;

    public String getLogLevel() {
        return this.logLevel;
    }

    public SecurityPolicyAdvancedOptionsConfigResponse(
        String jsonParsing,
        String logLevel) {
        this.jsonParsing = Objects.requireNonNull(jsonParsing, "expected parameter 'jsonParsing' to be non-null");
        this.logLevel = Objects.requireNonNull(logLevel, "expected parameter 'logLevel' to be non-null");
    }

    private SecurityPolicyAdvancedOptionsConfigResponse() {
        this.jsonParsing = null;
        this.logLevel = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyAdvancedOptionsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jsonParsing;
        private String logLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyAdvancedOptionsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jsonParsing = defaults.jsonParsing;
    	      this.logLevel = defaults.logLevel;
        }

        public Builder jsonParsing(String jsonParsing) {
            this.jsonParsing = Objects.requireNonNull(jsonParsing);
            return this;
        }

        public Builder logLevel(String logLevel) {
            this.logLevel = Objects.requireNonNull(logLevel);
            return this;
        }
        public SecurityPolicyAdvancedOptionsConfigResponse build() {
            return new SecurityPolicyAdvancedOptionsConfigResponse(jsonParsing, logLevel);
        }
    }
}
