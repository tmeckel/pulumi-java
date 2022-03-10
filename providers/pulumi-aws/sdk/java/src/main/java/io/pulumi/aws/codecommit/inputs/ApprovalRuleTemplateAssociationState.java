// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codecommit.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApprovalRuleTemplateAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final ApprovalRuleTemplateAssociationState Empty = new ApprovalRuleTemplateAssociationState();

    /**
     * The name for the approval rule template.
     * 
     */
    @InputImport(name="approvalRuleTemplateName")
      private final @Nullable Input<String> approvalRuleTemplateName;

    public Input<String> getApprovalRuleTemplateName() {
        return this.approvalRuleTemplateName == null ? Input.empty() : this.approvalRuleTemplateName;
    }

    /**
     * The name of the repository that you want to associate with the template.
     * 
     */
    @InputImport(name="repositoryName")
      private final @Nullable Input<String> repositoryName;

    public Input<String> getRepositoryName() {
        return this.repositoryName == null ? Input.empty() : this.repositoryName;
    }

    public ApprovalRuleTemplateAssociationState(
        @Nullable Input<String> approvalRuleTemplateName,
        @Nullable Input<String> repositoryName) {
        this.approvalRuleTemplateName = approvalRuleTemplateName;
        this.repositoryName = repositoryName;
    }

    private ApprovalRuleTemplateAssociationState() {
        this.approvalRuleTemplateName = Input.empty();
        this.repositoryName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApprovalRuleTemplateAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> approvalRuleTemplateName;
        private @Nullable Input<String> repositoryName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApprovalRuleTemplateAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvalRuleTemplateName = defaults.approvalRuleTemplateName;
    	      this.repositoryName = defaults.repositoryName;
        }

        public Builder approvalRuleTemplateName(@Nullable Input<String> approvalRuleTemplateName) {
            this.approvalRuleTemplateName = approvalRuleTemplateName;
            return this;
        }

        public Builder approvalRuleTemplateName(@Nullable String approvalRuleTemplateName) {
            this.approvalRuleTemplateName = Input.ofNullable(approvalRuleTemplateName);
            return this;
        }

        public Builder repositoryName(@Nullable Input<String> repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }

        public Builder repositoryName(@Nullable String repositoryName) {
            this.repositoryName = Input.ofNullable(repositoryName);
            return this;
        }
        public ApprovalRuleTemplateAssociationState build() {
            return new ApprovalRuleTemplateAssociationState(approvalRuleTemplateName, repositoryName);
        }
    }
}
