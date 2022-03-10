// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datapipeline.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PipelineDefinitionParameterObjectAttributeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineDefinitionParameterObjectAttributeGetArgs Empty = new PipelineDefinitionParameterObjectAttributeGetArgs();

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
     * Field value, expressed as a String.
     * 
     */
    @InputImport(name="stringValue", required=true)
      private final Input<String> stringValue;

    public Input<String> getStringValue() {
        return this.stringValue;
    }

    public PipelineDefinitionParameterObjectAttributeGetArgs(
        Input<String> key,
        Input<String> stringValue) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.stringValue = Objects.requireNonNull(stringValue, "expected parameter 'stringValue' to be non-null");
    }

    private PipelineDefinitionParameterObjectAttributeGetArgs() {
        this.key = Input.empty();
        this.stringValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDefinitionParameterObjectAttributeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;
        private Input<String> stringValue;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDefinitionParameterObjectAttributeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
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

        public Builder stringValue(Input<String> stringValue) {
            this.stringValue = Objects.requireNonNull(stringValue);
            return this;
        }

        public Builder stringValue(String stringValue) {
            this.stringValue = Input.of(Objects.requireNonNull(stringValue));
            return this;
        }
        public PipelineDefinitionParameterObjectAttributeGetArgs build() {
            return new PipelineDefinitionParameterObjectAttributeGetArgs(key, stringValue);
        }
    }
}
