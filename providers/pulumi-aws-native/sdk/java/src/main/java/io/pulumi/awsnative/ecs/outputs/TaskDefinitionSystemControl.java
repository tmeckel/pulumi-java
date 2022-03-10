// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskDefinitionSystemControl {
    private final @Nullable String namespace;
    private final @Nullable String value;

    @OutputCustomType.Constructor
    private TaskDefinitionSystemControl(
        @OutputCustomType.Parameter("namespace") @Nullable String namespace,
        @OutputCustomType.Parameter("value") @Nullable String value) {
        this.namespace = namespace;
        this.value = value;
    }

    public Optional<String> getNamespace() {
        return Optional.ofNullable(this.namespace);
    }
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionSystemControl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String namespace;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionSystemControl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
    	      this.value = defaults.value;
        }

        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public TaskDefinitionSystemControl build() {
            return new TaskDefinitionSystemControl(namespace, value);
        }
    }
}
