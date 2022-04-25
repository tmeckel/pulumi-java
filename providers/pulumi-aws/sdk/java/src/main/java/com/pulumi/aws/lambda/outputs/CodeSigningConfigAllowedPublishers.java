// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class CodeSigningConfigAllowedPublishers {
    /**
     * @return The Amazon Resource Name (ARN) for each of the signing profiles. A signing profile defines a trusted user who can sign a code package.
     * 
     */
    private final List<String> signingProfileVersionArns;

    @CustomType.Constructor
    private CodeSigningConfigAllowedPublishers(@CustomType.Parameter("signingProfileVersionArns") List<String> signingProfileVersionArns) {
        this.signingProfileVersionArns = signingProfileVersionArns;
    }

    /**
     * @return The Amazon Resource Name (ARN) for each of the signing profiles. A signing profile defines a trusted user who can sign a code package.
     * 
     */
    public List<String> signingProfileVersionArns() {
        return this.signingProfileVersionArns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeSigningConfigAllowedPublishers defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> signingProfileVersionArns;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeSigningConfigAllowedPublishers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.signingProfileVersionArns = defaults.signingProfileVersionArns;
        }

        public Builder signingProfileVersionArns(List<String> signingProfileVersionArns) {
            this.signingProfileVersionArns = Objects.requireNonNull(signingProfileVersionArns);
            return this;
        }
        public Builder signingProfileVersionArns(String... signingProfileVersionArns) {
            return signingProfileVersionArns(List.of(signingProfileVersionArns));
        }        public CodeSigningConfigAllowedPublishers build() {
            return new CodeSigningConfigAllowedPublishers(signingProfileVersionArns);
        }
    }
}
