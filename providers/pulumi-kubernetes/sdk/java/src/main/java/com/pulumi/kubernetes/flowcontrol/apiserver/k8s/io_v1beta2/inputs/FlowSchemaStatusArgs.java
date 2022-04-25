// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.inputs.FlowSchemaConditionArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * FlowSchemaStatus represents the current state of a FlowSchema.
 * 
 */
public final class FlowSchemaStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowSchemaStatusArgs Empty = new FlowSchemaStatusArgs();

    /**
     * `conditions` is a list of the current states of FlowSchema.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<FlowSchemaConditionArgs>> conditions;

    /**
     * @return `conditions` is a list of the current states of FlowSchema.
     * 
     */
    public Optional<Output<List<FlowSchemaConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    private FlowSchemaStatusArgs() {}

    private FlowSchemaStatusArgs(FlowSchemaStatusArgs $) {
        this.conditions = $.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowSchemaStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowSchemaStatusArgs $;

        public Builder() {
            $ = new FlowSchemaStatusArgs();
        }

        public Builder(FlowSchemaStatusArgs defaults) {
            $ = new FlowSchemaStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditions `conditions` is a list of the current states of FlowSchema.
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<List<FlowSchemaConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions `conditions` is a list of the current states of FlowSchema.
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<FlowSchemaConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions `conditions` is a list of the current states of FlowSchema.
         * 
         * @return builder
         * 
         */
        public Builder conditions(FlowSchemaConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public FlowSchemaStatusArgs build() {
            return $;
        }
    }

}
