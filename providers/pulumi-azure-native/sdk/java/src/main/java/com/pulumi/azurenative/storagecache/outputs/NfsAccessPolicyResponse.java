// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.outputs;

import com.pulumi.azurenative.storagecache.outputs.NfsAccessRuleResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class NfsAccessPolicyResponse {
    /**
     * @return The set of rules describing client accesses allowed under this policy.
     * 
     */
    private final List<NfsAccessRuleResponse> accessRules;
    /**
     * @return Name identifying this policy. Access Policy names are not case sensitive.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private NfsAccessPolicyResponse(
        @CustomType.Parameter("accessRules") List<NfsAccessRuleResponse> accessRules,
        @CustomType.Parameter("name") String name) {
        this.accessRules = accessRules;
        this.name = name;
    }

    /**
     * @return The set of rules describing client accesses allowed under this policy.
     * 
     */
    public List<NfsAccessRuleResponse> accessRules() {
        return this.accessRules;
    }
    /**
     * @return Name identifying this policy. Access Policy names are not case sensitive.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NfsAccessPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<NfsAccessRuleResponse> accessRules;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(NfsAccessPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessRules = defaults.accessRules;
    	      this.name = defaults.name;
        }

        public Builder accessRules(List<NfsAccessRuleResponse> accessRules) {
            this.accessRules = Objects.requireNonNull(accessRules);
            return this;
        }
        public Builder accessRules(NfsAccessRuleResponse... accessRules) {
            return accessRules(List.of(accessRules));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public NfsAccessPolicyResponse build() {
            return new NfsAccessPolicyResponse(accessRules, name);
        }
    }
}
