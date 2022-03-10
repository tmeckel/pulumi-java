// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AccessLevelCustomExpr {
    /**
     * Description of the expression
     * 
     */
    private final @Nullable String description;
    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    private final String expression;
    /**
     * String indicating the location of the expression for error reporting, e.g. a file name and a position in the file
     * 
     */
    private final @Nullable String location;
    /**
     * Title for the expression, i.e. a short string describing its purpose.
     * 
     */
    private final @Nullable String title;

    @OutputCustomType.Constructor
    private AccessLevelCustomExpr(
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("expression") String expression,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("title") @Nullable String title) {
        this.description = description;
        this.expression = expression;
        this.location = location;
        this.title = title;
    }

    /**
     * Description of the expression
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * 
    */
    public String getExpression() {
        return this.expression;
    }
    /**
     * String indicating the location of the expression for error reporting, e.g. a file name and a position in the file
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Title for the expression, i.e. a short string describing its purpose.
     * 
    */
    public Optional<String> getTitle() {
        return Optional.ofNullable(this.title);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelCustomExpr defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String expression;
        private @Nullable String location;
        private @Nullable String title;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelCustomExpr defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.location = defaults.location;
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

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        public AccessLevelCustomExpr build() {
            return new AccessLevelCustomExpr(description, expression, location, title);
        }
    }
}
