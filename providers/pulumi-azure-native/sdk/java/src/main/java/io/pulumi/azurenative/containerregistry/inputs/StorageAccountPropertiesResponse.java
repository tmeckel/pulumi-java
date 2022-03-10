// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The properties of a storage account for a container registry. Only applicable to Classic SKU.
 * 
 */
public final class StorageAccountPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final StorageAccountPropertiesResponse Empty = new StorageAccountPropertiesResponse();

    /**
     * The resource ID of the storage account.
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    public StorageAccountPropertiesResponse(String id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private StorageAccountPropertiesResponse() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public StorageAccountPropertiesResponse build() {
            return new StorageAccountPropertiesResponse(id);
        }
    }
}
