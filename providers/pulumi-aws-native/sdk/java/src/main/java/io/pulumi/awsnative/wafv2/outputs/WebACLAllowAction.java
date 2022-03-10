// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.WebACLCustomRequestHandling;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebACLAllowAction {
    private final @Nullable WebACLCustomRequestHandling customRequestHandling;

    @OutputCustomType.Constructor
    private WebACLAllowAction(@OutputCustomType.Parameter("customRequestHandling") @Nullable WebACLCustomRequestHandling customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    public Optional<WebACLCustomRequestHandling> getCustomRequestHandling() {
        return Optional.ofNullable(this.customRequestHandling);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLAllowAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebACLCustomRequestHandling customRequestHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLAllowAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        public Builder customRequestHandling(@Nullable WebACLCustomRequestHandling customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }
        public WebACLAllowAction build() {
            return new WebACLAllowAction(customRequestHandling);
        }
    }
}
