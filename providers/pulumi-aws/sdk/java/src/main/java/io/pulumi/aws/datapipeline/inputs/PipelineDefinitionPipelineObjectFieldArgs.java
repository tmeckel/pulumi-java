// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datapipeline.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineDefinitionPipelineObjectFieldArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineDefinitionPipelineObjectFieldArgs Empty = new PipelineDefinitionPipelineObjectFieldArgs();

    /**
     * Field identifier.
     * 
     */
    @InputImport(name="key", required=true)
      private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    /**
     * Field value, expressed as the identifier of another object
     * 
     */
    @InputImport(name="refValue")
      private final @Nullable Input<String> refValue;

    public Input<String> getRefValue() {
        return this.refValue == null ? Input.empty() : this.refValue;
    }

    /**
     * Field value, expressed as a String.
     * 
     */
    @InputImport(name="stringValue")
      private final @Nullable Input<String> stringValue;

    public Input<String> getStringValue() {
        return this.stringValue == null ? Input.empty() : this.stringValue;
    }

    public PipelineDefinitionPipelineObjectFieldArgs(
        Input<String> key,
        @Nullable Input<String> refValue,
        @Nullable Input<String> stringValue) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.refValue = refValue;
        this.stringValue = stringValue;
    }

    private PipelineDefinitionPipelineObjectFieldArgs() {
        this.key = Input.empty();
        this.refValue = Input.empty();
        this.stringValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDefinitionPipelineObjectFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;
        private @Nullable Input<String> refValue;
        private @Nullable Input<String> stringValue;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDefinitionPipelineObjectFieldArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.refValue = defaults.refValue;
    	      this.stringValue = defaults.stringValue;
        }

        public Builder key(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder refValue(@Nullable Input<String> refValue) {
            this.refValue = refValue;
            return this;
        }

        public Builder refValue(@Nullable String refValue) {
            this.refValue = Input.ofNullable(refValue);
            return this;
        }

        public Builder stringValue(@Nullable Input<String> stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Builder stringValue(@Nullable String stringValue) {
            this.stringValue = Input.ofNullable(stringValue);
            return this;
        }
        public PipelineDefinitionPipelineObjectFieldArgs build() {
            return new PipelineDefinitionPipelineObjectFieldArgs(key, refValue, stringValue);
        }
    }
}
