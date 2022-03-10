// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.certificateauthority.outputs.AuthorityConfigSubjectConfig;
import io.pulumi.gcp.certificateauthority.outputs.AuthorityConfigX509Config;
import java.util.Objects;

@OutputCustomType
public final class AuthorityConfig {
    /**
     * Specifies some of the values in a certificate that are related to the subject.
     * Structure is documented below.
     * 
     */
    private final AuthorityConfigSubjectConfig subjectConfig;
    /**
     * Describes how some of the technical X.509 fields in a certificate should be populated.
     * Structure is documented below.
     * 
     */
    private final AuthorityConfigX509Config x509Config;

    @OutputCustomType.Constructor
    private AuthorityConfig(
        @OutputCustomType.Parameter("subjectConfig") AuthorityConfigSubjectConfig subjectConfig,
        @OutputCustomType.Parameter("x509Config") AuthorityConfigX509Config x509Config) {
        this.subjectConfig = subjectConfig;
        this.x509Config = x509Config;
    }

    /**
     * Specifies some of the values in a certificate that are related to the subject.
     * Structure is documented below.
     * 
    */
    public AuthorityConfigSubjectConfig getSubjectConfig() {
        return this.subjectConfig;
    }
    /**
     * Describes how some of the technical X.509 fields in a certificate should be populated.
     * Structure is documented below.
     * 
    */
    public AuthorityConfigX509Config getX509Config() {
        return this.x509Config;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorityConfigSubjectConfig subjectConfig;
        private AuthorityConfigX509Config x509Config;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subjectConfig = defaults.subjectConfig;
    	      this.x509Config = defaults.x509Config;
        }

        public Builder subjectConfig(AuthorityConfigSubjectConfig subjectConfig) {
            this.subjectConfig = Objects.requireNonNull(subjectConfig);
            return this;
        }

        public Builder x509Config(AuthorityConfigX509Config x509Config) {
            this.x509Config = Objects.requireNonNull(x509Config);
            return this;
        }
        public AuthorityConfig build() {
            return new AuthorityConfig(subjectConfig, x509Config);
        }
    }
}
