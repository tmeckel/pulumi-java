// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectArtifactsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectArtifactsArgs Empty = new ProjectArtifactsArgs();

    /**
     * Artifact identifier. Must be the same specified inside the AWS CodeBuild build specification.
     * 
     */
    @Import(name="artifactIdentifier")
    private @Nullable Output<String> artifactIdentifier;

    /**
     * @return Artifact identifier. Must be the same specified inside the AWS CodeBuild build specification.
     * 
     */
    public Optional<Output<String>> artifactIdentifier() {
        return Optional.ofNullable(this.artifactIdentifier);
    }

    /**
     * Specifies the bucket owner&#39;s access for objects that another account uploads to their Amazon S3 bucket. By default, only the account that uploads the objects to the bucket has access to these objects. This property allows you to give the bucket owner access to these objects. Valid values are `NONE`, `READ_ONLY`, and `FULL`. your CodeBuild service role must have the `s3:PutBucketAcl` permission. This permission allows CodeBuild to modify the access control list for the bucket.
     * 
     */
    @Import(name="bucketOwnerAccess")
    private @Nullable Output<String> bucketOwnerAccess;

    /**
     * @return Specifies the bucket owner&#39;s access for objects that another account uploads to their Amazon S3 bucket. By default, only the account that uploads the objects to the bucket has access to these objects. This property allows you to give the bucket owner access to these objects. Valid values are `NONE`, `READ_ONLY`, and `FULL`. your CodeBuild service role must have the `s3:PutBucketAcl` permission. This permission allows CodeBuild to modify the access control list for the bucket.
     * 
     */
    public Optional<Output<String>> bucketOwnerAccess() {
        return Optional.ofNullable(this.bucketOwnerAccess);
    }

    /**
     * Whether to disable encrypting output artifacts. If `type` is set to `NO_ARTIFACTS`, this value is ignored. Defaults to `false`.
     * 
     */
    @Import(name="encryptionDisabled")
    private @Nullable Output<Boolean> encryptionDisabled;

    /**
     * @return Whether to disable encrypting output artifacts. If `type` is set to `NO_ARTIFACTS`, this value is ignored. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> encryptionDisabled() {
        return Optional.ofNullable(this.encryptionDisabled);
    }

    /**
     * Location of the source code from git or s3.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Location of the source code from git or s3.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Namespace to use in storing build artifacts. If `type` is set to `S3`, then valid values are `BUILD_ID` or `NONE`.
     * 
     */
    @Import(name="namespaceType")
    private @Nullable Output<String> namespaceType;

    /**
     * @return Namespace to use in storing build artifacts. If `type` is set to `S3`, then valid values are `BUILD_ID` or `NONE`.
     * 
     */
    public Optional<Output<String>> namespaceType() {
        return Optional.ofNullable(this.namespaceType);
    }

    /**
     * Whether a name specified in the build specification overrides the artifact name.
     * 
     */
    @Import(name="overrideArtifactName")
    private @Nullable Output<Boolean> overrideArtifactName;

    /**
     * @return Whether a name specified in the build specification overrides the artifact name.
     * 
     */
    public Optional<Output<Boolean>> overrideArtifactName() {
        return Optional.ofNullable(this.overrideArtifactName);
    }

    /**
     * Type of build output artifact to create. If `type` is set to `S3`, valid values are `NONE`, `ZIP`
     * 
     */
    @Import(name="packaging")
    private @Nullable Output<String> packaging;

    /**
     * @return Type of build output artifact to create. If `type` is set to `S3`, valid values are `NONE`, `ZIP`
     * 
     */
    public Optional<Output<String>> packaging() {
        return Optional.ofNullable(this.packaging);
    }

    /**
     * If `type` is set to `S3`, this is the path to the output artifact.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return If `type` is set to `S3`, this is the path to the output artifact.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ProjectArtifactsArgs() {}

    private ProjectArtifactsArgs(ProjectArtifactsArgs $) {
        this.artifactIdentifier = $.artifactIdentifier;
        this.bucketOwnerAccess = $.bucketOwnerAccess;
        this.encryptionDisabled = $.encryptionDisabled;
        this.location = $.location;
        this.name = $.name;
        this.namespaceType = $.namespaceType;
        this.overrideArtifactName = $.overrideArtifactName;
        this.packaging = $.packaging;
        this.path = $.path;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectArtifactsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectArtifactsArgs $;

        public Builder() {
            $ = new ProjectArtifactsArgs();
        }

        public Builder(ProjectArtifactsArgs defaults) {
            $ = new ProjectArtifactsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifactIdentifier Artifact identifier. Must be the same specified inside the AWS CodeBuild build specification.
         * 
         * @return builder
         * 
         */
        public Builder artifactIdentifier(@Nullable Output<String> artifactIdentifier) {
            $.artifactIdentifier = artifactIdentifier;
            return this;
        }

        /**
         * @param artifactIdentifier Artifact identifier. Must be the same specified inside the AWS CodeBuild build specification.
         * 
         * @return builder
         * 
         */
        public Builder artifactIdentifier(String artifactIdentifier) {
            return artifactIdentifier(Output.of(artifactIdentifier));
        }

        /**
         * @param bucketOwnerAccess Specifies the bucket owner&#39;s access for objects that another account uploads to their Amazon S3 bucket. By default, only the account that uploads the objects to the bucket has access to these objects. This property allows you to give the bucket owner access to these objects. Valid values are `NONE`, `READ_ONLY`, and `FULL`. your CodeBuild service role must have the `s3:PutBucketAcl` permission. This permission allows CodeBuild to modify the access control list for the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucketOwnerAccess(@Nullable Output<String> bucketOwnerAccess) {
            $.bucketOwnerAccess = bucketOwnerAccess;
            return this;
        }

        /**
         * @param bucketOwnerAccess Specifies the bucket owner&#39;s access for objects that another account uploads to their Amazon S3 bucket. By default, only the account that uploads the objects to the bucket has access to these objects. This property allows you to give the bucket owner access to these objects. Valid values are `NONE`, `READ_ONLY`, and `FULL`. your CodeBuild service role must have the `s3:PutBucketAcl` permission. This permission allows CodeBuild to modify the access control list for the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucketOwnerAccess(String bucketOwnerAccess) {
            return bucketOwnerAccess(Output.of(bucketOwnerAccess));
        }

        /**
         * @param encryptionDisabled Whether to disable encrypting output artifacts. If `type` is set to `NO_ARTIFACTS`, this value is ignored. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder encryptionDisabled(@Nullable Output<Boolean> encryptionDisabled) {
            $.encryptionDisabled = encryptionDisabled;
            return this;
        }

        /**
         * @param encryptionDisabled Whether to disable encrypting output artifacts. If `type` is set to `NO_ARTIFACTS`, this value is ignored. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder encryptionDisabled(Boolean encryptionDisabled) {
            return encryptionDisabled(Output.of(encryptionDisabled));
        }

        /**
         * @param location Location of the source code from git or s3.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Location of the source code from git or s3.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceType Namespace to use in storing build artifacts. If `type` is set to `S3`, then valid values are `BUILD_ID` or `NONE`.
         * 
         * @return builder
         * 
         */
        public Builder namespaceType(@Nullable Output<String> namespaceType) {
            $.namespaceType = namespaceType;
            return this;
        }

        /**
         * @param namespaceType Namespace to use in storing build artifacts. If `type` is set to `S3`, then valid values are `BUILD_ID` or `NONE`.
         * 
         * @return builder
         * 
         */
        public Builder namespaceType(String namespaceType) {
            return namespaceType(Output.of(namespaceType));
        }

        /**
         * @param overrideArtifactName Whether a name specified in the build specification overrides the artifact name.
         * 
         * @return builder
         * 
         */
        public Builder overrideArtifactName(@Nullable Output<Boolean> overrideArtifactName) {
            $.overrideArtifactName = overrideArtifactName;
            return this;
        }

        /**
         * @param overrideArtifactName Whether a name specified in the build specification overrides the artifact name.
         * 
         * @return builder
         * 
         */
        public Builder overrideArtifactName(Boolean overrideArtifactName) {
            return overrideArtifactName(Output.of(overrideArtifactName));
        }

        /**
         * @param packaging Type of build output artifact to create. If `type` is set to `S3`, valid values are `NONE`, `ZIP`
         * 
         * @return builder
         * 
         */
        public Builder packaging(@Nullable Output<String> packaging) {
            $.packaging = packaging;
            return this;
        }

        /**
         * @param packaging Type of build output artifact to create. If `type` is set to `S3`, valid values are `NONE`, `ZIP`
         * 
         * @return builder
         * 
         */
        public Builder packaging(String packaging) {
            return packaging(Output.of(packaging));
        }

        /**
         * @param path If `type` is set to `S3`, this is the path to the output artifact.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path If `type` is set to `S3`, this is the path to the output artifact.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param type Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ProjectArtifactsArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
