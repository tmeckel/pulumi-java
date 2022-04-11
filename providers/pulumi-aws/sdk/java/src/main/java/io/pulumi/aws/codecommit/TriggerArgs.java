// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codecommit;

import io.pulumi.aws.codecommit.inputs.TriggerTriggerArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class TriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerArgs Empty = new TriggerArgs();

    /**
     * The name for the repository. This needs to be less than 100 characters.
     * 
     */
    @Import(name="repositoryName", required=true)
      private final Output<String> repositoryName;

    public Output<String> getRepositoryName() {
        return this.repositoryName;
    }

    @Import(name="triggers", required=true)
      private final Output<List<TriggerTriggerArgs>> triggers;

    public Output<List<TriggerTriggerArgs>> getTriggers() {
        return this.triggers;
    }

    public TriggerArgs(
        Output<String> repositoryName,
        Output<List<TriggerTriggerArgs>> triggers) {
        this.repositoryName = Objects.requireNonNull(repositoryName, "expected parameter 'repositoryName' to be non-null");
        this.triggers = Objects.requireNonNull(triggers, "expected parameter 'triggers' to be non-null");
    }

    private TriggerArgs() {
        this.repositoryName = Codegen.empty();
        this.triggers = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> repositoryName;
        private Output<List<TriggerTriggerArgs>> triggers;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryName = defaults.repositoryName;
    	      this.triggers = defaults.triggers;
        }

        public Builder repositoryName(Output<String> repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = Output.of(Objects.requireNonNull(repositoryName));
            return this;
        }
        public Builder triggers(Output<List<TriggerTriggerArgs>> triggers) {
            this.triggers = Objects.requireNonNull(triggers);
            return this;
        }
        public Builder triggers(List<TriggerTriggerArgs> triggers) {
            this.triggers = Output.of(Objects.requireNonNull(triggers));
            return this;
        }
        public Builder triggers(TriggerTriggerArgs... triggers) {
            return triggers(List.of(triggers));
        }        public TriggerArgs build() {
            return new TriggerArgs(repositoryName, triggers);
        }
    }
}
