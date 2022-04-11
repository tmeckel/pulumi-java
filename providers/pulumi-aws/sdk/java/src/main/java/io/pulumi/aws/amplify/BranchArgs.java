// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.amplify;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BranchArgs extends io.pulumi.resources.ResourceArgs {

    public static final BranchArgs Empty = new BranchArgs();

    /**
     * The unique ID for an Amplify app.
     * 
     */
    @Import(name="appId", required=true)
      private final Output<String> appId;

    public Output<String> getAppId() {
        return this.appId;
    }

    /**
     * The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app.
     * 
     */
    @Import(name="backendEnvironmentArn")
      private final @Nullable Output<String> backendEnvironmentArn;

    public Output<String> getBackendEnvironmentArn() {
        return this.backendEnvironmentArn == null ? Codegen.empty() : this.backendEnvironmentArn;
    }

    /**
     * The basic authorization credentials for the branch.
     * 
     */
    @Import(name="basicAuthCredentials")
      private final @Nullable Output<String> basicAuthCredentials;

    public Output<String> getBasicAuthCredentials() {
        return this.basicAuthCredentials == null ? Codegen.empty() : this.basicAuthCredentials;
    }

    /**
     * The name for the branch.
     * 
     */
    @Import(name="branchName", required=true)
      private final Output<String> branchName;

    public Output<String> getBranchName() {
        return this.branchName;
    }

    /**
     * The description for the branch.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The display name for a branch. This is used as the default domain prefix.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Enables auto building for the branch.
     * 
     */
    @Import(name="enableAutoBuild")
      private final @Nullable Output<Boolean> enableAutoBuild;

    public Output<Boolean> getEnableAutoBuild() {
        return this.enableAutoBuild == null ? Codegen.empty() : this.enableAutoBuild;
    }

    /**
     * Enables basic authorization for the branch.
     * 
     */
    @Import(name="enableBasicAuth")
      private final @Nullable Output<Boolean> enableBasicAuth;

    public Output<Boolean> getEnableBasicAuth() {
        return this.enableBasicAuth == null ? Codegen.empty() : this.enableBasicAuth;
    }

    /**
     * Enables notifications for the branch.
     * 
     */
    @Import(name="enableNotification")
      private final @Nullable Output<Boolean> enableNotification;

    public Output<Boolean> getEnableNotification() {
        return this.enableNotification == null ? Codegen.empty() : this.enableNotification;
    }

    /**
     * Enables performance mode for the branch.
     * 
     */
    @Import(name="enablePerformanceMode")
      private final @Nullable Output<Boolean> enablePerformanceMode;

    public Output<Boolean> getEnablePerformanceMode() {
        return this.enablePerformanceMode == null ? Codegen.empty() : this.enablePerformanceMode;
    }

    /**
     * Enables pull request previews for this branch.
     * 
     */
    @Import(name="enablePullRequestPreview")
      private final @Nullable Output<Boolean> enablePullRequestPreview;

    public Output<Boolean> getEnablePullRequestPreview() {
        return this.enablePullRequestPreview == null ? Codegen.empty() : this.enablePullRequestPreview;
    }

    /**
     * The environment variables for the branch.
     * 
     */
    @Import(name="environmentVariables")
      private final @Nullable Output<Map<String,String>> environmentVariables;

    public Output<Map<String,String>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Codegen.empty() : this.environmentVariables;
    }

    /**
     * The framework for the branch.
     * 
     */
    @Import(name="framework")
      private final @Nullable Output<String> framework;

    public Output<String> getFramework() {
        return this.framework == null ? Codegen.empty() : this.framework;
    }

    /**
     * The Amplify environment name for the pull request.
     * 
     */
    @Import(name="pullRequestEnvironmentName")
      private final @Nullable Output<String> pullRequestEnvironmentName;

    public Output<String> getPullRequestEnvironmentName() {
        return this.pullRequestEnvironmentName == null ? Codegen.empty() : this.pullRequestEnvironmentName;
    }

    /**
     * Describes the current stage for the branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
     * 
     */
    @Import(name="stage")
      private final @Nullable Output<String> stage;

    public Output<String> getStage() {
        return this.stage == null ? Codegen.empty() : this.stage;
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The content Time To Live (TTL) for the website in seconds.
     * 
     */
    @Import(name="ttl")
      private final @Nullable Output<String> ttl;

    public Output<String> getTtl() {
        return this.ttl == null ? Codegen.empty() : this.ttl;
    }

    public BranchArgs(
        Output<String> appId,
        @Nullable Output<String> backendEnvironmentArn,
        @Nullable Output<String> basicAuthCredentials,
        Output<String> branchName,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<Boolean> enableAutoBuild,
        @Nullable Output<Boolean> enableBasicAuth,
        @Nullable Output<Boolean> enableNotification,
        @Nullable Output<Boolean> enablePerformanceMode,
        @Nullable Output<Boolean> enablePullRequestPreview,
        @Nullable Output<Map<String,String>> environmentVariables,
        @Nullable Output<String> framework,
        @Nullable Output<String> pullRequestEnvironmentName,
        @Nullable Output<String> stage,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> ttl) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.backendEnvironmentArn = backendEnvironmentArn;
        this.basicAuthCredentials = basicAuthCredentials;
        this.branchName = Objects.requireNonNull(branchName, "expected parameter 'branchName' to be non-null");
        this.description = description;
        this.displayName = displayName;
        this.enableAutoBuild = enableAutoBuild;
        this.enableBasicAuth = enableBasicAuth;
        this.enableNotification = enableNotification;
        this.enablePerformanceMode = enablePerformanceMode;
        this.enablePullRequestPreview = enablePullRequestPreview;
        this.environmentVariables = environmentVariables;
        this.framework = framework;
        this.pullRequestEnvironmentName = pullRequestEnvironmentName;
        this.stage = stage;
        this.tags = tags;
        this.ttl = ttl;
    }

    private BranchArgs() {
        this.appId = Codegen.empty();
        this.backendEnvironmentArn = Codegen.empty();
        this.basicAuthCredentials = Codegen.empty();
        this.branchName = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.enableAutoBuild = Codegen.empty();
        this.enableBasicAuth = Codegen.empty();
        this.enableNotification = Codegen.empty();
        this.enablePerformanceMode = Codegen.empty();
        this.enablePullRequestPreview = Codegen.empty();
        this.environmentVariables = Codegen.empty();
        this.framework = Codegen.empty();
        this.pullRequestEnvironmentName = Codegen.empty();
        this.stage = Codegen.empty();
        this.tags = Codegen.empty();
        this.ttl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BranchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> appId;
        private @Nullable Output<String> backendEnvironmentArn;
        private @Nullable Output<String> basicAuthCredentials;
        private Output<String> branchName;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<Boolean> enableAutoBuild;
        private @Nullable Output<Boolean> enableBasicAuth;
        private @Nullable Output<Boolean> enableNotification;
        private @Nullable Output<Boolean> enablePerformanceMode;
        private @Nullable Output<Boolean> enablePullRequestPreview;
        private @Nullable Output<Map<String,String>> environmentVariables;
        private @Nullable Output<String> framework;
        private @Nullable Output<String> pullRequestEnvironmentName;
        private @Nullable Output<String> stage;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(BranchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.backendEnvironmentArn = defaults.backendEnvironmentArn;
    	      this.basicAuthCredentials = defaults.basicAuthCredentials;
    	      this.branchName = defaults.branchName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enableAutoBuild = defaults.enableAutoBuild;
    	      this.enableBasicAuth = defaults.enableBasicAuth;
    	      this.enableNotification = defaults.enableNotification;
    	      this.enablePerformanceMode = defaults.enablePerformanceMode;
    	      this.enablePullRequestPreview = defaults.enablePullRequestPreview;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.framework = defaults.framework;
    	      this.pullRequestEnvironmentName = defaults.pullRequestEnvironmentName;
    	      this.stage = defaults.stage;
    	      this.tags = defaults.tags;
    	      this.ttl = defaults.ttl;
        }

        public Builder appId(Output<String> appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        public Builder appId(String appId) {
            this.appId = Output.of(Objects.requireNonNull(appId));
            return this;
        }
        public Builder backendEnvironmentArn(@Nullable Output<String> backendEnvironmentArn) {
            this.backendEnvironmentArn = backendEnvironmentArn;
            return this;
        }
        public Builder backendEnvironmentArn(@Nullable String backendEnvironmentArn) {
            this.backendEnvironmentArn = Codegen.ofNullable(backendEnvironmentArn);
            return this;
        }
        public Builder basicAuthCredentials(@Nullable Output<String> basicAuthCredentials) {
            this.basicAuthCredentials = basicAuthCredentials;
            return this;
        }
        public Builder basicAuthCredentials(@Nullable String basicAuthCredentials) {
            this.basicAuthCredentials = Codegen.ofNullable(basicAuthCredentials);
            return this;
        }
        public Builder branchName(Output<String> branchName) {
            this.branchName = Objects.requireNonNull(branchName);
            return this;
        }
        public Builder branchName(String branchName) {
            this.branchName = Output.of(Objects.requireNonNull(branchName));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder enableAutoBuild(@Nullable Output<Boolean> enableAutoBuild) {
            this.enableAutoBuild = enableAutoBuild;
            return this;
        }
        public Builder enableAutoBuild(@Nullable Boolean enableAutoBuild) {
            this.enableAutoBuild = Codegen.ofNullable(enableAutoBuild);
            return this;
        }
        public Builder enableBasicAuth(@Nullable Output<Boolean> enableBasicAuth) {
            this.enableBasicAuth = enableBasicAuth;
            return this;
        }
        public Builder enableBasicAuth(@Nullable Boolean enableBasicAuth) {
            this.enableBasicAuth = Codegen.ofNullable(enableBasicAuth);
            return this;
        }
        public Builder enableNotification(@Nullable Output<Boolean> enableNotification) {
            this.enableNotification = enableNotification;
            return this;
        }
        public Builder enableNotification(@Nullable Boolean enableNotification) {
            this.enableNotification = Codegen.ofNullable(enableNotification);
            return this;
        }
        public Builder enablePerformanceMode(@Nullable Output<Boolean> enablePerformanceMode) {
            this.enablePerformanceMode = enablePerformanceMode;
            return this;
        }
        public Builder enablePerformanceMode(@Nullable Boolean enablePerformanceMode) {
            this.enablePerformanceMode = Codegen.ofNullable(enablePerformanceMode);
            return this;
        }
        public Builder enablePullRequestPreview(@Nullable Output<Boolean> enablePullRequestPreview) {
            this.enablePullRequestPreview = enablePullRequestPreview;
            return this;
        }
        public Builder enablePullRequestPreview(@Nullable Boolean enablePullRequestPreview) {
            this.enablePullRequestPreview = Codegen.ofNullable(enablePullRequestPreview);
            return this;
        }
        public Builder environmentVariables(@Nullable Output<Map<String,String>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder environmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = Codegen.ofNullable(environmentVariables);
            return this;
        }
        public Builder framework(@Nullable Output<String> framework) {
            this.framework = framework;
            return this;
        }
        public Builder framework(@Nullable String framework) {
            this.framework = Codegen.ofNullable(framework);
            return this;
        }
        public Builder pullRequestEnvironmentName(@Nullable Output<String> pullRequestEnvironmentName) {
            this.pullRequestEnvironmentName = pullRequestEnvironmentName;
            return this;
        }
        public Builder pullRequestEnvironmentName(@Nullable String pullRequestEnvironmentName) {
            this.pullRequestEnvironmentName = Codegen.ofNullable(pullRequestEnvironmentName);
            return this;
        }
        public Builder stage(@Nullable Output<String> stage) {
            this.stage = stage;
            return this;
        }
        public Builder stage(@Nullable String stage) {
            this.stage = Codegen.ofNullable(stage);
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
        public Builder ttl(@Nullable Output<String> ttl) {
            this.ttl = ttl;
            return this;
        }
        public Builder ttl(@Nullable String ttl) {
            this.ttl = Codegen.ofNullable(ttl);
            return this;
        }        public BranchArgs build() {
            return new BranchArgs(appId, backendEnvironmentArn, basicAuthCredentials, branchName, description, displayName, enableAutoBuild, enableBasicAuth, enableNotification, enablePerformanceMode, enablePullRequestPreview, environmentVariables, framework, pullRequestEnvironmentName, stage, tags, ttl);
        }
    }
}
