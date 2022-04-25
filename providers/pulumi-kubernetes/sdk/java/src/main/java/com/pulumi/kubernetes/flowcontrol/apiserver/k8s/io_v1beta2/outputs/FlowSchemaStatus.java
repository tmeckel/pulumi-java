// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs.FlowSchemaCondition;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FlowSchemaStatus {
    /**
     * @return `conditions` is a list of the current states of FlowSchema.
     * 
     */
    private final @Nullable List<FlowSchemaCondition> conditions;

    @CustomType.Constructor
    private FlowSchemaStatus(@CustomType.Parameter("conditions") @Nullable List<FlowSchemaCondition> conditions) {
        this.conditions = conditions;
    }

    /**
     * @return `conditions` is a list of the current states of FlowSchema.
     * 
     */
    public List<FlowSchemaCondition> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSchemaStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FlowSchemaCondition> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSchemaStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        public Builder conditions(@Nullable List<FlowSchemaCondition> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(FlowSchemaCondition... conditions) {
            return conditions(List.of(conditions));
        }        public FlowSchemaStatus build() {
            return new FlowSchemaStatus(conditions);
        }
    }
}
