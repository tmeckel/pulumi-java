// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePlacementConstraintGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePlacementConstraintGetArgs Empty = new ServicePlacementConstraintGetArgs();

    /**
     * Cluster Query Language expression to apply to the constraint. Does not need to be specified for the `distinctInstance` type. For more information, see [Cluster Query Language in the Amazon EC2 Container Service Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html).
     * 
     */
    @Import(name="expression")
    private @Nullable Output<String> expression;

    /**
     * @return Cluster Query Language expression to apply to the constraint. Does not need to be specified for the `distinctInstance` type. For more information, see [Cluster Query Language in the Amazon EC2 Container Service Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html).
     * 
     */
    public Optional<Output<String>> expression() {
        return Optional.ofNullable(this.expression);
    }

    /**
     * Type of constraint. The only valid values at this time are `memberOf` and `distinctInstance`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of constraint. The only valid values at this time are `memberOf` and `distinctInstance`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ServicePlacementConstraintGetArgs() {}

    private ServicePlacementConstraintGetArgs(ServicePlacementConstraintGetArgs $) {
        this.expression = $.expression;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePlacementConstraintGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePlacementConstraintGetArgs $;

        public Builder() {
            $ = new ServicePlacementConstraintGetArgs();
        }

        public Builder(ServicePlacementConstraintGetArgs defaults) {
            $ = new ServicePlacementConstraintGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expression Cluster Query Language expression to apply to the constraint. Does not need to be specified for the `distinctInstance` type. For more information, see [Cluster Query Language in the Amazon EC2 Container Service Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html).
         * 
         * @return builder
         * 
         */
        public Builder expression(@Nullable Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression Cluster Query Language expression to apply to the constraint. Does not need to be specified for the `distinctInstance` type. For more information, see [Cluster Query Language in the Amazon EC2 Container Service Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html).
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        /**
         * @param type Type of constraint. The only valid values at this time are `memberOf` and `distinctInstance`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of constraint. The only valid values at this time are `memberOf` and `distinctInstance`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ServicePlacementConstraintGetArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
