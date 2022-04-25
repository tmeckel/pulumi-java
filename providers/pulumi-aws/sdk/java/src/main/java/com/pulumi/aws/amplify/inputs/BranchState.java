// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amplify.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BranchState extends com.pulumi.resources.ResourceArgs {

    public static final BranchState Empty = new BranchState();

    /**
     * The unique ID for an Amplify app.
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    /**
     * @return The unique ID for an Amplify app.
     * 
     */
    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * The Amazon Resource Name (ARN) for the branch.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) for the branch.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * A list of custom resources that are linked to this branch.
     * 
     */
    @Import(name="associatedResources")
    private @Nullable Output<List<String>> associatedResources;

    /**
     * @return A list of custom resources that are linked to this branch.
     * 
     */
    public Optional<Output<List<String>>> associatedResources() {
        return Optional.ofNullable(this.associatedResources);
    }

    /**
     * The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app.
     * 
     */
    @Import(name="backendEnvironmentArn")
    private @Nullable Output<String> backendEnvironmentArn;

    /**
     * @return The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app.
     * 
     */
    public Optional<Output<String>> backendEnvironmentArn() {
        return Optional.ofNullable(this.backendEnvironmentArn);
    }

    /**
     * The basic authorization credentials for the branch.
     * 
     */
    @Import(name="basicAuthCredentials")
    private @Nullable Output<String> basicAuthCredentials;

    /**
     * @return The basic authorization credentials for the branch.
     * 
     */
    public Optional<Output<String>> basicAuthCredentials() {
        return Optional.ofNullable(this.basicAuthCredentials);
    }

    /**
     * The name for the branch.
     * 
     */
    @Import(name="branchName")
    private @Nullable Output<String> branchName;

    /**
     * @return The name for the branch.
     * 
     */
    public Optional<Output<String>> branchName() {
        return Optional.ofNullable(this.branchName);
    }

    /**
     * The custom domains for the branch.
     * 
     */
    @Import(name="customDomains")
    private @Nullable Output<List<String>> customDomains;

    /**
     * @return The custom domains for the branch.
     * 
     */
    public Optional<Output<List<String>>> customDomains() {
        return Optional.ofNullable(this.customDomains);
    }

    /**
     * The description for the branch.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for the branch.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The destination branch if the branch is a pull request branch.
     * 
     */
    @Import(name="destinationBranch")
    private @Nullable Output<String> destinationBranch;

    /**
     * @return The destination branch if the branch is a pull request branch.
     * 
     */
    public Optional<Output<String>> destinationBranch() {
        return Optional.ofNullable(this.destinationBranch);
    }

    /**
     * The display name for a branch. This is used as the default domain prefix.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The display name for a branch. This is used as the default domain prefix.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Enables auto building for the branch.
     * 
     */
    @Import(name="enableAutoBuild")
    private @Nullable Output<Boolean> enableAutoBuild;

    /**
     * @return Enables auto building for the branch.
     * 
     */
    public Optional<Output<Boolean>> enableAutoBuild() {
        return Optional.ofNullable(this.enableAutoBuild);
    }

    /**
     * Enables basic authorization for the branch.
     * 
     */
    @Import(name="enableBasicAuth")
    private @Nullable Output<Boolean> enableBasicAuth;

    /**
     * @return Enables basic authorization for the branch.
     * 
     */
    public Optional<Output<Boolean>> enableBasicAuth() {
        return Optional.ofNullable(this.enableBasicAuth);
    }

    /**
     * Enables notifications for the branch.
     * 
     */
    @Import(name="enableNotification")
    private @Nullable Output<Boolean> enableNotification;

    /**
     * @return Enables notifications for the branch.
     * 
     */
    public Optional<Output<Boolean>> enableNotification() {
        return Optional.ofNullable(this.enableNotification);
    }

    /**
     * Enables performance mode for the branch.
     * 
     */
    @Import(name="enablePerformanceMode")
    private @Nullable Output<Boolean> enablePerformanceMode;

    /**
     * @return Enables performance mode for the branch.
     * 
     */
    public Optional<Output<Boolean>> enablePerformanceMode() {
        return Optional.ofNullable(this.enablePerformanceMode);
    }

    /**
     * Enables pull request previews for this branch.
     * 
     */
    @Import(name="enablePullRequestPreview")
    private @Nullable Output<Boolean> enablePullRequestPreview;

    /**
     * @return Enables pull request previews for this branch.
     * 
     */
    public Optional<Output<Boolean>> enablePullRequestPreview() {
        return Optional.ofNullable(this.enablePullRequestPreview);
    }

    /**
     * The environment variables for the branch.
     * 
     */
    @Import(name="environmentVariables")
    private @Nullable Output<Map<String,String>> environmentVariables;

    /**
     * @return The environment variables for the branch.
     * 
     */
    public Optional<Output<Map<String,String>>> environmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }

    /**
     * The framework for the branch.
     * 
     */
    @Import(name="framework")
    private @Nullable Output<String> framework;

    /**
     * @return The framework for the branch.
     * 
     */
    public Optional<Output<String>> framework() {
        return Optional.ofNullable(this.framework);
    }

    /**
     * The Amplify environment name for the pull request.
     * 
     */
    @Import(name="pullRequestEnvironmentName")
    private @Nullable Output<String> pullRequestEnvironmentName;

    /**
     * @return The Amplify environment name for the pull request.
     * 
     */
    public Optional<Output<String>> pullRequestEnvironmentName() {
        return Optional.ofNullable(this.pullRequestEnvironmentName);
    }

    /**
     * The source branch if the branch is a pull request branch.
     * 
     */
    @Import(name="sourceBranch")
    private @Nullable Output<String> sourceBranch;

    /**
     * @return The source branch if the branch is a pull request branch.
     * 
     */
    public Optional<Output<String>> sourceBranch() {
        return Optional.ofNullable(this.sourceBranch);
    }

    /**
     * Describes the current stage for the branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
     * 
     */
    @Import(name="stage")
    private @Nullable Output<String> stage;

    /**
     * @return Describes the current stage for the branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
     * 
     */
    public Optional<Output<String>> stage() {
        return Optional.ofNullable(this.stage);
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The content Time To Live (TTL) for the website in seconds.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<String> ttl;

    /**
     * @return The content Time To Live (TTL) for the website in seconds.
     * 
     */
    public Optional<Output<String>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    private BranchState() {}

    private BranchState(BranchState $) {
        this.appId = $.appId;
        this.arn = $.arn;
        this.associatedResources = $.associatedResources;
        this.backendEnvironmentArn = $.backendEnvironmentArn;
        this.basicAuthCredentials = $.basicAuthCredentials;
        this.branchName = $.branchName;
        this.customDomains = $.customDomains;
        this.description = $.description;
        this.destinationBranch = $.destinationBranch;
        this.displayName = $.displayName;
        this.enableAutoBuild = $.enableAutoBuild;
        this.enableBasicAuth = $.enableBasicAuth;
        this.enableNotification = $.enableNotification;
        this.enablePerformanceMode = $.enablePerformanceMode;
        this.enablePullRequestPreview = $.enablePullRequestPreview;
        this.environmentVariables = $.environmentVariables;
        this.framework = $.framework;
        this.pullRequestEnvironmentName = $.pullRequestEnvironmentName;
        this.sourceBranch = $.sourceBranch;
        this.stage = $.stage;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.ttl = $.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BranchState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BranchState $;

        public Builder() {
            $ = new BranchState();
        }

        public Builder(BranchState defaults) {
            $ = new BranchState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The unique ID for an Amplify app.
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The unique ID for an Amplify app.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) for the branch.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) for the branch.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param associatedResources A list of custom resources that are linked to this branch.
         * 
         * @return builder
         * 
         */
        public Builder associatedResources(@Nullable Output<List<String>> associatedResources) {
            $.associatedResources = associatedResources;
            return this;
        }

        /**
         * @param associatedResources A list of custom resources that are linked to this branch.
         * 
         * @return builder
         * 
         */
        public Builder associatedResources(List<String> associatedResources) {
            return associatedResources(Output.of(associatedResources));
        }

        /**
         * @param associatedResources A list of custom resources that are linked to this branch.
         * 
         * @return builder
         * 
         */
        public Builder associatedResources(String... associatedResources) {
            return associatedResources(List.of(associatedResources));
        }

        /**
         * @param backendEnvironmentArn The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app.
         * 
         * @return builder
         * 
         */
        public Builder backendEnvironmentArn(@Nullable Output<String> backendEnvironmentArn) {
            $.backendEnvironmentArn = backendEnvironmentArn;
            return this;
        }

        /**
         * @param backendEnvironmentArn The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app.
         * 
         * @return builder
         * 
         */
        public Builder backendEnvironmentArn(String backendEnvironmentArn) {
            return backendEnvironmentArn(Output.of(backendEnvironmentArn));
        }

        /**
         * @param basicAuthCredentials The basic authorization credentials for the branch.
         * 
         * @return builder
         * 
         */
        public Builder basicAuthCredentials(@Nullable Output<String> basicAuthCredentials) {
            $.basicAuthCredentials = basicAuthCredentials;
            return this;
        }

        /**
         * @param basicAuthCredentials The basic authorization credentials for the branch.
         * 
         * @return builder
         * 
         */
        public Builder basicAuthCredentials(String basicAuthCredentials) {
            return basicAuthCredentials(Output.of(basicAuthCredentials));
        }

        /**
         * @param branchName The name for the branch.
         * 
         * @return builder
         * 
         */
        public Builder branchName(@Nullable Output<String> branchName) {
            $.branchName = branchName;
            return this;
        }

        /**
         * @param branchName The name for the branch.
         * 
         * @return builder
         * 
         */
        public Builder branchName(String branchName) {
            return branchName(Output.of(branchName));
        }

        /**
         * @param customDomains The custom domains for the branch.
         * 
         * @return builder
         * 
         */
        public Builder customDomains(@Nullable Output<List<String>> customDomains) {
            $.customDomains = customDomains;
            return this;
        }

        /**
         * @param customDomains The custom domains for the branch.
         * 
         * @return builder
         * 
         */
        public Builder customDomains(List<String> customDomains) {
            return customDomains(Output.of(customDomains));
        }

        /**
         * @param customDomains The custom domains for the branch.
         * 
         * @return builder
         * 
         */
        public Builder customDomains(String... customDomains) {
            return customDomains(List.of(customDomains));
        }

        /**
         * @param description The description for the branch.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for the branch.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param destinationBranch The destination branch if the branch is a pull request branch.
         * 
         * @return builder
         * 
         */
        public Builder destinationBranch(@Nullable Output<String> destinationBranch) {
            $.destinationBranch = destinationBranch;
            return this;
        }

        /**
         * @param destinationBranch The destination branch if the branch is a pull request branch.
         * 
         * @return builder
         * 
         */
        public Builder destinationBranch(String destinationBranch) {
            return destinationBranch(Output.of(destinationBranch));
        }

        /**
         * @param displayName The display name for a branch. This is used as the default domain prefix.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name for a branch. This is used as the default domain prefix.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param enableAutoBuild Enables auto building for the branch.
         * 
         * @return builder
         * 
         */
        public Builder enableAutoBuild(@Nullable Output<Boolean> enableAutoBuild) {
            $.enableAutoBuild = enableAutoBuild;
            return this;
        }

        /**
         * @param enableAutoBuild Enables auto building for the branch.
         * 
         * @return builder
         * 
         */
        public Builder enableAutoBuild(Boolean enableAutoBuild) {
            return enableAutoBuild(Output.of(enableAutoBuild));
        }

        /**
         * @param enableBasicAuth Enables basic authorization for the branch.
         * 
         * @return builder
         * 
         */
        public Builder enableBasicAuth(@Nullable Output<Boolean> enableBasicAuth) {
            $.enableBasicAuth = enableBasicAuth;
            return this;
        }

        /**
         * @param enableBasicAuth Enables basic authorization for the branch.
         * 
         * @return builder
         * 
         */
        public Builder enableBasicAuth(Boolean enableBasicAuth) {
            return enableBasicAuth(Output.of(enableBasicAuth));
        }

        /**
         * @param enableNotification Enables notifications for the branch.
         * 
         * @return builder
         * 
         */
        public Builder enableNotification(@Nullable Output<Boolean> enableNotification) {
            $.enableNotification = enableNotification;
            return this;
        }

        /**
         * @param enableNotification Enables notifications for the branch.
         * 
         * @return builder
         * 
         */
        public Builder enableNotification(Boolean enableNotification) {
            return enableNotification(Output.of(enableNotification));
        }

        /**
         * @param enablePerformanceMode Enables performance mode for the branch.
         * 
         * @return builder
         * 
         */
        public Builder enablePerformanceMode(@Nullable Output<Boolean> enablePerformanceMode) {
            $.enablePerformanceMode = enablePerformanceMode;
            return this;
        }

        /**
         * @param enablePerformanceMode Enables performance mode for the branch.
         * 
         * @return builder
         * 
         */
        public Builder enablePerformanceMode(Boolean enablePerformanceMode) {
            return enablePerformanceMode(Output.of(enablePerformanceMode));
        }

        /**
         * @param enablePullRequestPreview Enables pull request previews for this branch.
         * 
         * @return builder
         * 
         */
        public Builder enablePullRequestPreview(@Nullable Output<Boolean> enablePullRequestPreview) {
            $.enablePullRequestPreview = enablePullRequestPreview;
            return this;
        }

        /**
         * @param enablePullRequestPreview Enables pull request previews for this branch.
         * 
         * @return builder
         * 
         */
        public Builder enablePullRequestPreview(Boolean enablePullRequestPreview) {
            return enablePullRequestPreview(Output.of(enablePullRequestPreview));
        }

        /**
         * @param environmentVariables The environment variables for the branch.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(@Nullable Output<Map<String,String>> environmentVariables) {
            $.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * @param environmentVariables The environment variables for the branch.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(Map<String,String> environmentVariables) {
            return environmentVariables(Output.of(environmentVariables));
        }

        /**
         * @param framework The framework for the branch.
         * 
         * @return builder
         * 
         */
        public Builder framework(@Nullable Output<String> framework) {
            $.framework = framework;
            return this;
        }

        /**
         * @param framework The framework for the branch.
         * 
         * @return builder
         * 
         */
        public Builder framework(String framework) {
            return framework(Output.of(framework));
        }

        /**
         * @param pullRequestEnvironmentName The Amplify environment name for the pull request.
         * 
         * @return builder
         * 
         */
        public Builder pullRequestEnvironmentName(@Nullable Output<String> pullRequestEnvironmentName) {
            $.pullRequestEnvironmentName = pullRequestEnvironmentName;
            return this;
        }

        /**
         * @param pullRequestEnvironmentName The Amplify environment name for the pull request.
         * 
         * @return builder
         * 
         */
        public Builder pullRequestEnvironmentName(String pullRequestEnvironmentName) {
            return pullRequestEnvironmentName(Output.of(pullRequestEnvironmentName));
        }

        /**
         * @param sourceBranch The source branch if the branch is a pull request branch.
         * 
         * @return builder
         * 
         */
        public Builder sourceBranch(@Nullable Output<String> sourceBranch) {
            $.sourceBranch = sourceBranch;
            return this;
        }

        /**
         * @param sourceBranch The source branch if the branch is a pull request branch.
         * 
         * @return builder
         * 
         */
        public Builder sourceBranch(String sourceBranch) {
            return sourceBranch(Output.of(sourceBranch));
        }

        /**
         * @param stage Describes the current stage for the branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
         * 
         * @return builder
         * 
         */
        public Builder stage(@Nullable Output<String> stage) {
            $.stage = stage;
            return this;
        }

        /**
         * @param stage Describes the current stage for the branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
         * 
         * @return builder
         * 
         */
        public Builder stage(String stage) {
            return stage(Output.of(stage));
        }

        /**
         * @param tags Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param ttl The content Time To Live (TTL) for the website in seconds.
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<String> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl The content Time To Live (TTL) for the website in seconds.
         * 
         * @return builder
         * 
         */
        public Builder ttl(String ttl) {
            return ttl(Output.of(ttl));
        }

        public BranchState build() {
            return $;
        }
    }

}
