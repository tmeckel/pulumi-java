// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLStatementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;


public final class WebACLAndStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLAndStatementArgs Empty = new WebACLAndStatementArgs();

    @Import(name="statements", required=true)
      private final Output<List<WebACLStatementArgs>> statements;

    public Output<List<WebACLStatementArgs>> getStatements() {
        return this.statements;
    }

    public WebACLAndStatementArgs(Output<List<WebACLStatementArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebACLAndStatementArgs() {
        this.statements = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLAndStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<WebACLStatementArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLAndStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(Output<List<WebACLStatementArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(List<WebACLStatementArgs> statements) {
            this.statements = Output.of(Objects.requireNonNull(statements));
            return this;
        }
        public Builder statements(WebACLStatementArgs... statements) {
            return statements(List.of(statements));
        }        public WebACLAndStatementArgs build() {
            return new WebACLAndStatementArgs(statements);
        }
    }
}
