// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudasset.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectFeedConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectFeedConditionArgs Empty = new ProjectFeedConditionArgs();

    /**
     * Description of the expression. This is a longer text which describes the expression,
     * e.g. when hovered over it in a UI.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the expression. This is a longer text which describes the expression,
     * e.g. when hovered over it in a UI.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }

    /**
     * String indicating the location of the expression for error reporting, e.g. a file
     * name and a position in the file.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return String indicating the location of the expression for error reporting, e.g. a file
     * name and a position in the file.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Title for the expression, i.e. a short string describing its purpose.
     * This can be used e.g. in UIs which allow to enter the expression.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Title for the expression, i.e. a short string describing its purpose.
     * This can be used e.g. in UIs which allow to enter the expression.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private ProjectFeedConditionArgs() {}

    private ProjectFeedConditionArgs(ProjectFeedConditionArgs $) {
        this.description = $.description;
        this.expression = $.expression;
        this.location = $.location;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectFeedConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectFeedConditionArgs $;

        public Builder() {
            $ = new ProjectFeedConditionArgs();
        }

        public Builder(ProjectFeedConditionArgs defaults) {
            $ = new ProjectFeedConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the expression. This is a longer text which describes the expression,
         * e.g. when hovered over it in a UI.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the expression. This is a longer text which describes the expression,
         * e.g. when hovered over it in a UI.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param expression Textual representation of an expression in Common Expression Language syntax.
         * 
         * @return builder
         * 
         */
        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression Textual representation of an expression in Common Expression Language syntax.
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        /**
         * @param location String indicating the location of the expression for error reporting, e.g. a file
         * name and a position in the file.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location String indicating the location of the expression for error reporting, e.g. a file
         * name and a position in the file.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param title Title for the expression, i.e. a short string describing its purpose.
         * This can be used e.g. in UIs which allow to enter the expression.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Title for the expression, i.e. a short string describing its purpose.
         * This can be used e.g. in UIs which allow to enter the expression.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public ProjectFeedConditionArgs build() {
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            return $;
        }
    }

}
