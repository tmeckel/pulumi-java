// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class BudgetResourceAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetResourceAssociationArgs Empty = new BudgetResourceAssociationArgs();

    /**
     * Budget name.
     * 
     */
    @Import(name="budgetName", required=true)
      private final Output<String> budgetName;

    public Output<String> getBudgetName() {
        return this.budgetName;
    }

    /**
     * Resource identifier.
     * 
     */
    @Import(name="resourceId", required=true)
      private final Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId;
    }

    public BudgetResourceAssociationArgs(
        Output<String> budgetName,
        Output<String> resourceId) {
        this.budgetName = Objects.requireNonNull(budgetName, "expected parameter 'budgetName' to be non-null");
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
    }

    private BudgetResourceAssociationArgs() {
        this.budgetName = Codegen.empty();
        this.resourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetResourceAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> budgetName;
        private Output<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetResourceAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.budgetName = defaults.budgetName;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder budgetName(Output<String> budgetName) {
            this.budgetName = Objects.requireNonNull(budgetName);
            return this;
        }
        public Builder budgetName(String budgetName) {
            this.budgetName = Output.of(Objects.requireNonNull(budgetName));
            return this;
        }
        public Builder resourceId(Output<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Output.of(Objects.requireNonNull(resourceId));
            return this;
        }        public BudgetResourceAssociationArgs build() {
            return new BudgetResourceAssociationArgs(budgetName, resourceId);
        }
    }
}
