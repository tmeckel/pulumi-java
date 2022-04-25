// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus.outputs;

import com.pulumi.azurenative.servicebus.outputs.ActionResponse;
import com.pulumi.azurenative.servicebus.outputs.CorrelationFilterResponse;
import com.pulumi.azurenative.servicebus.outputs.SqlFilterResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRuleResult {
    /**
     * @return Represents the filter actions which are allowed for the transformation of a message that have been matched by a filter expression.
     * 
     */
    private final @Nullable ActionResponse action;
    /**
     * @return Properties of correlationFilter
     * 
     */
    private final @Nullable CorrelationFilterResponse correlationFilter;
    /**
     * @return Filter type that is evaluated against a BrokeredMessage.
     * 
     */
    private final @Nullable String filterType;
    /**
     * @return Resource Id
     * 
     */
    private final String id;
    /**
     * @return Resource name
     * 
     */
    private final String name;
    /**
     * @return Properties of sqlFilter
     * 
     */
    private final @Nullable SqlFilterResponse sqlFilter;
    /**
     * @return Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetRuleResult(
        @CustomType.Parameter("action") @Nullable ActionResponse action,
        @CustomType.Parameter("correlationFilter") @Nullable CorrelationFilterResponse correlationFilter,
        @CustomType.Parameter("filterType") @Nullable String filterType,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("sqlFilter") @Nullable SqlFilterResponse sqlFilter,
        @CustomType.Parameter("type") String type) {
        this.action = action;
        this.correlationFilter = correlationFilter;
        this.filterType = filterType;
        this.id = id;
        this.name = name;
        this.sqlFilter = sqlFilter;
        this.type = type;
    }

    /**
     * @return Represents the filter actions which are allowed for the transformation of a message that have been matched by a filter expression.
     * 
     */
    public Optional<ActionResponse> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return Properties of correlationFilter
     * 
     */
    public Optional<CorrelationFilterResponse> correlationFilter() {
        return Optional.ofNullable(this.correlationFilter);
    }
    /**
     * @return Filter type that is evaluated against a BrokeredMessage.
     * 
     */
    public Optional<String> filterType() {
        return Optional.ofNullable(this.filterType);
    }
    /**
     * @return Resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Properties of sqlFilter
     * 
     */
    public Optional<SqlFilterResponse> sqlFilter() {
        return Optional.ofNullable(this.sqlFilter);
    }
    /**
     * @return Resource type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ActionResponse action;
        private @Nullable CorrelationFilterResponse correlationFilter;
        private @Nullable String filterType;
        private String id;
        private String name;
        private @Nullable SqlFilterResponse sqlFilter;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.correlationFilter = defaults.correlationFilter;
    	      this.filterType = defaults.filterType;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.sqlFilter = defaults.sqlFilter;
    	      this.type = defaults.type;
        }

        public Builder action(@Nullable ActionResponse action) {
            this.action = action;
            return this;
        }
        public Builder correlationFilter(@Nullable CorrelationFilterResponse correlationFilter) {
            this.correlationFilter = correlationFilter;
            return this;
        }
        public Builder filterType(@Nullable String filterType) {
            this.filterType = filterType;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder sqlFilter(@Nullable SqlFilterResponse sqlFilter) {
            this.sqlFilter = sqlFilter;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetRuleResult build() {
            return new GetRuleResult(action, correlationFilter, filterType, id, name, sqlFilter, type);
        }
    }
}
