// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.aws.autoscaling.inputs.GroupInstanceRefreshPreferencesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupInstanceRefreshArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupInstanceRefreshArgs Empty = new GroupInstanceRefreshArgs();

    /**
     * Override default parameters for Instance Refresh.
     * 
     */
    @Import(name="preferences")
      private final @Nullable Output<GroupInstanceRefreshPreferencesArgs> preferences;

    public Output<GroupInstanceRefreshPreferencesArgs> getPreferences() {
        return this.preferences == null ? Codegen.empty() : this.preferences;
    }

    /**
     * The strategy to use for instance refresh. The only allowed value is `Rolling`. See [StartInstanceRefresh Action](https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_StartInstanceRefresh.html#API_StartInstanceRefresh_RequestParameters) for more information.
     * 
     */
    @Import(name="strategy", required=true)
      private final Output<String> strategy;

    public Output<String> getStrategy() {
        return this.strategy;
    }

    /**
     * Set of additional property names that will trigger an Instance Refresh. A refresh will always be triggered by a change in any of `launch_configuration`, `launch_template`, or `mixed_instances_policy`.
     * 
     */
    @Import(name="triggers")
      private final @Nullable Output<List<String>> triggers;

    public Output<List<String>> getTriggers() {
        return this.triggers == null ? Codegen.empty() : this.triggers;
    }

    public GroupInstanceRefreshArgs(
        @Nullable Output<GroupInstanceRefreshPreferencesArgs> preferences,
        Output<String> strategy,
        @Nullable Output<List<String>> triggers) {
        this.preferences = preferences;
        this.strategy = Objects.requireNonNull(strategy, "expected parameter 'strategy' to be non-null");
        this.triggers = triggers;
    }

    private GroupInstanceRefreshArgs() {
        this.preferences = Codegen.empty();
        this.strategy = Codegen.empty();
        this.triggers = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupInstanceRefreshArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GroupInstanceRefreshPreferencesArgs> preferences;
        private Output<String> strategy;
        private @Nullable Output<List<String>> triggers;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupInstanceRefreshArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preferences = defaults.preferences;
    	      this.strategy = defaults.strategy;
    	      this.triggers = defaults.triggers;
        }

        public Builder preferences(@Nullable Output<GroupInstanceRefreshPreferencesArgs> preferences) {
            this.preferences = preferences;
            return this;
        }
        public Builder preferences(@Nullable GroupInstanceRefreshPreferencesArgs preferences) {
            this.preferences = Codegen.ofNullable(preferences);
            return this;
        }
        public Builder strategy(Output<String> strategy) {
            this.strategy = Objects.requireNonNull(strategy);
            return this;
        }
        public Builder strategy(String strategy) {
            this.strategy = Output.of(Objects.requireNonNull(strategy));
            return this;
        }
        public Builder triggers(@Nullable Output<List<String>> triggers) {
            this.triggers = triggers;
            return this;
        }
        public Builder triggers(@Nullable List<String> triggers) {
            this.triggers = Codegen.ofNullable(triggers);
            return this;
        }
        public Builder triggers(String... triggers) {
            return triggers(List.of(triggers));
        }        public GroupInstanceRefreshArgs build() {
            return new GroupInstanceRefreshArgs(preferences, strategy, triggers);
        }
    }
}
