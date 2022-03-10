// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeTemplateNodeTypeFlexibilityArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeTemplateNodeTypeFlexibilityArgs Empty = new NodeTemplateNodeTypeFlexibilityArgs();

    @InputImport(name="cpus")
      private final @Nullable Input<String> cpus;

    public Input<String> getCpus() {
        return this.cpus == null ? Input.empty() : this.cpus;
    }

    @InputImport(name="localSsd")
      private final @Nullable Input<String> localSsd;

    public Input<String> getLocalSsd() {
        return this.localSsd == null ? Input.empty() : this.localSsd;
    }

    @InputImport(name="memory")
      private final @Nullable Input<String> memory;

    public Input<String> getMemory() {
        return this.memory == null ? Input.empty() : this.memory;
    }

    public NodeTemplateNodeTypeFlexibilityArgs(
        @Nullable Input<String> cpus,
        @Nullable Input<String> localSsd,
        @Nullable Input<String> memory) {
        this.cpus = cpus;
        this.localSsd = localSsd;
        this.memory = memory;
    }

    private NodeTemplateNodeTypeFlexibilityArgs() {
        this.cpus = Input.empty();
        this.localSsd = Input.empty();
        this.memory = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTemplateNodeTypeFlexibilityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cpus;
        private @Nullable Input<String> localSsd;
        private @Nullable Input<String> memory;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTemplateNodeTypeFlexibilityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpus = defaults.cpus;
    	      this.localSsd = defaults.localSsd;
    	      this.memory = defaults.memory;
        }

        public Builder cpus(@Nullable Input<String> cpus) {
            this.cpus = cpus;
            return this;
        }

        public Builder cpus(@Nullable String cpus) {
            this.cpus = Input.ofNullable(cpus);
            return this;
        }

        public Builder localSsd(@Nullable Input<String> localSsd) {
            this.localSsd = localSsd;
            return this;
        }

        public Builder localSsd(@Nullable String localSsd) {
            this.localSsd = Input.ofNullable(localSsd);
            return this;
        }

        public Builder memory(@Nullable Input<String> memory) {
            this.memory = memory;
            return this;
        }

        public Builder memory(@Nullable String memory) {
            this.memory = Input.ofNullable(memory);
            return this;
        }
        public NodeTemplateNodeTypeFlexibilityArgs build() {
            return new NodeTemplateNodeTypeFlexibilityArgs(cpus, localSsd, memory);
        }
    }
}
