// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.inputs.NetworkInsightsAccessScopeAccessScopePathRequestArgs;
import io.pulumi.awsnative.ec2.inputs.NetworkInsightsAccessScopeTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkInsightsAccessScopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInsightsAccessScopeArgs Empty = new NetworkInsightsAccessScopeArgs();

    @Import(name="excludePaths")
      private final @Nullable Output<List<NetworkInsightsAccessScopeAccessScopePathRequestArgs>> excludePaths;

    public Output<List<NetworkInsightsAccessScopeAccessScopePathRequestArgs>> getExcludePaths() {
        return this.excludePaths == null ? Codegen.empty() : this.excludePaths;
    }

    @Import(name="matchPaths")
      private final @Nullable Output<List<NetworkInsightsAccessScopeAccessScopePathRequestArgs>> matchPaths;

    public Output<List<NetworkInsightsAccessScopeAccessScopePathRequestArgs>> getMatchPaths() {
        return this.matchPaths == null ? Codegen.empty() : this.matchPaths;
    }

    @Import(name="tags")
      private final @Nullable Output<List<NetworkInsightsAccessScopeTagArgs>> tags;

    public Output<List<NetworkInsightsAccessScopeTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public NetworkInsightsAccessScopeArgs(
        @Nullable Output<List<NetworkInsightsAccessScopeAccessScopePathRequestArgs>> excludePaths,
        @Nullable Output<List<NetworkInsightsAccessScopeAccessScopePathRequestArgs>> matchPaths,
        @Nullable Output<List<NetworkInsightsAccessScopeTagArgs>> tags) {
        this.excludePaths = excludePaths;
        this.matchPaths = matchPaths;
        this.tags = tags;
    }

    private NetworkInsightsAccessScopeArgs() {
        this.excludePaths = Codegen.empty();
        this.matchPaths = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAccessScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<NetworkInsightsAccessScopeAccessScopePathRequestArgs>> excludePaths;
        private @Nullable Output<List<NetworkInsightsAccessScopeAccessScopePathRequestArgs>> matchPaths;
        private @Nullable Output<List<NetworkInsightsAccessScopeTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAccessScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludePaths = defaults.excludePaths;
    	      this.matchPaths = defaults.matchPaths;
    	      this.tags = defaults.tags;
        }

        public Builder excludePaths(@Nullable Output<List<NetworkInsightsAccessScopeAccessScopePathRequestArgs>> excludePaths) {
            this.excludePaths = excludePaths;
            return this;
        }
        public Builder excludePaths(@Nullable List<NetworkInsightsAccessScopeAccessScopePathRequestArgs> excludePaths) {
            this.excludePaths = Codegen.ofNullable(excludePaths);
            return this;
        }
        public Builder excludePaths(NetworkInsightsAccessScopeAccessScopePathRequestArgs... excludePaths) {
            return excludePaths(List.of(excludePaths));
        }
        public Builder matchPaths(@Nullable Output<List<NetworkInsightsAccessScopeAccessScopePathRequestArgs>> matchPaths) {
            this.matchPaths = matchPaths;
            return this;
        }
        public Builder matchPaths(@Nullable List<NetworkInsightsAccessScopeAccessScopePathRequestArgs> matchPaths) {
            this.matchPaths = Codegen.ofNullable(matchPaths);
            return this;
        }
        public Builder matchPaths(NetworkInsightsAccessScopeAccessScopePathRequestArgs... matchPaths) {
            return matchPaths(List.of(matchPaths));
        }
        public Builder tags(@Nullable Output<List<NetworkInsightsAccessScopeTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<NetworkInsightsAccessScopeTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(NetworkInsightsAccessScopeTagArgs... tags) {
            return tags(List.of(tags));
        }        public NetworkInsightsAccessScopeArgs build() {
            return new NetworkInsightsAccessScopeArgs(excludePaths, matchPaths, tags);
        }
    }
}
