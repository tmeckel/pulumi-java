// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.enums.DataStoreTypes;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * DataStoreInfo base
 * 
 */
public final class DataStoreInfoBaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataStoreInfoBaseArgs Empty = new DataStoreInfoBaseArgs();

    /**
     * type of datastore; Operational/Vault/Archive
     * 
     */
    @Import(name="dataStoreType", required=true)
      private final Output<Either<String,DataStoreTypes>> dataStoreType;

    public Output<Either<String,DataStoreTypes>> getDataStoreType() {
        return this.dataStoreType;
    }

    /**
     * Type of Datasource object, used to initialize the right inherited type
     * 
     */
    @Import(name="objectType", required=true)
      private final Output<String> objectType;

    public Output<String> getObjectType() {
        return this.objectType;
    }

    public DataStoreInfoBaseArgs(
        Output<Either<String,DataStoreTypes>> dataStoreType,
        Output<String> objectType) {
        this.dataStoreType = Objects.requireNonNull(dataStoreType, "expected parameter 'dataStoreType' to be non-null");
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
    }

    private DataStoreInfoBaseArgs() {
        this.dataStoreType = Codegen.empty();
        this.objectType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataStoreInfoBaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,DataStoreTypes>> dataStoreType;
        private Output<String> objectType;

        public Builder() {
    	      // Empty
        }

        public Builder(DataStoreInfoBaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataStoreType = defaults.dataStoreType;
    	      this.objectType = defaults.objectType;
        }

        public Builder dataStoreType(Output<Either<String,DataStoreTypes>> dataStoreType) {
            this.dataStoreType = Objects.requireNonNull(dataStoreType);
            return this;
        }
        public Builder dataStoreType(Either<String,DataStoreTypes> dataStoreType) {
            this.dataStoreType = Output.of(Objects.requireNonNull(dataStoreType));
            return this;
        }
        public Builder objectType(Output<String> objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public Builder objectType(String objectType) {
            this.objectType = Output.of(Objects.requireNonNull(objectType));
            return this;
        }        public DataStoreInfoBaseArgs build() {
            return new DataStoreInfoBaseArgs(dataStoreType, objectType);
        }
    }
}
