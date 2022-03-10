// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.secretsmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class GetSecretRotationRule {
    private final Integer automaticallyAfterDays;

    @OutputCustomType.Constructor
    private GetSecretRotationRule(@OutputCustomType.Parameter("automaticallyAfterDays") Integer automaticallyAfterDays) {
        this.automaticallyAfterDays = automaticallyAfterDays;
    }

    public Integer getAutomaticallyAfterDays() {
        return this.automaticallyAfterDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretRotationRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer automaticallyAfterDays;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretRotationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticallyAfterDays = defaults.automaticallyAfterDays;
        }

        public Builder automaticallyAfterDays(Integer automaticallyAfterDays) {
            this.automaticallyAfterDays = Objects.requireNonNull(automaticallyAfterDays);
            return this;
        }
        public GetSecretRotationRule build() {
            return new GetSecretRotationRule(automaticallyAfterDays);
        }
    }
}
