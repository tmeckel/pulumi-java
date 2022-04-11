// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.gamelift.inputs;

import io.pulumi.aws.gamelift.inputs.GameSessionQueuePlayerLatencyPolicyGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameSessionQueueState extends io.pulumi.resources.ResourceArgs {

    public static final GameSessionQueueState Empty = new GameSessionQueueState();

    /**
     * Game Session Queue ARN.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * List of fleet/alias ARNs used by session queue for placing game sessions.
     * 
     */
    @Import(name="destinations")
      private final @Nullable Output<List<String>> destinations;

    public Output<List<String>> getDestinations() {
        return this.destinations == null ? Codegen.empty() : this.destinations;
    }

    /**
     * Name of the session queue.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * One or more policies used to choose fleet based on player latency. See below.
     * 
     */
    @Import(name="playerLatencyPolicies")
      private final @Nullable Output<List<GameSessionQueuePlayerLatencyPolicyGetArgs>> playerLatencyPolicies;

    public Output<List<GameSessionQueuePlayerLatencyPolicyGetArgs>> getPlayerLatencyPolicies() {
        return this.playerLatencyPolicies == null ? Codegen.empty() : this.playerLatencyPolicies;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * Maximum time a game session request can remain in the queue.
     * 
     */
    @Import(name="timeoutInSeconds")
      private final @Nullable Output<Integer> timeoutInSeconds;

    public Output<Integer> getTimeoutInSeconds() {
        return this.timeoutInSeconds == null ? Codegen.empty() : this.timeoutInSeconds;
    }

    public GameSessionQueueState(
        @Nullable Output<String> arn,
        @Nullable Output<List<String>> destinations,
        @Nullable Output<String> name,
        @Nullable Output<List<GameSessionQueuePlayerLatencyPolicyGetArgs>> playerLatencyPolicies,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<Integer> timeoutInSeconds) {
        this.arn = arn;
        this.destinations = destinations;
        this.name = name;
        this.playerLatencyPolicies = playerLatencyPolicies;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.timeoutInSeconds = timeoutInSeconds;
    }

    private GameSessionQueueState() {
        this.arn = Codegen.empty();
        this.destinations = Codegen.empty();
        this.name = Codegen.empty();
        this.playerLatencyPolicies = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.timeoutInSeconds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameSessionQueueState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<List<String>> destinations;
        private @Nullable Output<String> name;
        private @Nullable Output<List<GameSessionQueuePlayerLatencyPolicyGetArgs>> playerLatencyPolicies;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<Integer> timeoutInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(GameSessionQueueState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.destinations = defaults.destinations;
    	      this.name = defaults.name;
    	      this.playerLatencyPolicies = defaults.playerLatencyPolicies;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder destinations(@Nullable Output<List<String>> destinations) {
            this.destinations = destinations;
            return this;
        }
        public Builder destinations(@Nullable List<String> destinations) {
            this.destinations = Codegen.ofNullable(destinations);
            return this;
        }
        public Builder destinations(String... destinations) {
            return destinations(List.of(destinations));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder playerLatencyPolicies(@Nullable Output<List<GameSessionQueuePlayerLatencyPolicyGetArgs>> playerLatencyPolicies) {
            this.playerLatencyPolicies = playerLatencyPolicies;
            return this;
        }
        public Builder playerLatencyPolicies(@Nullable List<GameSessionQueuePlayerLatencyPolicyGetArgs> playerLatencyPolicies) {
            this.playerLatencyPolicies = Codegen.ofNullable(playerLatencyPolicies);
            return this;
        }
        public Builder playerLatencyPolicies(GameSessionQueuePlayerLatencyPolicyGetArgs... playerLatencyPolicies) {
            return playerLatencyPolicies(List.of(playerLatencyPolicies));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder timeoutInSeconds(@Nullable Output<Integer> timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }
        public Builder timeoutInSeconds(@Nullable Integer timeoutInSeconds) {
            this.timeoutInSeconds = Codegen.ofNullable(timeoutInSeconds);
            return this;
        }        public GameSessionQueueState build() {
            return new GameSessionQueueState(arn, destinations, name, playerLatencyPolicies, tags, tagsAll, timeoutInSeconds);
        }
    }
}
