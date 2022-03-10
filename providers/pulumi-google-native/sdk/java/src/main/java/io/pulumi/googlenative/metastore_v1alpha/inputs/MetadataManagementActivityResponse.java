// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.metastore_v1alpha.inputs.MetadataExportResponse;
import io.pulumi.googlenative.metastore_v1alpha.inputs.RestoreResponse;
import java.util.List;
import java.util.Objects;


/**
 * The metadata management activities of the metastore service.
 * 
 */
public final class MetadataManagementActivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetadataManagementActivityResponse Empty = new MetadataManagementActivityResponse();

    /**
     * The latest metadata exports of the metastore service.
     * 
     */
    @InputImport(name="metadataExports", required=true)
      private final List<MetadataExportResponse> metadataExports;

    public List<MetadataExportResponse> getMetadataExports() {
        return this.metadataExports;
    }

    /**
     * The latest restores of the metastore service.
     * 
     */
    @InputImport(name="restores", required=true)
      private final List<RestoreResponse> restores;

    public List<RestoreResponse> getRestores() {
        return this.restores;
    }

    public MetadataManagementActivityResponse(
        List<MetadataExportResponse> metadataExports,
        List<RestoreResponse> restores) {
        this.metadataExports = Objects.requireNonNull(metadataExports, "expected parameter 'metadataExports' to be non-null");
        this.restores = Objects.requireNonNull(restores, "expected parameter 'restores' to be non-null");
    }

    private MetadataManagementActivityResponse() {
        this.metadataExports = List.of();
        this.restores = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataManagementActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MetadataExportResponse> metadataExports;
        private List<RestoreResponse> restores;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataManagementActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadataExports = defaults.metadataExports;
    	      this.restores = defaults.restores;
        }

        public Builder metadataExports(List<MetadataExportResponse> metadataExports) {
            this.metadataExports = Objects.requireNonNull(metadataExports);
            return this;
        }

        public Builder restores(List<RestoreResponse> restores) {
            this.restores = Objects.requireNonNull(restores);
            return this;
        }
        public MetadataManagementActivityResponse build() {
            return new MetadataManagementActivityResponse(metadataExports, restores);
        }
    }
}
