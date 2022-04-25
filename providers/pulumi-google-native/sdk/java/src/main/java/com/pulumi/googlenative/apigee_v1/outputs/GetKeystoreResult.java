// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetKeystoreResult {
    /**
     * @return Aliases in this keystore.
     * 
     */
    private final List<String> aliases;
    /**
     * @return Resource ID for this keystore. Values must match the regular expression `[\w[:space:]-.]{1,255}`.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetKeystoreResult(
        @CustomType.Parameter("aliases") List<String> aliases,
        @CustomType.Parameter("name") String name) {
        this.aliases = aliases;
        this.name = name;
    }

    /**
     * @return Aliases in this keystore.
     * 
     */
    public List<String> aliases() {
        return this.aliases;
    }
    /**
     * @return Resource ID for this keystore. Values must match the regular expression `[\w[:space:]-.]{1,255}`.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeystoreResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> aliases;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeystoreResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliases = defaults.aliases;
    	      this.name = defaults.name;
        }

        public Builder aliases(List<String> aliases) {
            this.aliases = Objects.requireNonNull(aliases);
            return this;
        }
        public Builder aliases(String... aliases) {
            return aliases(List.of(aliases));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetKeystoreResult build() {
            return new GetKeystoreResult(aliases, name);
        }
    }
}
