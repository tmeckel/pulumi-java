// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.datacatalog.inputs.TagTemplateIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagTemplateIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagTemplateIamMemberArgs Empty = new TagTemplateIamMemberArgs();

    @Import(name="condition")
      private final @Nullable Output<TagTemplateIamMemberConditionArgs> condition;

    public Output<TagTemplateIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    @Import(name="member", required=true)
      private final Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    @Import(name="tagTemplate", required=true)
      private final Output<String> tagTemplate;

    public Output<String> getTagTemplate() {
        return this.tagTemplate;
    }

    public TagTemplateIamMemberArgs(
        @Nullable Output<TagTemplateIamMemberConditionArgs> condition,
        Output<String> member,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        Output<String> role,
        Output<String> tagTemplate) {
        this.condition = condition;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.project = project;
        this.region = region;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.tagTemplate = Objects.requireNonNull(tagTemplate, "expected parameter 'tagTemplate' to be non-null");
    }

    private TagTemplateIamMemberArgs() {
        this.condition = Codegen.empty();
        this.member = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.role = Codegen.empty();
        this.tagTemplate = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagTemplateIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TagTemplateIamMemberConditionArgs> condition;
        private Output<String> member;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private Output<String> role;
        private Output<String> tagTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(TagTemplateIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.role = defaults.role;
    	      this.tagTemplate = defaults.tagTemplate;
        }

        public Builder condition(@Nullable Output<TagTemplateIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable TagTemplateIamMemberConditionArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder member(Output<String> member) {
            this.member = Objects.requireNonNull(member);
            return this;
        }
        public Builder member(String member) {
            this.member = Output.of(Objects.requireNonNull(member));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }
        public Builder tagTemplate(Output<String> tagTemplate) {
            this.tagTemplate = Objects.requireNonNull(tagTemplate);
            return this;
        }
        public Builder tagTemplate(String tagTemplate) {
            this.tagTemplate = Output.of(Objects.requireNonNull(tagTemplate));
            return this;
        }        public TagTemplateIamMemberArgs build() {
            return new TagTemplateIamMemberArgs(condition, member, project, region, role, tagTemplate);
        }
    }
}
