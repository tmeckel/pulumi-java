// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLStatement;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class WebACLNotStatement extends io.pulumi.resources.InvokeArgs {

    public static final WebACLNotStatement Empty = new WebACLNotStatement();

    @InputImport(name="statement", required=true)
      private final WebACLStatement statement;

    public WebACLStatement getStatement() {
        return this.statement;
    }

    public WebACLNotStatement(WebACLStatement statement) {
        this.statement = Objects.requireNonNull(statement, "expected parameter 'statement' to be non-null");
    }

    private WebACLNotStatement() {
        this.statement = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLNotStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLStatement statement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLNotStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statement = defaults.statement;
        }

        public Builder statement(WebACLStatement statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }
        public WebACLNotStatement build() {
            return new WebACLNotStatement(statement);
        }
    }
}
