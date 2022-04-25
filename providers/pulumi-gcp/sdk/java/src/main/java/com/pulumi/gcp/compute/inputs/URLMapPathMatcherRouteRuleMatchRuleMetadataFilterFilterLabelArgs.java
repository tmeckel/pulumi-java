// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs Empty = new URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs();

    /**
     * The name of the query parameter to match. The query parameter must exist in the
     * request, in the absence of which the request match fails.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the query parameter to match. The query parameter must exist in the
     * request, in the absence of which the request match fails.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The value of the label must match the specified value. value can have a maximum
     * length of 1024 characters.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value of the label must match the specified value. value can have a maximum
     * length of 1024 characters.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs() {}

    private URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs(URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs $;

        public Builder() {
            $ = new URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs();
        }

        public Builder(URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs defaults) {
            $ = new URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the query parameter to match. The query parameter must exist in the
         * request, in the absence of which the request match fails.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the query parameter to match. The query parameter must exist in the
         * request, in the absence of which the request match fails.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The value of the label must match the specified value. value can have a maximum
         * length of 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the label must match the specified value. value can have a maximum
         * length of 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
