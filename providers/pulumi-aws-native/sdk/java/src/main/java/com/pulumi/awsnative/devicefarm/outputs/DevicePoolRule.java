// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.devicefarm.outputs;

import com.pulumi.awsnative.devicefarm.enums.DevicePoolRuleAttribute;
import com.pulumi.awsnative.devicefarm.enums.DevicePoolRuleOperator;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DevicePoolRule {
    /**
     * @return The rule&#39;s stringified attribute.
     * 
     */
    private final @Nullable DevicePoolRuleAttribute attribute;
    /**
     * @return Specifies how Device Farm compares the rule&#39;s attribute to the value.
     * 
     */
    private final @Nullable DevicePoolRuleOperator operator;
    /**
     * @return The rule&#39;s value.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private DevicePoolRule(
        @CustomType.Parameter("attribute") @Nullable DevicePoolRuleAttribute attribute,
        @CustomType.Parameter("operator") @Nullable DevicePoolRuleOperator operator,
        @CustomType.Parameter("value") @Nullable String value) {
        this.attribute = attribute;
        this.operator = operator;
        this.value = value;
    }

    /**
     * @return The rule&#39;s stringified attribute.
     * 
     */
    public Optional<DevicePoolRuleAttribute> attribute() {
        return Optional.ofNullable(this.attribute);
    }
    /**
     * @return Specifies how Device Farm compares the rule&#39;s attribute to the value.
     * 
     */
    public Optional<DevicePoolRuleOperator> operator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * @return The rule&#39;s value.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicePoolRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DevicePoolRuleAttribute attribute;
        private @Nullable DevicePoolRuleOperator operator;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(DevicePoolRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.operator = defaults.operator;
    	      this.value = defaults.value;
        }

        public Builder attribute(@Nullable DevicePoolRuleAttribute attribute) {
            this.attribute = attribute;
            return this;
        }
        public Builder operator(@Nullable DevicePoolRuleOperator operator) {
            this.operator = operator;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public DevicePoolRule build() {
            return new DevicePoolRule(attribute, operator, value);
        }
    }
}
