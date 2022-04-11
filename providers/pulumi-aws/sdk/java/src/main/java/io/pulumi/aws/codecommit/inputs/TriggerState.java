// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codecommit.inputs;

import io.pulumi.aws.codecommit.inputs.TriggerTriggerGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerState extends io.pulumi.resources.ResourceArgs {

    public static final TriggerState Empty = new TriggerState();

    /**
     * System-generated unique identifier.
     * 
     */
    @Import(name="configurationId")
      private final @Nullable Output<String> configurationId;

    public Output<String> getConfigurationId() {
        return this.configurationId == null ? Codegen.empty() : this.configurationId;
    }

    /**
     * The name for the repository. This needs to be less than 100 characters.
     * 
     */
    @Import(name="repositoryName")
      private final @Nullable Output<String> repositoryName;

    public Output<String> getRepositoryName() {
        return this.repositoryName == null ? Codegen.empty() : this.repositoryName;
    }

    @Import(name="triggers")
      private final @Nullable Output<List<TriggerTriggerGetArgs>> triggers;

    public Output<List<TriggerTriggerGetArgs>> getTriggers() {
        return this.triggers == null ? Codegen.empty() : this.triggers;
    }

    public TriggerState(
        @Nullable Output<String> configurationId,
        @Nullable Output<String> repositoryName,
        @Nullable Output<List<TriggerTriggerGetArgs>> triggers) {
        this.configurationId = configurationId;
        this.repositoryName = repositoryName;
        this.triggers = triggers;
    }

    private TriggerState() {
        this.configurationId = Codegen.empty();
        this.repositoryName = Codegen.empty();
        this.triggers = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> configurationId;
        private @Nullable Output<String> repositoryName;
        private @Nullable Output<List<TriggerTriggerGetArgs>> triggers;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationId = defaults.configurationId;
    	      this.repositoryName = defaults.repositoryName;
    	      this.triggers = defaults.triggers;
        }

        public Builder configurationId(@Nullable Output<String> configurationId) {
            this.configurationId = configurationId;
            return this;
        }
        public Builder configurationId(@Nullable String configurationId) {
            this.configurationId = Codegen.ofNullable(configurationId);
            return this;
        }
        public Builder repositoryName(@Nullable Output<String> repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }
        public Builder repositoryName(@Nullable String repositoryName) {
            this.repositoryName = Codegen.ofNullable(repositoryName);
            return this;
        }
        public Builder triggers(@Nullable Output<List<TriggerTriggerGetArgs>> triggers) {
            this.triggers = triggers;
            return this;
        }
        public Builder triggers(@Nullable List<TriggerTriggerGetArgs> triggers) {
            this.triggers = Codegen.ofNullable(triggers);
            return this;
        }
        public Builder triggers(TriggerTriggerGetArgs... triggers) {
            return triggers(List.of(triggers));
        }        public TriggerState build() {
            return new TriggerState(configurationId, repositoryName, triggers);
        }
    }
}
