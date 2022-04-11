// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie.inputs;

import io.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaCriterionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FindingsFilterFindingCriteriaGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FindingsFilterFindingCriteriaGetArgs Empty = new FindingsFilterFindingCriteriaGetArgs();

    /**
     * A condition that specifies the property, operator, and one or more values to use to filter the results.  (documented below)
     * 
     */
    @Import(name="criterions")
      private final @Nullable Output<List<FindingsFilterFindingCriteriaCriterionGetArgs>> criterions;

    public Output<List<FindingsFilterFindingCriteriaCriterionGetArgs>> getCriterions() {
        return this.criterions == null ? Codegen.empty() : this.criterions;
    }

    public FindingsFilterFindingCriteriaGetArgs(@Nullable Output<List<FindingsFilterFindingCriteriaCriterionGetArgs>> criterions) {
        this.criterions = criterions;
    }

    private FindingsFilterFindingCriteriaGetArgs() {
        this.criterions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FindingsFilterFindingCriteriaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<FindingsFilterFindingCriteriaCriterionGetArgs>> criterions;

        public Builder() {
    	      // Empty
        }

        public Builder(FindingsFilterFindingCriteriaGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criterions = defaults.criterions;
        }

        public Builder criterions(@Nullable Output<List<FindingsFilterFindingCriteriaCriterionGetArgs>> criterions) {
            this.criterions = criterions;
            return this;
        }
        public Builder criterions(@Nullable List<FindingsFilterFindingCriteriaCriterionGetArgs> criterions) {
            this.criterions = Codegen.ofNullable(criterions);
            return this;
        }
        public Builder criterions(FindingsFilterFindingCriteriaCriterionGetArgs... criterions) {
            return criterions(List.of(criterions));
        }        public FindingsFilterFindingCriteriaGetArgs build() {
            return new FindingsFilterFindingCriteriaGetArgs(criterions);
        }
    }
}
