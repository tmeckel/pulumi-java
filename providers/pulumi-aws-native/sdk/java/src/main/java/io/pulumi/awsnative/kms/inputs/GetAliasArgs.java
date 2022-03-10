// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kms.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAliasArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAliasArgs Empty = new GetAliasArgs();

    /**
     * Specifies the alias name. This value must begin with alias/ followed by a name, such as alias/ExampleAlias. The alias name cannot begin with alias/aws/. The alias/aws/ prefix is reserved for AWS managed CMKs.
     * 
     */
    @InputImport(name="aliasName", required=true)
      private final String aliasName;

    public String getAliasName() {
        return this.aliasName;
    }

    public GetAliasArgs(String aliasName) {
        this.aliasName = Objects.requireNonNull(aliasName, "expected parameter 'aliasName' to be non-null");
    }

    private GetAliasArgs() {
        this.aliasName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aliasName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasName = defaults.aliasName;
        }

        public Builder aliasName(String aliasName) {
            this.aliasName = Objects.requireNonNull(aliasName);
            return this;
        }
        public GetAliasArgs build() {
            return new GetAliasArgs(aliasName);
        }
    }
}
