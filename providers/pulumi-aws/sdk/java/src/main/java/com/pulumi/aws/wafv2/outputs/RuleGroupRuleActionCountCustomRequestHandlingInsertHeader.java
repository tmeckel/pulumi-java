// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleActionCountCustomRequestHandlingInsertHeader {
    /**
     * @return The label string.
     * 
     */
    private final String name;
    /**
     * @return The value of the custom header.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private RuleGroupRuleActionCountCustomRequestHandlingInsertHeader(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * @return The label string.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The value of the custom header.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionCountCustomRequestHandlingInsertHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionCountCustomRequestHandlingInsertHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public RuleGroupRuleActionCountCustomRequestHandlingInsertHeader build() {
            return new RuleGroupRuleActionCountCustomRequestHandlingInsertHeader(name, value);
        }
    }
}
