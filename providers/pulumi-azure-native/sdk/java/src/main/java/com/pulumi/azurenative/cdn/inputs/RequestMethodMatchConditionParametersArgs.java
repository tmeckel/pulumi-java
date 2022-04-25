// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.enums.RequestMethodOperator;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the parameters for RequestMethod match conditions
 * 
 */
public final class RequestMethodMatchConditionParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final RequestMethodMatchConditionParametersArgs Empty = new RequestMethodMatchConditionParametersArgs();

    /**
     * The match value for the condition of the delivery rule
     * 
     */
    @Import(name="matchValues")
    private @Nullable Output<List<String>> matchValues;

    /**
     * @return The match value for the condition of the delivery rule
     * 
     */
    public Optional<Output<List<String>>> matchValues() {
        return Optional.ofNullable(this.matchValues);
    }

    /**
     * Describes if this is negate condition or not
     * 
     */
    @Import(name="negateCondition")
    private @Nullable Output<Boolean> negateCondition;

    /**
     * @return Describes if this is negate condition or not
     * 
     */
    public Optional<Output<Boolean>> negateCondition() {
        return Optional.ofNullable(this.negateCondition);
    }

    @Import(name="odataType", required=true)
    private Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * Describes operator to be matched
     * 
     */
    @Import(name="operator", required=true)
    private Output<Either<String,RequestMethodOperator>> operator;

    /**
     * @return Describes operator to be matched
     * 
     */
    public Output<Either<String,RequestMethodOperator>> operator() {
        return this.operator;
    }

    private RequestMethodMatchConditionParametersArgs() {}

    private RequestMethodMatchConditionParametersArgs(RequestMethodMatchConditionParametersArgs $) {
        this.matchValues = $.matchValues;
        this.negateCondition = $.negateCondition;
        this.odataType = $.odataType;
        this.operator = $.operator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RequestMethodMatchConditionParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RequestMethodMatchConditionParametersArgs $;

        public Builder() {
            $ = new RequestMethodMatchConditionParametersArgs();
        }

        public Builder(RequestMethodMatchConditionParametersArgs defaults) {
            $ = new RequestMethodMatchConditionParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param matchValues The match value for the condition of the delivery rule
         * 
         * @return builder
         * 
         */
        public Builder matchValues(@Nullable Output<List<String>> matchValues) {
            $.matchValues = matchValues;
            return this;
        }

        /**
         * @param matchValues The match value for the condition of the delivery rule
         * 
         * @return builder
         * 
         */
        public Builder matchValues(List<String> matchValues) {
            return matchValues(Output.of(matchValues));
        }

        /**
         * @param matchValues The match value for the condition of the delivery rule
         * 
         * @return builder
         * 
         */
        public Builder matchValues(String... matchValues) {
            return matchValues(List.of(matchValues));
        }

        /**
         * @param negateCondition Describes if this is negate condition or not
         * 
         * @return builder
         * 
         */
        public Builder negateCondition(@Nullable Output<Boolean> negateCondition) {
            $.negateCondition = negateCondition;
            return this;
        }

        /**
         * @param negateCondition Describes if this is negate condition or not
         * 
         * @return builder
         * 
         */
        public Builder negateCondition(Boolean negateCondition) {
            return negateCondition(Output.of(negateCondition));
        }

        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        /**
         * @param operator Describes operator to be matched
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<Either<String,RequestMethodOperator>> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator Describes operator to be matched
         * 
         * @return builder
         * 
         */
        public Builder operator(Either<String,RequestMethodOperator> operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param operator Describes operator to be matched
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Either.ofLeft(operator));
        }

        /**
         * @param operator Describes operator to be matched
         * 
         * @return builder
         * 
         */
        public Builder operator(RequestMethodOperator operator) {
            return operator(Either.ofRight(operator));
        }

        public RequestMethodMatchConditionParametersArgs build() {
            $.odataType = Objects.requireNonNull($.odataType, "expected parameter 'odataType' to be non-null");
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            return $;
        }
    }

}
