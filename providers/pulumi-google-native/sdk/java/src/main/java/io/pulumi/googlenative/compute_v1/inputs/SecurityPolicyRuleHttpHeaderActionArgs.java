// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyRuleHttpHeaderActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleHttpHeaderActionArgs Empty = new SecurityPolicyRuleHttpHeaderActionArgs();

    /**
     * The list of request headers to add or overwrite if they're already present.
     * 
     */
    @InputImport(name="requestHeadersToAdds")
      private final @Nullable Input<List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs>> requestHeadersToAdds;

    public Input<List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs>> getRequestHeadersToAdds() {
        return this.requestHeadersToAdds == null ? Input.empty() : this.requestHeadersToAdds;
    }

    public SecurityPolicyRuleHttpHeaderActionArgs(@Nullable Input<List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs>> requestHeadersToAdds) {
        this.requestHeadersToAdds = requestHeadersToAdds;
    }

    private SecurityPolicyRuleHttpHeaderActionArgs() {
        this.requestHeadersToAdds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleHttpHeaderActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs>> requestHeadersToAdds;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleHttpHeaderActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeadersToAdds = defaults.requestHeadersToAdds;
        }

        public Builder requestHeadersToAdds(@Nullable Input<List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs>> requestHeadersToAdds) {
            this.requestHeadersToAdds = requestHeadersToAdds;
            return this;
        }

        public Builder requestHeadersToAdds(@Nullable List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs> requestHeadersToAdds) {
            this.requestHeadersToAdds = Input.ofNullable(requestHeadersToAdds);
            return this;
        }
        public SecurityPolicyRuleHttpHeaderActionArgs build() {
            return new SecurityPolicyRuleHttpHeaderActionArgs(requestHeadersToAdds);
        }
    }
}
