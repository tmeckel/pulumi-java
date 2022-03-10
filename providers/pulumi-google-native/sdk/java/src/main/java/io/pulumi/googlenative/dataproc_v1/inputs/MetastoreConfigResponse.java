// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies a Metastore configuration.
 * 
 */
public final class MetastoreConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetastoreConfigResponse Empty = new MetastoreConfigResponse();

    /**
     * Resource name of an existing Dataproc Metastore service.Example: projects/[project_id]/locations/[dataproc_region]/services/[service-name]
     * 
     */
    @InputImport(name="dataprocMetastoreService", required=true)
      private final String dataprocMetastoreService;

    public String getDataprocMetastoreService() {
        return this.dataprocMetastoreService;
    }

    public MetastoreConfigResponse(String dataprocMetastoreService) {
        this.dataprocMetastoreService = Objects.requireNonNull(dataprocMetastoreService, "expected parameter 'dataprocMetastoreService' to be non-null");
    }

    private MetastoreConfigResponse() {
        this.dataprocMetastoreService = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetastoreConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataprocMetastoreService;

        public Builder() {
    	      // Empty
        }

        public Builder(MetastoreConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataprocMetastoreService = defaults.dataprocMetastoreService;
        }

        public Builder dataprocMetastoreService(String dataprocMetastoreService) {
            this.dataprocMetastoreService = Objects.requireNonNull(dataprocMetastoreService);
            return this;
        }
        public MetastoreConfigResponse build() {
            return new MetastoreConfigResponse(dataprocMetastoreService);
        }
    }
}
