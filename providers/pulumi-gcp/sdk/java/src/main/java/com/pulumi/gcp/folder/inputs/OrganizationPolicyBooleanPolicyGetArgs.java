// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.folder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class OrganizationPolicyBooleanPolicyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationPolicyBooleanPolicyGetArgs Empty = new OrganizationPolicyBooleanPolicyGetArgs();

    /**
     * If true, then the Policy is enforced. If false, then any configuration is acceptable.
     * 
     */
    @Import(name="enforced", required=true)
    private Output<Boolean> enforced;

    /**
     * @return If true, then the Policy is enforced. If false, then any configuration is acceptable.
     * 
     */
    public Output<Boolean> enforced() {
        return this.enforced;
    }

    private OrganizationPolicyBooleanPolicyGetArgs() {}

    private OrganizationPolicyBooleanPolicyGetArgs(OrganizationPolicyBooleanPolicyGetArgs $) {
        this.enforced = $.enforced;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationPolicyBooleanPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationPolicyBooleanPolicyGetArgs $;

        public Builder() {
            $ = new OrganizationPolicyBooleanPolicyGetArgs();
        }

        public Builder(OrganizationPolicyBooleanPolicyGetArgs defaults) {
            $ = new OrganizationPolicyBooleanPolicyGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enforced If true, then the Policy is enforced. If false, then any configuration is acceptable.
         * 
         * @return builder
         * 
         */
        public Builder enforced(Output<Boolean> enforced) {
            $.enforced = enforced;
            return this;
        }

        /**
         * @param enforced If true, then the Policy is enforced. If false, then any configuration is acceptable.
         * 
         * @return builder
         * 
         */
        public Builder enforced(Boolean enforced) {
            return enforced(Output.of(enforced));
        }

        public OrganizationPolicyBooleanPolicyGetArgs build() {
            $.enforced = Objects.requireNonNull($.enforced, "expected parameter 'enforced' to be non-null");
            return $;
        }
    }

}
