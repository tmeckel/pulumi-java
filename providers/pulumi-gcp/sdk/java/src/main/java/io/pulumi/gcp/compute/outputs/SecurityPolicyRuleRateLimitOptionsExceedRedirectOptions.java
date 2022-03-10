// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecurityPolicyRuleRateLimitOptionsExceedRedirectOptions {
    private final @Nullable String target;
    private final String type;

    @OutputCustomType.Constructor
    private SecurityPolicyRuleRateLimitOptionsExceedRedirectOptions(
        @OutputCustomType.Parameter("target") @Nullable String target,
        @OutputCustomType.Parameter("type") String type) {
        this.target = target;
        this.type = type;
    }

    public Optional<String> getTarget() {
        return Optional.ofNullable(this.target);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRateLimitOptionsExceedRedirectOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String target;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleRateLimitOptionsExceedRedirectOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
    	      this.type = defaults.type;
        }

        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SecurityPolicyRuleRateLimitOptionsExceedRedirectOptions build() {
            return new SecurityPolicyRuleRateLimitOptionsExceedRedirectOptions(target, type);
        }
    }
}
