// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * One query argument in a web request, identified by name, for example UserName or SalesRegion. The name can be up to 30 characters long and isn't case sensitive.
 * 
 */
public final class RuleGroupFieldToMatchSingleQueryArgumentPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupFieldToMatchSingleQueryArgumentPropertiesArgs Empty = new RuleGroupFieldToMatchSingleQueryArgumentPropertiesArgs();

    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public RuleGroupFieldToMatchSingleQueryArgumentPropertiesArgs(Input<String> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private RuleGroupFieldToMatchSingleQueryArgumentPropertiesArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupFieldToMatchSingleQueryArgumentPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupFieldToMatchSingleQueryArgumentPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public RuleGroupFieldToMatchSingleQueryArgumentPropertiesArgs build() {
            return new RuleGroupFieldToMatchSingleQueryArgumentPropertiesArgs(name);
        }
    }
}
