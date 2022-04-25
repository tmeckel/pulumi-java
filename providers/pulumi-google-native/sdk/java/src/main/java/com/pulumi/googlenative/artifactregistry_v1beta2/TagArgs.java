// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.artifactregistry_v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagArgs Empty = new TagArgs();

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the tag, for example: &#34;projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/tags/tag1&#34;. If the package part contains slashes, the slashes are escaped. The tag part can only have characters in [a-zA-Z0-9\-._~:@], anything else must be URL encoded.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the tag, for example: &#34;projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/tags/tag1&#34;. If the package part contains slashes, the slashes are escaped. The tag part can only have characters in [a-zA-Z0-9\-._~:@], anything else must be URL encoded.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="packageId", required=true)
    private Output<String> packageId;

    public Output<String> packageId() {
        return this.packageId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="repositoryId", required=true)
    private Output<String> repositoryId;

    public Output<String> repositoryId() {
        return this.repositoryId;
    }

    @Import(name="tagId")
    private @Nullable Output<String> tagId;

    public Optional<Output<String>> tagId() {
        return Optional.ofNullable(this.tagId);
    }

    /**
     * The name of the version the tag refers to, for example: &#34;projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/sha256:5243811&#34; If the package or version ID parts contain slashes, the slashes are escaped.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The name of the version the tag refers to, for example: &#34;projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/sha256:5243811&#34; If the package or version ID parts contain slashes, the slashes are escaped.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private TagArgs() {}

    private TagArgs(TagArgs $) {
        this.location = $.location;
        this.name = $.name;
        this.packageId = $.packageId;
        this.project = $.project;
        this.repositoryId = $.repositoryId;
        this.tagId = $.tagId;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagArgs $;

        public Builder() {
            $ = new TagArgs();
        }

        public Builder(TagArgs defaults) {
            $ = new TagArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the tag, for example: &#34;projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/tags/tag1&#34;. If the package part contains slashes, the slashes are escaped. The tag part can only have characters in [a-zA-Z0-9\-._~:@], anything else must be URL encoded.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the tag, for example: &#34;projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/tags/tag1&#34;. If the package part contains slashes, the slashes are escaped. The tag part can only have characters in [a-zA-Z0-9\-._~:@], anything else must be URL encoded.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder packageId(Output<String> packageId) {
            $.packageId = packageId;
            return this;
        }

        public Builder packageId(String packageId) {
            return packageId(Output.of(packageId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder repositoryId(Output<String> repositoryId) {
            $.repositoryId = repositoryId;
            return this;
        }

        public Builder repositoryId(String repositoryId) {
            return repositoryId(Output.of(repositoryId));
        }

        public Builder tagId(@Nullable Output<String> tagId) {
            $.tagId = tagId;
            return this;
        }

        public Builder tagId(String tagId) {
            return tagId(Output.of(tagId));
        }

        /**
         * @param version The name of the version the tag refers to, for example: &#34;projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/sha256:5243811&#34; If the package or version ID parts contain slashes, the slashes are escaped.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The name of the version the tag refers to, for example: &#34;projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/sha256:5243811&#34; If the package or version ID parts contain slashes, the slashes are escaped.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public TagArgs build() {
            $.packageId = Objects.requireNonNull($.packageId, "expected parameter 'packageId' to be non-null");
            $.repositoryId = Objects.requireNonNull($.repositoryId, "expected parameter 'repositoryId' to be non-null");
            return $;
        }
    }

}
