// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies a Metastore configuration.
 * 
 */
public final class MetastoreConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetastoreConfigArgs Empty = new MetastoreConfigArgs();

    /**
     * Resource name of an existing Dataproc Metastore service.Example: projects/[project_id]/locations/[dataproc_region]/services/[service-name]
     * 
     */
    @InputImport(name="dataprocMetastoreService", required=true)
    private final Input<String> dataprocMetastoreService;

    public Input<String> getDataprocMetastoreService() {
        return this.dataprocMetastoreService;
    }

    public MetastoreConfigArgs(Input<String> dataprocMetastoreService) {
        this.dataprocMetastoreService = Objects.requireNonNull(dataprocMetastoreService, "expected parameter 'dataprocMetastoreService' to be non-null");
    }

    private MetastoreConfigArgs() {
        this.dataprocMetastoreService = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetastoreConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> dataprocMetastoreService;

        public Builder() {
    	      // Empty
        }

        public Builder(MetastoreConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataprocMetastoreService = defaults.dataprocMetastoreService;
        }

        public Builder setDataprocMetastoreService(Input<String> dataprocMetastoreService) {
            this.dataprocMetastoreService = Objects.requireNonNull(dataprocMetastoreService);
            return this;
        }

        public Builder setDataprocMetastoreService(String dataprocMetastoreService) {
            this.dataprocMetastoreService = Input.of(Objects.requireNonNull(dataprocMetastoreService));
            return this;
        }

        public MetastoreConfigArgs build() {
            return new MetastoreConfigArgs(dataprocMetastoreService);
        }
    }
}
