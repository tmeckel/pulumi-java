// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.memorydb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AclState extends io.pulumi.resources.ResourceArgs {

    public static final AclState Empty = new AclState();

    /**
     * The ARN of the ACL.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The minimum engine version supported by the ACL.
     * 
     */
    @Import(name="minimumEngineVersion")
      private final @Nullable Output<String> minimumEngineVersion;

    public Output<String> getMinimumEngineVersion() {
        return this.minimumEngineVersion == null ? Codegen.empty() : this.minimumEngineVersion;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> getNamePrefix() {
        return this.namePrefix == null ? Codegen.empty() : this.namePrefix;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * Set of MemoryDB user names to be included in this ACL.
     * 
     */
    @Import(name="userNames")
      private final @Nullable Output<List<String>> userNames;

    public Output<List<String>> getUserNames() {
        return this.userNames == null ? Codegen.empty() : this.userNames;
    }

    public AclState(
        @Nullable Output<String> arn,
        @Nullable Output<String> minimumEngineVersion,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<List<String>> userNames) {
        this.arn = arn;
        this.minimumEngineVersion = minimumEngineVersion;
        this.name = name;
        this.namePrefix = namePrefix;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.userNames = userNames;
    }

    private AclState() {
        this.arn = Codegen.empty();
        this.minimumEngineVersion = Codegen.empty();
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.userNames = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AclState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> minimumEngineVersion;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<List<String>> userNames;

        public Builder() {
    	      // Empty
        }

        public Builder(AclState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.minimumEngineVersion = defaults.minimumEngineVersion;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.userNames = defaults.userNames;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder minimumEngineVersion(@Nullable Output<String> minimumEngineVersion) {
            this.minimumEngineVersion = minimumEngineVersion;
            return this;
        }
        public Builder minimumEngineVersion(@Nullable String minimumEngineVersion) {
            this.minimumEngineVersion = Codegen.ofNullable(minimumEngineVersion);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Codegen.ofNullable(namePrefix);
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
        }
        public Builder userNames(@Nullable Output<List<String>> userNames) {
            this.userNames = userNames;
            return this;
        }
        public Builder userNames(@Nullable List<String> userNames) {
            this.userNames = Codegen.ofNullable(userNames);
            return this;
        }
        public Builder userNames(String... userNames) {
            return userNames(List.of(userNames));
        }        public AclState build() {
            return new AclState(arn, minimumEngineVersion, name, namePrefix, tags, tagsAll, userNames);
        }
    }
}
