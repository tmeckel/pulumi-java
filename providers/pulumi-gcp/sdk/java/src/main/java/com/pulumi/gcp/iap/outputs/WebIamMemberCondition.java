// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iap.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebIamMemberCondition {
    /**
     * @return An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    private final String expression;
    /**
     * @return A title for the expression, i.e. a short string describing its purpose.
     * 
     */
    private final String title;

    @CustomType.Constructor
    private WebIamMemberCondition(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("expression") String expression,
        @CustomType.Parameter("title") String title) {
        this.description = description;
        this.expression = expression;
        this.title = title;
    }

    /**
     * @return An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    public String expression() {
        return this.expression;
    }
    /**
     * @return A title for the expression, i.e. a short string describing its purpose.
     * 
     */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebIamMemberCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String expression;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(WebIamMemberCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.title = defaults.title;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public WebIamMemberCondition build() {
            return new WebIamMemberCondition(description, expression, title);
        }
    }
}
