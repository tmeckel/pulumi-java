// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldFieldGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldFieldGetArgs Empty = new PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldFieldGetArgs();

    /**
     * Name describing the field.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldFieldGetArgs(Input<String> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldFieldGetArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldFieldGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldFieldGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldFieldGetArgs build() {
            return new PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldFieldGetArgs(name);
        }
    }
}
