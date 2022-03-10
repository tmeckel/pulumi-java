// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.aws.codebuild.inputs.ProjectArtifactsGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectBuildBatchConfigGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectCacheGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectEnvironmentGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectFileSystemLocationGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectLogsConfigGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectSecondaryArtifactGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectSecondarySourceGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectSecondarySourceVersionGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectSourceGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectVpcConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectState extends io.pulumi.resources.ResourceArgs {

    public static final ProjectState Empty = new ProjectState();

    /**
     * ARN of the CodeBuild project.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="artifacts")
      private final @Nullable Input<ProjectArtifactsGetArgs> artifacts;

    public Input<ProjectArtifactsGetArgs> getArtifacts() {
        return this.artifacts == null ? Input.empty() : this.artifacts;
    }

    /**
     * Generates a publicly-accessible URL for the projects build badge. Available as `badge_url` attribute when enabled.
     * 
     */
    @InputImport(name="badgeEnabled")
      private final @Nullable Input<Boolean> badgeEnabled;

    public Input<Boolean> getBadgeEnabled() {
        return this.badgeEnabled == null ? Input.empty() : this.badgeEnabled;
    }

    /**
     * URL of the build badge when `badge_enabled` is enabled.
     * 
     */
    @InputImport(name="badgeUrl")
      private final @Nullable Input<String> badgeUrl;

    public Input<String> getBadgeUrl() {
        return this.badgeUrl == null ? Input.empty() : this.badgeUrl;
    }

    /**
     * Defines the batch build options for the project.
     * 
     */
    @InputImport(name="buildBatchConfig")
      private final @Nullable Input<ProjectBuildBatchConfigGetArgs> buildBatchConfig;

    public Input<ProjectBuildBatchConfigGetArgs> getBuildBatchConfig() {
        return this.buildBatchConfig == null ? Input.empty() : this.buildBatchConfig;
    }

    /**
     * Number of minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that does not get marked as completed. The default is 60 minutes.
     * 
     */
    @InputImport(name="buildTimeout")
      private final @Nullable Input<Integer> buildTimeout;

    public Input<Integer> getBuildTimeout() {
        return this.buildTimeout == null ? Input.empty() : this.buildTimeout;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="cache")
      private final @Nullable Input<ProjectCacheGetArgs> cache;

    public Input<ProjectCacheGetArgs> getCache() {
        return this.cache == null ? Input.empty() : this.cache;
    }

    /**
     * Specify a maximum number of concurrent builds for the project. The value specified must be greater than 0 and less than the account concurrent running builds limit.
     * 
     */
    @InputImport(name="concurrentBuildLimit")
      private final @Nullable Input<Integer> concurrentBuildLimit;

    public Input<Integer> getConcurrentBuildLimit() {
        return this.concurrentBuildLimit == null ? Input.empty() : this.concurrentBuildLimit;
    }

    /**
     * Short description of the project.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build project's build output artifacts.
     * 
     */
    @InputImport(name="encryptionKey")
      private final @Nullable Input<String> encryptionKey;

    public Input<String> getEncryptionKey() {
        return this.encryptionKey == null ? Input.empty() : this.encryptionKey;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="environment")
      private final @Nullable Input<ProjectEnvironmentGetArgs> environment;

    public Input<ProjectEnvironmentGetArgs> getEnvironment() {
        return this.environment == null ? Input.empty() : this.environment;
    }

    /**
     * A set of file system locations to to mount inside the build. File system locations are documented below.
     * 
     */
    @InputImport(name="fileSystemLocations")
      private final @Nullable Input<List<ProjectFileSystemLocationGetArgs>> fileSystemLocations;

    public Input<List<ProjectFileSystemLocationGetArgs>> getFileSystemLocations() {
        return this.fileSystemLocations == null ? Input.empty() : this.fileSystemLocations;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="logsConfig")
      private final @Nullable Input<ProjectLogsConfigGetArgs> logsConfig;

    public Input<ProjectLogsConfigGetArgs> getLogsConfig() {
        return this.logsConfig == null ? Input.empty() : this.logsConfig;
    }

    /**
     * Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Specifies the visibility of the project's builds. Possible values are: `PUBLIC_READ` and `PRIVATE`. Default value is `PRIVATE`.
     * 
     */
    @InputImport(name="projectVisibility")
      private final @Nullable Input<String> projectVisibility;

    public Input<String> getProjectVisibility() {
        return this.projectVisibility == null ? Input.empty() : this.projectVisibility;
    }

    /**
     * The project identifier used with the public build APIs.
     * 
     */
    @InputImport(name="publicProjectAlias")
      private final @Nullable Input<String> publicProjectAlias;

    public Input<String> getPublicProjectAlias() {
        return this.publicProjectAlias == null ? Input.empty() : this.publicProjectAlias;
    }

    /**
     * Number of minutes, from 5 to 480 (8 hours), a build is allowed to be queued before it times out. The default is 8 hours.
     * 
     */
    @InputImport(name="queuedTimeout")
      private final @Nullable Input<Integer> queuedTimeout;

    public Input<Integer> getQueuedTimeout() {
        return this.queuedTimeout == null ? Input.empty() : this.queuedTimeout;
    }

    /**
     * The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3 artifacts for the project's builds.
     * 
     */
    @InputImport(name="resourceAccessRole")
      private final @Nullable Input<String> resourceAccessRole;

    public Input<String> getResourceAccessRole() {
        return this.resourceAccessRole == null ? Input.empty() : this.resourceAccessRole;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="secondaryArtifacts")
      private final @Nullable Input<List<ProjectSecondaryArtifactGetArgs>> secondaryArtifacts;

    public Input<List<ProjectSecondaryArtifactGetArgs>> getSecondaryArtifacts() {
        return this.secondaryArtifacts == null ? Input.empty() : this.secondaryArtifacts;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="secondarySourceVersions")
      private final @Nullable Input<List<ProjectSecondarySourceVersionGetArgs>> secondarySourceVersions;

    public Input<List<ProjectSecondarySourceVersionGetArgs>> getSecondarySourceVersions() {
        return this.secondarySourceVersions == null ? Input.empty() : this.secondarySourceVersions;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="secondarySources")
      private final @Nullable Input<List<ProjectSecondarySourceGetArgs>> secondarySources;

    public Input<List<ProjectSecondarySourceGetArgs>> getSecondarySources() {
        return this.secondarySources == null ? Input.empty() : this.secondarySources;
    }

    /**
     * Specifies the service role ARN for the batch build project.
     * 
     */
    @InputImport(name="serviceRole")
      private final @Nullable Input<String> serviceRole;

    public Input<String> getServiceRole() {
        return this.serviceRole == null ? Input.empty() : this.serviceRole;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="source")
      private final @Nullable Input<ProjectSourceGetArgs> source;

    public Input<ProjectSourceGetArgs> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    /**
     * The source version for the corresponding source identifier. See [AWS docs](https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ProjectSourceVersion.html#CodeBuild-Type-ProjectSourceVersion-sourceVersion) for more details.
     * 
     */
    @InputImport(name="sourceVersion")
      private final @Nullable Input<String> sourceVersion;

    public Input<String> getSourceVersion() {
        return this.sourceVersion == null ? Input.empty() : this.sourceVersion;
    }

    /**
     * Map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="vpcConfig")
      private final @Nullable Input<ProjectVpcConfigGetArgs> vpcConfig;

    public Input<ProjectVpcConfigGetArgs> getVpcConfig() {
        return this.vpcConfig == null ? Input.empty() : this.vpcConfig;
    }

    public ProjectState(
        @Nullable Input<String> arn,
        @Nullable Input<ProjectArtifactsGetArgs> artifacts,
        @Nullable Input<Boolean> badgeEnabled,
        @Nullable Input<String> badgeUrl,
        @Nullable Input<ProjectBuildBatchConfigGetArgs> buildBatchConfig,
        @Nullable Input<Integer> buildTimeout,
        @Nullable Input<ProjectCacheGetArgs> cache,
        @Nullable Input<Integer> concurrentBuildLimit,
        @Nullable Input<String> description,
        @Nullable Input<String> encryptionKey,
        @Nullable Input<ProjectEnvironmentGetArgs> environment,
        @Nullable Input<List<ProjectFileSystemLocationGetArgs>> fileSystemLocations,
        @Nullable Input<ProjectLogsConfigGetArgs> logsConfig,
        @Nullable Input<String> name,
        @Nullable Input<String> projectVisibility,
        @Nullable Input<String> publicProjectAlias,
        @Nullable Input<Integer> queuedTimeout,
        @Nullable Input<String> resourceAccessRole,
        @Nullable Input<List<ProjectSecondaryArtifactGetArgs>> secondaryArtifacts,
        @Nullable Input<List<ProjectSecondarySourceVersionGetArgs>> secondarySourceVersions,
        @Nullable Input<List<ProjectSecondarySourceGetArgs>> secondarySources,
        @Nullable Input<String> serviceRole,
        @Nullable Input<ProjectSourceGetArgs> source,
        @Nullable Input<String> sourceVersion,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<ProjectVpcConfigGetArgs> vpcConfig) {
        this.arn = arn;
        this.artifacts = artifacts;
        this.badgeEnabled = badgeEnabled;
        this.badgeUrl = badgeUrl;
        this.buildBatchConfig = buildBatchConfig;
        this.buildTimeout = buildTimeout;
        this.cache = cache;
        this.concurrentBuildLimit = concurrentBuildLimit;
        this.description = description;
        this.encryptionKey = encryptionKey;
        this.environment = environment;
        this.fileSystemLocations = fileSystemLocations;
        this.logsConfig = logsConfig;
        this.name = name;
        this.projectVisibility = projectVisibility;
        this.publicProjectAlias = publicProjectAlias;
        this.queuedTimeout = queuedTimeout;
        this.resourceAccessRole = resourceAccessRole;
        this.secondaryArtifacts = secondaryArtifacts;
        this.secondarySourceVersions = secondarySourceVersions;
        this.secondarySources = secondarySources;
        this.serviceRole = serviceRole;
        this.source = source;
        this.sourceVersion = sourceVersion;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpcConfig = vpcConfig;
    }

    private ProjectState() {
        this.arn = Input.empty();
        this.artifacts = Input.empty();
        this.badgeEnabled = Input.empty();
        this.badgeUrl = Input.empty();
        this.buildBatchConfig = Input.empty();
        this.buildTimeout = Input.empty();
        this.cache = Input.empty();
        this.concurrentBuildLimit = Input.empty();
        this.description = Input.empty();
        this.encryptionKey = Input.empty();
        this.environment = Input.empty();
        this.fileSystemLocations = Input.empty();
        this.logsConfig = Input.empty();
        this.name = Input.empty();
        this.projectVisibility = Input.empty();
        this.publicProjectAlias = Input.empty();
        this.queuedTimeout = Input.empty();
        this.resourceAccessRole = Input.empty();
        this.secondaryArtifacts = Input.empty();
        this.secondarySourceVersions = Input.empty();
        this.secondarySources = Input.empty();
        this.serviceRole = Input.empty();
        this.source = Input.empty();
        this.sourceVersion = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.vpcConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<ProjectArtifactsGetArgs> artifacts;
        private @Nullable Input<Boolean> badgeEnabled;
        private @Nullable Input<String> badgeUrl;
        private @Nullable Input<ProjectBuildBatchConfigGetArgs> buildBatchConfig;
        private @Nullable Input<Integer> buildTimeout;
        private @Nullable Input<ProjectCacheGetArgs> cache;
        private @Nullable Input<Integer> concurrentBuildLimit;
        private @Nullable Input<String> description;
        private @Nullable Input<String> encryptionKey;
        private @Nullable Input<ProjectEnvironmentGetArgs> environment;
        private @Nullable Input<List<ProjectFileSystemLocationGetArgs>> fileSystemLocations;
        private @Nullable Input<ProjectLogsConfigGetArgs> logsConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<String> projectVisibility;
        private @Nullable Input<String> publicProjectAlias;
        private @Nullable Input<Integer> queuedTimeout;
        private @Nullable Input<String> resourceAccessRole;
        private @Nullable Input<List<ProjectSecondaryArtifactGetArgs>> secondaryArtifacts;
        private @Nullable Input<List<ProjectSecondarySourceVersionGetArgs>> secondarySourceVersions;
        private @Nullable Input<List<ProjectSecondarySourceGetArgs>> secondarySources;
        private @Nullable Input<String> serviceRole;
        private @Nullable Input<ProjectSourceGetArgs> source;
        private @Nullable Input<String> sourceVersion;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<ProjectVpcConfigGetArgs> vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.artifacts = defaults.artifacts;
    	      this.badgeEnabled = defaults.badgeEnabled;
    	      this.badgeUrl = defaults.badgeUrl;
    	      this.buildBatchConfig = defaults.buildBatchConfig;
    	      this.buildTimeout = defaults.buildTimeout;
    	      this.cache = defaults.cache;
    	      this.concurrentBuildLimit = defaults.concurrentBuildLimit;
    	      this.description = defaults.description;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.environment = defaults.environment;
    	      this.fileSystemLocations = defaults.fileSystemLocations;
    	      this.logsConfig = defaults.logsConfig;
    	      this.name = defaults.name;
    	      this.projectVisibility = defaults.projectVisibility;
    	      this.publicProjectAlias = defaults.publicProjectAlias;
    	      this.queuedTimeout = defaults.queuedTimeout;
    	      this.resourceAccessRole = defaults.resourceAccessRole;
    	      this.secondaryArtifacts = defaults.secondaryArtifacts;
    	      this.secondarySourceVersions = defaults.secondarySourceVersions;
    	      this.secondarySources = defaults.secondarySources;
    	      this.serviceRole = defaults.serviceRole;
    	      this.source = defaults.source;
    	      this.sourceVersion = defaults.sourceVersion;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder artifacts(@Nullable Input<ProjectArtifactsGetArgs> artifacts) {
            this.artifacts = artifacts;
            return this;
        }

        public Builder artifacts(@Nullable ProjectArtifactsGetArgs artifacts) {
            this.artifacts = Input.ofNullable(artifacts);
            return this;
        }

        public Builder badgeEnabled(@Nullable Input<Boolean> badgeEnabled) {
            this.badgeEnabled = badgeEnabled;
            return this;
        }

        public Builder badgeEnabled(@Nullable Boolean badgeEnabled) {
            this.badgeEnabled = Input.ofNullable(badgeEnabled);
            return this;
        }

        public Builder badgeUrl(@Nullable Input<String> badgeUrl) {
            this.badgeUrl = badgeUrl;
            return this;
        }

        public Builder badgeUrl(@Nullable String badgeUrl) {
            this.badgeUrl = Input.ofNullable(badgeUrl);
            return this;
        }

        public Builder buildBatchConfig(@Nullable Input<ProjectBuildBatchConfigGetArgs> buildBatchConfig) {
            this.buildBatchConfig = buildBatchConfig;
            return this;
        }

        public Builder buildBatchConfig(@Nullable ProjectBuildBatchConfigGetArgs buildBatchConfig) {
            this.buildBatchConfig = Input.ofNullable(buildBatchConfig);
            return this;
        }

        public Builder buildTimeout(@Nullable Input<Integer> buildTimeout) {
            this.buildTimeout = buildTimeout;
            return this;
        }

        public Builder buildTimeout(@Nullable Integer buildTimeout) {
            this.buildTimeout = Input.ofNullable(buildTimeout);
            return this;
        }

        public Builder cache(@Nullable Input<ProjectCacheGetArgs> cache) {
            this.cache = cache;
            return this;
        }

        public Builder cache(@Nullable ProjectCacheGetArgs cache) {
            this.cache = Input.ofNullable(cache);
            return this;
        }

        public Builder concurrentBuildLimit(@Nullable Input<Integer> concurrentBuildLimit) {
            this.concurrentBuildLimit = concurrentBuildLimit;
            return this;
        }

        public Builder concurrentBuildLimit(@Nullable Integer concurrentBuildLimit) {
            this.concurrentBuildLimit = Input.ofNullable(concurrentBuildLimit);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder encryptionKey(@Nullable Input<String> encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        public Builder encryptionKey(@Nullable String encryptionKey) {
            this.encryptionKey = Input.ofNullable(encryptionKey);
            return this;
        }

        public Builder environment(@Nullable Input<ProjectEnvironmentGetArgs> environment) {
            this.environment = environment;
            return this;
        }

        public Builder environment(@Nullable ProjectEnvironmentGetArgs environment) {
            this.environment = Input.ofNullable(environment);
            return this;
        }

        public Builder fileSystemLocations(@Nullable Input<List<ProjectFileSystemLocationGetArgs>> fileSystemLocations) {
            this.fileSystemLocations = fileSystemLocations;
            return this;
        }

        public Builder fileSystemLocations(@Nullable List<ProjectFileSystemLocationGetArgs> fileSystemLocations) {
            this.fileSystemLocations = Input.ofNullable(fileSystemLocations);
            return this;
        }

        public Builder logsConfig(@Nullable Input<ProjectLogsConfigGetArgs> logsConfig) {
            this.logsConfig = logsConfig;
            return this;
        }

        public Builder logsConfig(@Nullable ProjectLogsConfigGetArgs logsConfig) {
            this.logsConfig = Input.ofNullable(logsConfig);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder projectVisibility(@Nullable Input<String> projectVisibility) {
            this.projectVisibility = projectVisibility;
            return this;
        }

        public Builder projectVisibility(@Nullable String projectVisibility) {
            this.projectVisibility = Input.ofNullable(projectVisibility);
            return this;
        }

        public Builder publicProjectAlias(@Nullable Input<String> publicProjectAlias) {
            this.publicProjectAlias = publicProjectAlias;
            return this;
        }

        public Builder publicProjectAlias(@Nullable String publicProjectAlias) {
            this.publicProjectAlias = Input.ofNullable(publicProjectAlias);
            return this;
        }

        public Builder queuedTimeout(@Nullable Input<Integer> queuedTimeout) {
            this.queuedTimeout = queuedTimeout;
            return this;
        }

        public Builder queuedTimeout(@Nullable Integer queuedTimeout) {
            this.queuedTimeout = Input.ofNullable(queuedTimeout);
            return this;
        }

        public Builder resourceAccessRole(@Nullable Input<String> resourceAccessRole) {
            this.resourceAccessRole = resourceAccessRole;
            return this;
        }

        public Builder resourceAccessRole(@Nullable String resourceAccessRole) {
            this.resourceAccessRole = Input.ofNullable(resourceAccessRole);
            return this;
        }

        public Builder secondaryArtifacts(@Nullable Input<List<ProjectSecondaryArtifactGetArgs>> secondaryArtifacts) {
            this.secondaryArtifacts = secondaryArtifacts;
            return this;
        }

        public Builder secondaryArtifacts(@Nullable List<ProjectSecondaryArtifactGetArgs> secondaryArtifacts) {
            this.secondaryArtifacts = Input.ofNullable(secondaryArtifacts);
            return this;
        }

        public Builder secondarySourceVersions(@Nullable Input<List<ProjectSecondarySourceVersionGetArgs>> secondarySourceVersions) {
            this.secondarySourceVersions = secondarySourceVersions;
            return this;
        }

        public Builder secondarySourceVersions(@Nullable List<ProjectSecondarySourceVersionGetArgs> secondarySourceVersions) {
            this.secondarySourceVersions = Input.ofNullable(secondarySourceVersions);
            return this;
        }

        public Builder secondarySources(@Nullable Input<List<ProjectSecondarySourceGetArgs>> secondarySources) {
            this.secondarySources = secondarySources;
            return this;
        }

        public Builder secondarySources(@Nullable List<ProjectSecondarySourceGetArgs> secondarySources) {
            this.secondarySources = Input.ofNullable(secondarySources);
            return this;
        }

        public Builder serviceRole(@Nullable Input<String> serviceRole) {
            this.serviceRole = serviceRole;
            return this;
        }

        public Builder serviceRole(@Nullable String serviceRole) {
            this.serviceRole = Input.ofNullable(serviceRole);
            return this;
        }

        public Builder source(@Nullable Input<ProjectSourceGetArgs> source) {
            this.source = source;
            return this;
        }

        public Builder source(@Nullable ProjectSourceGetArgs source) {
            this.source = Input.ofNullable(source);
            return this;
        }

        public Builder sourceVersion(@Nullable Input<String> sourceVersion) {
            this.sourceVersion = sourceVersion;
            return this;
        }

        public Builder sourceVersion(@Nullable String sourceVersion) {
            this.sourceVersion = Input.ofNullable(sourceVersion);
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

        public Builder vpcConfig(@Nullable Input<ProjectVpcConfigGetArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public Builder vpcConfig(@Nullable ProjectVpcConfigGetArgs vpcConfig) {
            this.vpcConfig = Input.ofNullable(vpcConfig);
            return this;
        }
        public ProjectState build() {
            return new ProjectState(arn, artifacts, badgeEnabled, badgeUrl, buildBatchConfig, buildTimeout, cache, concurrentBuildLimit, description, encryptionKey, environment, fileSystemLocations, logsConfig, name, projectVisibility, publicProjectAlias, queuedTimeout, resourceAccessRole, secondaryArtifacts, secondarySourceVersions, secondarySources, serviceRole, source, sourceVersion, tags, tagsAll, vpcConfig);
        }
    }
}
