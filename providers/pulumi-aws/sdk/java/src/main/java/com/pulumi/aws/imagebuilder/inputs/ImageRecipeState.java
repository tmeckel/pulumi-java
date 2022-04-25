// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.aws.imagebuilder.inputs.ImageRecipeBlockDeviceMappingGetArgs;
import com.pulumi.aws.imagebuilder.inputs.ImageRecipeComponentGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageRecipeState extends com.pulumi.resources.ResourceArgs {

    public static final ImageRecipeState Empty = new ImageRecipeState();

    /**
     * (Required) Amazon Resource Name (ARN) of the image recipe.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return (Required) Amazon Resource Name (ARN) of the image recipe.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Configuration block(s) with block device mappings for the the image recipe. Detailed below.
     * 
     */
    @Import(name="blockDeviceMappings")
    private @Nullable Output<List<ImageRecipeBlockDeviceMappingGetArgs>> blockDeviceMappings;

    /**
     * @return Configuration block(s) with block device mappings for the the image recipe. Detailed below.
     * 
     */
    public Optional<Output<List<ImageRecipeBlockDeviceMappingGetArgs>>> blockDeviceMappings() {
        return Optional.ofNullable(this.blockDeviceMappings);
    }

    /**
     * Ordered configuration block(s) with components for the image recipe. Detailed below.
     * 
     */
    @Import(name="components")
    private @Nullable Output<List<ImageRecipeComponentGetArgs>> components;

    /**
     * @return Ordered configuration block(s) with components for the image recipe. Detailed below.
     * 
     */
    public Optional<Output<List<ImageRecipeComponentGetArgs>>> components() {
        return Optional.ofNullable(this.components);
    }

    /**
     * Date the image recipe was created.
     * 
     */
    @Import(name="dateCreated")
    private @Nullable Output<String> dateCreated;

    /**
     * @return Date the image recipe was created.
     * 
     */
    public Optional<Output<String>> dateCreated() {
        return Optional.ofNullable(this.dateCreated);
    }

    /**
     * Description of the image recipe.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the image recipe.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the image recipe.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the image recipe.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Owner of the image recipe.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    /**
     * @return Owner of the image recipe.
     * 
     */
    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * Platform of the image recipe.
     * 
     */
    @Import(name="parentImage")
    private @Nullable Output<String> parentImage;

    /**
     * @return Platform of the image recipe.
     * 
     */
    public Optional<Output<String>> parentImage() {
        return Optional.ofNullable(this.parentImage);
    }

    /**
     * Platform of the image recipe.
     * 
     */
    @Import(name="platform")
    private @Nullable Output<String> platform;

    /**
     * @return Platform of the image recipe.
     * 
     */
    public Optional<Output<String>> platform() {
        return Optional.ofNullable(this.platform);
    }

    /**
     * Key-value map of resource tags for the image recipe. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags for the image recipe. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Base64 encoded user data. Use this to provide commands or a command script to run when you launch your build instance.
     * 
     */
    @Import(name="userDataBase64")
    private @Nullable Output<String> userDataBase64;

    /**
     * @return Base64 encoded user data. Use this to provide commands or a command script to run when you launch your build instance.
     * 
     */
    public Optional<Output<String>> userDataBase64() {
        return Optional.ofNullable(this.userDataBase64);
    }

    /**
     * Version of the image recipe.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Version of the image recipe.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    /**
     * The working directory to be used during build and test workflows.
     * 
     */
    @Import(name="workingDirectory")
    private @Nullable Output<String> workingDirectory;

    /**
     * @return The working directory to be used during build and test workflows.
     * 
     */
    public Optional<Output<String>> workingDirectory() {
        return Optional.ofNullable(this.workingDirectory);
    }

    private ImageRecipeState() {}

    private ImageRecipeState(ImageRecipeState $) {
        this.arn = $.arn;
        this.blockDeviceMappings = $.blockDeviceMappings;
        this.components = $.components;
        this.dateCreated = $.dateCreated;
        this.description = $.description;
        this.name = $.name;
        this.owner = $.owner;
        this.parentImage = $.parentImage;
        this.platform = $.platform;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.userDataBase64 = $.userDataBase64;
        this.version = $.version;
        this.workingDirectory = $.workingDirectory;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageRecipeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageRecipeState $;

        public Builder() {
            $ = new ImageRecipeState();
        }

        public Builder(ImageRecipeState defaults) {
            $ = new ImageRecipeState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn (Required) Amazon Resource Name (ARN) of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn (Required) Amazon Resource Name (ARN) of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param blockDeviceMappings Configuration block(s) with block device mappings for the the image recipe. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder blockDeviceMappings(@Nullable Output<List<ImageRecipeBlockDeviceMappingGetArgs>> blockDeviceMappings) {
            $.blockDeviceMappings = blockDeviceMappings;
            return this;
        }

        /**
         * @param blockDeviceMappings Configuration block(s) with block device mappings for the the image recipe. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder blockDeviceMappings(List<ImageRecipeBlockDeviceMappingGetArgs> blockDeviceMappings) {
            return blockDeviceMappings(Output.of(blockDeviceMappings));
        }

        /**
         * @param blockDeviceMappings Configuration block(s) with block device mappings for the the image recipe. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder blockDeviceMappings(ImageRecipeBlockDeviceMappingGetArgs... blockDeviceMappings) {
            return blockDeviceMappings(List.of(blockDeviceMappings));
        }

        /**
         * @param components Ordered configuration block(s) with components for the image recipe. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder components(@Nullable Output<List<ImageRecipeComponentGetArgs>> components) {
            $.components = components;
            return this;
        }

        /**
         * @param components Ordered configuration block(s) with components for the image recipe. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder components(List<ImageRecipeComponentGetArgs> components) {
            return components(Output.of(components));
        }

        /**
         * @param components Ordered configuration block(s) with components for the image recipe. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder components(ImageRecipeComponentGetArgs... components) {
            return components(List.of(components));
        }

        /**
         * @param dateCreated Date the image recipe was created.
         * 
         * @return builder
         * 
         */
        public Builder dateCreated(@Nullable Output<String> dateCreated) {
            $.dateCreated = dateCreated;
            return this;
        }

        /**
         * @param dateCreated Date the image recipe was created.
         * 
         * @return builder
         * 
         */
        public Builder dateCreated(String dateCreated) {
            return dateCreated(Output.of(dateCreated));
        }

        /**
         * @param description Description of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param owner Owner of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner Owner of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param parentImage Platform of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder parentImage(@Nullable Output<String> parentImage) {
            $.parentImage = parentImage;
            return this;
        }

        /**
         * @param parentImage Platform of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder parentImage(String parentImage) {
            return parentImage(Output.of(parentImage));
        }

        /**
         * @param platform Platform of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder platform(@Nullable Output<String> platform) {
            $.platform = platform;
            return this;
        }

        /**
         * @param platform Platform of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder platform(String platform) {
            return platform(Output.of(platform));
        }

        /**
         * @param tags Key-value map of resource tags for the image recipe. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags for the image recipe. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param userDataBase64 Base64 encoded user data. Use this to provide commands or a command script to run when you launch your build instance.
         * 
         * @return builder
         * 
         */
        public Builder userDataBase64(@Nullable Output<String> userDataBase64) {
            $.userDataBase64 = userDataBase64;
            return this;
        }

        /**
         * @param userDataBase64 Base64 encoded user data. Use this to provide commands or a command script to run when you launch your build instance.
         * 
         * @return builder
         * 
         */
        public Builder userDataBase64(String userDataBase64) {
            return userDataBase64(Output.of(userDataBase64));
        }

        /**
         * @param version Version of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Version of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        /**
         * @param workingDirectory The working directory to be used during build and test workflows.
         * 
         * @return builder
         * 
         */
        public Builder workingDirectory(@Nullable Output<String> workingDirectory) {
            $.workingDirectory = workingDirectory;
            return this;
        }

        /**
         * @param workingDirectory The working directory to be used during build and test workflows.
         * 
         * @return builder
         * 
         */
        public Builder workingDirectory(String workingDirectory) {
            return workingDirectory(Output.of(workingDirectory));
        }

        public ImageRecipeState build() {
            return $;
        }
    }

}
