// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.alertsmanagement.inputs;

import com.pulumi.azurenative.alertsmanagement.enums.ActionRuleStatus;
import com.pulumi.azurenative.alertsmanagement.inputs.ConditionsArgs;
import com.pulumi.azurenative.alertsmanagement.inputs.ScopeArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Action rule with diagnostics configuration
 * 
 */
public final class DiagnosticsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiagnosticsArgs Empty = new DiagnosticsArgs();

    /**
     * conditions on which alerts will be filtered
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<ConditionsArgs> conditions;

    /**
     * @return conditions on which alerts will be filtered
     * 
     */
    public Optional<Output<ConditionsArgs>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * Description of action rule
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of action rule
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * scope on which action rule will apply
     * 
     */
    @Import(name="scope")
    private @Nullable Output<ScopeArgs> scope;

    /**
     * @return scope on which action rule will apply
     * 
     */
    public Optional<Output<ScopeArgs>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * Indicates if the given action rule is enabled or disabled
     * 
     */
    @Import(name="status")
    private @Nullable Output<Either<String,ActionRuleStatus>> status;

    /**
     * @return Indicates if the given action rule is enabled or disabled
     * 
     */
    public Optional<Output<Either<String,ActionRuleStatus>>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Indicates type of action rule
     * Expected value is &#39;Diagnostics&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Indicates type of action rule
     * Expected value is &#39;Diagnostics&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private DiagnosticsArgs() {}

    private DiagnosticsArgs(DiagnosticsArgs $) {
        this.conditions = $.conditions;
        this.description = $.description;
        this.scope = $.scope;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiagnosticsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiagnosticsArgs $;

        public Builder() {
            $ = new DiagnosticsArgs();
        }

        public Builder(DiagnosticsArgs defaults) {
            $ = new DiagnosticsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditions conditions on which alerts will be filtered
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<ConditionsArgs> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions conditions on which alerts will be filtered
         * 
         * @return builder
         * 
         */
        public Builder conditions(ConditionsArgs conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param description Description of action rule
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of action rule
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param scope scope on which action rule will apply
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<ScopeArgs> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope scope on which action rule will apply
         * 
         * @return builder
         * 
         */
        public Builder scope(ScopeArgs scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param status Indicates if the given action rule is enabled or disabled
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Either<String,ActionRuleStatus>> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Indicates if the given action rule is enabled or disabled
         * 
         * @return builder
         * 
         */
        public Builder status(Either<String,ActionRuleStatus> status) {
            return status(Output.of(status));
        }

        /**
         * @param status Indicates if the given action rule is enabled or disabled
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Either.ofLeft(status));
        }

        /**
         * @param status Indicates if the given action rule is enabled or disabled
         * 
         * @return builder
         * 
         */
        public Builder status(ActionRuleStatus status) {
            return status(Either.ofRight(status));
        }

        /**
         * @param type Indicates type of action rule
         * Expected value is &#39;Diagnostics&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Indicates type of action rule
         * Expected value is &#39;Diagnostics&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DiagnosticsArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
