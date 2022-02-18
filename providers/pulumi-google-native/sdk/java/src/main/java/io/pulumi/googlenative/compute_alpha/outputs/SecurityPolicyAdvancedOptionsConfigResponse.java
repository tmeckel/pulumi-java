// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SecurityPolicyAdvancedOptionsConfigResponse {
    private final String jsonParsing;
    private final String logLevel;

    @OutputCustomType.Constructor({"jsonParsing","logLevel"})
    private SecurityPolicyAdvancedOptionsConfigResponse(
        String jsonParsing,
        String logLevel) {
        this.jsonParsing = Objects.requireNonNull(jsonParsing);
        this.logLevel = Objects.requireNonNull(logLevel);
    }

    public String getJsonParsing() {
        return this.jsonParsing;
    }
    public String getLogLevel() {
        return this.logLevel;
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

        public Builder setJsonParsing(String jsonParsing) {
            this.jsonParsing = Objects.requireNonNull(jsonParsing);
            return this;
        }

        public Builder setLogLevel(String logLevel) {
            this.logLevel = Objects.requireNonNull(logLevel);
            return this;
        }

        public SecurityPolicyAdvancedOptionsConfigResponse build() {
            return new SecurityPolicyAdvancedOptionsConfigResponse(jsonParsing, logLevel);
        }
    }
}
