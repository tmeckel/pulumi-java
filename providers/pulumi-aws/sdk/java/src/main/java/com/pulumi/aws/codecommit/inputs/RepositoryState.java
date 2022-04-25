// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codecommit.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryState extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryState Empty = new RepositoryState();

    /**
     * The ARN of the repository
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the repository
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The URL to use for cloning the repository over HTTPS.
     * 
     */
    @Import(name="cloneUrlHttp")
    private @Nullable Output<String> cloneUrlHttp;

    /**
     * @return The URL to use for cloning the repository over HTTPS.
     * 
     */
    public Optional<Output<String>> cloneUrlHttp() {
        return Optional.ofNullable(this.cloneUrlHttp);
    }

    /**
     * The URL to use for cloning the repository over SSH.
     * 
     */
    @Import(name="cloneUrlSsh")
    private @Nullable Output<String> cloneUrlSsh;

    /**
     * @return The URL to use for cloning the repository over SSH.
     * 
     */
    public Optional<Output<String>> cloneUrlSsh() {
        return Optional.ofNullable(this.cloneUrlSsh);
    }

    /**
     * The default branch of the repository. The branch specified here needs to exist.
     * 
     */
    @Import(name="defaultBranch")
    private @Nullable Output<String> defaultBranch;

    /**
     * @return The default branch of the repository. The branch specified here needs to exist.
     * 
     */
    public Optional<Output<String>> defaultBranch() {
        return Optional.ofNullable(this.defaultBranch);
    }

    /**
     * The description of the repository. This needs to be less than 1000 characters
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the repository. This needs to be less than 1000 characters
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of the repository
     * 
     */
    @Import(name="repositoryId")
    private @Nullable Output<String> repositoryId;

    /**
     * @return The ID of the repository
     * 
     */
    public Optional<Output<String>> repositoryId() {
        return Optional.ofNullable(this.repositoryId);
    }

    /**
     * The name for the repository. This needs to be less than 100 characters.
     * 
     */
    @Import(name="repositoryName")
    private @Nullable Output<String> repositoryName;

    /**
     * @return The name for the repository. This needs to be less than 100 characters.
     * 
     */
    public Optional<Output<String>> repositoryName() {
        return Optional.ofNullable(this.repositoryName);
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    private RepositoryState() {}

    private RepositoryState(RepositoryState $) {
        this.arn = $.arn;
        this.cloneUrlHttp = $.cloneUrlHttp;
        this.cloneUrlSsh = $.cloneUrlSsh;
        this.defaultBranch = $.defaultBranch;
        this.description = $.description;
        this.repositoryId = $.repositoryId;
        this.repositoryName = $.repositoryName;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryState $;

        public Builder() {
            $ = new RepositoryState();
        }

        public Builder(RepositoryState defaults) {
            $ = new RepositoryState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the repository
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the repository
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param cloneUrlHttp The URL to use for cloning the repository over HTTPS.
         * 
         * @return builder
         * 
         */
        public Builder cloneUrlHttp(@Nullable Output<String> cloneUrlHttp) {
            $.cloneUrlHttp = cloneUrlHttp;
            return this;
        }

        /**
         * @param cloneUrlHttp The URL to use for cloning the repository over HTTPS.
         * 
         * @return builder
         * 
         */
        public Builder cloneUrlHttp(String cloneUrlHttp) {
            return cloneUrlHttp(Output.of(cloneUrlHttp));
        }

        /**
         * @param cloneUrlSsh The URL to use for cloning the repository over SSH.
         * 
         * @return builder
         * 
         */
        public Builder cloneUrlSsh(@Nullable Output<String> cloneUrlSsh) {
            $.cloneUrlSsh = cloneUrlSsh;
            return this;
        }

        /**
         * @param cloneUrlSsh The URL to use for cloning the repository over SSH.
         * 
         * @return builder
         * 
         */
        public Builder cloneUrlSsh(String cloneUrlSsh) {
            return cloneUrlSsh(Output.of(cloneUrlSsh));
        }

        /**
         * @param defaultBranch The default branch of the repository. The branch specified here needs to exist.
         * 
         * @return builder
         * 
         */
        public Builder defaultBranch(@Nullable Output<String> defaultBranch) {
            $.defaultBranch = defaultBranch;
            return this;
        }

        /**
         * @param defaultBranch The default branch of the repository. The branch specified here needs to exist.
         * 
         * @return builder
         * 
         */
        public Builder defaultBranch(String defaultBranch) {
            return defaultBranch(Output.of(defaultBranch));
        }

        /**
         * @param description The description of the repository. This needs to be less than 1000 characters
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the repository. This needs to be less than 1000 characters
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param repositoryId The ID of the repository
         * 
         * @return builder
         * 
         */
        public Builder repositoryId(@Nullable Output<String> repositoryId) {
            $.repositoryId = repositoryId;
            return this;
        }

        /**
         * @param repositoryId The ID of the repository
         * 
         * @return builder
         * 
         */
        public Builder repositoryId(String repositoryId) {
            return repositoryId(Output.of(repositoryId));
        }

        /**
         * @param repositoryName The name for the repository. This needs to be less than 100 characters.
         * 
         * @return builder
         * 
         */
        public Builder repositoryName(@Nullable Output<String> repositoryName) {
            $.repositoryName = repositoryName;
            return this;
        }

        /**
         * @param repositoryName The name for the repository. This needs to be less than 100 characters.
         * 
         * @return builder
         * 
         */
        public Builder repositoryName(String repositoryName) {
            return repositoryName(Output.of(repositoryName));
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public RepositoryState build() {
            return $;
        }
    }

}
