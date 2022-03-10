// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.awsnative.iotanalytics.outputs.DatastoreCustomerManagedS3;
import io.pulumi.awsnative.iotanalytics.outputs.DatastoreIotSiteWiseMultiLayerStorage;
import io.pulumi.awsnative.iotanalytics.outputs.DatastoreServiceManagedS3;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatastoreStorage {
    private final @Nullable DatastoreCustomerManagedS3 customerManagedS3;
    private final @Nullable DatastoreIotSiteWiseMultiLayerStorage iotSiteWiseMultiLayerStorage;
    private final @Nullable DatastoreServiceManagedS3 serviceManagedS3;

    @OutputCustomType.Constructor
    private DatastoreStorage(
        @OutputCustomType.Parameter("customerManagedS3") @Nullable DatastoreCustomerManagedS3 customerManagedS3,
        @OutputCustomType.Parameter("iotSiteWiseMultiLayerStorage") @Nullable DatastoreIotSiteWiseMultiLayerStorage iotSiteWiseMultiLayerStorage,
        @OutputCustomType.Parameter("serviceManagedS3") @Nullable DatastoreServiceManagedS3 serviceManagedS3) {
        this.customerManagedS3 = customerManagedS3;
        this.iotSiteWiseMultiLayerStorage = iotSiteWiseMultiLayerStorage;
        this.serviceManagedS3 = serviceManagedS3;
    }

    public Optional<DatastoreCustomerManagedS3> getCustomerManagedS3() {
        return Optional.ofNullable(this.customerManagedS3);
    }
    public Optional<DatastoreIotSiteWiseMultiLayerStorage> getIotSiteWiseMultiLayerStorage() {
        return Optional.ofNullable(this.iotSiteWiseMultiLayerStorage);
    }
    public Optional<DatastoreServiceManagedS3> getServiceManagedS3() {
        return Optional.ofNullable(this.serviceManagedS3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastoreStorage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatastoreCustomerManagedS3 customerManagedS3;
        private @Nullable DatastoreIotSiteWiseMultiLayerStorage iotSiteWiseMultiLayerStorage;
        private @Nullable DatastoreServiceManagedS3 serviceManagedS3;

        public Builder() {
    	      // Empty
        }

        public Builder(DatastoreStorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerManagedS3 = defaults.customerManagedS3;
    	      this.iotSiteWiseMultiLayerStorage = defaults.iotSiteWiseMultiLayerStorage;
    	      this.serviceManagedS3 = defaults.serviceManagedS3;
        }

        public Builder customerManagedS3(@Nullable DatastoreCustomerManagedS3 customerManagedS3) {
            this.customerManagedS3 = customerManagedS3;
            return this;
        }

        public Builder iotSiteWiseMultiLayerStorage(@Nullable DatastoreIotSiteWiseMultiLayerStorage iotSiteWiseMultiLayerStorage) {
            this.iotSiteWiseMultiLayerStorage = iotSiteWiseMultiLayerStorage;
            return this;
        }

        public Builder serviceManagedS3(@Nullable DatastoreServiceManagedS3 serviceManagedS3) {
            this.serviceManagedS3 = serviceManagedS3;
            return this;
        }
        public DatastoreStorage build() {
            return new DatastoreStorage(customerManagedS3, iotSiteWiseMultiLayerStorage, serviceManagedS3);
        }
    }
}
