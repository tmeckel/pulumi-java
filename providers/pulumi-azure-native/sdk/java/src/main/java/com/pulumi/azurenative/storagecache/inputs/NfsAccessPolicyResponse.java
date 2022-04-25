// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.inputs;

import com.pulumi.azurenative.storagecache.inputs.NfsAccessRuleResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A set of rules describing access policies applied to NFSv3 clients of the cache.
 * 
 */
public final class NfsAccessPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final NfsAccessPolicyResponse Empty = new NfsAccessPolicyResponse();

    /**
     * The set of rules describing client accesses allowed under this policy.
     * 
     */
    @Import(name="accessRules", required=true)
    private List<NfsAccessRuleResponse> accessRules;

    /**
     * @return The set of rules describing client accesses allowed under this policy.
     * 
     */
    public List<NfsAccessRuleResponse> accessRules() {
        return this.accessRules;
    }

    /**
     * Name identifying this policy. Access Policy names are not case sensitive.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name identifying this policy. Access Policy names are not case sensitive.
     * 
     */
    public String name() {
        return this.name;
    }

    private NfsAccessPolicyResponse() {}

    private NfsAccessPolicyResponse(NfsAccessPolicyResponse $) {
        this.accessRules = $.accessRules;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NfsAccessPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NfsAccessPolicyResponse $;

        public Builder() {
            $ = new NfsAccessPolicyResponse();
        }

        public Builder(NfsAccessPolicyResponse defaults) {
            $ = new NfsAccessPolicyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessRules The set of rules describing client accesses allowed under this policy.
         * 
         * @return builder
         * 
         */
        public Builder accessRules(List<NfsAccessRuleResponse> accessRules) {
            $.accessRules = accessRules;
            return this;
        }

        /**
         * @param accessRules The set of rules describing client accesses allowed under this policy.
         * 
         * @return builder
         * 
         */
        public Builder accessRules(NfsAccessRuleResponse... accessRules) {
            return accessRules(List.of(accessRules));
        }

        /**
         * @param name Name identifying this policy. Access Policy names are not case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public NfsAccessPolicyResponse build() {
            $.accessRules = Objects.requireNonNull($.accessRules, "expected parameter 'accessRules' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
