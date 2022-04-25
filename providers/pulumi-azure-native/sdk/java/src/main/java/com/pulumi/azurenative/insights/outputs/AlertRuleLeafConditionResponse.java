// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertRuleLeafConditionResponse {
    /**
     * @return The value of the event&#39;s field will be compared to the values in this array (case-insensitive) to determine if the condition is met.
     * 
     */
    private final @Nullable List<String> containsAny;
    /**
     * @return The value of the event&#39;s field will be compared to this value (case-insensitive) to determine if the condition is met.
     * 
     */
    private final @Nullable String equals;
    /**
     * @return The name of the Activity Log event&#39;s field that this condition will examine.
     * The possible values for this field are (case-insensitive): &#39;resourceId&#39;, &#39;category&#39;, &#39;caller&#39;, &#39;level&#39;, &#39;operationName&#39;, &#39;resourceGroup&#39;, &#39;resourceProvider&#39;, &#39;status&#39;, &#39;subStatus&#39;, &#39;resourceType&#39;, or anything beginning with &#39;properties&#39;.
     * 
     */
    private final @Nullable String field;

    @CustomType.Constructor
    private AlertRuleLeafConditionResponse(
        @CustomType.Parameter("containsAny") @Nullable List<String> containsAny,
        @CustomType.Parameter("equals") @Nullable String equals,
        @CustomType.Parameter("field") @Nullable String field) {
        this.containsAny = containsAny;
        this.equals = equals;
        this.field = field;
    }

    /**
     * @return The value of the event&#39;s field will be compared to the values in this array (case-insensitive) to determine if the condition is met.
     * 
     */
    public List<String> containsAny() {
        return this.containsAny == null ? List.of() : this.containsAny;
    }
    /**
     * @return The value of the event&#39;s field will be compared to this value (case-insensitive) to determine if the condition is met.
     * 
     */
    public Optional<String> equals_() {
        return Optional.ofNullable(this.equals);
    }
    /**
     * @return The name of the Activity Log event&#39;s field that this condition will examine.
     * The possible values for this field are (case-insensitive): &#39;resourceId&#39;, &#39;category&#39;, &#39;caller&#39;, &#39;level&#39;, &#39;operationName&#39;, &#39;resourceGroup&#39;, &#39;resourceProvider&#39;, &#39;status&#39;, &#39;subStatus&#39;, &#39;resourceType&#39;, or anything beginning with &#39;properties&#39;.
     * 
     */
    public Optional<String> field() {
        return Optional.ofNullable(this.field);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertRuleLeafConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> containsAny;
        private @Nullable String equals;
        private @Nullable String field;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertRuleLeafConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containsAny = defaults.containsAny;
    	      this.equals = defaults.equals;
    	      this.field = defaults.field;
        }

        public Builder containsAny(@Nullable List<String> containsAny) {
            this.containsAny = containsAny;
            return this;
        }
        public Builder containsAny(String... containsAny) {
            return containsAny(List.of(containsAny));
        }
        public Builder equals_(@Nullable String equals) {
            this.equals = equals;
            return this;
        }
        public Builder field(@Nullable String field) {
            this.field = field;
            return this;
        }        public AlertRuleLeafConditionResponse build() {
            return new AlertRuleLeafConditionResponse(containsAny, equals, field);
        }
    }
}
