// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceProfileArgs Empty = new InstanceProfileArgs();

    /**
     * Name of the instance profile. If omitted, this provider will assign a random, unique name. Conflicts with `name_prefix`. Can be a string of characters consisting of upper and lowercase alphanumeric characters and these special characters: `_`, `+`, `=`, `,`, `.`, `@`, `-`. Spaces are not allowed.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @InputImport(name="namePrefix")
      private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * Path to the instance profile. For more information about paths, see [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the IAM User Guide. Can be a string of characters consisting of either a forward slash (`/`) by itself or a string that must begin and end with forward slashes. Can include any ASCII character from the ! (\u0021) through the DEL character (\u007F), including most punctuation characters, digits, and upper and lowercase letters.
     * 
     */
    @InputImport(name="path")
      private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * Name of the role to add to the profile.
     * 
     */
    @InputImport(name="role")
      private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    /**
     * Map of resource tags for the IAM Instance Profile. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public InstanceProfileArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<String> path,
        @Nullable Input<String> role,
        @Nullable Input<Map<String,String>> tags) {
        this.name = name;
        this.namePrefix = namePrefix;
        this.path = path;
        this.role = role;
        this.tags = tags;
    }

    private InstanceProfileArgs() {
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.path = Input.empty();
        this.role = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<String> path;
        private @Nullable Input<String> role;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.path = defaults.path;
    	      this.role = defaults.role;
    	      this.tags = defaults.tags;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder namePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder path(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder role(@Nullable Input<String> role) {
            this.role = role;
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
        public InstanceProfileArgs build() {
            return new InstanceProfileArgs(name, namePrefix, path, role, tags);
        }
    }
}
