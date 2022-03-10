// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplify.outputs;

import io.pulumi.awsnative.amplify.enums.BranchStage;
import io.pulumi.awsnative.amplify.outputs.BranchEnvironmentVariable;
import io.pulumi.awsnative.amplify.outputs.BranchTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBranchResult {
    private final @Nullable String arn;
    private final @Nullable String buildSpec;
    private final @Nullable String description;
    private final @Nullable Boolean enableAutoBuild;
    private final @Nullable Boolean enablePerformanceMode;
    private final @Nullable Boolean enablePullRequestPreview;
    private final @Nullable List<BranchEnvironmentVariable> environmentVariables;
    private final @Nullable String pullRequestEnvironmentName;
    private final @Nullable BranchStage stage;
    private final @Nullable List<BranchTag> tags;

    @OutputCustomType.Constructor
    private GetBranchResult(
        @OutputCustomType.Parameter("arn") @Nullable String arn,
        @OutputCustomType.Parameter("buildSpec") @Nullable String buildSpec,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("enableAutoBuild") @Nullable Boolean enableAutoBuild,
        @OutputCustomType.Parameter("enablePerformanceMode") @Nullable Boolean enablePerformanceMode,
        @OutputCustomType.Parameter("enablePullRequestPreview") @Nullable Boolean enablePullRequestPreview,
        @OutputCustomType.Parameter("environmentVariables") @Nullable List<BranchEnvironmentVariable> environmentVariables,
        @OutputCustomType.Parameter("pullRequestEnvironmentName") @Nullable String pullRequestEnvironmentName,
        @OutputCustomType.Parameter("stage") @Nullable BranchStage stage,
        @OutputCustomType.Parameter("tags") @Nullable List<BranchTag> tags) {
        this.arn = arn;
        this.buildSpec = buildSpec;
        this.description = description;
        this.enableAutoBuild = enableAutoBuild;
        this.enablePerformanceMode = enablePerformanceMode;
        this.enablePullRequestPreview = enablePullRequestPreview;
        this.environmentVariables = environmentVariables;
        this.pullRequestEnvironmentName = pullRequestEnvironmentName;
        this.stage = stage;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getBuildSpec() {
        return Optional.ofNullable(this.buildSpec);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<Boolean> getEnableAutoBuild() {
        return Optional.ofNullable(this.enableAutoBuild);
    }
    public Optional<Boolean> getEnablePerformanceMode() {
        return Optional.ofNullable(this.enablePerformanceMode);
    }
    public Optional<Boolean> getEnablePullRequestPreview() {
        return Optional.ofNullable(this.enablePullRequestPreview);
    }
    public List<BranchEnvironmentVariable> getEnvironmentVariables() {
        return this.environmentVariables == null ? List.of() : this.environmentVariables;
    }
    public Optional<String> getPullRequestEnvironmentName() {
        return Optional.ofNullable(this.pullRequestEnvironmentName);
    }
    public Optional<BranchStage> getStage() {
        return Optional.ofNullable(this.stage);
    }
    public List<BranchTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBranchResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String buildSpec;
        private @Nullable String description;
        private @Nullable Boolean enableAutoBuild;
        private @Nullable Boolean enablePerformanceMode;
        private @Nullable Boolean enablePullRequestPreview;
        private @Nullable List<BranchEnvironmentVariable> environmentVariables;
        private @Nullable String pullRequestEnvironmentName;
        private @Nullable BranchStage stage;
        private @Nullable List<BranchTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBranchResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.buildSpec = defaults.buildSpec;
    	      this.description = defaults.description;
    	      this.enableAutoBuild = defaults.enableAutoBuild;
    	      this.enablePerformanceMode = defaults.enablePerformanceMode;
    	      this.enablePullRequestPreview = defaults.enablePullRequestPreview;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.pullRequestEnvironmentName = defaults.pullRequestEnvironmentName;
    	      this.stage = defaults.stage;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder buildSpec(@Nullable String buildSpec) {
            this.buildSpec = buildSpec;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder enableAutoBuild(@Nullable Boolean enableAutoBuild) {
            this.enableAutoBuild = enableAutoBuild;
            return this;
        }

        public Builder enablePerformanceMode(@Nullable Boolean enablePerformanceMode) {
            this.enablePerformanceMode = enablePerformanceMode;
            return this;
        }

        public Builder enablePullRequestPreview(@Nullable Boolean enablePullRequestPreview) {
            this.enablePullRequestPreview = enablePullRequestPreview;
            return this;
        }

        public Builder environmentVariables(@Nullable List<BranchEnvironmentVariable> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder pullRequestEnvironmentName(@Nullable String pullRequestEnvironmentName) {
            this.pullRequestEnvironmentName = pullRequestEnvironmentName;
            return this;
        }

        public Builder stage(@Nullable BranchStage stage) {
            this.stage = stage;
            return this;
        }

        public Builder tags(@Nullable List<BranchTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetBranchResult build() {
            return new GetBranchResult(arn, buildSpec, description, enableAutoBuild, enablePerformanceMode, enablePullRequestPreview, environmentVariables, pullRequestEnvironmentName, stage, tags);
        }
    }
}
