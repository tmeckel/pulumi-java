// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModelPackageGroupState extends io.pulumi.resources.ResourceArgs {

    public static final ModelPackageGroupState Empty = new ModelPackageGroupState();

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Model Package Group.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * A description for the model group.
     * 
     */
    @Import(name="modelPackageGroupDescription")
      private final @Nullable Output<String> modelPackageGroupDescription;

    public Output<String> getModelPackageGroupDescription() {
        return this.modelPackageGroupDescription == null ? Codegen.empty() : this.modelPackageGroupDescription;
    }

    /**
     * The name of the model group.
     * 
     */
    @Import(name="modelPackageGroupName")
      private final @Nullable Output<String> modelPackageGroupName;

    public Output<String> getModelPackageGroupName() {
        return this.modelPackageGroupName == null ? Codegen.empty() : this.modelPackageGroupName;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public ModelPackageGroupState(
        @Nullable Output<String> arn,
        @Nullable Output<String> modelPackageGroupDescription,
        @Nullable Output<String> modelPackageGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.modelPackageGroupDescription = modelPackageGroupDescription;
        this.modelPackageGroupName = modelPackageGroupName;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ModelPackageGroupState() {
        this.arn = Codegen.empty();
        this.modelPackageGroupDescription = Codegen.empty();
        this.modelPackageGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelPackageGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> modelPackageGroupDescription;
        private @Nullable Output<String> modelPackageGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelPackageGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.modelPackageGroupDescription = defaults.modelPackageGroupDescription;
    	      this.modelPackageGroupName = defaults.modelPackageGroupName;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder modelPackageGroupDescription(@Nullable Output<String> modelPackageGroupDescription) {
            this.modelPackageGroupDescription = modelPackageGroupDescription;
            return this;
        }
        public Builder modelPackageGroupDescription(@Nullable String modelPackageGroupDescription) {
            this.modelPackageGroupDescription = Codegen.ofNullable(modelPackageGroupDescription);
            return this;
        }
        public Builder modelPackageGroupName(@Nullable Output<String> modelPackageGroupName) {
            this.modelPackageGroupName = modelPackageGroupName;
            return this;
        }
        public Builder modelPackageGroupName(@Nullable String modelPackageGroupName) {
            this.modelPackageGroupName = Codegen.ofNullable(modelPackageGroupName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public ModelPackageGroupState build() {
            return new ModelPackageGroupState(arn, modelPackageGroupDescription, modelPackageGroupName, tags, tagsAll);
        }
    }
}
