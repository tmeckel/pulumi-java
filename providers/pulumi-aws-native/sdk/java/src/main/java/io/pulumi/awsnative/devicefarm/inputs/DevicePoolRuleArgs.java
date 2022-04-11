// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devicefarm.inputs;

import io.pulumi.awsnative.devicefarm.enums.DevicePoolRuleAttribute;
import io.pulumi.awsnative.devicefarm.enums.DevicePoolRuleOperator;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a condition for a device pool.
 * 
 */
public final class DevicePoolRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final DevicePoolRuleArgs Empty = new DevicePoolRuleArgs();

    /**
     * The rule's stringified attribute.
     * 
     */
    @Import(name="attribute")
      private final @Nullable Output<DevicePoolRuleAttribute> attribute;

    public Output<DevicePoolRuleAttribute> getAttribute() {
        return this.attribute == null ? Codegen.empty() : this.attribute;
    }

    /**
     * Specifies how Device Farm compares the rule's attribute to the value.
     * 
     */
    @Import(name="operator")
      private final @Nullable Output<DevicePoolRuleOperator> operator;

    public Output<DevicePoolRuleOperator> getOperator() {
        return this.operator == null ? Codegen.empty() : this.operator;
    }

    /**
     * The rule's value.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public DevicePoolRuleArgs(
        @Nullable Output<DevicePoolRuleAttribute> attribute,
        @Nullable Output<DevicePoolRuleOperator> operator,
        @Nullable Output<String> value) {
        this.attribute = attribute;
        this.operator = operator;
        this.value = value;
    }

    private DevicePoolRuleArgs() {
        this.attribute = Codegen.empty();
        this.operator = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicePoolRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DevicePoolRuleAttribute> attribute;
        private @Nullable Output<DevicePoolRuleOperator> operator;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(DevicePoolRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.operator = defaults.operator;
    	      this.value = defaults.value;
        }

        public Builder attribute(@Nullable Output<DevicePoolRuleAttribute> attribute) {
            this.attribute = attribute;
            return this;
        }
        public Builder attribute(@Nullable DevicePoolRuleAttribute attribute) {
            this.attribute = Codegen.ofNullable(attribute);
            return this;
        }
        public Builder operator(@Nullable Output<DevicePoolRuleOperator> operator) {
            this.operator = operator;
            return this;
        }
        public Builder operator(@Nullable DevicePoolRuleOperator operator) {
            this.operator = Codegen.ofNullable(operator);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public DevicePoolRuleArgs build() {
            return new DevicePoolRuleArgs(attribute, operator, value);
        }
    }
}
