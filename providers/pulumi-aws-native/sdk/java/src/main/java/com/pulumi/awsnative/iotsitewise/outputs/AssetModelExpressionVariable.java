// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.outputs;

import com.pulumi.awsnative.iotsitewise.outputs.AssetModelVariableValue;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AssetModelExpressionVariable {
    /**
     * @return The friendly name of the variable to be used in the expression.
     * 
     */
    private final String name;
    /**
     * @return The variable that identifies an asset property from which to use values.
     * 
     */
    private final AssetModelVariableValue value;

    @CustomType.Constructor
    private AssetModelExpressionVariable(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") AssetModelVariableValue value) {
        this.name = name;
        this.value = value;
    }

    /**
     * @return The friendly name of the variable to be used in the expression.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The variable that identifies an asset property from which to use values.
     * 
     */
    public AssetModelVariableValue value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelExpressionVariable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private AssetModelVariableValue value;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelExpressionVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(AssetModelVariableValue value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public AssetModelExpressionVariable build() {
            return new AssetModelExpressionVariable(name, value);
        }
    }
}
