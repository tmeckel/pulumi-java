// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.memorydb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AclState extends com.pulumi.resources.ResourceArgs {

    public static final AclState Empty = new AclState();

    /**
     * The ARN of the ACL.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the ACL.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The minimum engine version supported by the ACL.
     * 
     */
    @Import(name="minimumEngineVersion")
    private @Nullable Output<String> minimumEngineVersion;

    /**
     * @return The minimum engine version supported by the ACL.
     * 
     */
    public Optional<Output<String>> minimumEngineVersion() {
        return Optional.ofNullable(this.minimumEngineVersion);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Set of MemoryDB user names to be included in this ACL.
     * 
     */
    @Import(name="userNames")
    private @Nullable Output<List<String>> userNames;

    /**
     * @return Set of MemoryDB user names to be included in this ACL.
     * 
     */
    public Optional<Output<List<String>>> userNames() {
        return Optional.ofNullable(this.userNames);
    }

    private AclState() {}

    private AclState(AclState $) {
        this.arn = $.arn;
        this.minimumEngineVersion = $.minimumEngineVersion;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.userNames = $.userNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AclState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AclState $;

        public Builder() {
            $ = new AclState();
        }

        public Builder(AclState defaults) {
            $ = new AclState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the ACL.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the ACL.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param minimumEngineVersion The minimum engine version supported by the ACL.
         * 
         * @return builder
         * 
         */
        public Builder minimumEngineVersion(@Nullable Output<String> minimumEngineVersion) {
            $.minimumEngineVersion = minimumEngineVersion;
            return this;
        }

        /**
         * @param minimumEngineVersion The minimum engine version supported by the ACL.
         * 
         * @return builder
         * 
         */
        public Builder minimumEngineVersion(String minimumEngineVersion) {
            return minimumEngineVersion(Output.of(minimumEngineVersion));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namePrefix Creates a unique name beginning with the specified prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param namePrefix Creates a unique name beginning with the specified prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param userNames Set of MemoryDB user names to be included in this ACL.
         * 
         * @return builder
         * 
         */
        public Builder userNames(@Nullable Output<List<String>> userNames) {
            $.userNames = userNames;
            return this;
        }

        /**
         * @param userNames Set of MemoryDB user names to be included in this ACL.
         * 
         * @return builder
         * 
         */
        public Builder userNames(List<String> userNames) {
            return userNames(Output.of(userNames));
        }

        /**
         * @param userNames Set of MemoryDB user names to be included in this ACL.
         * 
         * @return builder
         * 
         */
        public Builder userNames(String... userNames) {
            return userNames(List.of(userNames));
        }

        public AclState build() {
            return $;
        }
    }

}
