// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf;

import io.pulumi.aws.waf.inputs.RulePredicateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleArgs Empty = new RuleArgs();

    /**
     * The name or description for the Amazon CloudWatch metric of this rule. The name can contain only alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace.
     * 
     */
    @InputImport(name="metricName", required=true)
      private final Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName;
    }

    /**
     * The name or description of the rule.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The objects to include in a rule (documented below).
     * 
     */
    @InputImport(name="predicates")
      private final @Nullable Input<List<RulePredicateArgs>> predicates;

    public Input<List<RulePredicateArgs>> getPredicates() {
        return this.predicates == null ? Input.empty() : this.predicates;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public RuleArgs(
        Input<String> metricName,
        @Nullable Input<String> name,
        @Nullable Input<List<RulePredicateArgs>> predicates,
        @Nullable Input<Map<String,String>> tags) {
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.name = name;
        this.predicates = predicates;
        this.tags = tags;
    }

    private RuleArgs() {
        this.metricName = Input.empty();
        this.name = Input.empty();
        this.predicates = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> metricName;
        private @Nullable Input<String> name;
        private @Nullable Input<List<RulePredicateArgs>> predicates;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricName = defaults.metricName;
    	      this.name = defaults.name;
    	      this.predicates = defaults.predicates;
    	      this.tags = defaults.tags;
        }

        public Builder metricName(Input<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder metricName(String metricName) {
            this.metricName = Input.of(Objects.requireNonNull(metricName));
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder predicates(@Nullable Input<List<RulePredicateArgs>> predicates) {
            this.predicates = predicates;
            return this;
        }

        public Builder predicates(@Nullable List<RulePredicateArgs> predicates) {
            this.predicates = Input.ofNullable(predicates);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public RuleArgs build() {
            return new RuleArgs(metricName, name, predicates, tags);
        }
    }
}
