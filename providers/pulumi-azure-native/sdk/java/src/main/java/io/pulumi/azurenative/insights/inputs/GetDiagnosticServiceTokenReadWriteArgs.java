// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDiagnosticServiceTokenReadWriteArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDiagnosticServiceTokenReadWriteArgs Empty = new GetDiagnosticServiceTokenReadWriteArgs();

    /**
     * The identifier of the resource.
     * 
     */
    @InputImport(name="resourceUri", required=true)
      private final String resourceUri;

    public String getResourceUri() {
        return this.resourceUri;
    }

    public GetDiagnosticServiceTokenReadWriteArgs(String resourceUri) {
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
    }

    private GetDiagnosticServiceTokenReadWriteArgs() {
        this.resourceUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiagnosticServiceTokenReadWriteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDiagnosticServiceTokenReadWriteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder resourceUri(String resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }
        public GetDiagnosticServiceTokenReadWriteArgs build() {
            return new GetDiagnosticServiceTokenReadWriteArgs(resourceUri);
        }
    }
}
