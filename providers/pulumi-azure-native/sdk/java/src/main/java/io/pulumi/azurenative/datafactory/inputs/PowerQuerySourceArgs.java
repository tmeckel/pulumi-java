// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DataFlowReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.DatasetReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Power query source.
 * 
 */
public final class PowerQuerySourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PowerQuerySourceArgs Empty = new PowerQuerySourceArgs();

    /**
     * Dataset reference.
     * 
     */
    @Import(name="dataset")
      private final @Nullable Output<DatasetReferenceArgs> dataset;

    public Output<DatasetReferenceArgs> getDataset() {
        return this.dataset == null ? Codegen.empty() : this.dataset;
    }

    /**
     * Transformation description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Flowlet Reference
     * 
     */
    @Import(name="flowlet")
      private final @Nullable Output<DataFlowReferenceArgs> flowlet;

    public Output<DataFlowReferenceArgs> getFlowlet() {
        return this.flowlet == null ? Codegen.empty() : this.flowlet;
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedService")
      private final @Nullable Output<LinkedServiceReferenceArgs> linkedService;

    public Output<LinkedServiceReferenceArgs> getLinkedService() {
        return this.linkedService == null ? Codegen.empty() : this.linkedService;
    }

    /**
     * Transformation name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Schema linked service reference.
     * 
     */
    @Import(name="schemaLinkedService")
      private final @Nullable Output<LinkedServiceReferenceArgs> schemaLinkedService;

    public Output<LinkedServiceReferenceArgs> getSchemaLinkedService() {
        return this.schemaLinkedService == null ? Codegen.empty() : this.schemaLinkedService;
    }

    /**
     * source script.
     * 
     */
    @Import(name="script")
      private final @Nullable Output<String> script;

    public Output<String> getScript() {
        return this.script == null ? Codegen.empty() : this.script;
    }

    public PowerQuerySourceArgs(
        @Nullable Output<DatasetReferenceArgs> dataset,
        @Nullable Output<String> description,
        @Nullable Output<DataFlowReferenceArgs> flowlet,
        @Nullable Output<LinkedServiceReferenceArgs> linkedService,
        Output<String> name,
        @Nullable Output<LinkedServiceReferenceArgs> schemaLinkedService,
        @Nullable Output<String> script) {
        this.dataset = dataset;
        this.description = description;
        this.flowlet = flowlet;
        this.linkedService = linkedService;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.schemaLinkedService = schemaLinkedService;
        this.script = script;
    }

    private PowerQuerySourceArgs() {
        this.dataset = Codegen.empty();
        this.description = Codegen.empty();
        this.flowlet = Codegen.empty();
        this.linkedService = Codegen.empty();
        this.name = Codegen.empty();
        this.schemaLinkedService = Codegen.empty();
        this.script = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerQuerySourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DatasetReferenceArgs> dataset;
        private @Nullable Output<String> description;
        private @Nullable Output<DataFlowReferenceArgs> flowlet;
        private @Nullable Output<LinkedServiceReferenceArgs> linkedService;
        private Output<String> name;
        private @Nullable Output<LinkedServiceReferenceArgs> schemaLinkedService;
        private @Nullable Output<String> script;

        public Builder() {
    	      // Empty
        }

        public Builder(PowerQuerySourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.description = defaults.description;
    	      this.flowlet = defaults.flowlet;
    	      this.linkedService = defaults.linkedService;
    	      this.name = defaults.name;
    	      this.schemaLinkedService = defaults.schemaLinkedService;
    	      this.script = defaults.script;
        }

        public Builder dataset(@Nullable Output<DatasetReferenceArgs> dataset) {
            this.dataset = dataset;
            return this;
        }
        public Builder dataset(@Nullable DatasetReferenceArgs dataset) {
            this.dataset = Codegen.ofNullable(dataset);
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
        public Builder flowlet(@Nullable Output<DataFlowReferenceArgs> flowlet) {
            this.flowlet = flowlet;
            return this;
        }
        public Builder flowlet(@Nullable DataFlowReferenceArgs flowlet) {
            this.flowlet = Codegen.ofNullable(flowlet);
            return this;
        }
        public Builder linkedService(@Nullable Output<LinkedServiceReferenceArgs> linkedService) {
            this.linkedService = linkedService;
            return this;
        }
        public Builder linkedService(@Nullable LinkedServiceReferenceArgs linkedService) {
            this.linkedService = Codegen.ofNullable(linkedService);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder schemaLinkedService(@Nullable Output<LinkedServiceReferenceArgs> schemaLinkedService) {
            this.schemaLinkedService = schemaLinkedService;
            return this;
        }
        public Builder schemaLinkedService(@Nullable LinkedServiceReferenceArgs schemaLinkedService) {
            this.schemaLinkedService = Codegen.ofNullable(schemaLinkedService);
            return this;
        }
        public Builder script(@Nullable Output<String> script) {
            this.script = script;
            return this;
        }
        public Builder script(@Nullable String script) {
            this.script = Codegen.ofNullable(script);
            return this;
        }        public PowerQuerySourceArgs build() {
            return new PowerQuerySourceArgs(dataset, description, flowlet, linkedService, name, schemaLinkedService, script);
        }
    }
}
