// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigSubjectConfigArgs;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigArgs;
import java.util.Objects;


public final class AuthorityConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorityConfigArgs Empty = new AuthorityConfigArgs();

    /**
     * Specifies some of the values in a certificate that are related to the subject.
     * Structure is documented below.
     * 
     */
    @InputImport(name="subjectConfig", required=true)
      private final Input<AuthorityConfigSubjectConfigArgs> subjectConfig;

    public Input<AuthorityConfigSubjectConfigArgs> getSubjectConfig() {
        return this.subjectConfig;
    }

    /**
     * Describes how some of the technical X.509 fields in a certificate should be populated.
     * Structure is documented below.
     * 
     */
    @InputImport(name="x509Config", required=true)
      private final Input<AuthorityConfigX509ConfigArgs> x509Config;

    public Input<AuthorityConfigX509ConfigArgs> getX509Config() {
        return this.x509Config;
    }

    public AuthorityConfigArgs(
        Input<AuthorityConfigSubjectConfigArgs> subjectConfig,
        Input<AuthorityConfigX509ConfigArgs> x509Config) {
        this.subjectConfig = Objects.requireNonNull(subjectConfig, "expected parameter 'subjectConfig' to be non-null");
        this.x509Config = Objects.requireNonNull(x509Config, "expected parameter 'x509Config' to be non-null");
    }

    private AuthorityConfigArgs() {
        this.subjectConfig = Input.empty();
        this.x509Config = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AuthorityConfigSubjectConfigArgs> subjectConfig;
        private Input<AuthorityConfigX509ConfigArgs> x509Config;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subjectConfig = defaults.subjectConfig;
    	      this.x509Config = defaults.x509Config;
        }

        public Builder subjectConfig(Input<AuthorityConfigSubjectConfigArgs> subjectConfig) {
            this.subjectConfig = Objects.requireNonNull(subjectConfig);
            return this;
        }

        public Builder subjectConfig(AuthorityConfigSubjectConfigArgs subjectConfig) {
            this.subjectConfig = Input.of(Objects.requireNonNull(subjectConfig));
            return this;
        }

        public Builder x509Config(Input<AuthorityConfigX509ConfigArgs> x509Config) {
            this.x509Config = Objects.requireNonNull(x509Config);
            return this;
        }

        public Builder x509Config(AuthorityConfigX509ConfigArgs x509Config) {
            this.x509Config = Input.of(Objects.requireNonNull(x509Config));
            return this;
        }
        public AuthorityConfigArgs build() {
            return new AuthorityConfigArgs(subjectConfig, x509Config);
        }
    }
}
