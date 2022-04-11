// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagTemplateIamPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final TagTemplateIamPolicyState Empty = new TagTemplateIamPolicyState();

    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    @Import(name="policyData")
      private final @Nullable Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData == null ? Codegen.empty() : this.policyData;
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

    @Import(name="tagTemplate")
      private final @Nullable Output<String> tagTemplate;

    public Output<String> getTagTemplate() {
        return this.tagTemplate == null ? Codegen.empty() : this.tagTemplate;
    }

    public TagTemplateIamPolicyState(
        @Nullable Output<String> etag,
        @Nullable Output<String> policyData,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<String> tagTemplate) {
        this.etag = etag;
        this.policyData = policyData;
        this.project = project;
        this.region = region;
        this.tagTemplate = tagTemplate;
    }

    private TagTemplateIamPolicyState() {
        this.etag = Codegen.empty();
        this.policyData = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.tagTemplate = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagTemplateIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> etag;
        private @Nullable Output<String> policyData;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<String> tagTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(TagTemplateIamPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.tagTemplate = defaults.tagTemplate;
        }

        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder policyData(@Nullable Output<String> policyData) {
            this.policyData = policyData;
            return this;
        }
        public Builder policyData(@Nullable String policyData) {
            this.policyData = Codegen.ofNullable(policyData);
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
        public Builder tagTemplate(@Nullable Output<String> tagTemplate) {
            this.tagTemplate = tagTemplate;
            return this;
        }
        public Builder tagTemplate(@Nullable String tagTemplate) {
            this.tagTemplate = Codegen.ofNullable(tagTemplate);
            return this;
        }        public TagTemplateIamPolicyState build() {
            return new TagTemplateIamPolicyState(etag, policyData, project, region, tagTemplate);
        }
    }
}
