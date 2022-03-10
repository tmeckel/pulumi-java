// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubnetworkIAMMemberConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetworkIAMMemberConditionArgs Empty = new SubnetworkIAMMemberConditionArgs();

    /**
     * An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    @InputImport(name="expression", required=true)
      private final Input<String> expression;

    public Input<String> getExpression() {
        return this.expression;
    }

    /**
     * A title for the expression, i.e. a short string describing its purpose.
     * 
     */
    @InputImport(name="title", required=true)
      private final Input<String> title;

    public Input<String> getTitle() {
        return this.title;
    }

    public SubnetworkIAMMemberConditionArgs(
        @Nullable Input<String> description,
        Input<String> expression,
        Input<String> title) {
        this.description = description;
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private SubnetworkIAMMemberConditionArgs() {
        this.description = Input.empty();
        this.expression = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkIAMMemberConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> expression;
        private Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkIAMMemberConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.title = defaults.title;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder expression(Input<String> expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder expression(String expression) {
            this.expression = Input.of(Objects.requireNonNull(expression));
            return this;
        }

        public Builder title(Input<String> title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder title(String title) {
            this.title = Input.of(Objects.requireNonNull(title));
            return this;
        }
        public SubnetworkIAMMemberConditionArgs build() {
            return new SubnetworkIAMMemberConditionArgs(description, expression, title);
        }
    }
}
