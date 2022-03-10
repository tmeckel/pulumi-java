// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataStoreInfoBaseResponse {
    /**
     * type of datastore; Operational/Vault/Archive
     * 
     */
    private final String dataStoreType;
    /**
     * Type of Datasource object, used to initialize the right inherited type
     * 
     */
    private final String objectType;

    @OutputCustomType.Constructor
    private DataStoreInfoBaseResponse(
        @OutputCustomType.Parameter("dataStoreType") String dataStoreType,
        @OutputCustomType.Parameter("objectType") String objectType) {
        this.dataStoreType = dataStoreType;
        this.objectType = objectType;
    }

    /**
     * type of datastore; Operational/Vault/Archive
     * 
    */
    public String getDataStoreType() {
        return this.dataStoreType;
    }
    /**
     * Type of Datasource object, used to initialize the right inherited type
     * 
    */
    public String getObjectType() {
        return this.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataStoreInfoBaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataStoreType;
        private String objectType;

        public Builder() {
    	      // Empty
        }

        public Builder(DataStoreInfoBaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataStoreType = defaults.dataStoreType;
    	      this.objectType = defaults.objectType;
        }

        public Builder dataStoreType(String dataStoreType) {
            this.dataStoreType = Objects.requireNonNull(dataStoreType);
            return this;
        }

        public Builder objectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public DataStoreInfoBaseResponse build() {
            return new DataStoreInfoBaseResponse(dataStoreType, objectType);
        }
    }
}
