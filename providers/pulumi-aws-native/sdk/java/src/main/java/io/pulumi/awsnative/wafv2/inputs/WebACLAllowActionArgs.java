// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLCustomRequestHandlingArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Allow traffic towards application.
 * 
 */
public final class WebACLAllowActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLAllowActionArgs Empty = new WebACLAllowActionArgs();

    @Import(name="customRequestHandling")
      private final @Nullable Output<WebACLCustomRequestHandlingArgs> customRequestHandling;

    public Output<WebACLCustomRequestHandlingArgs> getCustomRequestHandling() {
        return this.customRequestHandling == null ? Codegen.empty() : this.customRequestHandling;
    }

    public WebACLAllowActionArgs(@Nullable Output<WebACLCustomRequestHandlingArgs> customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    private WebACLAllowActionArgs() {
        this.customRequestHandling = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLAllowActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebACLCustomRequestHandlingArgs> customRequestHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLAllowActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        public Builder customRequestHandling(@Nullable Output<WebACLCustomRequestHandlingArgs> customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }
        public Builder customRequestHandling(@Nullable WebACLCustomRequestHandlingArgs customRequestHandling) {
            this.customRequestHandling = Codegen.ofNullable(customRequestHandling);
            return this;
        }        public WebACLAllowActionArgs build() {
            return new WebACLAllowActionArgs(customRequestHandling);
        }
    }
}
