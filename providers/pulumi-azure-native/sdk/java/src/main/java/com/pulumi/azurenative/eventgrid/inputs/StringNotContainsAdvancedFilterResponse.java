// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * StringNotContains Advanced Filter.
 * 
 */
public final class StringNotContainsAdvancedFilterResponse extends com.pulumi.resources.InvokeArgs {

    public static final StringNotContainsAdvancedFilterResponse Empty = new StringNotContainsAdvancedFilterResponse();

    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    @Import(name="key")
    private @Nullable String key;

    /**
     * @return The field/property in the event based on which you want to filter.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is &#39;StringNotContains&#39;.
     * 
     */
    @Import(name="operatorType", required=true)
    private String operatorType;

    /**
     * @return The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is &#39;StringNotContains&#39;.
     * 
     */
    public String operatorType() {
        return this.operatorType;
    }

    /**
     * The set of filter values.
     * 
     */
    @Import(name="values")
    private @Nullable List<String> values;

    /**
     * @return The set of filter values.
     * 
     */
    public Optional<List<String>> values() {
        return Optional.ofNullable(this.values);
    }

    private StringNotContainsAdvancedFilterResponse() {}

    private StringNotContainsAdvancedFilterResponse(StringNotContainsAdvancedFilterResponse $) {
        this.key = $.key;
        this.operatorType = $.operatorType;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StringNotContainsAdvancedFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StringNotContainsAdvancedFilterResponse $;

        public Builder() {
            $ = new StringNotContainsAdvancedFilterResponse();
        }

        public Builder(StringNotContainsAdvancedFilterResponse defaults) {
            $ = new StringNotContainsAdvancedFilterResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The field/property in the event based on which you want to filter.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable String key) {
            $.key = key;
            return this;
        }

        /**
         * @param operatorType The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
         * Expected value is &#39;StringNotContains&#39;.
         * 
         * @return builder
         * 
         */
        public Builder operatorType(String operatorType) {
            $.operatorType = operatorType;
            return this;
        }

        /**
         * @param values The set of filter values.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The set of filter values.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public StringNotContainsAdvancedFilterResponse build() {
            $.operatorType = Codegen.stringProp("operatorType").arg($.operatorType).require();
            return $;
        }
    }

}
