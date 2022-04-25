// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codecommit.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApprovalRuleTemplateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApprovalRuleTemplateArgs Empty = new GetApprovalRuleTemplateArgs();

    /**
     * The name for the approval rule template. This needs to be less than 100 characters.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name for the approval rule template. This needs to be less than 100 characters.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetApprovalRuleTemplateArgs() {}

    private GetApprovalRuleTemplateArgs(GetApprovalRuleTemplateArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApprovalRuleTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApprovalRuleTemplateArgs $;

        public Builder() {
            $ = new GetApprovalRuleTemplateArgs();
        }

        public Builder(GetApprovalRuleTemplateArgs defaults) {
            $ = new GetApprovalRuleTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name for the approval rule template. This needs to be less than 100 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetApprovalRuleTemplateArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
