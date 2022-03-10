// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetNamedQueryArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNamedQueryArgs Empty = new GetNamedQueryArgs();

    /**
     * The unique ID of the query.
     * 
     */
    @InputImport(name="namedQueryId", required=true)
      private final String namedQueryId;

    public String getNamedQueryId() {
        return this.namedQueryId;
    }

    public GetNamedQueryArgs(String namedQueryId) {
        this.namedQueryId = Objects.requireNonNull(namedQueryId, "expected parameter 'namedQueryId' to be non-null");
    }

    private GetNamedQueryArgs() {
        this.namedQueryId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamedQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String namedQueryId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamedQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namedQueryId = defaults.namedQueryId;
        }

        public Builder namedQueryId(String namedQueryId) {
            this.namedQueryId = Objects.requireNonNull(namedQueryId);
            return this;
        }
        public GetNamedQueryArgs build() {
            return new GetNamedQueryArgs(namedQueryId);
        }
    }
}
