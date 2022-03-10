// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * A description for the model group.
     * 
     */
    @InputImport(name="modelPackageGroupDescription")
      private final @Nullable Input<String> modelPackageGroupDescription;

    public Input<String> getModelPackageGroupDescription() {
        return this.modelPackageGroupDescription == null ? Input.empty() : this.modelPackageGroupDescription;
    }

    /**
     * The name of the model group.
     * 
     */
    @InputImport(name="modelPackageGroupName")
      private final @Nullable Input<String> modelPackageGroupName;

    public Input<String> getModelPackageGroupName() {
        return this.modelPackageGroupName == null ? Input.empty() : this.modelPackageGroupName;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public ModelPackageGroupState(
        @Nullable Input<String> arn,
        @Nullable Input<String> modelPackageGroupDescription,
        @Nullable Input<String> modelPackageGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.modelPackageGroupDescription = modelPackageGroupDescription;
        this.modelPackageGroupName = modelPackageGroupName;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ModelPackageGroupState() {
        this.arn = Input.empty();
        this.modelPackageGroupDescription = Input.empty();
        this.modelPackageGroupName = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelPackageGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> modelPackageGroupDescription;
        private @Nullable Input<String> modelPackageGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

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

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder modelPackageGroupDescription(@Nullable Input<String> modelPackageGroupDescription) {
            this.modelPackageGroupDescription = modelPackageGroupDescription;
            return this;
        }

        public Builder modelPackageGroupDescription(@Nullable String modelPackageGroupDescription) {
            this.modelPackageGroupDescription = Input.ofNullable(modelPackageGroupDescription);
            return this;
        }

        public Builder modelPackageGroupName(@Nullable Input<String> modelPackageGroupName) {
            this.modelPackageGroupName = modelPackageGroupName;
            return this;
        }

        public Builder modelPackageGroupName(@Nullable String modelPackageGroupName) {
            this.modelPackageGroupName = Input.ofNullable(modelPackageGroupName);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public ModelPackageGroupState build() {
            return new ModelPackageGroupState(arn, modelPackageGroupDescription, modelPackageGroupName, tags, tagsAll);
        }
    }
}
