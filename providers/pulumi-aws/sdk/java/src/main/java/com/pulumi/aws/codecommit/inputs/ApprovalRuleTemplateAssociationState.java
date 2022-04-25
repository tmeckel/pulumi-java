// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codecommit.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApprovalRuleTemplateAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final ApprovalRuleTemplateAssociationState Empty = new ApprovalRuleTemplateAssociationState();

    /**
     * The name for the approval rule template.
     * 
     */
    @Import(name="approvalRuleTemplateName")
    private @Nullable Output<String> approvalRuleTemplateName;

    /**
     * @return The name for the approval rule template.
     * 
     */
    public Optional<Output<String>> approvalRuleTemplateName() {
        return Optional.ofNullable(this.approvalRuleTemplateName);
    }

    /**
     * The name of the repository that you want to associate with the template.
     * 
     */
    @Import(name="repositoryName")
    private @Nullable Output<String> repositoryName;

    /**
     * @return The name of the repository that you want to associate with the template.
     * 
     */
    public Optional<Output<String>> repositoryName() {
        return Optional.ofNullable(this.repositoryName);
    }

    private ApprovalRuleTemplateAssociationState() {}

    private ApprovalRuleTemplateAssociationState(ApprovalRuleTemplateAssociationState $) {
        this.approvalRuleTemplateName = $.approvalRuleTemplateName;
        this.repositoryName = $.repositoryName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApprovalRuleTemplateAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApprovalRuleTemplateAssociationState $;

        public Builder() {
            $ = new ApprovalRuleTemplateAssociationState();
        }

        public Builder(ApprovalRuleTemplateAssociationState defaults) {
            $ = new ApprovalRuleTemplateAssociationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param approvalRuleTemplateName The name for the approval rule template.
         * 
         * @return builder
         * 
         */
        public Builder approvalRuleTemplateName(@Nullable Output<String> approvalRuleTemplateName) {
            $.approvalRuleTemplateName = approvalRuleTemplateName;
            return this;
        }

        /**
         * @param approvalRuleTemplateName The name for the approval rule template.
         * 
         * @return builder
         * 
         */
        public Builder approvalRuleTemplateName(String approvalRuleTemplateName) {
            return approvalRuleTemplateName(Output.of(approvalRuleTemplateName));
        }

        /**
         * @param repositoryName The name of the repository that you want to associate with the template.
         * 
         * @return builder
         * 
         */
        public Builder repositoryName(@Nullable Output<String> repositoryName) {
            $.repositoryName = repositoryName;
            return this;
        }

        /**
         * @param repositoryName The name of the repository that you want to associate with the template.
         * 
         * @return builder
         * 
         */
        public Builder repositoryName(String repositoryName) {
            return repositoryName(Output.of(repositoryName));
        }

        public ApprovalRuleTemplateAssociationState build() {
            return $;
        }
    }

}
