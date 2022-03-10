// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
 * 
 */
public final class AggregationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AggregationRuleArgs Empty = new AggregationRuleArgs();

    /**
     * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole's permissions will be added
     * 
     */
    @InputImport(name="clusterRoleSelectors")
      private final @Nullable Input<List<LabelSelectorArgs>> clusterRoleSelectors;

    public Input<List<LabelSelectorArgs>> getClusterRoleSelectors() {
        return this.clusterRoleSelectors == null ? Input.empty() : this.clusterRoleSelectors;
    }

    public AggregationRuleArgs(@Nullable Input<List<LabelSelectorArgs>> clusterRoleSelectors) {
        this.clusterRoleSelectors = clusterRoleSelectors;
    }

    private AggregationRuleArgs() {
        this.clusterRoleSelectors = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AggregationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<LabelSelectorArgs>> clusterRoleSelectors;

        public Builder() {
    	      // Empty
        }

        public Builder(AggregationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterRoleSelectors = defaults.clusterRoleSelectors;
        }

        public Builder clusterRoleSelectors(@Nullable Input<List<LabelSelectorArgs>> clusterRoleSelectors) {
            this.clusterRoleSelectors = clusterRoleSelectors;
            return this;
        }

        public Builder clusterRoleSelectors(@Nullable List<LabelSelectorArgs> clusterRoleSelectors) {
            this.clusterRoleSelectors = Input.ofNullable(clusterRoleSelectors);
            return this;
        }
        public AggregationRuleArgs build() {
            return new AggregationRuleArgs(clusterRoleSelectors);
        }
    }
}
