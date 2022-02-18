// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * More info about Metric: https://docs.apigee.com/api-platform/analytics/analytics-reference#metrics
 * 
 */
public final class GoogleCloudApigeeV1QueryMetricArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1QueryMetricArgs Empty = new GoogleCloudApigeeV1QueryMetricArgs();

    /**
     * Alias for the metric. Alias will be used to replace metric name in query results.
     * 
     */
    @InputImport(name="alias")
    private final @Nullable Input<String> alias;

    public Input<String> getAlias() {
        return this.alias == null ? Input.empty() : this.alias;
    }

    /**
     * Aggregation function: avg, min, max, or sum.
     * 
     */
    @InputImport(name="function")
    private final @Nullable Input<String> function;

    public Input<String> getFunction() {
        return this.function == null ? Input.empty() : this.function;
    }

    /**
     * Metric name.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * One of `+`, `-`, `/`, `%`, `*`.
     * 
     */
    @InputImport(name="operator")
    private final @Nullable Input<String> operator;

    public Input<String> getOperator() {
        return this.operator == null ? Input.empty() : this.operator;
    }

    /**
     * Operand value should be provided when operator is set.
     * 
     */
    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public GoogleCloudApigeeV1QueryMetricArgs(
        @Nullable Input<String> alias,
        @Nullable Input<String> function,
        Input<String> name,
        @Nullable Input<String> operator,
        @Nullable Input<String> value) {
        this.alias = alias;
        this.function = function;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.operator = operator;
        this.value = value;
    }

    private GoogleCloudApigeeV1QueryMetricArgs() {
        this.alias = Input.empty();
        this.function = Input.empty();
        this.name = Input.empty();
        this.operator = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1QueryMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> alias;
        private @Nullable Input<String> function;
        private Input<String> name;
        private @Nullable Input<String> operator;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1QueryMetricArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.function = defaults.function;
    	      this.name = defaults.name;
    	      this.operator = defaults.operator;
    	      this.value = defaults.value;
        }

        public Builder setAlias(@Nullable Input<String> alias) {
            this.alias = alias;
            return this;
        }

        public Builder setAlias(@Nullable String alias) {
            this.alias = Input.ofNullable(alias);
            return this;
        }

        public Builder setFunction(@Nullable Input<String> function) {
            this.function = function;
            return this;
        }

        public Builder setFunction(@Nullable String function) {
            this.function = Input.ofNullable(function);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setOperator(@Nullable Input<String> operator) {
            this.operator = operator;
            return this;
        }

        public Builder setOperator(@Nullable String operator) {
            this.operator = Input.ofNullable(operator);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public GoogleCloudApigeeV1QueryMetricArgs build() {
            return new GoogleCloudApigeeV1QueryMetricArgs(alias, function, name, operator, value);
        }
    }
}
