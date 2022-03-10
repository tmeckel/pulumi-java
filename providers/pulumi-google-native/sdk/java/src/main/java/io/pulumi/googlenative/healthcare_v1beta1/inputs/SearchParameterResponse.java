// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Contains the versioned name and the URL for one SearchParameter.
 * 
 */
public final class SearchParameterResponse extends io.pulumi.resources.InvokeArgs {

    public static final SearchParameterResponse Empty = new SearchParameterResponse();

    /**
     * The canonical url of the search parameter resource.
     * 
     */
    @InputImport(name="canonicalUrl", required=true)
      private final String canonicalUrl;

    public String getCanonicalUrl() {
        return this.canonicalUrl;
    }

    /**
     * The versioned name of the search parameter resource. The format is projects/{project-id}/locations/{location}/datasets/{dataset-id}/fhirStores/{fhirStore-id}/fhir/SearchParameter/{resource-id}/_history/{version-id} For fhir stores with disable_resource_versioning=true, the format is projects/{project-id}/locations/{location}/datasets/{dataset-id}/fhirStores/{fhirStore-id}/fhir/SearchParameter/{resource-id}/
     * 
     */
    @InputImport(name="parameter", required=true)
      private final String parameter;

    public String getParameter() {
        return this.parameter;
    }

    public SearchParameterResponse(
        String canonicalUrl,
        String parameter) {
        this.canonicalUrl = Objects.requireNonNull(canonicalUrl, "expected parameter 'canonicalUrl' to be non-null");
        this.parameter = Objects.requireNonNull(parameter, "expected parameter 'parameter' to be non-null");
    }

    private SearchParameterResponse() {
        this.canonicalUrl = null;
        this.parameter = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SearchParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String canonicalUrl;
        private String parameter;

        public Builder() {
    	      // Empty
        }

        public Builder(SearchParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canonicalUrl = defaults.canonicalUrl;
    	      this.parameter = defaults.parameter;
        }

        public Builder canonicalUrl(String canonicalUrl) {
            this.canonicalUrl = Objects.requireNonNull(canonicalUrl);
            return this;
        }

        public Builder parameter(String parameter) {
            this.parameter = Objects.requireNonNull(parameter);
            return this;
        }
        public SearchParameterResponse build() {
            return new SearchParameterResponse(canonicalUrl, parameter);
        }
    }
}
