// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FindingsFilterFindingCriteriaCriterionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FindingsFilterFindingCriteriaCriterionArgs Empty = new FindingsFilterFindingCriteriaCriterionArgs();

    /**
     * The value for the property exclusively matches (equals an exact match for) all the specified values. If you specify multiple values, Amazon Macie uses AND logic to join the values.
     * 
     */
    @Import(name="eqExactMatches")
      private final @Nullable Output<List<String>> eqExactMatches;

    public Output<List<String>> getEqExactMatches() {
        return this.eqExactMatches == null ? Codegen.empty() : this.eqExactMatches;
    }

    /**
     * The value for the property matches (equals) the specified value. If you specify multiple values, Amazon Macie uses OR logic to join the values.
     * 
     */
    @Import(name="eqs")
      private final @Nullable Output<List<String>> eqs;

    public Output<List<String>> getEqs() {
        return this.eqs == null ? Codegen.empty() : this.eqs;
    }

    /**
     * The name of the field to be evaluated.
     * 
     */
    @Import(name="field", required=true)
      private final Output<String> field;

    public Output<String> getField() {
        return this.field;
    }

    /**
     * The value for the property is greater than the specified value.
     * 
     */
    @Import(name="gt")
      private final @Nullable Output<String> gt;

    public Output<String> getGt() {
        return this.gt == null ? Codegen.empty() : this.gt;
    }

    /**
     * The value for the property is greater than or equal to the specified value.
     * 
     */
    @Import(name="gte")
      private final @Nullable Output<String> gte;

    public Output<String> getGte() {
        return this.gte == null ? Codegen.empty() : this.gte;
    }

    /**
     * The value for the property is less than the specified value.
     * 
     */
    @Import(name="lt")
      private final @Nullable Output<String> lt;

    public Output<String> getLt() {
        return this.lt == null ? Codegen.empty() : this.lt;
    }

    /**
     * The value for the property is less than or equal to the specified value.
     * 
     */
    @Import(name="lte")
      private final @Nullable Output<String> lte;

    public Output<String> getLte() {
        return this.lte == null ? Codegen.empty() : this.lte;
    }

    /**
     * The value for the property doesn't match (doesn't equal) the specified value. If you specify multiple values, Amazon Macie uses OR logic to join the values.
     * 
     */
    @Import(name="neqs")
      private final @Nullable Output<List<String>> neqs;

    public Output<List<String>> getNeqs() {
        return this.neqs == null ? Codegen.empty() : this.neqs;
    }

    public FindingsFilterFindingCriteriaCriterionArgs(
        @Nullable Output<List<String>> eqExactMatches,
        @Nullable Output<List<String>> eqs,
        Output<String> field,
        @Nullable Output<String> gt,
        @Nullable Output<String> gte,
        @Nullable Output<String> lt,
        @Nullable Output<String> lte,
        @Nullable Output<List<String>> neqs) {
        this.eqExactMatches = eqExactMatches;
        this.eqs = eqs;
        this.field = Objects.requireNonNull(field, "expected parameter 'field' to be non-null");
        this.gt = gt;
        this.gte = gte;
        this.lt = lt;
        this.lte = lte;
        this.neqs = neqs;
    }

    private FindingsFilterFindingCriteriaCriterionArgs() {
        this.eqExactMatches = Codegen.empty();
        this.eqs = Codegen.empty();
        this.field = Codegen.empty();
        this.gt = Codegen.empty();
        this.gte = Codegen.empty();
        this.lt = Codegen.empty();
        this.lte = Codegen.empty();
        this.neqs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FindingsFilterFindingCriteriaCriterionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> eqExactMatches;
        private @Nullable Output<List<String>> eqs;
        private Output<String> field;
        private @Nullable Output<String> gt;
        private @Nullable Output<String> gte;
        private @Nullable Output<String> lt;
        private @Nullable Output<String> lte;
        private @Nullable Output<List<String>> neqs;

        public Builder() {
    	      // Empty
        }

        public Builder(FindingsFilterFindingCriteriaCriterionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eqExactMatches = defaults.eqExactMatches;
    	      this.eqs = defaults.eqs;
    	      this.field = defaults.field;
    	      this.gt = defaults.gt;
    	      this.gte = defaults.gte;
    	      this.lt = defaults.lt;
    	      this.lte = defaults.lte;
    	      this.neqs = defaults.neqs;
        }

        public Builder eqExactMatches(@Nullable Output<List<String>> eqExactMatches) {
            this.eqExactMatches = eqExactMatches;
            return this;
        }
        public Builder eqExactMatches(@Nullable List<String> eqExactMatches) {
            this.eqExactMatches = Codegen.ofNullable(eqExactMatches);
            return this;
        }
        public Builder eqExactMatches(String... eqExactMatches) {
            return eqExactMatches(List.of(eqExactMatches));
        }
        public Builder eqs(@Nullable Output<List<String>> eqs) {
            this.eqs = eqs;
            return this;
        }
        public Builder eqs(@Nullable List<String> eqs) {
            this.eqs = Codegen.ofNullable(eqs);
            return this;
        }
        public Builder eqs(String... eqs) {
            return eqs(List.of(eqs));
        }
        public Builder field(Output<String> field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        public Builder field(String field) {
            this.field = Output.of(Objects.requireNonNull(field));
            return this;
        }
        public Builder gt(@Nullable Output<String> gt) {
            this.gt = gt;
            return this;
        }
        public Builder gt(@Nullable String gt) {
            this.gt = Codegen.ofNullable(gt);
            return this;
        }
        public Builder gte(@Nullable Output<String> gte) {
            this.gte = gte;
            return this;
        }
        public Builder gte(@Nullable String gte) {
            this.gte = Codegen.ofNullable(gte);
            return this;
        }
        public Builder lt(@Nullable Output<String> lt) {
            this.lt = lt;
            return this;
        }
        public Builder lt(@Nullable String lt) {
            this.lt = Codegen.ofNullable(lt);
            return this;
        }
        public Builder lte(@Nullable Output<String> lte) {
            this.lte = lte;
            return this;
        }
        public Builder lte(@Nullable String lte) {
            this.lte = Codegen.ofNullable(lte);
            return this;
        }
        public Builder neqs(@Nullable Output<List<String>> neqs) {
            this.neqs = neqs;
            return this;
        }
        public Builder neqs(@Nullable List<String> neqs) {
            this.neqs = Codegen.ofNullable(neqs);
            return this;
        }
        public Builder neqs(String... neqs) {
            return neqs(List.of(neqs));
        }        public FindingsFilterFindingCriteriaCriterionArgs build() {
            return new FindingsFilterFindingCriteriaCriterionArgs(eqExactMatches, eqs, field, gt, gte, lt, lte, neqs);
        }
    }
}
