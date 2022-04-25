// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetAmiFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetAmiFilter Empty = new GetAmiFilter();

    /**
     * The name of the AMI that was provided during image creation.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the AMI that was provided during image creation.
     * 
     */
    public String name() {
        return this.name;
    }

    @Import(name="values", required=true)
    private List<String> values;

    public List<String> values() {
        return this.values;
    }

    private GetAmiFilter() {}

    private GetAmiFilter(GetAmiFilter $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAmiFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAmiFilter $;

        public Builder() {
            $ = new GetAmiFilter();
        }

        public Builder(GetAmiFilter defaults) {
            $ = new GetAmiFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the AMI that was provided during image creation.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetAmiFilter build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
